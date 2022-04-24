public class Main {
    public static void main(String[] args) {

        int account = 300;
        int accountReplenishment = 1350;
        int bonus;

        if (accountReplenishment > 1000) {
            bonus = accountReplenishment / 100;
        } else {
            bonus = 0;
        }

        int totalAccount = account + accountReplenishment + bonus;

        System.out.println("Итоговый счет: " + totalAccount);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
