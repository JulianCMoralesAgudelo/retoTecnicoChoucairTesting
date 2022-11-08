package com.reto.choucair.task;

import com.reto.choucair.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.reto.choucair.userinterfaces.DevicesPage.*;

import java.util.List;

public class DeviceTask implements Task {

    private List<Data> data;

    public DeviceTask(List<Data> data) {
        this.data = data;
    }

    public static DeviceTask thePage(List<Data> data) {
        return Tasks.instrumented(DeviceTask.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DIV_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(MOBILE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DIV_OS),
                Enter.theValue(data.get(0).getStrOS()).into(OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BUTTON_LAST_STEP)
        );
    }
}
