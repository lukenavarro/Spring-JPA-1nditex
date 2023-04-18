package demo.lvlInditex.pruebatecnica.Application.UseCase;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.Infrastracture.Mapper.PricesDTOMapper;
import demo.lvlInditex.pruebatecnica.Infrastracture.Mapper.PricesMapper;
import demo.lvlInditex.pruebatecnica.Infrastracture.Mapper.PricesDAOMapper;
import demo.lvlInditex.pruebatecnica.domain.UseCase.PricesService;
import demo.lvlInditex.pruebatecnica.domain.model.entities.Prices;
import demo.lvlInditex.pruebatecnica.Infrastracture.repository.PricesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PricesServiceImpl implements PricesService {
    private final PricesRepository pricesRepository;
    private final PricesDAOMapper pricesDAOMapper;
    private final PricesMapper pricesMapper;

    private final PricesDTOMapper pricesDTOMapper;

    @Override
    public List<PricesDTO> getPriceIntoHours(LocalDateTime hour,Long brandID, Long productID) {
        List<Prices> pricesList =  pricesDAOMapper.priceDAOToListPrice(pricesRepository.findByHourIntoRange(hour,brandID,productID));
        return pricesMapper.priceToListPriceDTO(pricesList.stream().max(Comparator.comparing(Prices::getPriority)).stream().collect(Collectors.toList()));
    }


    public PricesDTO addNewPrices(PricesDTO pricesDTO){
        return pricesDAOMapper
                .priceDAOToPricesDTO(pricesRepository
                        .save(pricesDTOMapper.pricesDTOToPricesDAO(pricesDTO)));
    }
}
