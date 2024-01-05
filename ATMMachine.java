import java.util.*;

class ATM{
    float Balance;
    int PIN = 0000;

    public void check_pin(){

        System.out.println("Enter your pin: ");

        Scanner sc = new Scanner(System.in);
         int entered_pin = sc.nextInt();

         if(PIN == entered_pin){
            menu();
         }
         else{
            System.out.println("Enter a valid pin");
         }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);

        int opt = sc.nextInt();

        if(opt == 1){
            check_balance();
        }
        else if(opt == 2){
            Withdraw_money();
        }
        else if(opt ==3){
            Deposit_money();
        }
        else if(opt == 4){
            return;
        }

        else{
            System.out.println("Enter a valid choice: ");
        }
        
    }

    public void check_balance(){
        System.out.println("Balance is: "+ Balance);
        menu();
    }

    public void Withdraw_money(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount > Balance){
            System.out.println("Insufficient Balance in your acount");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money withdrawl successful");
        }

        menu();
    }

    public void Deposit_money(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Money deposited Successfully");
        menu();

    }
}


public class ATMMachine {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.check_pin();    
        
    }
    
}








// In this we use basic concept of class and objects 
