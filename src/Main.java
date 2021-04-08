public class Main {
    public static void main (String[] args){
        int clientAccount = 1200;
        int depositAmount = 100;
        int bonus = 1;
        int balance = clientAccount / depositAmount * bonus + clientAccount;

        if(balance > 1000){
            System.out.println (balance);
        }
        else {
            System.out.println (clientAccount + depositAmount);
        }
    }
}
