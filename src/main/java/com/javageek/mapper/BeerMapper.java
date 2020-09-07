package com.javageek.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import com.javageek.domain.Beer;
import com.javageek.web.model.BeerDto;

@Mapper(uses= {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {
	BeerDto beerToBeerDto(Beer beer);
	
	BeerDto beerToBeerDtoWithInventory(Beer beer);
	
	Beer beerDtoToBeer(BeerDto beerDto);
}
