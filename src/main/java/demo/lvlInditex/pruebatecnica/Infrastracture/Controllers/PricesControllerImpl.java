package demo.lvlInditex.pruebatecnica.Infrastracture.Controllers;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.domain.UseCase.PricesService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PricesControllerImpl implements PricesController{
    private final PricesService pricesService;
    @GetMapping("/prices/hour")
    public ResponseEntity<List<PricesDTO>> getByHourInterval(@RequestParam("hour") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime hour){
        List<PricesDTO> list = pricesService.getPriceIntoHours(hour);
        if(list.isEmpty()){
            return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/prices")
    public PricesDTO addNewPrices(@RequestBody PricesDTO pricesDTO){
        return pricesService.addNewPrices(pricesDTO);
    }


}
