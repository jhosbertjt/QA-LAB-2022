package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.lang.Thread;

public class SwagLabSD {

    @Steps
    SwagLabSteps swaglab;
    @Given("que me encuentro en la aplicación SwagLab")
    public void queMeEncuentroEnLaAplicaciónSwagLab() {
        System.out.println("Thread ini");
        try{
            Thread.sleep(4000);
        }catch (Exception e){

        }
        System.out.println("Thread fin");
    }

    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String user) {
        System.out.println("ingresoElUsuario ini");
        swaglab.inputUser(user);
        System.out.println("ingresoElUsuario fin");
    }

    @And("ingreso la contraseña {string}")
    public void ingresoLaContraseña(String pass) {
        System.out.println("ingresoLaContraseña ini");
        swaglab.inputPass(pass);
        System.out.println("ingresoLaContraseña fin");
    }

    @And("hago clic en Login")
    public void hagoClicEnLogin(){
        swaglab.clicLogin();
    }

    @Then("valido que aparezca el titulo {string}")
    public void validoElTitulo(String titulo) {

        Assert.assertEquals(swaglab.getTitleProduct(), titulo);
    }
    @And("que aparezca el producto {string}")
    public void validoElProducto(String producto) {

        Assert.assertEquals(swaglab.getProduct(), producto);
    }

}
