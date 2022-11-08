package com.reto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

    public static final Target CITY = Target.the("City")
            .located(By.xpath("//*[contains(@id,'city')]"));

    public static final Target ZIP_CODE = Target.the("Zip")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input"));


    public static final Target CONTAINER = Target.the("Container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));

    public static final Target COUNTRY = Target.the("Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));


    public static final Target BUTTON_DEVICE = Target.the("Device Button")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
