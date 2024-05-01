import java.util.*;

public class CoinChanger {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        boolean validCoin = false;

        int coin_amount;

        while (!validCoin) {
            System.out.println("\n--- Coin Changer ---\n");

            try {
                do {
                    System.out.print("Enter amount of coins: ");
                    coin_amount = userInput.nextInt();

                    if(coin_amount <= 0) {
                        System.out.println("Invalid coin amount.");
                    }
                }while(coin_amount <= 0);
                
                getChange(coin_amount);
            }
            catch(InputMismatchException err) {
                System.out.println("Invalid coin amount.");
                userInput.nextLine();
            }             
        }

       

        
        

    }

    private static void getChange(int coin_amount) {

       System.out.println("\nYour coin amount: "+coin_amount+"\n");

        int quarters = coin_amount / 25;
        coin_amount %= 25;

        int dimes = coin_amount / 10;
        coin_amount %= 10;

        int nickels = coin_amount / 5;
        coin_amount %= 5;

        int pennies = coin_amount;

        int totalCoins = quarters + dimes + nickels + pennies;

        System.out.println("You get "+ totalCoins +" coin(s) change: ");

        if(quarters > 0) {
           System.out.println(quarters + " quarter(s)"); 
        }
        if(dimes > 0) {
            System.out.println(dimes + " dime(s)");
        }
        if(nickels > 0) {
            System.out.println(nickels + " nickel(s)");
        }
        if(pennies > 0) {
            System.out.println(pennies + " penny(ies)");
        }


    }

}