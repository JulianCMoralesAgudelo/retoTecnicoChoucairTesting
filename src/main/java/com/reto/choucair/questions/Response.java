package com.reto.choucair.questions;

import com.reto.choucair.model.Data;
import com.reto.choucair.userinterfaces.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Response implements Question<Boolean> {

    private List<Data> data;

    public Response(List<Data> data) {
        this.data = data;
    }

    public static Response Information(List<Data> data) {
        return new Response(data);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String finalText = Text.of(LastPage.BUTTON_SETUP).viewedBy(actor).asString();
        return data.get(0).getStrLastText().equals(finalText);
    }
}
