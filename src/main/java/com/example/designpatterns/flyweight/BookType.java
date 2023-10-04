package com.example.designpatterns.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Intrinsic

@Getter
@AllArgsConstructor
public class BookType {
    private final String type;
    private final String distributor;
    private final String otherData;
}
