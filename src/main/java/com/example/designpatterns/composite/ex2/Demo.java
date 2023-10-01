package com.example.designpatterns.composite.ex2;


public class Demo {

    public static void main(String[] args) {

        SongInfo industrialMusic=new SongGroup("Industrial",
                "La industria musical está conformada por las empresas y las personas dedicadas al negocio" +
                        " de la creación, la divulgación y la venta de música");

        SongInfo heavyMetal=new SongGroup("Heavy Metal",
                "es un subgénero musical que nació a finales de los años sesenta");

        SongInfo dubstepMusic=new SongGroup("Dubstep",
                "es un género musical derivado del bass que surgió a finales de los años 1990");

        SongInfo everySong=new SongGroup("Song List","Every Song Available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole","NIN",1990));
        industrialMusic.add(new Song("HeadHunter","Front 242",1988));

        industrialMusic.add(dubstepMusic);

        everySong.add(industrialMusic);

        SongService songService=new SongService(everySong);
        songService.getSongList();










    }
}
