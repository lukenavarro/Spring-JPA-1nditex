package demo.lvlInditex.pruebatecnica.domain.model.repository;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesRepositoryOut {
    List<PricesDAO> findByHourIntoRange(LocalDateTime hour,Long brandID,Long productID);

}
