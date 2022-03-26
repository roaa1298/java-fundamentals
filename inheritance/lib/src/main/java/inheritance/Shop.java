package inheritance;

import java.util.ArrayList;

public class Shop extends Review {
    private String name;
    private String description;
    private int price;
    ArrayList<Review> ShopReviews;
//    private int NumberOfStars=0;

    public Shop(String name, String description, int price){
        this.name=name;
        this.description=description;
        this.price=price;
        ShopReviews=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


    public void addReview(Review rev) {
        ShopReviews.add(rev);
//        editStars();
    }

//    @Override
//    public void editStars() {
//        int sum=0;
//        int avg;
//        for (Review rev:
//                ShopReviews) {
//            sum+=rev.numberOfStars;
//        }
//        avg=sum/ShopReviews.size();
//        this.NumberOfStars=avg;
//    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + this.name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", ShopReviews=" + ShopReviews +
                '}';
    }
}
