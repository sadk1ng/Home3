public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int Amount = 1100;
        int bonusThreshold = 1000;
        
        // Рассчитываем бонус и итоговую сумму на счету
        int bonus = 0;

        if (Amount > bonusThreshold) {
            bonus = Amount / 100;
        }

        int totalBalance = initialBalance + Amount + bonus;

        System.out.println("Итоговая сумма на счету: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}

