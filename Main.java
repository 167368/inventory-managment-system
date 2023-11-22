import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to LootHub Gaming.");
        PlayerDetails player1 = new PlayerDetails("Mendez", "12345", 25, 5000);
        PlayerDetails player2 = new PlayerDetails("finomino", "54321", 30, 15000);
        ArrayList<GameDetails> games = new ArrayList<>();
        games.add(new GameDetails("Awesome Game", 5000, 4.5));
        games.add(new GameDetails("Exciting Adventure", 3000, 3.9));
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Game Shop A", 5.0, 50,2,200));
        shops.add(new Shop("Game Shop B", 4.0, 30,5,200));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter playername: ");
        String enteredPlayerName = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();
        PlayerDetails loggedInPlayer = null;
        for (PlayerDetails player : new PlayerDetails[]{player1, player2}) {
            if (player.LoginPlayerDetails(enteredPlayerName, enteredPassword)) {
                loggedInPlayer = player;
                break;
            }
        }

        if (loggedInPlayer != null) {
            System.out.println("Login successful! Welcome, " + enteredPlayerName);
            System.out.println("Your Account Balance is: $" + loggedInPlayer.getPlayerBalance());
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        // Display available games
        System.out.println("Available Games:");
        for (int i = 0; i < games.size(); i++) {
            GameDetails game = games.get(i);
            System.out.println((i + 1) + ". " + game.getName() + " - Price: $" + game.getPrice() + " - Rating: " + game.getRating());
        }
        System.out.print("Enter the number of the game you want to buy: ");
        int selectedGame = scanner.nextInt();
        GameDetails selectedGameDetails = games.get(selectedGame - 1);
        System.out.println("Available Shops:");
        for (int i = 0; i < shops.size(); i++) {
            Shop shop = shops.get(i);
            System.out.println((i + 1) + ". " + shop.getShopName()+ " - Delivery Cost: Ksh" + shop.deliveryCost+  " - Stock: " + shop.getAvailableStock());
        }
        System.out.print("Enter the number of the shop you want to buy from: ");
        int selectedShop = scanner.nextInt();

        Shop selectedShopDetails = shops.get(selectedShop - 1);
        System.out.print("Enter the quantity you want to buy: ");
        int quantity = scanner.nextInt();
        BuyItem buyItem = new BuyItem();
        buyItem.buyGame(loggedInPlayer, selectedGameDetails, selectedShopDetails,quantity);
        System.out.println("Enjoy and come back again");
    }

}
//shop.getDeliveryCost()
//BuyItem buyItem = new BuyItem(); // Create an instance of BuyItem
//buyItem.buyGame(loggedInPlayer, selectedGameDetails, selectedShopDetails, quantity);
//buyItem.printNewBalance(loggedInPlayer, totalPay);

