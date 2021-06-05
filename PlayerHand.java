package SimpleGameUseJava;

public class PlayerHand {
    String plHand = "Scissors";

    public PlayerHand(Integer num) {
        if (num.intValue() == 1) {
            this.plHand = "Scissors";
        } else if (num.intValue() == 2) {
            this.plHand = "Rock";
        } else {
            this.plHand = "Paper";
        }
    }

    public String getHndName() {
        return this.plHand;
    }
}
