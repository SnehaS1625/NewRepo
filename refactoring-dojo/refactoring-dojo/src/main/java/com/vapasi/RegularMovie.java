package com.vapasi;

public class RegularMovie implements Movie{

    private String movieTitle;
    private int priceOfMovie;

    private static final int ACTUAL_DAYS = 2;
    private double finalPriceOfMovie = 0;
    private int frequentRenterPoints;

    public RegularMovie(String movieTitle , int priceOfMovie){
        this.movieTitle = movieTitle;
        this.priceOfMovie = priceOfMovie;
    }

    @Override
    public double rentCalculationForMovie(int rentedDays) {
        finalPriceOfMovie += priceOfMovie;

        if (rentedDays >  ACTUAL_DAYS)
           return finalPriceOfMovie += (rentedDays - ACTUAL_DAYS) * priceOfMovie;

        return finalPriceOfMovie;
    }

    @Override
    public int frequentRenterPoints(int numOfDaysRented) {
        return ++frequentRenterPoints;
    }

}
