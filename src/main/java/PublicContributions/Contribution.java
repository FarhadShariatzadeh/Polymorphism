package PublicContributions;

import java.time.LocalDate;

/**
 * Represent the common properties of Contribution(abstract). A Contribution has a dollar
 * amount and a date of Contribution
 */
public abstract class Contribution implements IContribution {

  protected Integer dollarAmount;
  protected LocalDate dateOfContribution;

  /**
   * Construct a new Contribution object and initialize it with the given dollar amount and
   * date of Contribution
   * @param dollarAmount The amount of dollar Contribution
   * @param dateOfContribution The date of Contribution occur
   */

  public Contribution(Integer dollarAmount, LocalDate dateOfContribution) {
    this.dollarAmount = dollarAmount;
    this.dateOfContribution = dateOfContribution;
  }

  /**
   * Construct a new Contribution object and initialize it with the given dollar amount
   * @param dollarAmount The amount of dollar Contribution
   */
  public Contribution(Integer dollarAmount){
    this.dollarAmount = dollarAmount;
    this.dateOfContribution = LocalDate.now();
  }

  /**
   * @return the Dollar amount
   */
  @Override
  public Integer getDollarAmount() {
    return dollarAmount;
  }

  /**
   * @return The amount of dollar Contribution
   */
  @Override
  public LocalDate getDateOfContribution() {
    return dateOfContribution;
  }



}
