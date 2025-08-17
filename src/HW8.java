public class HW8 {

    //        (Задание № 1)
    public int multipyleNumbers (int a, int b) {
        return a * b;
    }

    //        (Задание № 2)

    public int sumNumbers(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + sumNumbers(n - 1);
    }



    public static void main(String[] args) {
        //                (ДЗ № 5)
        System.out.println("ДЗ № 5");

        //        (Задание № 1)

        System.out.println(" ");
        System.out.println("Первое задание:");
        System.out.println(" ");


        HW8 examples = new HW8();
        int result = examples.multipyleNumbers(8,34);
        int result1 = examples.multipyleNumbers(0,-34);
        int result2 = examples.multipyleNumbers(-9,-82);
        int result3 = examples.multipyleNumbers(34,-82);

        if (result > 0) {
            System.out.println(result + " это число положительное");
        } else if (result >= 0 ) {
            System.out.println(result + " это просто ноль");
        } else {
            System.out.println(result1+ " это число атрицательное");
        }

        if (result1 > 0) {
            System.out.println(result1 + " это число положительное");
        } else if (result1 >= 0 ) {
            System.out.println(result1 + " это просто ноль");
        } else {
            System.out.println(result1+ " это число атрицательное");
        }

        if (result2 > 0) {
            System.out.println(result2 + " это число положительное");
        } else if (result2 >= 0 ) {
            System.out.println(result2 + " это просто ноль");
        } else {
            System.out.println(result2 + " это число атрицательное");
        }

        if (result3 > 0) {
            System.out.println(result3 + " это число положительное");
        } else if (result3 >= 0 ) {
            System.out.println(result3 + " это просто ноль");
        } else {
            System.out.println(result3 + " это число атрицательное");
        }


        //        (Задание № 2)

        System.out.println(" ");
        System.out.println("Второе задание:");
        System.out.println(" ");

        System.out.println(examples.sumNumbers(8));


        //        (Задание № 3)

        System.out.println(" ");
        System.out.println("Третье задание:");
        System.out.println(" ");

        //        (Задание № 4)

        System.out.println(" ");
        System.out.println("Четвёртое задание:");
        System.out.println(" ");

        //        (Задание № 5)

        System.out.println(" ");
        System.out.println("Пятое задание:");
        System.out.println(" ");

    }
}

