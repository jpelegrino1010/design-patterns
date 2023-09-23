package com.example.designpatterns.intsegregation;

public class OrderService implements PersistenceService<Order>{


    @Override
    public void save(Order entity) {
        System.out.println("Saving order");
    }

    @Override
    public void delete(Long id) {
        System.out.println("Deleting order");
    }

}
