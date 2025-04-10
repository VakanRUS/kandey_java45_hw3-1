public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        byte age = 22;
        if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        System.out.println();

        //task 2
        System.out.println("task 2");
        byte temp = 5;
        System.out.printf("На улице ");
        if (temp < 5) {
            System.out.println(temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println(temp + " градусов, можно идти без шапки");
        }
        System.out.println();

        //task 3
        System.out.println("task 3");
        short speed = 30;
        boolean speedLimit = speed <= 60;
        if (speedLimit == true) {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф");
        }
        System.out.println();

        //task 4
        System.out.println("task 4");
        byte ageOfHuman = 33;
        if (ageOfHuman >= 2 && ageOfHuman < 7) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в детский сад");
        } else if (ageOfHuman >= 7 && ageOfHuman < 18) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в школу");
        } else if (ageOfHuman >= 18 && ageOfHuman < 24) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить на работу");
        }
            System.out.println();


        //task 5
        System.out.println("task 5");
        byte ageOfChildren = 13;
        if (ageOfChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChildren + ", то ему нельзя кататься на аттракционе");
        } else if (ageOfChildren >= 5 && ageOfChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChildren + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfChildren + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
            System.out.println();

        //task 6
        System.out.println("task 6");
        short passengers = 103;
        if (passengers <= 60) {
            System.out.println("Есть сидячие места");
        } else if (passengers > 60 && passengers < 102) {
            System.out.println("Остались только стоячие места");
        } else {
            System.out.println("Мест нет, подождите другой поезд");
        }
        System.out.println();

        //task 7
        System.out.println("task 7");
        // Я так понял можно поставить рандомные числа к переменным
        int one = 12;
        int two = -11;
        int three = 000;
        boolean greaterOne = (one > two && one > three);
        boolean greaterTwo = (two > one && two > three);
        if (greaterOne){
            System.out.println("Число " + one + " больше чисел " + two + " и " + three);
        } else if (greaterTwo){
            System.out.println("Число " + two + " больше чисел " + one + " и " + three);
        } else {
            System.out.println("Число " + three + " больше чисел " + one + " и " + two);
        }
        System.out.println();
    }
}