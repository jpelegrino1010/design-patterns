package com.example.designpatterns.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Extrinsic

@Getter
@AllArgsConstructor
public class Book {
    private final String name;
    private final double price;
    private BookType type;
}
