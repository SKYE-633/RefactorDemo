package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double getMovieAmount(){
        return this.movie.getAmount(this);
    }

    public double getFrequentRenterPoint() {return this.movie.getFrequentRenterPoint(this);}



}