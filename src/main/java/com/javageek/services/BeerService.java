package com.javageek.services;

import java.util.UUID;

import org.springframework.data.domain.PageRequest;

import com.javageek.web.model.BeerDto;
import com.javageek.web.model.BeerPagedList;
import com.javageek.web.model.BeerStyleEnum;

public interface BeerService {
	 BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

	 BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

	 BeerDto saveNewBeer(BeerDto beerDto);

	 BeerDto updateBeer(UUID beerId, BeerDto beerDto);

	BeerDto getByUpc(String upc);

}
