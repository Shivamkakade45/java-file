package ATMMachine;
import java.util.*;
    class ATM {
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }

public void menu(){
    System.out.println("Enter your choice");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. EXIT");
    

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if (opt == 1){
       checkBalance();
    }
    else if(opt == 2){
        withdrawMoney();
    }
    else if(opt == 3){
        depositMoney();
    }
    else if(opt == 4){
        System.out.println("Thank You");
    }
    else{
        System.out.println("Enter a valid choice");
    }
}
public void checkBalance(){
    System.out.println("Current Balance: "+ Balance);
    menu();
}
public void withdrawMoney(){
    System.out.println("Enter your amount: ");
    Scanner sc = new Scanner(System.in);
    float Amount = sc.nextFloat();
    if (Amount>Balance){
        System.out.println("Insufficent amount");
    }
    else{
        Balance = Balance - Amount;
        System.out.println("Withdrawl Successful");

    }
    menu();
}
public void depositMoney(){
    System.out.println("Enter the amount: ");
    Scanner sc = new Scanner(System.in);
    float Amount = sc.nextFloat();
    Balance = Balance + Amount; 
    System.out.println("Money Deposited Successfuly");
    menu();
}

  
    }

public class ATMMachine{
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }

}

