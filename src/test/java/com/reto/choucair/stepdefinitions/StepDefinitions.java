package com.reto.choucair.stepdefinitions;

import com.reto.choucair.model.Data;
import com.reto.choucair.questions.Response;
import com.reto.choucair.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class StepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Julian registers on the page$")
    public void julianRegistersOnThePage() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenBrowserTask.thePage());
    }


    @When("^enter his dates into the module$")
    public void enterHisDatesIntoTheModule(List<Data> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(UserTask.thePage(data),
                LocationTask.thePage(data), DeviceTask.thePage(data),
                LastTask.thePage(data)
        );
    }

    @Then("^should see the welcome message$")
    public void shouldSeeTheWelcomeMessage(List<Data> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Response.Information(data)));

    }

}
