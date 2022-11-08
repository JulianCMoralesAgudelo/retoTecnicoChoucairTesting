package com.reto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {

    public static final Target PASSWORD = Target.the("Password")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input"));
    public static final Target CONF_PASSWORD = Target.the("Conf_Password")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input"));
    public static final Target CHBOX_STAY = Target.the("CheckStayInformed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHBOX_TERMS = Target.the("CheckTerms")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHBOX_ACCEPT = Target.the("CheckAccept")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_SETUP = Target.the("Button Setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div"));
    /*.located(By.xpath("//a[@class='btn btn-blue']"));*/

}
