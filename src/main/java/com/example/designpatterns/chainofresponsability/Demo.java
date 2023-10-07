package com.example.designpatterns.chainofresponsability;

public class Demo {

    public static void main(String[] args) {
        Database database=new Database();

        Handler handler=new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service=new AuthService(handler);
        service.logIn("admin_username","admin_password");

        char c='o';

    }
}
