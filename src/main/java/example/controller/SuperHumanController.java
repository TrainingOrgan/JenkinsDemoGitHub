package example.controller;

import example.model.CustomResponseMessage;
import example.model.SuperHuman;
import example.service.SuperHumanService;
import example.service.SuperHumanServiceImpl;
import io.javalin.http.Context;


public class SuperHumanController {
    private static SuperHumanService shumanServiceLayer = new SuperHumanServiceImpl();

    //ROUTES

    public static void getAllSHumans(Context context){
        context.json(shumanServiceLayer.getAllSHumans());
    }

    public static void getSHumanByIndex(Context context){
        int myIndex = Integer.parseInt(context.pathParam("index"));
        context.json(shumanServiceLayer.getSHumanUsingId(myIndex));
    }

    public static void createShuman(Context context){
        SuperHuman customSuper = context.bodyAsClass(SuperHuman.class);
        shumanServiceLayer.addSHuman(customSuper);
        context.json(new CustomResponseMessage("Your Super Human has been created")).status(201);
    }
}
