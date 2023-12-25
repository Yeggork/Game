package com.example.gametest;

import android.content.Context;
import android.widget.Toast;

public class Story {
    private Situation start_story;
    public Situation current_situation;

    //Основная история
    Story() {
        start_story = new Situation(
                "\"Начало пути\"",
                "Вы собираетесь отправиться в увлекаетльное путешествие с друзьями. Выбирать то, на чем поехать в путешествие, заставили вас. Ну что, как будем добираться?\n"
                        + "(1)на моей машине\n"
                        + "(2)поездом\n"
                        + "(3)почему бы не пешком? ",
                3, 0);
        start_story.direction[0] = new Situation(
                "Машина",
                "Все были не против, и даже рады, ведь путешествие на машине это очень интересно\n"
                        + "Вы уже собираетесь ехать и тут снова выбор - кто первый поведет машину?",
                4, 0);
        start_story.direction[1] = new Situation(
                "поездом",
                "Сегодня будет совещание, меня неожиданно вызвали,"
                        + "есть сведения что \n босс доволен сегодняшней сделкой.",
                0, 1);
        start_story.direction[2] = new Situation(
                "пешком",
                "Не, не ты конечно гений,какой пешком? Нам идти минимум 1234 км"
                        + "Алексей из вашей компании сказал \"по приколу \" я не против)"
                        + "В итоге вы решили поехать на машине", 3, -1);
        //Разветвление истории от 3 выбора
        start_story.direction[2].direction[0] = new Situation(
                "новая ситуация 1",
                "Описание вашей новой ситуации после выбора (3)как надо так и сделаем",
                0, 0
        );
        start_story.direction[2].direction[1] = new Situation(
                "новая ситуация 2",
                "Описание вашей новой ситуации после выбора (3)как надо так и сделаем",
                0, 0
        );
        start_story.direction[2].direction[2] = new Situation(
                "новая ситуация 3",
                "Описание вашей новой ситуации после выбора (3)как надо так и сделаем",
                0, 0
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