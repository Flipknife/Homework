 class Car{
    String brand;
    String model;
    int year;


    public void startEngine() {
        System.out.println("Двигатель запущен");
    }
    public void stopEngine() {
        System.out.println("Двигатель остановлен");
    }
 }


 class ElectricCar extends Car{
    @Override
     public void startEngine() {
        System.out.println("Электродвигатель запущен");
    }

     @Override
     public void stopEngine() {
         System.out.println("Электродвигатель остановлен");
    }

     public void chargeBatteryLevel(int battery) {
        if (battery <= 20) {
            System.out.println("Батарея разряжена, требуется зарядка");
        } else {
            System.out.println("У вас осталось: "+ battery +" % заряда");
        }
     }

 }


class CarData {
    private String brand;
    private String model;
    private int year;

    public CarData(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // геттеры
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

class CarService {
    public void printCar(CarData print) {
        System.out.println("Марка: " + print.getBrand() + ", модель: " + print.getModel() + " и год выпуска машины " + print.getYear() + " год");
    }
}


class FunctionalCar{
    private String brand;
    private String model;
    private int year;

    public FunctionalCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен!");
    }
    public void printInfo() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год: " + year);
    }

    public void startAndPrintInfo() {
        startEngine();
        printInfo();
    }
}





public class HW10 {
    public static void main (String[] args) {

//                (ДЗ № 10)
        System.out.println("ДЗ № 10");

        //        (Задание № 1)

        System.out.println(" ");
        System.out.println("Первое задание:");
        System.out.println(" ");



        Car newCar = new Car();

        newCar.startEngine();
        newCar.stopEngine();



        //        (Задание № 4)

        System.out.println(" ");
        System.out.println("Четвёртое задание:");
        System.out.println(" ");



        Car newElectricCar = new ElectricCar();

        newElectricCar.brand = "Tesla";
        newElectricCar.model = "Model S";
        newElectricCar.year = 2022;

        System.out.println("Марка: " + newElectricCar.brand + ", модель: " + newElectricCar.model + " и год выпуска машины " + newElectricCar.year + " год");


        newElectricCar.startEngine();
        newElectricCar.stopEngine();

        ElectricCar nullCar = null;

        try {
            nullCar.startEngine();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: попытка вызвать метод на null-объекте!");
        }

        ElectricCar myElectricCar = new ElectricCar();

        myElectricCar.chargeBatteryLevel(15);




        //        (Задание № 6)

        System.out.println(" ");
        System.out.println("Шестое задание:");
        System.out.println(" ");

        System.out.println("АНEМИЧНАЯ МОДЕЛЬ");
        CarData carData = new CarData("Hyundai", "IONIQ 6", 2024);
        CarService service = new CarService();
        service.printCar(carData);

        System.out.println(" ");

        System.out.println("ОБЫЧНАЯ ООП-МОДЕЛЬ");
        FunctionalCar functionalCar = new FunctionalCar("Wuling Hongguang", "Mini EV", 2024);
        functionalCar.startAndPrintInfo();

    }
}
