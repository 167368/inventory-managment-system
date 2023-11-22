public class PlayerDetails {
    String playerName;
    int playerAge;
     String playerPassword;
    String playerEmail;
    int playerID;
    int playerBalance;


    public PlayerDetails(String playerName,String playerPassword,int playerAge,int playerBalance) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerEmail = playerEmail;
        this.playerID = playerID;
        this.playerPassword=playerPassword;
        this.playerBalance=playerBalance;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public int getPlayerID() {
        return playerID;

    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public String getPlayerPassword() {
        return playerPassword;
    }
    public boolean LoginPlayerDetails(String enteredPlayerName, String enteredPassword) {
        return enteredPlayerName.equals(this.playerName) && enteredPassword.equals(this.playerPassword);
    }

    public void setPlayerBalance(int playerBalance) {
        this.playerBalance = playerBalance;
    }

    public int getPlayerBalance() {
        return playerBalance;
    }
}

