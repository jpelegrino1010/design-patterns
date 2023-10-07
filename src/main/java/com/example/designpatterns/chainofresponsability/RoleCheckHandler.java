package com.example.designpatterns.chainofresponsability;

public class RoleCheckHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if("admin_username".equals(username)) {
            System.out.println("Loading admin page");
            return false;
        }
        System.out.println("Loading default page..");
        return handleNext(username,password);
    }
}
