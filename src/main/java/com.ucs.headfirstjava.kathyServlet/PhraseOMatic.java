package com.ucs.headfirstjava.kathyServlet;

/**
 * Created by vendin on 15.09.2017.
 */
public class PhraseOMatic {
    public static String makePhrase() {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};

        String[] worldListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + worldListTwo[rand2] + " " + wordListThree[rand3];

        return ("All, what you need, - " + phrase);
    }
}
