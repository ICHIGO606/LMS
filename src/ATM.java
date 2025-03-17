import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    float balance;
    int pin=5674;

    public void checkPin(){
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin == pin){
            menu();
        }else{
            System.out.println("The Entered Pin is Incorrect Please Provide with the valid pin");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc =new Scanner(System.in);
        int selection = sc.nextInt();
        if(selection == 1){
            checkBalance();
        }
        else if(selection == 2){
            withdrawMoney();
        }
        else if(selection == 3){
            depositMoney();
        }else if(selection == 4){
            return;
        }else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance"+ balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Withdraw Amount: ");
        Scanner sc =new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient balance");
        }else{
            balance-=amount;
            System.out.println("Money Withdrawn Successfully");
            menu();
        }
    }
    public void depositMoney(){
        System.out.println("Enter the amount to deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance+=amount;
        System.out.println("Money deposited Successfully");
        menu();
    }

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }

}
