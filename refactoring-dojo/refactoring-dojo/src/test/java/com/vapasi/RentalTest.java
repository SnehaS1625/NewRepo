package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

    private Rental rental;

    @Test
    public void shouldReturnRentalAMountForMovie(){
        Movie movie = new ChildrenMovie("Frozen",75);
        rental = new Rental(movie,2);

        double rentalAmount = rental.rentalAmountForMovie();
        assertEquals(75 , rentalAmount);
    }
    @Test
    public void shouldReturnFrequentRenterPoints(){
        Movie movie = new NewReleaseMovie("Frozen",75);
        rental = new Rental(movie,3);

        int rentalAmount = rental.frequentRenterPointsForMovie();
        assertEquals(2, rentalAmount);
    }



}
