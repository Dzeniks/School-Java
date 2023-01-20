public class BankAcc {
    
    private String pin, accNumber;
    private float money;

    public BankAcc(String accNumber, String pin){
        this.accNumber = accNumber;
        this.pin = pin;
        this.money = 0;
    }

    public boolean withdraw(float amount){
        if (this.money >= amount){
            this.money -= amount;
            return true;
        }
        return false;
    }

    public void deposit(float amount){
        this.money += amount;
    }

    public void transfer(float amount, BankAcc ToAcc){
        if(withdraw(amount)){
            ToAcc.deposit(amount);
        }
    }

    public boolean verification(String input){
        return input.equals(pin);
    }

    public String GetNumber(){
        return accNumber;
    }

    @Override
    public String toString() {
        // return "BankAcc [accNumber=" + accNumber + ", pin=" + pin + ", money=" + money + "]";
        return "BankAcc accNumber=" + accNumber;
    }

}
