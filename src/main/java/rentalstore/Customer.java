package rentalstore;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {

        return new TextStatement().getStatement(this);
    }
    public String htmlStatement(){
        return new HtmlStatement().getStatement(this);
    }


}

