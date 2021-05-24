package com.abrito10.beerstock.mapper;

import com.abrito10.beerstock.entity.Beer;
import com.abrito10.beerstock.dto.BeerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
