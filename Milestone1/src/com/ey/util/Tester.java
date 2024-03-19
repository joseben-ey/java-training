package com.ey.util;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class InvalidMovieIdException extends Exception {
    public InvalidMovieIdException(String message) {
        super(message);
    }
}

interface BookMyMovie {
    double calculateTicketAmount(int movieId, int noOfTickets) throws InvalidMovieIdException;
}

public class Tester {
    public static void main(String[] args) {
        BookMyMovie bookMyMovie = new BookMyMovieImpl();
        try {
            int movieId = 101; 
            int noOfTickets = 3; 
            double totalAmount = bookMyMovie.calculateTicketAmount(movieId, noOfTickets);
            System.out.println("Total ticket amount after discount: $" + totalAmount);
        } catch (InvalidMovieIdException e) {
            System.out.println(e.getMessage());
        }
    }
}