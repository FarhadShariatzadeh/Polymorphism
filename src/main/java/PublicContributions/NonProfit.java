package PublicContributions;

import java.util.ArrayList;

/**
 * Represent a NonProfit organization. A non profit organization has a name and a list of Contribution
 */
public class NonProfit {

  private String organizationName;
  private ArrayList<Contribution> contributionList;

  /**
   * Construct a new nonprofit organization with initialized name and collection
   * of Contribution list
   * @param organizationName the name of organization
   * @param contributionList the collection of Contribution
   */

  public NonProfit(String organizationName, ArrayList<Contribution> contributionList) {
    this.organizationName = organizationName;
    this.contributionList = contributionList;
  }

  public String getOrganizationName() {
    return this.organizationName;
  }

  public ArrayList<Contribution> getContributionList() {
    return this.contributionList;
  }

  /**
   * This method get a year as input and return the total amount dollar Contribution for given year
   * @param year the year given to method
   * @return the total amount of dollar Contribution for that year
   */
  public Integer getTotalContributionsForYear(int year) {
    Integer sum = 0;
    for(int i = 0; i < contributionList.size(); i ++) {
      sum += contributionList.get(i).dollarAmountPerYear(year);
    }
    return sum;
  }



  public void setContributionList(ArrayList<Contribution> contributionList) {
    this.contributionList = contributionList;
  }
}
