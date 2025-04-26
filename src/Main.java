//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = (int) (Math.random() * 2);
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылку");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Не известный OS");
        }
        // Задание 2
        int releaseDate = (int) (Math.random() * 25) + 2000;
        if(clientOS == 0){
            if(releaseDate < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылку");
            }else {
                System.out.println("Установите версию приложения для IOS по ссылку");
            }
        }else {
            if(releaseDate < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        // Задание 3
        int year = (int) (Math.random() * 5) + 2020;
        System.out.println(year);
        if (year > 1584) {
            switch (year) {

                case 2020:
                    System.out.println("Вискосный год");
                    break;
                case 2021:
                case 2022:
                case 2023:
                    System.out.println("Не високосный год");
                    break;
                case 2024:
                    System.out.println("Високосный год");
                    break;
            }
        }else{
                System.out.println("Ошибка");
            }
        // Задание 4
        /*int deliveryDistance = (int) (Math.random() * 120);
        System.out.println(deliveryDistance); Проверил все дистанции*/
        int deliveryDistance = 95;
        int days;
        if(deliveryDistance <= 20){
            days = 1;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 20 && deliveryDistance < 60){
             days = 2;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 60 && deliveryDistance < 100){
            days = 3;
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Доставки нет");
    }
        //Задание 5
        /*int season = (int) (Math.random() * 13);
        System.out.println(season); проверка */
        int season = 1
        switch (season){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
}
}