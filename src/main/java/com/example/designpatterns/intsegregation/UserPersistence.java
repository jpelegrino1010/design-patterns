package com.example.designpatterns.intsegregation;

public interface UserPersistence {
    User findByEmail(String email);
}
