package demo.lvlInditex.pruebatecnica.Infrastracture.Controllers;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesController {
    ResponseEntity<List<PricesDTO>> getByHourInterval(LocalDateTime hour,Long brandID, Long productID);
    PricesDTO addNewPrices(PricesDTO pricesDTO);
}
