package Masterpieces;

/**
 * A List of masterpieces.
 */
public interface IMasterpieces {

  /**
   * Add item to the list
   * @param item - the item to add
   */
  void add(Item item);

  /**
   * remove item from the list
   * @param item - the item that remove
   */
  void remove(Item item);

  /**
   * The size of the list
   * @return the size of the list
   */
  int size();


}
