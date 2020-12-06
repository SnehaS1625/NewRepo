package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    private Customer customer;
    private Movie childrenMovie;
    private Movie newReleaseMovie;
    private Movie regularMovie;
    private Rental rental;
    List<Rental> listOfRental = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        customer = new Customer("Sneha");

        Movie movie = new ChildrenMovie("Frozen",75);
        rental = new Rental(movie,1);
        listOfRental.add(rental);

        movie = new NewReleaseMovie("Ratnam",75);
        rental = new Rental(movie,1);
        listOfRental.add(rental);

        movie = new RegularMovie("Akash",75);
        rental = new Rental(movie,1);
        listOfRental.add(rental);
    }

    @Test
    public void shouldReturnTheFinalStatement(){
      String result =   customer.rentalRecordWithRentalPoints(listOfRental);
        System.out.println(result);
        Assertions.assertNotNull(result);

    }

}
