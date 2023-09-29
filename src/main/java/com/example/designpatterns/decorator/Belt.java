package com.example.designpatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Belt extends Article{

    private Article article;

    @Override
    public String getName() {
        return article.getName()+ "Belt,";
    }

    @Override
    public double getPrice() {
        return article.getPrice()+ 2.0;
    }
}
