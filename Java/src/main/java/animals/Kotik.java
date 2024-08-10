package animals;

import java.util.Random;

public class Kotik {
    private static final int METHODS = 5;
    private static int count = 0;

    private String name;
    private String voice;
    private int satiety;
    private int weight;

    //Конструктор с параметрами
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    //Конструктор без параметров
    public Kotik() {
        this.name = "Безымянный";
        this.voice = "Мяу";
        this.satiety = 10;
        this.weight = 3;
        count++;
    }

    //геттеры
    public String getName() {
        return name;
    }
    public String getVoice() {
        return voice;
    }
    public int getSatiety() {
        return satiety;
    }
    public int getWeight() {
        return weight;
    }
    public static int getCount() {
        return count;
    }

    //сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Методы поведения кошки
    public boolean play() {
        if (satiety > 0) {
            System.out.println(name + " котик играет!");
            satiety--;
            return true;
        } else {
            System.out.println(name + "xочет кушать!");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println(name + " котик спит!");
            satiety--;
            return true;
        } else {
            System.out.println(name + "xочет кушать!");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println(name + " котик умывается!");
            satiety--;
            return true;
        } else {
            System.out.println(name + "xочет кушать!");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println(name + " котик гуляет!");
            satiety--;
            return true;
        } else {
            System.out.println(name + " Хочет кушать!");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println(name + " котик охотиться на собак =)!");
            satiety--;
            return true;
        } else {
            System.out.println(name + " Хочет кушать!");
            return false;
        }
    }

    //1 принимает только количество единиц сытости
    public void eat(int satiety) {
        this.satiety += satiety;
        System.out.println(name + " поел и теперь сыт!");
    }

    //2 количество единиц сытости и новая переменная еда
    public void eat(int satiety, String foodName) {
        this.satiety += satiety;
        System.out.println(name + " покушал " + foodName + " и теперь сыт!");
    }

    //3 Без параметров
    public void eat() {
        eat(2, "Вкусный корм");
    }

    public String[] liveAnotherDay() {
        String[] day = new String[24];
        Random random = new Random();

        for (int hour = 0; hour < 24; hour++) {
            int action = random.nextInt(METHODS);

            switch (action) {
                case 0:
                    if (play()) {
                        day[hour] = hour + " - играл";
                    } else {
                        eat(2, " Вкусный корм");

                        day[hour] = hour + " - ел";
                    }
                    break;
                case 1:
                    if (sleep()) {
                        day[hour] = hour + " - спал";
                    } else {
                        eat(2, " Вкусный корм");
                        day[hour] = hour + " - ел";
                    }
                    break;
                case 2:
                    if (wash()) {
                        day[hour] = hour + " - умывался";
                    } else {
                        eat(2, " Вкусный корм ");
                        day[hour] = hour + " - ел";
                    }
                    break;
                case 3:
                    if (walk()) {
                        day[hour] = hour + " - гулял";
                    } else {
                        eat(2, " Вкусный корм ");
                        day[hour] = hour + " - ел";
                    }
                    break;
                case 4:
                    if (hunt()) {
                        day[hour] = hour + " - охотился";
                    } else {
                        eat(2, " Вкусный корм");
                        day[hour] = hour + " - ел";
                    }
                    break;
            }
        }
        return day;
    }
}
