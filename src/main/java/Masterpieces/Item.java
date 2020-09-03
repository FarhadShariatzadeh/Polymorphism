package Masterpieces;

import java.util.Objects;

/**
 * Represent the common properties of an Item. An Item has a creator, title, and year of creation.
 */
public class Item {

  protected Creator creator;
  protected String title;
  protected String yearOfCreation;

  /**
   * Construct a new Item object and initialize it with the given title and year of creation.
   * @param title
   * @param yearOfCreation
   */
  public Item(String title, String yearOfCreation) {
    this.title = title;
    this.yearOfCreation = yearOfCreation;
  }

  /**
   * @return the creator
   */
  public Creator getCreator() {
    return creator;
  }

  /**
   * set the creator
   * @param creator the creator of item
   * @throws InvalidCreatorException when the creator is not match with type of item
   */
  public void setCreator(Creator creator) throws InvalidCreatorException {
    this.creator = creator;
  }

  /**
   * @return the title of item
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return the year of creation
   */
  public String getYearOfCreation() {
    return yearOfCreation;
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
    if (!(o instanceof Item)) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(getCreator(), item.getCreator()) &&
        Objects.equals(getTitle(), item.getTitle()) &&
        Objects.equals(getYearOfCreation(), item.getYearOfCreation());
  }
  /**
   * Return the hash value of this object.
   *  @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getCreator(), getTitle(), getYearOfCreation());
  }

  /**
   * @return the string of object
   */
  @Override
  public String toString() {
    return "Item{" +
        "creator=" + creator +
        ", title='" + title + '\'' +
        ", yearOfCreation='" + yearOfCreation + '\'' +
        '}';
  }
}
