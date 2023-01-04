public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен," + age + " то он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать».");
        }
        //Задача2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("«На улице холодно, нужно надеть шапку»");
        } else {
            System.out.println("«Сегодня тепло, можно идти без шапки»");
        }
        //Задача3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость, " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        //Задача4
        int toGoToTheKindergarten = 3;
        if (toGoToTheKindergarten > 2 || toGoToTheKindergarten < 6) {
            System.out.println("Если возраст человека равен," + toGoToTheKindergarten + " то ему нужно ходить в детский сад");
        }


        int goToSchool = 12;
        if (goToSchool > 7 && goToSchool < 18) {
            System.out.println("Если возраст человека равен, " + goToSchool + " то ему нужно ходить в школу");
        }


        int goToUniversity = 21;
        if (goToUniversity > 18 && goToUniversity < 24) {
            System.out.println("Если возраст человека равен, " + goToUniversity + " то ему нужно ходить в университет");
        }


        int goToWork = 25;
        if (goToWork > 24) {
            System.out.println("Если возраст человека равен, " + goToWork + " то ему нужно ходить на работу");
        }


        //Задача5
        int kid = 4;
        if (kid < 5) {
            System.out.println("Если возраст ребенка равен " + kid + "то ему нельзя кататься на аттракционе");
        }

        int kids = 7;
        if (kids > 5 || kids < 14) {
            System.out.println("Если возраст ребенка равен " + kid + "то ему можно кататься на аттракционе в сопровождении");
        }

        int guy = 18;
        if (guy > 14) {
            System.out.println("Если возраст ребенка равен " + guy + "то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Задача6
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount;
        if (otherCount == otherCount) {
            System.out.println("Всего сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        //Задача7
        int one = 3;
        int two = 1;
        int three = 68;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }

        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);

            } else if (three > one) {
                System.out.println("Максимальное число - " + three);

            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}

