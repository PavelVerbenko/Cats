import animals.Kotik;

public class Application {

    public static void main(String[] args) {
        //Для первого экземпляра использовать конструктор с параметрами
        Kotik Cat1 = new Kotik("Киля", "Мур", 10, 3);
        //Для второго конструктор без параметров в сочетании с сеттерами для инициализации переменных
        Kotik Cat2 = new Kotik();
        Cat2.setName("Тайсон");
        Cat2.setVoice("Мур");
        Cat2.setSatiety(8);
        Cat2.setWeight(2);

        String[] day = Cat1.liveAnotherDay();

        for (String action : day) {
            System.out.println(action);
        }

        System.out.println("Имя котика:" + Cat2.getName() + "\n" + "Вес котика:" + Cat2.getWeight());

     boolean VoiceCat = compareVoice(Cat1, Cat2);
     System.out.println("Котики разговаривают одинаково: " + VoiceCat);


     System.out.println("Создано котиков: " + Kotik.getCount());
    }

    public static boolean compareVoice(Kotik Cat1, Kotik Cat2) {
        return Cat1.getVoice().equals(Cat2.getVoice());
    }
}
