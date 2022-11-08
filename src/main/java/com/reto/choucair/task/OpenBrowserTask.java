package com.reto.choucair.task;

import com.reto.choucair.userinterfaces.OfficialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowserTask implements Task {

    private OfficialPage thePage;

    public static OpenBrowserTask thePage() {
        return Tasks.instrumented(OpenBrowserTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(thePage),
                Click.on(OfficialPage.JOIN));
    }
}
