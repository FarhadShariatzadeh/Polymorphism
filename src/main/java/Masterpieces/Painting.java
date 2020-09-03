package Masterpieces;
/**
 * Represent a Painting item. A Painting item has a title name and year of creation
 */
public class Painting extends Item {
  /**
   * Construct a new Painting object and initialize it with the given title and year of creation
   * @param title the title of item
   * @param yearOfCreation the year of creation of the item
   */
  public Painting(String title, String yearOfCreation) {
    super(title, yearOfCreation);
  }
  /**
   * Set the creator
   * @param creator the creator of item
   * @throws InvalidCreatorException if the the creator was photographer
   */
  @Override
  public void setCreator(Creator creator) throws InvalidCreatorException {

    if (creator instanceof Potter) {
      throw new InvalidCreatorException("The creator is not Photographer");
    }
    super.setCreator(creator);
  }
}
