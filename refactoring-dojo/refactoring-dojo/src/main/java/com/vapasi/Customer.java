package com.vapasi;

import java.util.List;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String rentalRecordWithRentalPoints(List<Rental> listOfRentals) {

        int frequentRenterPoints =0;
        int finalRenterPoints = 0;
        double rentalAmountForMovie = 0;
        double totalAmountForMovie = 0;

        String result = "Rental record for " + this.name + "\n";

        for (Rental rental : listOfRentals) {

            frequentRenterPoints = rental.frequentRenterPointsForMovie();
            rentalAmountForMovie = rental.rentalAmountForMovie();

            totalAmountForMovie += rentalAmountForMovie;
            finalRenterPoints += frequentRenterPoints;
        }

        result += "Amount owed is " + String.valueOf(totalAmountForMovie) + "\n";
        result += "You earned " + String.valueOf(finalRenterPoints) + " frequent renter points";

        return result;
    }
}
