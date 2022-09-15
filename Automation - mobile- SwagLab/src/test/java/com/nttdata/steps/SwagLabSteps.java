package com.nttdata.steps;

import com.nttdata.screens.SwagLabScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabSteps {

    SwagLabScreen swagscreen;


    @Step("Ingreso de Usuario por texto")
    public void inputUser(String user){
        System.out.println("inputUser ini");
        swagscreen.ingresarUser(user);
        System.out.println("inputUser fin");
    }

    @Step("Ingreso de Contraseña por texto")
    public void inputPass(String pass){
        System.out.println("inputPass ini");
        swagscreen.ingresarPass(pass);
        System.out.println("inputPass fin");
    }

    @Step("Clic en Login")
    public void clicLogin(){
        swagscreen.clickLogin();
    }

    @Step("Obtiene el texto del resultado")
    public String getTitleProduct(){

        return swagscreen.getTitleProduct();
    }

    @Step("Obtiene el producto")
    public String getProduct(){

        return swagscreen.getProduct();
    }

}
