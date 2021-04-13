package example.frontcontroller;

import example.controller.SuperHumanController;
import example.controller.UserAccountController;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Dispatcher {

    public Dispatcher(Javalin app){
        setupAllPaths(app);

    }

    public static void setupAllPaths(Javalin app){
        setupSHumanPaths(app);
        setupUserAccountPaths(app);
    }

    public static void setupSHumanPaths(Javalin app){
        app.routes(() ->{
            path("/api/shuman", ()->{
                get(SuperHumanController::getAllSHumans);
                post(SuperHumanController::createShuman);
                path(":index", ()->{
                    get(SuperHumanController::getSHumanByIndex);
                });
            });
        });

    }

    public static void setupUserAccountPaths(Javalin app){
        app.routes(() ->{
            path("/api/useraccount", ()->{
                get(UserAccountController::getCurrentUserAccount);
                path("login", ()->{
                    post(UserAccountController::login);
                });
                path("logout", ()->{
                    post(UserAccountController::logout);
                });
            });
        });

    }
}
