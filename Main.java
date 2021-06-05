package SimpleGameUseJava;
import java.util.Scanner;

public class Main {
    static Integer counter = 1;
    static String winner = "Hafiz";
    public static void main(String[] args) {
        while (counter <= 5) {

            System.out.println("Game rule: 1. Scissors 2. Rock 3.Paper");
            System.out.println("    |==|");
            System.out.println("  |======|");
            System.out.println("|==========|");
            
            System.out.println("Please choose choose oposit role: 1. Bill Getes 2. Elon Musk 3. Steve Jobs (Input related number)");
            Scanner plNumber = new Scanner(System.in);
            Integer playerName = plNumber.nextInt();
            PlayerName name = new PlayerName(playerName);
            String plNme = name.getName();
            String plHnd = name.getHand();
            System.out.println("You choose: " + plNme);

            Scanner bool = new Scanner(System.in);
            System.out.print("Do you wanna play now? (y/n)");
            String yAndn = bool.nextLine();

            if (yAndn.equals("y")) {
                 // Hand relatet cal
                System.out.println("Please show your hand: 1. Scissors 2. Rock 3.Pape (Input related number)");
                Scanner hand = new Scanner(System.in);
                Integer hndNum = hand.nextInt();
                PlayerHand myHand = new PlayerHand(hndNum);
                String myHnd = myHand.getHndName();

                if (plHnd.equals(myHnd)) {
                    System.out.println("You how " + myHnd);
                    System.out.println(plNme + " how " + plHnd);
                    System.out.println("Ended in a tie!");
                    break;
                }else if (counter == 5) {
                    System.out.println(
                            "You have try so many times. Sorry, we couldn't found no more option for you. Please play leter (:");
                    break;
                }else if(!plHnd.equals(myHnd)){
                    System.out.println("You how " + myHnd);
                    System.out.println(plNme + " how " + plHnd);
                    System.out.println("Sorry, you lost!");
                    counter++;
                }else {
                    Scanner tryOnce = new Scanner(System.in);
                    System.out.println(plNme + " wanna try once more? (y/n): ");
                    String yAndnTry = tryOnce.nextLine();
                    if(yAndnTry.equals("y")){
                        counter++;
                    }else{
                        break;
                    }
                }
            } else {
                break;
            }
        }
    };
}
