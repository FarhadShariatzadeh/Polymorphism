package Masterpieces;
/**
 * Represents an exception dedicated towards an Invalid creator.
 */
public class InvalidCreatorException extends Exception {
  /**
   * Construct a new InvalidCreatorException object and initialize it with the given message.
   * @param message the message of this creator is not accept
   */
  public InvalidCreatorException(String message) {
    super(message);
  }

}
