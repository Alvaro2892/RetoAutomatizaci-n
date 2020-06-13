package co.com.reto.saucedemo.questions;

import co.com.reto.saucedemo.userinterface.GetIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckQ implements Question<Boolean>
{
    String word;

    public CheckQ(String word)
    {
        this.word = word;
    }

    public static CheckQ is(String questionv) {
        return new CheckQ(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(GetIn.VERIFYPAG).viewedBy(actor).asString();
        return word.equals(text );
    }
}