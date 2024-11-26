import java.util.Scanner;

public class ProjetoBancoBasico {
    public static void main(String[] args) {
        Account newAccount = new Account("Lucas", "Corrente", 2500);
        System.out.println();
        newAccount.print();
        System.out.println();

        System.out.println("Select one option: ");
        menu();
        selectOption(newAccount);
    }
    public static void menu() {

        String[] menu = {
                "1 - Account balance",
                "2 - Deposit amount",
                "3 - Withdraw amount",
                "4 - Exit program"
        };
        for (String item : menu) {
            System.out.println(item);
        }
    }
    public static void selectOption(Account account) {
        Scanner scanner = new Scanner(System.in);
        int selection = 0;
        int depositAmount;
        int withdrawAmount;
        while (selection != 4) {
            switch (selection = scanner.nextInt()) {
                case 1:
                    System.out.println("Your account balance: " + account.getBalance());
                    System.out.println();
                    menu();
                    break;
                case 2:
                    System.out.println("Inform the amount you wish to deposit: ");
                    depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    System.out.println("Your updated account balance is: " + account.getBalance());
                    System.out.println();
                    menu();
                    break;
                case 3:
                    System.out.println("Inform the amount you wish to withdraw: ");
                    withdrawAmount = scanner.nextInt();
                    account.withdraw(withdrawAmount);
                    System.out.println("Your updated account balance is: " + account.getBalance());
                    System.out.println();
                    menu();
                    break;
                case 4:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.println();
                    menu();
                    break;
            }
        }
    }
}
class Account {
    private final String name;
    private final String type;
    private double balance;
    public Account(String nome, String type ,double balance) {
        this.name = nome;
        this.type = type;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("Tipo conta: " + this.type);
        System.out.println("Saldo: " + this.balance);
    }
}

