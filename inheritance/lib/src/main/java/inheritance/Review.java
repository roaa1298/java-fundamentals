package inheritance;

public class Review {
    String body;
    String author;
    int numberOfStars;

    public Review(String body, String author, int numberOfStars){
        this.body=body;
        this.author=author;
        this.numberOfStars=numberOfStars;
    }
    @Override
    public String toString() {
        String str = "{Author: " + this.author + ", Body: " +this.body+ ", Number of stars: " + this.numberOfStars+"}";
        return str;
    }
}
