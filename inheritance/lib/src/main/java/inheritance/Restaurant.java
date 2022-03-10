package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Manager{
    int NumberOfStars;
    String price;
    ArrayList<Review> reviews;

    public Restaurant(String name,int NumberOfStars,String price){
        super(name);
        if (NumberOfStars>=0 && NumberOfStars<=5)
        {
            this.NumberOfStars=NumberOfStars;
        }
        this.price=price;
        reviews=new ArrayList<>();
    }

    public void setNumberOfStars(int numberOfStars) {
        NumberOfStars = numberOfStars;
    }

    public int getNumberOfStars() {
        return NumberOfStars;
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
    public void addReview(Review rev) {
        reviews.add(rev);
        editStars();
    }

    @Override
    public String toString(){
        String str="Restaurant name: "+super.getName()+"\n"+"Number of stars: "+this.NumberOfStars+"\n"+"Price: "+this.price+"\n"+"Reviews:\n"+reviews;

        return str;
    }
}
