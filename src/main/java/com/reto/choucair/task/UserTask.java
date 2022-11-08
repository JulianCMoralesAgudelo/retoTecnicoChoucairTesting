package com.reto.choucair.task;

import com.reto.choucair.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static com.reto.choucair.userinterfaces.PersonalDataPage.*;

public class UserTask implements Task {

    private List<Data> data;

    public UserTask(List<Data> data) {

        this.data = data;
    }

    public static UserTask thePage(List<Data> data) {

        return Tasks.instrumented(UserTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(BD_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(BD_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(BD_YEAR),
                Click.on(BUTTON));
    }
}
