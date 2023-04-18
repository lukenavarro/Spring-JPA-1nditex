package demo.lvlInditex.pruebatecnica.Infrastracture.repository;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.domain.model.repository.PricesRepositoryOut;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class H2PricesRepository implements PricesRepositoryOut {

    private PricesRepository pricesRepository;
    public List<PricesDAO> findByHourIntoRange(LocalDateTime hour, Long brandID, Long productID){
        return pricesRepository.findByHourIntoRange(hour,brandID,productID);
    }
}
