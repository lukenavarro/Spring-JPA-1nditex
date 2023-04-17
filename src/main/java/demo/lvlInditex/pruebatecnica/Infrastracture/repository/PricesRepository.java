package demo.lvlInditex.pruebatecnica.Infrastracture.repository;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PriceDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PricesRepository extends JpaRepository<PriceDAO,Long> {
    @Query(value = "SELECT p FROM PRICES p WHERE :hora BETWEEN p.startDate AND p.endDate AND p.brandID=1 AND p.productID=35455")
    List<PriceDAO> findByHourIntoRange(LocalDateTime hora);
}
