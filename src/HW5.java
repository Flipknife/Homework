public class HW5 {
    public static void main(String[] args) {

        //                (ДЗ № 5)
        System.out.println("ДЗ № 5");

        //        (Задание № 1)

        System.out.println("");
        System.out.println("Первое задание:");
        System.out.println("");



        int[] number = {5,2,25,6,4};
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Среднее значение элементов: " + (double)sum / number[0]);



        //        (Задание № 2)

        System.out.println("");
        System.out.println("Второе задание:");
        System.out.println("");



        int[] negat = {-5,-32,-7,-81,0};

        for (int i = 0; i < negat.length; i++) {
            if (negat[i] < 0) {
                negat[i] = Math.abs(negat[i]);
            }
            System.out.println("Массив после замены отрицательных элементов на абсолютные значения: " + negat[i]);
        }

        //        (Задание № 3)

        System.out.println("");
        System.out.println("Третье задание:");
        System.out.println("");


        int[][] numb = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < numb.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < numb[i].length; j++) {
                sum1 += numb[i][j];
            }
            System.out.println(sum1);
        }

        //        (Задание № 4)

        System.out.println("");
        System.out.println("Четвертое задание:");
        System.out.println("");


        int[] num = {5,6,23,57,88,1};
        int maxind = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[maxind]) {
                maxind = i;
            }
        }
        System.out.println("Максимальный элемент в массиве равен: " + num[maxind] + " и его индекс равен: " + maxind);

        //        (Задание № 5)

        System.out.println("");
        System.out.println("Пятое задание:");
        System.out.println("");

        int[] numbers = {1,5,7,5,3,2};

        boolean repeat = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    repeat = true;
                    break;
                    }
                }
            }
                if (repeat) {
                    System.out.println("В массиве есть повторяющиеся элементы.");
                }else {
                    System.out.println("В массиве нету повторяющихся элементов.");
                }
        }
    }

