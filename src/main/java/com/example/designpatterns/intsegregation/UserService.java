package com.example.designpatterns.intsegregation;

import java.util.HashMap;
import java.util.Map;

public class UserService implements PersistenceService<User>,UserPersistence{

    private Map<Long,User> USERS=new HashMap<>();

    @Override
    public void save(User entity) {
        USERS.put(entity.getId(),entity);
    }

    @Override
    public void delete(Long id) {
        USERS.remove(id);
    }

    @Override
    public User findByEmail(String email) {
        return new User();
    }


}
