package inheritance;

import java.util.ArrayList;

public class Theater extends Manager {
    private ArrayList<String> movies;
    private ArrayList<Review> reviews;

    public Theater(String name) {
        super(name);
        movies=new ArrayList<>();
        reviews=new ArrayList<>();
    }
    public void addMovie(String movie){
        if (!movies.contains(movie)){
            movies.add(movie);
        }

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

    @Override
    public void addReview(Review rev) {
        reviews.add(rev);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + super.getName() + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }
}
