package example.frontcontroller;

import io.javalin.Javalin;
import io.javalin.http.Context;

import java.util.Optional;

public class FrontController {
    Javalin app;
    Dispatcher dispatcher;

    //CONSTRUCTOR
    public FrontController(Javalin app){
        this.app = app;

        app.before("/api/*", FrontController::checkAllRequests);
        app.after("*", FrontController::dealWithCORS);
//        app.options("/api/*", (Context context)->{
//           context.status(200);
//        });

        dispatcher = new Dispatcher(app);

    }

    //ROUTES
    public static void checkAllRequests(Context context){
        //System.out.println("In front controller");
    }

    public static void dealWithCORS(Context context){
        System.out.println("In cors filter");
//        context.header("Access-Control-Allow-Origin","*");
        context.header("Access-Control-Allow-Origin","http://localhost:4200");
//        context.header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD");
        context.header("Access-Control-Allow-Headers", "origin, content-type");
        context.header("Access-Control-Allow-Credentials", "true");

        //you could also have an endpoint handler which would automatically send back a 200 status code
        //if you didn't have this line then the preflight request would come back with a 404 and fail
        if(context.method().equalsIgnoreCase("OPTIONS"))
            context.status(200);
    }


}
