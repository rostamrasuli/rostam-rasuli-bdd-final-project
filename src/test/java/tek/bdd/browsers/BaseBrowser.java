package tek.bdd.browsers;


import org.openqa.selenium.WebDriver;
import tek_bdd.base.BaseSetup;

public  interface  BaseBrowser  {

    WebDriver openBrowser(boolean isHeadless);
}