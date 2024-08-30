package tek.bdd.steps;


import io.cucumber.java.en.Then;
import org.junit.Assert;

import tek_bdd.pages.PlansPageObject;
import tek_bdd.utilities.SeleniumUtility;

public class PlansSteps  extends SeleniumUtility {
    @Then("click on plans button")
    public void clickOnPlansButton() {
        clickOnElement(PlansPageObject.PLANE_BUTTON);

    }
    @Then("validate {int} row of the data is present")
    public void validate4RowOfTheDataIsPresent(Integer row) {

        String planType = getElementText(PlansPageObject.PLANE_TYPE);
        Assert.assertEquals("PLAN TYPE", planType);

        String planBasePrice = getElementText(PlansPageObject.DATE_CREATED);
        Assert.assertEquals("PLAN BASE PRICE", planBasePrice);

        String dateCreated = getElementText(PlansPageObject.DATE_CREATED);
        Assert.assertEquals("DATE CREATED", dateCreated);

        String dateExpire = getElementText(PlansPageObject.DATE_EXPIRE);
        Assert.assertEquals("DATE EXPIRE", dateExpire);

    }

    @Then("validate Create Date is today's date in EST Time zone")
    public void validateCreateDate() {
        String currentDate = getElementText(PlansPageObject.CREATE_DATE);
        Assert.assertEquals("August 21, 2024", currentDate);

    }
    @Then("validate Date Expire is a day after EST Time Zone")
    public void validateDateExpire() {
        String expireDate = getElementText(PlansPageObject.EXPIRE_DATE);
        Assert.assertEquals("August 22, 2024", expireDate);

    }



}