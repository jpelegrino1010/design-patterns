package com.example.designpatterns.decorator.parttwo;

public class Demo {

    public static void main(String[] args) {

        MasterArticle masterArticle=new MasterArticleImp();

        MasterArticle article=new Article(new Article(new Article(masterArticle,new ArticleDto("Pant",5.0)),
                new ArticleDto("Shirt",4.0)),new ArticleDto("Belt",2.0))  ;

        System.out.println(article.getName() +" Total:: "+ article.getPrice());
    }
}
