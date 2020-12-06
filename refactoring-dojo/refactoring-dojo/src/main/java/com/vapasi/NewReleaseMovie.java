package com.vapasi;

public class NewReleaseMovie implements  Movie{

    private String movieTitle;
    private int priceOfMovie;

    private double finalPriceOfMovie = 0;
    private int frequentRenterPoints = 0;

    public NewReleaseMovie(String movieTitle , int priceOfMovie){
        this.movieTitle = movieTitle;
        this.priceOfMovie = priceOfMovie;
    }

    @Override
    public double rentCalculationForMovie(int rentedDays) {
        return finalPriceOfMovie += (rentedDays * (priceOfMovie * 2));
    }

    @Override
    public int frequentRenterPoints(int numOfDaysRented) {
        frequentRenterPoints++;

        if(numOfDaysRented > 1)
            return ++frequentRenterPoints;

        return frequentRenterPoints;
    }
}
