package PublicContributions;

import java.time.LocalDate;

/**
 * Represent a MonthlyContribution. A monthly Contribution has a dollar amount and a local date of Contribution.
 */
public class MonthlyContribution extends Contribution {
  private static final int MONTH_PER_YEAR = 12;
  private LocalDate cancelDate;

  /**
   * Construct a new Monthly Contribution object and initialize it with the given dollar amount and
   * date of Contribution
   * @param dollarAmount the mount of dollar for Contribution
   * @param dateOfContribution the date of Contribution
   */

  public MonthlyContribution(Integer dollarAmount, LocalDate dateOfContribution) {
    super(dollarAmount, dateOfContribution);
  }

  /**
   * Construct a new Monthly Contribution object and initialize it with the given dollar amount
   * @param dollarAmount the mount of dollar for Contribution
   */
  public MonthlyContribution(Integer dollarAmount) {
    super(dollarAmount);
  }

  /**
   *
   * @param year the year given for all mount of Contribution in that year
   * @return the total amount of dollar Contribution for the given year
   */
  @Override
  public Integer dollarAmountPerYear(int year) {
    int monthNumber;
    Integer totalAmount;
    if (dateOfContribution.getYear() == year) {
      if ((cancelDate == null) || (cancelDate.getYear() != year)) {
        monthNumber = 1 + MONTH_PER_YEAR - dateOfContribution.getMonth().getValue();
        totalAmount = monthNumber * dollarAmount;
        return totalAmount;
      }
      else if ((cancelDate != null) && (cancelDate.getYear() == year)) {
        if (cancelDate.getDayOfMonth() >= dateOfContribution.getDayOfMonth()) {
          monthNumber = cancelDate.getMonth().getValue() - dateOfContribution.getMonth().getValue() + 1;
        }
        else {
          monthNumber = cancelDate.getMonth().getValue() - dateOfContribution.getMonth().getValue();
        }
        totalAmount = monthNumber * dollarAmount;
        return totalAmount;
      }
      }
    return 0;
  }

  /**
   * Return the cancel date of Contribution
   * @return the cancel date of Contribution
   */
  public LocalDate getCancelDate() {
    return cancelDate;
  }

  /**
   * Set the Cancel date of Contribution
   * @param cancelDate set the cancel date of Contribution
   */

  public void setCancelDate(LocalDate cancelDate) {
    this.cancelDate = cancelDate;
  }
}
