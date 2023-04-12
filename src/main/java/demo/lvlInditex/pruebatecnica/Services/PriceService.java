package demo.lvlInditex.pruebatecnica.Services;

import demo.lvlInditex.pruebatecnica.Model.Entities.Prices;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PriceService {
    Optional<Prices> findByCustomQuery(LocalDateTime hora);

    List<Prices> getPrices();
}
