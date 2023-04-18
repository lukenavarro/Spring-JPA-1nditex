package demo.lvlInditex.pruebatecnica.domain.UseCase;

import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PricesService {

    List<PricesDTO> getPriceIntoHours(LocalDateTime hour);

    PricesDTO addNewPrices(PricesDTO pricesDTO);
}
