package com.javageek.mapper;

import org.mapstruct.Mapper;

import com.javageek.domain.Beer;
import com.javageek.web.model.BeerDto;

@Mapper(uses= {DateMapper.class})
public interface BeerMapper {
	BeerDto beerToBeerDto(Beer beer);
	
	Beer beerDtoToBeer(BeerDto beerDto);
}
