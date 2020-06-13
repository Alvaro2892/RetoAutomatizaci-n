package co.com.reto.saucedemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/*Creamos nuetro runner que va ser quién ejecute los test
En cucumberOptions le indico la ruta donde se encuentra mi feature y enlazo las clases de stepdefinitions y
 util, los snippets los utilizo para darle formato a las funciones que genera cucumber que son las que van en el
  stepdefinitions, en este caso le pusimos CAMELCASE*/
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Saucedemo.feature",
        glue = {"co.com.reto.saucedemo.stepdefinitions","co.com.reto.saucedemo.util"},
        snippets = SnippetType.CAMELCASE )


public class RunnerTags
{
}
