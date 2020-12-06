package com.vapasi;

public class Rental {

    private Movie movie;
    private int rentedDays;

    public Rental(Movie movie , int numberOfDaysRented) {
        this.movie = movie;
        this.rentedDays = numberOfDaysRented;
    }

    public double rentalAmountForMovie(){
        return this.movie.rentCalculationForMovie(this.rentedDays);
    }

    public int frequentRenterPointsForMovie(){
        return this.movie.frequentRenterPoints(this.rentedDays);
    }

}
