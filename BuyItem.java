public class BuyItem {
    private int price;
    public int deliveryCost;
    public int totalPay;

    public BuyItem() {
        this.price = 0;
        this.deliveryCost = 0;
        this.totalPay = 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setDeliveryCost(int deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public int getDeliveryCost() {
        return deliveryCost;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }
    public void buyGame(PlayerDetails player, GameDetails game, Shop shop, int quantity) {
        // Check if there is enough stock in the selected shop
        if (quantity >=1 && quantity <= shop.getAvailableStock()) {
            // Calculate the total payment
            int totalCost = game.getPrice() * quantity;
            int deliveryCost = shop.getDeliveryCost();
            int totalPay = totalCost + deliveryCost;

            // Deduct the total payment from the player's balance
            if (totalPay <= player.getPlayerBalance()) {
                player.setPlayerBalance(player.getPlayerBalance() - totalPay);

                // Update the shop's available stock
                shop.setAvailableStock(shop.getAvailableStock() - quantity);

                // Update BuyItem properties
                setPrice(totalCost);
                setDeliveryCost(deliveryCost);
                setTotalPay(totalPay);

                System.out.println("Purchase successful!");
                System.out.println("Purchased Game: " + game.getName());
                System.out.println("Quantity: " + quantity);
                System.out.println("Total Payment: $" + totalPay);
            } else {
                System.out.println("Insufficient balance. Please add funds to your account.");
            }
        } else {
            System.out.println("Invalid quantity or insufficient stock in the selected shop.");
        }
    }
    public void printNewBalance(PlayerDetails player, int totalPay) {
        int newBalance = player.getPlayerBalance() - totalPay;
        System.out.println("Your new Balance is: " + newBalance);
    }




}