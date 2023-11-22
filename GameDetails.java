public class GameDetails {


    public String games;

    private String name;
    private String category;
    public int price;
    private int downloads;
    private Double rating;
    private Double memorySize;
    private int ageRestriction;
    private int shopNumber;
    private int availableStock;

    // Default constructor
    public GameDetails(String name, int price, double rating) {
        this.ageRestriction = ageRestriction;
        this.name = name;
        this.category = category;
        this.price = price;
        this.downloads = downloads;
        this.shopNumber = shopNumber;
        this.availableStock = availableStock;
        this.rating = rating;
        this.memorySize = memorySize;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDownloads() {
        return downloads;
    }

    public void incrementDownloads() {
        this.downloads++;
    }

    public Double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Double memorySize) {
        this.memorySize = memorySize;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public int getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(int shopNumber) {
        this.shopNumber = shopNumber;
    }

    public void setDownloads(int downloads) {
        this.downloads=downloads;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock=availableStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }

}

