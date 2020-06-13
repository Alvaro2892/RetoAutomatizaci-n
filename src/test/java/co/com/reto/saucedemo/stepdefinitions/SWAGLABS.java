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

/*En nuestro stepdefinitions vamos a decirle a nuestra automatización que paso va a seguir
  para ejecutar con éxito la funcionalidad que se está probando en esta automatización.
  Vemos que consta de 3 pasos.
  En el primer paso "DADO" es donde levantamos el navegador con la url
  de la página a la cuál automatizamos.
  En el segundo paso "CUANDO" es donde está toda la magia de nuestra automatización,
  aquí es donde hacemos todas las interaciones con la página (click, scroll, inserción de datos, etc).
  En el tercer paso hacemos la question o verificación del mensaje final */


public class SWAGLABS
{
    @Dado("^que el actor abra el navegador y quiera comprar un producto$")
    public void queElActorAbraElNavegadorYQuieraComprarUnProducto()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());
    }

    @Cuando("^el busque y compre el producto deseado$")
    //Aquí creamos una lista y le pasamos la clase "InitializeObjects" del paquete model para que
    //me guarde en data todas las variables que le paso en el feature para así mas tarde
    // utilizarla en los formularios
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
