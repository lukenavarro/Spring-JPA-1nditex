package demo.lvlInditex.pruebatecnica.Infrastracture.Mapper;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.domain.model.entities.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface PricesDTOMapper {

    @Mapping(target= "brandID",source ="brandID")
    @Mapping(target = "productID",source = "productID")
    @Mapping(target = "priority",source = "priority")
    @Mapping(target = "price",source = "price")
    @Mapping(target = "curr",source = "curr")
    PricesDAO pricesDTOToPricesDAO(PricesDTO pricesDTO);
    Prices pricesDTOToPrices (PricesDTO pricesDTO);
}
