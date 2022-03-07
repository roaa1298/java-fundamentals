package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String Name;
    int NumberOfStars;
    String price;
    ArrayList<Review> reviews;

    public Restaurant(String Name,int NumberOfStars,String price){
        this.Name=Name;
        if (NumberOfStars>=0 && NumberOfStars<=5)
        {
            this.NumberOfStars=NumberOfStars;
        }
        this.price=price;
        reviews=new ArrayList<>();
    }

    public void addReview(Review review){
        reviews.add(review);
        editStars();

    }
    public void editStars(){
        int sum=0;
        int avg;
        for (Review rev:
                reviews) {
            sum+=rev.numberOfStars;
        }
        avg=sum/reviews.size();
        this.NumberOfStars=avg;
    }

    @Override
    public String toString(){
        String str="Restaurant name: "+this.Name+"\n"+"Number of stars: "+this.NumberOfStars+"\n"+"Price: "+this.price+"\n"+"Reviews:\n"+reviews;

        return str;
    }
}
