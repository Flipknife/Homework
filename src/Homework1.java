//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Homework1 {
    public static void main(String[] args) {

//        (ДЗ № 1)
        System.out.println("ДЗ № 1");

//        (Задание № 1)
        System.out.println("");
        System.out.println("Первое задание:");
        System.out.println("");

        int firstVar = 6;
        System.out.println("Значение переменной (firstVar) с типом (int) равно: " + firstVar);

        byte secondVar = 37;
        System.out.println("Значение переменной (secondVar) с типом (byte) равно: " + secondVar);

        short thirdVar = 8555;
        System.out.println("Значение переменной (thirdVar) с типом (short) равно: " + thirdVar);

        long fourthVar = 1076754456434463289L;
        System.out.println("Значение переменной (fourthVar) с типом (long) равно: " + fourthVar);

        float fifthVar = 10.58f;
        System.out.println("Значение переменной (fifthVar) с типом (float) равно: " + fifthVar);

        double sixthVar = 10.777746369;
        System.out.println("Значение переменной (sixthVar) с типом (double) равно: " + sixthVar);


//        (Задание № 2)

        System.out.println("");
        System.out.println("Второе задание:");
        System.out.println("");

        int bananasGrams = 80;
        int milkGrams = 105;
        int icecreamGrams = 100;
        int eggsGrams = 70;

        double sumResult = 5 * bananasGrams+ 2 * milkGrams + 2 * icecreamGrams + 4 * eggsGrams;
        System.out.println("Такой спортзавтрак весит: " + sumResult + " грамм ");
        System.out.println("или");
        System.out.println("Такой спортзавтрак весит: " + sumResult / 1000 + " килограмм");


//        (Задание № 3)

        System.out.println("");
        System.out.println("Третье задание:");
        System.out.println("");

        double mashaZpMonthBefore = 67760;
        double denisZpMonthBefore = 83690;
        double kristinaZpMonthBefore = 76230;

        double mashaZpMonthAfter = mashaZpMonthBefore + mashaZpMonthBefore * 0.1;
        double denisZpMonthAfter = denisZpMonthBefore + denisZpMonthBefore * 0.1;
        double kristinaZpMonthAfter = kristinaZpMonthBefore + kristinaZpMonthBefore * 0.1;

        System.out.println("Маша теперь получает:  " + mashaZpMonthAfter + " рублей. Годовой доход вырос на: " + ((mashaZpMonthAfter * 12) - (mashaZpMonthBefore * 12)) + " рублей");
        System.out.println("Денис теперь получает: " + denisZpMonthAfter + " рублей. Годовой доход вырос на: " + ((denisZpMonthAfter * 12) - (denisZpMonthBefore * 12)) + " рублей");
        System.out.println("Кристина теперь получает: " + kristinaZpMonthAfter + " рублей. Годовой доход вырос на: " + ((kristinaZpMonthAfter * 12) - kristinaZpMonthBefore * 12) + " рублей");





        }
    }