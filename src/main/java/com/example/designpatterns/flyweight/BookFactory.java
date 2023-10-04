package com.example.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BookFactory {
    private static Map<String,BookType> bookTypes=new HashMap<>();

    public static BookType getBookType(String type,String distributor,String otherData) {
        if (Objects.isNull(bookTypes.get(type))) {
            bookTypes.put(type,new BookType(type,distributor,otherData));
        }

        return bookTypes.get(type);
    }
}
