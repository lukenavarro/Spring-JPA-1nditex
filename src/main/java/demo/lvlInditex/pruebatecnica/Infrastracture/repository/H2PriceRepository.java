package demo.lvlInditex.pruebatecnica.Infrastracture.repository;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PriceDAO;
import demo.lvlInditex.pruebatecnica.domain.model.repository.PricesRepositoryOut;

import java.time.LocalDateTime;
import java.util.List;

public class H2PriceRepository implements PricesRepositoryOut {

    private PricesRepository pricesRepository;
    public List<PriceDAO> findByHourIntoRange(LocalDateTime hora){
        return pricesRepository.findByHourIntoRange(hora);
    }


}
