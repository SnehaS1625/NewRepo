package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    private Movie movie;
    private static final int NUMBER_OF_DAYS_RENTED = 3;
    private static final int PRICE_OF_MOVIE = 75;

    @Test
    public void shouldReturnRentCalculationAndFrequentRentalPointsForNewReleaseMovie(){
        movie = new NewReleaseMovie("Ratnam",75);

        double rentalAmountForMovie = movie.rentCalculationForMovie(NUMBER_OF_DAYS_RENTED);
        int frequentRenterPoints = movie.frequentRenterPoints(NUMBER_OF_DAYS_RENTED);

        assertEquals( 450,rentalAmountForMovie);
        assertEquals(2,frequentRenterPoints);

    }

    @Test
    public void shouldReturnRentCalculationAndFrequentRentalPointsForChildrenMovie(){
        movie = new ChildrenMovie("Frozen",75);

        double rentalAmountForMovie = movie.rentCalculationForMovie(NUMBER_OF_DAYS_RENTED);
        int frequentRenterPoints = movie.frequentRenterPoints(NUMBER_OF_DAYS_RENTED);

        assertEquals( 75,rentalAmountForMovie);
        assertEquals(1,frequentRenterPoints);

    }

    @Test
    public void shouldReturnRentCalculationAndFrequentRentalPointsForRegularMovie(){
        movie = new ChildrenMovie("Akash",75);

        double rentalAmountForMovie = movie.rentCalculationForMovie(NUMBER_OF_DAYS_RENTED);
        int frequentRenterPoints = movie.frequentRenterPoints(NUMBER_OF_DAYS_RENTED);

        assertEquals( 75,rentalAmountForMovie);
        assertEquals(1,frequentRenterPoints);

    }

}
