public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int amount = 23456;
        //int bonus = amount > 1000 ? amount / 100 : 0;
        int bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
        }

        System.out.println("Бонусов: " + bonus);
        System.out.println("Сумма на балансе: " + (balance + amount));
    }
}
