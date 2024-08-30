package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek_bdd.pages.CreateAccountPageObject;
import tek_bdd.utilities.RundomGenerator;
import tek_bdd.utilities.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {
    @When("click on Crate Primary Account link")
    public void clickOnLink() {
        clickOnElement(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_LINK);
    }

    @Then("validate section title to be Create Primary Account Holder")
    public void validateSectionTitleToBe() {
        String createAccountHolderTitle = getElementText(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_HOLDER_TILE);
        Assert.assertEquals("Create Primary Account Holder", createAccountHolderTitle);
    }

    @Then("fill up create account form")
    public void fillUpCreateAccountForm() {
        String prefix = "omer";
        String randomEmail = RundomGenerator.randomEmail(prefix);
        sendText(CreateAccountPageObject.EMAIL_INPUT, randomEmail);
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, "Mr.");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Fazliomer");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "Ali");
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, "Male");
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, "Single");
        sendText(CreateAccountPageObject.EMPLOYMENT_STATUS, "Test Engineer");
        sendText(CreateAccountPageObject.DATE_OF_BIRTH, "03/21/2001");
    }

    @Then("click on Create Account button")
    public void clickOnCreateAccountButton() {
        clickOnElement(CreateAccountPageObject.CREATE_ACCOUNT_BUTTON);
    }

    @Then("validate Sign up your account title is exist")
    public void validateSignUpYourAccountTitleIsExist() {
        String actualSignUpTitle = getElementText(CreateAccountPageObject.SIGN_UP_YOUR_ACCOUNT_TITLE);
        Assert.assertEquals("Sign up your account", actualSignUpTitle);

    }
    @Then("validate user full name is displayed")
    public void validateUserFullNameIsDisplayed() {
        boolean userActualFullName = isElementIsDisplayed(CreateAccountPageObject.USER_FULL_NAME);
        Assert.assertTrue("User full name should be displayed", userActualFullName);

    }
    @Then("validate email address shows as expected")
    public void validateEmailAddressShowsAsExpected() {
        boolean userActualEmailAddress = isElementIsDisplayed(CreateAccountPageObject.USER_EMAIL_ADDRESS_TITLE);
        Assert.assertTrue("Email address must be displayed as expected", userActualEmailAddress);

    }
    @When("when the user fill up sign up form")
    public void whenTheUserFillUpSignUpForm() {
        sendText(CreateAccountPageObject.USERNAME_INPUT, "Fazliomer");
        sendText(CreateAccountPageObject.PASSWORD_INPUT, "Omer32@");
        sendText(CreateAccountPageObject.CONFIRM_PASSWORD_INPUT, "Omer32@");
    }
    @Then("click on submit button")
    public void clickOnSubmitButton() {
        clickOnElement(CreateAccountPageObject.SUBMIT_BUTTON);
    }

    @Then("fill up create account form page")
    public void fillUpCreateAccountFormPage() {

        sendText(CreateAccountPageObject.EMAIL_INPUT, "fazliomer@gmail.com");
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, "Mr.");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Fazliomer");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "Ali");
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, "Male");
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, "Single");
        sendText(CreateAccountPageObject.EMPLOYMENT_STATUS, "Test Engineer");
        sendText(CreateAccountPageObject.DATE_OF_BIRTH, "03/21/2001");
    }
    @When("validate account error message")
    public void validateAccountErrorMessage() {
        String errorMessage = getElementText(CreateAccountPageObject.ERROR_MESSAGE);
        Assert.assertEquals("ERROR", errorMessage);
        System.out.println(errorMessage);

    }

}