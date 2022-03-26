package inheritance;

import java.util.ArrayList;

public class Theater extends Review {
    private String name;
    private ArrayList<String> movies;
    private ArrayList<Review> reviews;

    public Theater(String name) {
        this.name=name;
        movies=new ArrayList<>();
        reviews=new ArrayList<>();
    }
    public void addMovie(String movie){
        if (!movies.contains(movie)){
            movies.add(movie);
        }

    }

    public String getName() {
        return name;
    }

    public void removeMovie(String movie){
        movies.remove(movie);
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review rev) {
        reviews.add(rev);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + this.name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }
}
