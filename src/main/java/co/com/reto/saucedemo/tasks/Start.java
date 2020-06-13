package co.com.reto.saucedemo.tasks;

import co.com.reto.saucedemo.userinterface.EnterWebSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Start implements Task
{
    //creamos una userinterface con el proposito de guardar la url de la
    // página y así respetar los principios solid
    private EnterWebSite enterWebSite;

    public static Start webSite()
    {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        //llamamos al actor para que ejecute la acción de levantar el navegador con la url asignada
        actor.attemptsTo(Open.browserOn(enterWebSite));
    }
}
