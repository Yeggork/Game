package com.example.gametest;

public class Situation {
    //Массив ситуация для создания вариантов новых событий
    Situation[] direction;
    String subject,text;
    //Переменные для изменения характеристик игрока
    int dLife;
    public Situation (String subject, String text, int variants, int dLife) {
        this.subject=subject;
        this.text=text;
        this.dLife=dLife;
        direction=new Situation[variants];
    }
}