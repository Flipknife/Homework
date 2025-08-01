import java.util.Arrays;

public class HW6 {
    public static void main(String[] args) {

        //                (ДЗ № 6)
        System.out.println("ДЗ № 6");

        //        (Задание № 1)

        System.out.println(" ");
        System.out.println("Первое задание:");
        System.out.println(" ");

        int[] numbers = {3,6,8,4,88,434};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
