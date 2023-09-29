package com.example.designpatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pant extends Article{

    private Article article;

    @Override
    public String getName() {
        return article.getName() +" "+ "Pant,";
    }

    @Override
    public double getPrice() {
        return article.getPrice() + 5.0;
    }
}
