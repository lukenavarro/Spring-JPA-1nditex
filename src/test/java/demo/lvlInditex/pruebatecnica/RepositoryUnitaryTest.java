package demo.lvlInditex.pruebatecnica;

import demo.lvlInditex.pruebatecnica.Infrastracture.DAO.PricesDAO;
import demo.lvlInditex.pruebatecnica.Infrastracture.repository.H2PricesRepository;
import demo.lvlInditex.pruebatecnica.Infrastracture.repository.PricesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RepositoryUnitaryTest {
    @InjectMocks
    private H2PricesRepository H2pricesRepository;

    @Mock
    private PricesRepository pricesRepository;

    private PricesDAO pricesDAO = PricesDAO.builder()
            .brandID(1L)
            .startDate(LocalDateTime.parse("2020-06-15T16:00:00"))
            .endDate(LocalDateTime.parse("2020-12-31T23:59:59"))
            .priceList(4L)
            .productID(35455L)
            .priority(1L)
            .price(38.95)
            .curr("EUR")
            .build();

    @Test
    void shouldNotWorkCauseEmptyList(){
        ArrayList<PricesDAO> emptyList = new ArrayList<>();
        LocalDateTime time = LocalDateTime.parse("2002-05-05T21:00:00");
        when(pricesRepository.findByHourIntoRange(time)).thenReturn(emptyList);
        assertEquals(emptyList,pricesRepository.findByHourIntoRange(time));
    }
    @Test
    void shouldWorkCauseListWithResult(){
        ArrayList<PricesDAO> listResult = new ArrayList<>();
        listResult.add(pricesDAO);
        LocalDateTime time = LocalDateTime.parse("2020-07-15T19:05:06");
        when(pricesRepository.findByHourIntoRange(time)).thenReturn(listResult);
        assertEquals(listResult,pricesRepository.findByHourIntoRange(time));
    }
}
