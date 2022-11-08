package com.reto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class OfficialPage extends PageObject {

    public static final Target JOIN = Target.the("Register button")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
