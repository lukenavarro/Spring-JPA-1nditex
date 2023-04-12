package demo.lvlInditex.pruebatecnica.Services;

import demo.lvlInditex.pruebatecnica.Model.Entities.Prices;
import demo.lvlInditex.pruebatecnica.Model.Repositories.PricesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {
    private final PricesRepository pricesRepository;
    @Override
    public Optional<Prices> findByCustomQuery(LocalDateTime hora) {
        List<Prices> priceList = pricesRepository.findByCustomQuery(hora);
        //Opcion de ordenar la lista y tomar la 1º posicion
        //priceList.sort(Comparator.comparing(Prices::getPriority));
        //return Optional.ofNullable(priceList.get(0));
        //Devolver directamente un Optional obteniendo el valor maximo de la lista
        return priceList.stream().max(Comparator.comparing(Prices::getPriority));
    }
    public List<Prices> getPrices(){
        return pricesRepository.findAll();
    }
}
