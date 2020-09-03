package PublicContributions;

import java.time.LocalDate;

/**
 * Represent a one time Contribution. A one time Contribution has a dollar amount and date of Contribution
 */
public class OneTimeContribution extends Contribution {

  /**
   * Construct a new one time Contribution and initialize it with the given dollar amount and date of
   * Contribution
   * @param dollarAmount the amount of Contribution
   * @param dateOfContribution the time Contribution
   */
  public OneTimeContribution(Integer dollarAmount, LocalDate dateOfContribution) {
    super(dollarAmount, dateOfContribution);
  }
/**
 * Construct a new one time Contribution and initialize it with the given dollar amount
 * @param dollarAmount the amount of Contribution
 */
  public OneTimeContribution(Integer dollarAmount) {
    super(dollarAmount);
  }

  /**
   * The method return the amount of dollar for the given year
   * @param year the year given for all mount of Contribution in that year
   * @return the amount of dollar for that year
   */
  @Override
  public Integer dollarAmountPerYear(int year) {

    if (dateOfContribution.getYear() == year) {
      return dollarAmount;
    }
    return 0;
  }

}
