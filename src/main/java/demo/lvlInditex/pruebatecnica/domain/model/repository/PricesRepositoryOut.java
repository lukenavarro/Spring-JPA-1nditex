package demo.lvlInditex.pruebatecnica.domain.model.repository;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PriceDAO;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesRepositoryOut {
    List<PriceDAO> findByHourIntoRange(LocalDateTime hora);

}
