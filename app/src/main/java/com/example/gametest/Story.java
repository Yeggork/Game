package com.example.gametest;

import android.content.Context;
import android.widget.Switch;
import android.widget.Toast;

public class Story {
    private Situation start_story;
    public Situation current_situation;

    //Основная история
    Story() {
//1
        start_story = new Situation(                                         //Старт
                "\"Начало пути\"",
                "Вы собираетесь отправиться в увлекаетльное путешествие с друзьями. Выбирать то, на чем поехать в путешествие, заставили вас. Ну что, как будем добираться?\n"
                        + "(1)на моей машине\n"
                        + "(2)поездом\n"
                        + "(3)почему бы не пешком? ",
                3, 0);


//2
        start_story.direction[0] = new Situation(                                                         //на чем едем{
                "Машина",
                "Все были не против, и даже рады, ведь путешествие на машине это очень интересно\n"
                        + "Вы уже собираетесь ехать и тут снова выбор - кто первый поведет машину?\n"
                        + "(1)Сергей\n"
                        + "(2)Никита\n"
                        + "(3)Тимофей\n"
                        + "(4)Александр\n",
                4, 0);
        start_story.direction[1] = new Situation(
                "поездом",
                "Хорошо, тогда мы пойдем за билетами, а вы собирате вещи \n"
                        + "\"Вы уже подходите на вокзал\"\n Пока никто не стал занимать заранее места, надо поскорее зарезервировать его.\n"
                        + "(1)Верхнее"
                        + "(2)Нижнее",
                2, 0);
        start_story.direction[2] = new Situation(
                "пешком",
                "Не, ты конечно гений, какой пешком? Нам идти минимум 1234 км"
                        + "В итоге вы решили поехать на машине, но перед вам снова оказался выбор - кто поедет первый?\n"
                        + "(1)Сергей\n"
                        + "(2)Никити\n"
                        + "(3)Тимофей\n"
                        + "(4)Александр\n",
                4, -1);                                                                                     //}


//3
        start_story.direction[0].direction[0] = new Situation(                                        //выбор водителя{    111111
                "Сергей",
                "мы дали вести машину Сергею, но то что у него нету прав мы узнали когда нам выписали штраф на дороге, а так вроде все нормально",
                1, -1
        );
        start_story.direction[0].direction[1] = new Situation(
                "Никита",
                "Никита отказался вести машину, так как это очень страшно для него, к тому же у него нет прав на машину.",
                1, 0
        );
        start_story.direction[0].direction[2] = new Situation(
                "Тимофей",
                "Он был не против поехать первым, вот и поехал",
                1, 0
        );
        start_story.direction[0].direction[3] = new Situation(
                "Александр",
                "Александром ведь являетесь вы, вот не задача, что делать?\n"
                + "(1)садиться за руль\n"
                + "(2)не садиться за руль",
                2, 0
        );                                                                                                 //}





        start_story.direction[1].direction[0] = new Situation(                                        //выбор койки в поезде{22222222222
                "Верхнее",
                "Вы выбрали верхнее\n"
                + "вот блин, вы простудились, всетаки на улице прохладно ночью, а с закрытым окном было душно.",
                0, -1
        );
        start_story.direction[1].direction[1] = new Situation(
                "Нижнее",
                "вы заняли нижнее место и в течение 3 дней вы спокойно ехали отдыхать,",
                0, 0
        );                                                                                                   //}


        




        start_story.direction[2].direction[0] = new Situation(                                        //выбор водителя{    3333333333
                "Сергей",
                "мы дали вести машину Сергею, но то что у него нету прав мы узнали когда нам выписали штраф на дороге, а так вроде все нормально",
                1, -1
        );
        start_story.direction[2].direction[1] = new Situation(
                "Никита",
                "Никита отказался вести машину, так как это очень страшно для него, к тому же у него нет прав на машину.",
                1, 0
        );
        start_story.direction[2].direction[2] = new Situation(
                "Тимофей",
                "Он был не против поехать первым, вот и поехал",
                1, 0
        );
        start_story.direction[2].direction[3] = new Situation(
                "Александр",
                "Александром ведь являетесь вы, вот не задача, что делать?\n"
                        + "(1)садиться за руль\n"
                        + "(2)не садиться за руль",
                2, 0
        );                                                                                                 //}
//4




        start_story.direction[0].direction[0].direction[0] = new Situation(
                "Вы продолжили путешествие",
                "вы продолжаете ехать дальше со всеми",
        0,0
        );
        start_story.direction[0].direction[1].direction[0] = new Situation(
                "Вы продолжили путешествие",
                "вы продолжаете ехать дальше со всеми",
                0,0
        );
        start_story.direction[0].direction[2].direction[0] = new Situation(
                "Вы продолжили путешествие",
                "вы продолжаете ехать дальше со всеми",
                0,0
        );
        start_story.direction[0].direction[3].direction[0] = new Situation(
                "вести",
                "Вы решили сесть за руль, ваши друзья обрадовались что вы сделали это",
                0,+1
        );
        start_story.direction[0].direction[3].direction[1] = new Situation(
                "Не вести",
                "Вас долго уговаривали, но вы смогли отказаться",
                0,0
        );




        start_story.direction[2].direction[0].direction[0] = new Situation(
                "Вы продолжили путешествие",
                "вы продолжаете ехать дальше со всеми",
                0,0
        );
        start_story.direction[2].direction[1].direction[0] = new Situation(
                "Вы продолжили путешествие",
                "вы продолжаете ехать дальше со всеми",
                0,0
        );
        start_story.direction[2].direction[2].direction[0] = new Situation(
                "Вы продолжили путешествие",
                "вы продолжаете ехать дальше со всеми",
                0,0
        );
        start_story.direction[2].direction[3].direction[0] = new Situation(
                "вести",
                "Вы решили сесть за руль, ваши друзья обрадовались что вы сделали это",
                0,+1
        );
        start_story.direction[2].direction[3].direction[1] = new Situation(
                "Не вести",
                "Вас долго уговаривали, но вы смогли отказаться",
                0,0
        );

        current_situation = start_story;
    }

    //Метод для продолжения истории
    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
    }
    //Проверка на наличие историй по выбранному пути
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}