package co.com.reto.saucedemo.tasks;

import co.com.reto.saucedemo.model.InitializeObjects;
import co.com.reto.saucedemo.userinterface.GetIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import java.util.List;
import static co.com.reto.saucedemo.util.Constants.ZERO;


/*Creo una variable "data" que me guarde
  lo que la lista me vaya trayendo de la clase
  InitializeObjects y así poder pasarselo a la caja de teexto mapeada en la clase GetIn */
public class ComeIn implements Task
{
    private List<InitializeObjects> data;

    public ComeIn (List<InitializeObjects> data)
    {
        this.data = data;
    }

    public static ComeIn WebSite(List<InitializeObjects> initializeObjects)
    {
        return Tasks.instrumented(ComeIn.class, initializeObjects);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        /*La variable info la creo con la intención de ahorrarme de escribir "data.get(ZERO)"
        cada vez que necesito ingresar un dato a un formulario y la contaste ZERO lo único que me
        trae es el número cero lo hago con la intención de no pasar datos quemados en esta clase*/

        InitializeObjects info = data.get(ZERO);
        actor.attemptsTo(Click.on(GetIn.USERNAME),
                Enter.theValue(info.getUsername()).into(GetIn.USERNAME),
                Enter.theValue(info.getPassword()).into(GetIn.PASSWORD),
                Click.on(GetIn.CLICKLOGIN),
                Scroll.to(GetIn.SCROLLSAUCELABS),
                Click.on(GetIn.CLICKADDTOCART),
                Scroll.to(GetIn.SCROLLSHOPPINGCART),
                Click.on(GetIn.CLICKSHOPPINGCART),
                Click.on(GetIn.CLICKCHECKOUT),
                Enter.theValue(info.getFirstname()).into(GetIn.ENTERFIRSTNAME),
                Enter.theValue(info.getLastname()).into(GetIn.ENTERLASTNAME),
                Enter.theValue(info.getCodepostal()).into(GetIn.ENTERPOSTALCODE),
                Click.on(GetIn.CLICKCONTINUE),
                Click.on(GetIn.CLICKFINISH)
                );
    }
}
