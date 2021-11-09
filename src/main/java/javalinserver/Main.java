package javalinserver;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(7000);

        app.post("/add-post", context -> {
            String num1 = context.formParam("add1");
            String num2 = context.formParam("add2");
            int value = Integer.valueOf(num1) + Integer.valueOf(num2);
            context.result(String.valueOf(value));
        });

        app.post("/sub-post", context ->{
            String num1 = context.formParam("sub1");
            String num2 = context.formParam("sub2");
            int value = Integer.valueOf(num1) - Integer.valueOf(num2);
            context.result(String.valueOf(value));
        });

        app.post("/mult-post", context -> {
            String num1 = context.formParam("mult1");
            String num2 = context.formParam("mult2");
            int value = Integer.valueOf(num1) * Integer.valueOf(num2);
            context.result(String.valueOf(value));
        });

        app.post("/div-post", context -> {
            String num1 = context.formParam("div1");
            String num2 = context.formParam("div2");
            int value = Integer.valueOf(num1) / Integer.valueOf(num2);
            context.result(String.valueOf(value));
        });
    }
}
