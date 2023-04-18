package demo.lvlInditex.pruebatecnica.Infrastracture.repository;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PricesRepository extends JpaRepository<PricesDAO,Long> {
    @Query(value = "SELECT p FROM PRICES p WHERE :hour BETWEEN p.startDate AND p.endDate AND p.brandID=:brandID AND p.productID=:productID")
    List<PricesDAO> findByHourIntoRange(LocalDateTime hour,Long brandID, Long productID);
}
