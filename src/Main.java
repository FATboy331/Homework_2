public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 1 " + calculateWallking(35, 10));  // Задание 3
        System.out.println("Вариант 2 " + calculateWallking(45,40));
        System.out.println("Вариант 3 " + calculateWallking(37,-5));
        System.out.println("Вариант 4 " + calculateWallking(19,28));
        System.out.println("Вариант 5 " + calculateWallking(46,-70));
        System.out.println("Доп задание " + calculateWallking(randomAge(),15));



    }

    public static String calculateWallking(int humanAge, int outsideTemperature) {    // Задание 1
        if (humanAge >= 20 && humanAge <= 40 && outsideTemperature >= -20 && outsideTemperature <= 30) {  // Задание 2: Алгоритм действий (а)
            return "Можно идти гулять";
        }
        if (humanAge < 20 && outsideTemperature >= 0 && outsideTemperature <= 28) {                       // Алгоритм действий (b)
            return "Можно идти гулять";
        }
        if (humanAge < 45 && outsideTemperature >= -10 && outsideTemperature <= 25) {                     // Алгоритм действий (c)
            return "Можно идти гулять";
        }
        return "Оставайтесь дома";                                                                        // Алгоритм действий (d)

    }
    public static int randomAge(){
        double namber = Math.random() * 100;
        return (int) namber;


    }




}