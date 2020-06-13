package co.com.reto.saucedemo.tasks;

import co.com.reto.saucedemo.userinterface.EnterWebSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Start implements Task
{

    private EnterWebSite enterWebSite;

    public static Start webSite()
    {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(enterWebSite));
    }
}
