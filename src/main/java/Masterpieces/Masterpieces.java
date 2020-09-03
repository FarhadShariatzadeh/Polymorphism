package Masterpieces;

import java.util.Arrays;
import java.util.Objects;

/**
 * Represent the common properties of Masterpieces. A Masterpieces has
 * a collection of items
 */
public class Masterpieces implements IMasterpieces {

  private static final int NUM_SLOT = 1000;
  private Item[] items;
  private int size;

  /**
   * Construct a new Collection and initialize it with a given list of items.
   * @param items is a list list of items.
   */
  public Masterpieces(Item[] items) {
    this.items = items;
    int counter = 0;
    for (int i = 0; i < items.length; i ++){
      if (items[i] != null) {
        counter ++;
      }
      else {
        break;
      }
    }
    this.size = counter;
  }

  /**
   * Construct a new Collection of item without initialize list
   */
  public Masterpieces() {
    this.items = new Item[NUM_SLOT];
    this.size = 0;
  }

  /**
   * @return the items
   */
  public Item[] getItems() {
    return items;
  }

  /**
   * Adding items to the list
   * @param item - the item to add
   */
  @Override
  public void add(Item item) {
    if (this.inSizeRange() == false) {
      this.resize();
    }
    this.items[this.size] = item;
    this.size ++;
  }

  /**
   * Helper function that checks if there is room in
   * the collection to add a new item to the list.
   * @return true if there is space available, false otherwise
   */
  private boolean inSizeRange() {
    if (this.size + 1 <= this.items.length) {
      return true;
    }
    return false;
  }
  /**
   * Increase the size of the list. This involves creating a temporary new list, adding the
   * existing data to the new list, then setting the data to the new list.
   */
  private void resize() {
    int newSize = this.size + NUM_SLOT;
    Item[] newItems = new Item[newSize];
    this.copyItems(this.items, newItems, 0, items.length, 0);
    this.items = newItems;
  }

  /**
   * Helper function used by add and insert methods. Copies the items from one list to another.
   * @param from - The item to copy start.
   * @param to -The item to copy end.
   * @param fromStart - The index in the "start" list to start copying.
   * @param fromEnd - The index in the "end" list to end at (exclusive).
   * @param toStart - The index in the "end" list to start copying to.
   */
  private void copyItems(Item[] from, Item[] to, int fromStart, int fromEnd, int toStart) {
    if (toStart >= 0) {
      for (int i = fromStart; i < fromEnd; i++) {
        to[toStart] = from[i];
        toStart++;
      }
    }
  }

  /**
   * Remove the item from the list
   * @param item - the item that remove
   */
  @Override
  public void remove(Item item) {
    for (int i = 0; i < this.items.length; i ++) {
      if (this.items[i].equals(item)) {
        int j = i;
        while ( j < this.items.length-1) {
          this.items[j] = this.items[j + 1];
          j++;
        }
        break;
      }
    }
  }

  /**
   * @return the size of list
   */
  @Override
  public int size() {
    return this.size;
  }

  /**
   * This method retrieve all items in the masterpiece
   * collection, regardless of type, that have a title containing the keyword.
   * @param keyword - The keyword that given to method
   * @return the list of item that contain the keyword
   */
  public Item[] search(String keyword) {
    String keywordNew = keyword.toLowerCase();

    Item[] subclassItem1 = new Item[NUM_SLOT];
    int count = 0;
    for (int i = 0; i < size; i ++) {
      if (items[i].title.toLowerCase().contains(keywordNew)) {
        subclassItem1[count] = items[i];
        count++;
      }
    }
    return subclassItem1;
  }

  /**
   * This method retrieve all items in the catalog that have
   * an exact match for the given artist.
   * @param artist - The artist given to the method
   * @return the list of item match for the given artist
   */
  public Item[] search(Artist artist) {
    Item[] subclassItem2 = new Item[NUM_SLOT];
    int count = 0;
    for (int i = 0; i < size; i ++) {
      if (items[i].creator.equals(artist) ){
        subclassItem2[count] = items[i];
        count ++;
      }
    }
    return subclassItem2;
  }

  /**
   * This method retrieves all items in the catalog that
   * have an exact match for the given painter
   * @param painter the painter given to the method
   * @return the list of item match with the given painter
   */

  public Item[] search(Painter painter) {
    Item[] subclassItem3 = new Item[NUM_SLOT];
    int count = 0;
    for (int i = 0; i < size; i ++) {
      if (items[i] instanceof Painting) {
        if (items[i].creator instanceof Painter) {
          if (items[i].creator.equals(painter))
          {
            subclassItem3[count] = items[i];
            count ++;
          }
        }
      }
    }
    return subclassItem3;
  }
  /**
   * Return whether or not the given object is the same as this object
   *
   * @param o the object to be compared to for equality.
   * @return whether or not the given object is the same as this object.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Masterpieces)) {
      return false;
    }
    Masterpieces that = (Masterpieces) o;
    return size == that.size &&
        Arrays.equals(items, that.items);
  }
  /**
   * Return the hash value of this object.
   *  @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    int result = Objects.hash(size);
    result = 31 * result + Arrays.hashCode(items);
    return result;
  }

  /**
   * @return the string of the object
   */
  @Override
  public String toString() {
    return "ArtCollection{" +
        "items=" + Arrays.toString(items) +
        ", size=" + size +
        '}';
  }
}
