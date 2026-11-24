public class Main {
    public static void main(String[] args) {
        Account account = new Account("Bakai Rakhimzhanov", 1000, "1234567890123456");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}