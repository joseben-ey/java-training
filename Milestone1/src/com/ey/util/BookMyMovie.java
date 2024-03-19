package com.ey.util;

public class BookMyMovie {
	
	Integer movieId;
	Integer noOfTickets;
	Double discount;
	Double totalAmount;
	
	public static void BookMyMovie() {
		
		
				
	}

	public BookMyMovie(Integer movieId, Integer noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void calculateDiscount() {
		
		if (movieId==101 || movieId==102 || movieId==103)
		{
			if (noOfTickets<5)
				discount=0.0;
		}
		if (movieId==101 || movieId==103)
		{
			if (noOfTickets>=5 && noOfTickets<10 )
				discount=0.15;
		}
		
		if (movieId==101 || movieId==103)
		{
			if (noOfTickets>=10 && noOfTickets<=15 )
				discount=0.20;
		}	
		if (movieId==102)
		{
			if (noOfTickets>=10 && noOfTickets<=15 )
				discount=0.15;
			else
				discount=0.1;
		}	
	}
	
	
	public double calculateTicketAmount() {
		calculateDiscount();
		int BaseFare = 0;
		switch(movieId){
		case 101:
			BaseFare=120;
			break;
		case 102:
			BaseFare=170;
			break;
		case 103:
			BaseFare=150;
		}
		
		double totalAmount = (BaseFare * noOfTickets * discount);
		return totalAmount;
		
	}
}
