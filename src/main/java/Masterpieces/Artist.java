package Masterpieces;

import java.util.Objects;

/**
 * Represent An Artist with the common properties. An Artist has a first name and
 * last name
 */
public class Artist extends Creator {

  protected String firstName;
  protected String lastName;

  /**
   * Construct a new Artist with a first name and last name given
   * @param firstName the first of artist
   * @param lastName the last name of artist
   */
  public Artist(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return the last name
   */
  public String getLastName() {
    return lastName;
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
    if (!(o instanceof Artist)) {
      return false;
    }
    Artist artist = (Artist) o;
    return Objects.equals(getFirstName(), artist.getFirstName()) &&
        Objects.equals(getLastName(), artist.getLastName());
  }
  /**
   * Return the hash value of this object.
   *  @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName());
  }

  /**
   * @return the string of Object
   */
  @Override
  public String toString() {
    return "Artist{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
