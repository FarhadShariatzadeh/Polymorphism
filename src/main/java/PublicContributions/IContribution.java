package PublicContributions;

import java.time.LocalDate;

/**
 * This interface contains information of all Contribution.
 */
public interface IContribution {

  /**
   * @return the date of the Contribution
   */
  LocalDate getDateOfContribution();

  /**
   * @return the dollar amount of Contribution
   */
  Integer getDollarAmount();

  /**
   * Return the all dollar amount of Contribution for the given year
   * @param year the year given for all mount of Contribution in that year
   * @return the total amount of Contribution
   */
  Integer dollarAmountPerYear(int year);



}
