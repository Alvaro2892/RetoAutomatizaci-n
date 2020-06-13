package co.com.reto.saucedemo.stepdefinitions;

import co.com.reto.saucedemo.model.InitializeObjects;
import co.com.reto.saucedemo.questions.CheckQ;
import co.com.reto.saucedemo.tasks.ComeIn;
import co.com.reto.saucedemo.tasks.Start;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SWAGLABS
{
    @Dado("^que el actor abra el navegador y quiera comprar un producto$")
    public void queElActorAbraElNavegadorYQuieraComprarUnProducto()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());
    }

    @Cuando("^el busque y compre el producto deseado$")
    public void elBusqueYCompreElProductoDeseado(List<InitializeObjects> data)
    {
        theActorInTheSpotlight().attemptsTo(ComeIn.WebSite(data));

    }

    @Entonces("^verifica que si fue el producto que el queria comprar (.*)$")
    public void verificaQueSiFueElProductoQueElQueriaComprar(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(CheckQ.is(questionv)));
    }

}
