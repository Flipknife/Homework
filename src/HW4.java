public class HW4 {
    public static void main(String[] args) {

//                (ДЗ № 4)
        System.out.println("ДЗ № 4");

        //        (Задание № 1)

        System.out.println("");
        System.out.println("Первое задание:");
        System.out.println("");

        int number = 1;
        while (number <= 50) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }


        //        (Задание № 2)

        System.out.println("");
        System.out.println("Второе задание:");
        System.out.println("");

        int number1 = 1;
        int count = 0;
        do {
            if (number1 % 7 == 0) {
                count++;
            }
            number1++;
        } while (number1 <= 100);
        System.out.println("Есть всего " + count + " чисел которык делятся на 7");


        //        (Задание № 3)

        System.out.println("");
        System.out.println("Третье задание:");
        System.out.println("");

        int number2 = 1;
        int sum = 0;
        while (number2 <= 100) {
            sum += number2;
            number2++;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);


        //        (Задание № 4)

        System.out.println("");
        System.out.println("Четвертое задание:");
        System.out.println("");

        int numb = 0;
        int randomNumber;
        do {
            randomNumber = (int) (Math.random() * 20) + 1;
            numb++;
            System.out.println("Сгенерировано: " + randomNumber );
        } while (randomNumber != 15);
        System.out.println("Число 15 было сгенерировано спустя " + numb + " попыток");

    }
}



