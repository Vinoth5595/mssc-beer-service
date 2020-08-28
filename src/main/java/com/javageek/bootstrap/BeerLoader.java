package com.javageek.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javageek.domain.Beer;
import com.javageek.repository.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {
	
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
					.upc(12345L)
					.price(new BigDecimal("12.50"))
					.build());
			
			beerRepository.save(Beer.builder()
					.beerName("Beer 2")
					.beerStyle("Beer Style 2")
					.minOnHand(24)
					.quantityToBrew(200)
					.upc(23456L)
					.price(new BigDecimal("15.50"))
					.build());
		}
	}

}
