package SimpleGameUseJava;

class PlayerName {
    String playerName = "";
    String playerHand = "";

    public PlayerName(Integer name) {
        if (name.intValue() == 1) {
            this.playerName = "Bill Getes";
            this.playerHand = "Scissors";
        } else if (name.intValue() == 2) {
            this.playerName = "Elon Musk";
            this.playerHand = "Rock";
        } else {
            this.playerName = "Steve Jobs";
            this.playerHand = "Paper";
        }
    }

    public String getName() {
        return this.playerName;
    }

    public String getHand() {
        // String plData = this.playerName + "show hand: " + playerHand;
        return this.playerHand;
    }
}