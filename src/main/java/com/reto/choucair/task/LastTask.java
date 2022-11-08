package com.reto.choucair.task;

import com.reto.choucair.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.reto.choucair.userinterfaces.LastPage.*;

import java.util.List;

import static com.reto.choucair.userinterfaces.PersonalDataPage.*;

public class LastTask implements Task {

    private List<Data> data;

    public LastTask(List<Data> data) {
        this.data = data;
    }

    public static LastTask thePage(List<Data> data) {

        return Tasks.instrumented(LastTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONF_PASSWORD),
                Click.on(CHBOX_STAY),
                Click.on(CHBOX_TERMS),
                Click.on(CHBOX_ACCEPT),
                Click.on(BUTTON_SETUP)
        );
    }
}
