package demo.lvlInditex.pruebatecnica;

import demo.lvlInditex.pruebatecnica.Application.UseCase.PricesServiceImpl;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.Infrastracture.Mapper.PricesDAOMapper;
import demo.lvlInditex.pruebatecnica.Infrastracture.Mapper.PricesMapper;
import demo.lvlInditex.pruebatecnica.Infrastracture.repository.PricesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceUnitaryTest {
    @InjectMocks
    private PricesServiceImpl pricesService;

    @Mock
    private PricesRepository pricesRepository;

    @Mock
    private PricesDAOMapper pricesDAOMapper;

    @Mock
    private PricesMapper pricesMapper;

    private PricesDTO pricesDTO = PricesDTO.builder()
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
    void ShouldNotWorkCauseEmptyList(){
        List<PricesDTO> emptyList = new ArrayList<>();
        LocalDateTime time = LocalDateTime.parse("2022-07-25T18:05:05");
        when(pricesService.getPriceIntoHours(time,1L,35455L)).thenReturn(emptyList);
        assertEquals(emptyList,pricesService.getPriceIntoHours(time,1L,35455L));
    }

    @Test
    void ShouldWorkCauseListWithContent(){
        List<PricesDTO> resultList = new ArrayList<>();
        resultList.add(pricesDTO);
        LocalDateTime time = LocalDateTime.parse("2020-08-06T22:05:07");
        when(pricesService.getPriceIntoHours(time,1L,35455L)).thenReturn(resultList);
        assertEquals(resultList,pricesService.getPriceIntoHours(time,1L,35455L));
    }
}
