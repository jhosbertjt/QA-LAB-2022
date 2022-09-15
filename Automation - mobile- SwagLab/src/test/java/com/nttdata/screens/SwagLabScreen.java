package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SwagLabScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPass;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement loginButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement txtTitle;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    private  WebElement txtProducto;


    public void ingresarUser(String user){
        System.out.println("ingresarUser init");
        getDriver().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        txtUser.click();
        txtUser.sendKeys(user);
        System.out.println("ingresarUser init");
    }

    public void ingresarPass(String pass){
        System.out.println("ingresarPass init");
        getDriver().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        txtPass.click();
        txtPass.sendKeys(pass);
        System.out.println("ingresarPass init");
    }

    public void clickLogin(){
        System.out.println("clickLogin init");
        getDriver().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        loginButton.click();
        System.out.println("clickLogin fin");
    }


    public String getTitleProduct(){

    System.out.println("getTitleProduct ini");
    getDriver().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
    return txtTitle.getText();
    }

    public String getProduct(){

        System.out.println("getProduct ini");
        getDriver().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        return txtProducto.getText();
    }


}
