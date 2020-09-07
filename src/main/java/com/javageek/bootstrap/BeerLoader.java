package com.javageek.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javageek.domain.Beer;
import com.javageek.repository.BeerRepository;

//@Component
public class BeerLoader implements CommandLineRunner {
	
	public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";
	
	private final BeerRepository beerRepository;
	
	public BeerLoader(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		loadBeerObjects();
	}

	private void loadBeerObjects() {
		if(beerRepository.count() == 0) {
			beerRepository.save(Beer.builder()
					.beerName("Beer 1")
					.beerStyle("Beer Style 1")
					.minOnHand(24)
					.quantityToBrew(200)
					.upc(BEER_1_UPC)
					.price(new BigDecimal("12.50"))
					.build());
			
			beerRepository.save(Beer.builder()
					.beerName("Beer 2")
					.beerStyle("Beer Style 2")
					.minOnHand(24)
					.quantityToBrew(200)
					.upc(BEER_2_UPC)
					.price(new BigDecimal("15.50"))
					.build());
			
			beerRepository.save(Beer.builder()
					.beerName("Beer 3")
					.beerStyle("Beer Style 3")
					.minOnHand(24)
					.quantityToBrew(200)
					.upc(BEER_3_UPC)
					.price(new BigDecimal("15.50"))
					.build());
		}
	}

}
