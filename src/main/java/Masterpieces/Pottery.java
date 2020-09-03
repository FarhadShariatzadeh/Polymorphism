package Masterpieces;

/**
 * Represents a Pottery item. A Pottery item has a title name and year of creation.
 */
public class Pottery extends Item {

  /**
   * Construct a new Pottery object and initializes it with the given title and year of creation.
   * @param title the title of item
   * @param yearOfCreation the year of creation of the item
   */

  public Pottery(String title, String yearOfCreation) {
    super(title, yearOfCreation);
  }

  /**
   * Set the creator
   * @param creator the creator of item
   * @throws InvalidCreatorException if the the creator was painter of Masterpieces.
   */
  @Override
  public void setCreator(Creator creator) throws InvalidCreatorException {
    if ((creator instanceof Painter) || (creator instanceof MasterpieceSelection)){
      throw new InvalidCreatorException("The creator is not Painter");
    }
    super.setCreator(creator);
  }
}
