package inheritance;

public class Review {
    String body;
    String author;
    int numberOfStars;
    String movieName;

    public Review(String body, String author, int numberOfStars){
        this.body=body;
        this.author=author;
        this.numberOfStars=numberOfStars;
    }
    public Review(String body, String author, int numberOfStars,String mov){
        this.body=body;
        this.author=author;
        this.numberOfStars=numberOfStars;
        this.movieName=mov;
    }

    @Override
    public String toString() {
        String str;
        if (this.movieName==null)
        {
            str = "{Author: " + this.author + ", Body: " +this.body+ ", Number of stars: " + this.numberOfStars+"}";
        }else {
            str = "{Author: " + this.author + ", Body: " +this.body+ ", Number of stars: " + this.numberOfStars+", movie name: "+this.movieName+"}";
        }

        return str;
    }
}
