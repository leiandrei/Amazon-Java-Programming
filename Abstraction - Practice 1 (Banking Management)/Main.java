public class Main {

    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount("01-56A-98B-0", "Lebron James", 1000.0, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("01-56A-98B-0", "Kai Sotto", 2500.0, 10);


        // Savings Account
        System.out.println(savingsAccount.funcDisplayInfo());

        System.out.println();


        // Checking Account
        System.out.println(checkingAccount.funcDisplayInfo());
    }
    
}
