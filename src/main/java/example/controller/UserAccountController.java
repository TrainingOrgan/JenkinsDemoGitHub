package example.controller;

import example.model.CustomResponseMessage;
import example.model.SuperHuman;
import example.model.UserAccount;
import io.javalin.http.Context;

public class UserAccountController {
    //ROUTES

    public static void login(Context context){

        UserAccount loginAccount = context.bodyAsClass(UserAccount.class);

        context.sessionAttribute("currentUser", loginAccount);
        context.json(new CustomResponseMessage("You have successfully logged in"));

    }

    public static void getCurrentUserAccount(Context context){
        UserAccount currentUser= context.sessionAttribute("currentUser");
        System.out.println(currentUser);

        if (currentUser != null) {
            context.json(currentUser);
        }else{
            context.json(new CustomResponseMessage("You are NOT currently logged in"));
        }
    }

    public static void logout(Context context){
        context.sessionAttribute("currentUser", null);
        context.json(new CustomResponseMessage("You have successfully logged out"));
    }
}
