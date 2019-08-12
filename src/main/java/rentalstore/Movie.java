package rentalstore;

public abstract class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getAmount(Rental rental);

    public abstract double getFrequentRenterPoint(Rental rental);
}
