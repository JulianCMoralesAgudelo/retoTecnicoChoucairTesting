package com.reto.choucair.task;

import com.reto.choucair.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.reto.choucair.userinterfaces.LocationPage.*;


public class LocationTask implements Task {

    private List<Data> data;

    public LocationTask(List<Data> data) {
        this.data = data;
    }

    public static LocationTask thePage(List<Data> data) {
        return Tasks.instrumented(LocationTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrZip()).into(ZIP_CODE),
                Click.on(CONTAINER),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BUTTON_DEVICE));
    }
}
