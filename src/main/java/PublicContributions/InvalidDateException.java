package PublicContributions;

/**
 * Represents an exception dedicated towards an Invalid date
 */
public class InvalidDateException extends Exception {
  /**
   * Construct a new InvalidDateException object and initialize it with the given message.
   * @param message the message of this date is not valid
   */
  public InvalidDateException(String message) {super(message);}

}
