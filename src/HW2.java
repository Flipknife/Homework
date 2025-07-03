public class HW2 {
    public static void main(String[] args) {

//        (ДЗ № 2)
        System.out.println("ДЗ № 2");

//        (Задание № 1)

        System.out.println("");
        System.out.println("Первое задание:");
        System.out.println("");


        int age = 30;

        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <=17) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
        } else if (age >= 18 && age <=24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age +  ", то ему пора ходить на работу");
        } else {
            System.out.println("Если твой возраст равен " + age +  ", то научись ходить на горшок");
        }


//        (Задание № 2)

        System.out.println("");
        System.out.println("Второе задание:");
        System.out.println("");


        int vagon = 102;
        int passengers = 100;
        int seeds = 60;
        int stay = vagon - seeds;

        if (passengers < seeds) {
            System.out.println("В вагоне осталось сидячих мест " + (seeds - passengers) + " и стоячих мест осталось " + stay);
        } else if (passengers >= seeds && passengers <= vagon) {
            System.out.println("В вагоне осталось свободных мест " + (vagon - passengers));
        } else {
            System.out.println("В вагоне не хватит мест на " + passengers + " человек");
        }



//        (Задание № 3)

        System.out.println("");
        System.out.println("Третье задание:");
        System.out.println("");


        int year = 2002;

        if (year <= 1584) {
            System.out.println(year + " Этот год меньше 1584 года, значит тогда ещё не было правил високосных годов");
        }  else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }



//        (задание № 4)

        System.out.println("");
        System.out.println("Четвертое задание:");
        System.out.println("");


        int monthNumber = 14;

        switch (monthNumber) {
            case 12:
                System.out.println(monthNumber + " месяц (он же декабрь) принадлежит к сезону зима");
                break;
            case 11:
                System.out.println(monthNumber + " месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + " месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 9:
                System.out.println(monthNumber + " месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 8:
                System.out.println(monthNumber + " месяц (он же август) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + " месяц (он же июль) принадлежит к сезону лето");
                break;
            case 6:
                System.out.println(monthNumber + " месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 5:
                System.out.println(monthNumber + " месяц (он же май) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + " месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 3:
                System.out.println(monthNumber + " месяц (он же март) принадлежит к сезону весна");
                break;
            case 2:
                System.out.println(monthNumber + " месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 1:
                System.out.println(monthNumber + " месяц (он же январь) принадлежит к сезону зима");
                break;
                default:
                    System.out.println(monthNumber + " не существует такого номера месяца");
                    break;

        }

        }
    }