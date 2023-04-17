package demo.lvlInditex.pruebatecnica.Infrastracture.Mapper;

import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.domain.model.entities.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "Spring")
public interface PriceMapper {
    @Mapping(target= "brandID",source ="brandID")
    @Mapping(target = "productID",source = "productID")
    @Mapping(target = "priority",source = "priority")
    @Mapping(target = "price",source = "price")
    @Mapping(target = "curr",source = "curr")
    PricesDTO priceToPriceDTO(Prices price);
    
    List<PricesDTO> priceToListPriceDTO(List<Prices> price);
}
