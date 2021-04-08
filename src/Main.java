public class Main {
    public static void main (String[] args){
        int clientAccount = 1100;
        int depositAmount = 100;
        int balance = clientAccount + depositAmount;
        int bonus = balance / depositAmount * 1;

        if(balance > 1000){
            System.out.println (bonus);
        }
        else{

        }
    }
}
