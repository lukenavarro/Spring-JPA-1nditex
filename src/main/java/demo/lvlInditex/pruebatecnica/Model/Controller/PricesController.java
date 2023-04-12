package demo.lvlInditex.pruebatecnica.Model.Controller;


import demo.lvlInditex.pruebatecnica.Model.Entities.Prices;
import demo.lvlInditex.pruebatecnica.Model.Repositories.PricesRepository;
import demo.lvlInditex.pruebatecnica.Services.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PricesController {
    private final PriceService priceService;
    @PostMapping("/prices")
    public List<Prices> getPrices(){
        return priceService.getPrices();
    }
    @PostMapping("/prices/hora")
    public Optional<Prices> getByHour(@RequestParam("hora") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime hora){
        return priceService.findByCustomQuery(hora);
    }

}
