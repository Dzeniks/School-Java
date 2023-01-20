import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main{

    
    public static void main(String[] args) throws InterruptedException {
        // Clear console
        System.out.print("\033[H\033[2J");

        BankAcc[] Accounts = new BankAcc[5];
        
        // Tvorba účtů pro testování
        for(int i = 0; i < 5; i++){
            Accounts[i] = new BankAcc(String.format("%s", i), String.format("%s%s%s", i,i,i));  
        }

        Scanner scanner = new Scanner(System.in);
        outerloop:
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            BankAcc loginAcc;
            
            while (true) {

                System.out.print("\033[H\033[2J");
                System.out.flush();
                // Find your acc and login
                System.out.println("Enter your account or exit: ");
                String Acc = scanner.next(); 
                // exit
                if (Acc.toLowerCase().equals("exit")){
                break outerloop;
                }
                
                System.out.println("Enter your PIN: ");
                String pinVer = scanner.next(); 

                

                loginAcc = findAcc(Accounts, Acc);
                if (loginAcc != null){
                    if (loginAcc.verification(pinVer)){
                        break;
                    }
                }
            };
            System.out.print("\033[H\033[2J");
            System.out.printf("Your account %s", loginAcc);

            // Opereration 
            System.out.print("Pick operation: \n\t1 = Deposit\n\t2 = Withdraw\n\t3 = Transfer\n\texit = Exit\n");
            String operation = scanner.next();
            operation.toLowerCase(); 
            switch (operation) {
                case "1":
                    deposit(loginAcc, scanner);
                    TimeUnit.SECONDS.sleep(3);
                    break;
                case "2":
                    withdraw(loginAcc, scanner);
                    TimeUnit.SECONDS.sleep(3);
                    break;
                case "3":
                    transfer(loginAcc, Accounts, scanner);
                    TimeUnit.SECONDS.sleep(5);
                    break;
                case "exit":
                    break;
                }   
            
        }
        scanner.close();
        System.out.println("END");
    }


    public static BankAcc findAcc(BankAcc[] Array, String AccNumber){
        for (BankAcc bankAcc : Array) {
            if(bankAcc.GetNumber().equals(AccNumber)){
                return bankAcc;
            }
        }
        return null;
    }

    public static void withdraw(BankAcc Acc, Scanner scanner){
        System.out.print("\033[H\033[2J");

        System.out.print("Enter amount to withdraw: ");
        float amount = scanner.nextFloat();
        if(Acc.withdraw(amount)){
            System.out.printf("Withdraw amount %s. ", amount);
        }
        else{
            System.out.print("Not enough money");
        }
    }

    public static void deposit(BankAcc Acc, Scanner scanner){
        System.out.print("\033[H\033[2J");
        System.out.print("Enter amount to deposit: ");
        float amount = scanner.nextFloat();
        Acc.deposit(amount);
        System.out.printf("Deposit amount %s. ", amount);
    }

    public static void transfer(BankAcc Acc, BankAcc[] Array, Scanner scanner){
        System.out.print("\033[H\033[2J");
        System.out.print("Amount to transfer: ");
        float amount = scanner.nextFloat();
        
        System.out.print("Account to transfer money: ");
        String toAccNumber = scanner.next();
        BankAcc accForTransfer = findAcc(Array, toAccNumber);
        if (accForTransfer != null){
            Acc.transfer(amount, accForTransfer);
            System.out.printf("Transfer amount %s to account %s .", amount, toAccNumber);
        }
    }
}