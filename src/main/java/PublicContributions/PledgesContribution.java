package PublicContributions;

import java.time.LocalDate;

/**
 * Represent the PledgesContribution. A PledgesContribution has a cancel date, today date, dollar amount
 * of Contribution and date of Contribution.
 */
public class PledgesContribution extends Contribution {

  private LocalDate cancelDate;
  private LocalDate today = LocalDate.now();

  public PledgesContribution(Integer dollarAmount, LocalDate dateOfContribution) {
    super(dollarAmount, dateOfContribution);
  }

  /**
   * The method return the amount of dollar for the given year
   * @param year the year given for all mount of Contribution in that year
   * @return The amount of dollar return for given year
   */
  @Override
  public Integer dollarAmountPerYear(int year) {

    if (( dateOfContribution.isBefore(today) || dateOfContribution.isEqual(today)) &&
    dateOfContribution.getYear() == year ) {
      if (cancelDate == null || cancelDate.isBefore(dateOfContribution) ){
        return dollarAmount;
      }
    }
    return 0;
  }

  /**
   *
   * @return the cancel date of Contribution
   */
  public LocalDate getCancelDate() {
    return cancelDate;
  }

  /**
   * Set the cancel date
   * @param cancelDate the date which Contribution canceled
   * @throws InvalidDateException if the cancel date is before now
   */
  public void setCancelDate(LocalDate cancelDate) throws InvalidDateException {
    if (cancelDate.isBefore(today)) {
      throw new InvalidDateException("The date is not acceptable!");
    }
    this.cancelDate = cancelDate;
  }

  /**
   * Set the change date
   * @param changeDate the date which Contribution changed
   * @throws InvalidDateException if the change date is before or equal now or before Contribution
   * date
   */
  public void setChangeDate(LocalDate changeDate) throws InvalidDateException{
    if ((changeDate.isBefore(today)) || (dateOfContribution.isBefore(today)) ||
        (dateOfContribution.isEqual(today))){
      throw new InvalidDateException("The date is not acceptable");
    }
    this.dateOfContribution = changeDate;
  }
}
