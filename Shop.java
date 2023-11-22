public class Shop {
    String shopName;
    int shopID;
    String gamesAvailable;
    Double shopRating;
    int deliveryCost;

    int availableStock;
    public Shop(String shopName, double shopRating , int shopID,int availableStock,int deliveryCost){
        this.shopName = shopName;
        this.shopID = shopID;
        this.gamesAvailable = gamesAvailable;
        this.shopRating = shopRating;
        this.availableStock=availableStock;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setGamesAvailable(String gamesAvailable) {
        this.gamesAvailable = gamesAvailable;
    }

    public String getGamesAvailable() {
        return gamesAvailable;
    }

    public void setShopRating(Double shopRating) {
        this.shopRating = shopRating;
    }

    public Double getShopRating() {
        return shopRating;
    }
    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;}
    public int getAvailableStock() {
        return availableStock;
    }
    public void updateStock(int quantitySold) {

        if (quantitySold > 0 && quantitySold <= availableStock) {
            availableStock -= quantitySold;
            System.out.println(quantitySold + " games sold. Updated available stock: " + availableStock);
        } else {
            System.out.println("Invalid quantity or insufficient stock.");
        }
    }

    public void setDeliveryCost(int deliveryCost) {
        this.deliveryCost = deliveryCost;
    }
    public int getDeliveryCost() {
        return deliveryCost;
    }
}




