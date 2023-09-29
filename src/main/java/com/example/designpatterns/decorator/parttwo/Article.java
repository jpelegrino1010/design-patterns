package com.example.designpatterns.decorator.parttwo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Article implements MasterArticle{

    private MasterArticle masterArticle;
    private ArticleDto articleDto;

    @Override
    public String getName() {
        return masterArticle.getName()+" "+articleDto.getName();
    }

    @Override
    public double getPrice() {
        return masterArticle.getPrice() + articleDto.getPrice();
    }
}
