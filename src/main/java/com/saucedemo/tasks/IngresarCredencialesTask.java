package com.saucedemo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.ensure.Ensure;

public class IngresarCredencialesTask implements Task {
    private String username;
    private String password;
    public IngresarCredencialesTask(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(Target.the("Input username").locatedBy("//input[@id='user-name']")),
                Enter.theValue(password).into(Target.the("Input password").locatedBy("//input[@id='password']")),
                Click.on(Target.the("Button Ingresar").locatedBy("//input[@id='login-button']"))
        );
    }
    public static IngresarCredencialesTask login(String username, String password) {
        return instrumented(IngresarCredencialesTask.class, username, password);
    }


}
