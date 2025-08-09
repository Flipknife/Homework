public class HW7 {
    public static void main(String[] args) {

        //                (ДЗ № 7)
        System.out.println("ДЗ № 7");

        //        (Задание № 1)

        System.out.println(" ");
        System.out.println("Первое задание:");
        System.out.println(" ");




        String str = "Java - это язык программирования";
        String string1 = str.contains("Java") ? "Да содержит" : "Нет не содержит";


        System.out.println("Длина строки: " + str.length() + ". Первый символ: " + str.charAt(0) + ". Содержит Java: " + string1 + ".");




        //        (Задание № 2)

        System.out.println(" ");
        System.out.println("Второе задание:");
        System.out.println(" ");




        String sub = "Kafija maksā 25 eiro";

        String sub1 = sub.substring(13);
        int index1 = sub.indexOf("25");
        System.out.println("Метод substring(): " + sub1 + ". Метод toUpperCase(): " + sub.toUpperCase() + ". И Метод indexOf(): " + index1);



        //        (Задание № 3)

        System.out.println(" ");
        System.out.println("Третье задание:");
        System.out.println(" ");



        String item = "Молоко";
        double price = 150.25;
        int quan = 3;

        System.out.println("Вы купили " + item + ", количество: " + quan + ", итоговая стоимость: " + price * quan + " рублей.");
    }
}
