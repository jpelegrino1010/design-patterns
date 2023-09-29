package com.example.designpatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Shirt extends Article{

    private Article article;

    @Override
    public String getName() {
        return article.getName() +" "+ "Shirt,";
    }

    @Override
    public double getPrice() {
        return article.getPrice() + 4.0;
    }
}
