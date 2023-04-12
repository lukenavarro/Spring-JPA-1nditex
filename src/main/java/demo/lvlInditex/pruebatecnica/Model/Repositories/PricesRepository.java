package demo.lvlInditex.pruebatecnica.Model.Repositories;

import demo.lvlInditex.pruebatecnica.Model.Entities.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PricesRepository extends JpaRepository<Prices,Long> {
    @Query(value = "SELECT p FROM PRICES p WHERE :hora BETWEEN p.startDate AND p.endDate AND p.brandID=1 AND p.productID=35455")
    List<Prices> findByCustomQuery(@Param("hora") LocalDateTime hora);
}
