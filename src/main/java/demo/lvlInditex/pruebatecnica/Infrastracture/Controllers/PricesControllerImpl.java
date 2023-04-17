package demo.lvlInditex.pruebatecnica.Infrastracture.Controllers;

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
    @GetMapping("/prices/hora")
    public ResponseEntity<List<PricesDTO>> getByHourInterval(@RequestParam("hora") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime hora){
        List<PricesDTO> lista = pricesService.getPriceIntoHours(hora);
        if(lista.isEmpty()){
            return new ResponseEntity<>(lista, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }


}
