package demo.lvlInditex.pruebatecnica;

import demo.lvlInditex.pruebatecnica.Infrastracture.Controllers.PricesControllerImpl;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.domain.UseCase.PricesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ControllerUnitaryTest {

	@InjectMocks
	private PricesControllerImpl pricesController;
	@Mock
	private PricesService pricesService;

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
	void shouldNotWorkCauseEmptyList() {
		ArrayList<PricesDTO> emptyList = new ArrayList<>();
		LocalDateTime t1 = LocalDateTime.parse("2022-07-14T15:00:00");
		when(pricesService.getPriceIntoHours(t1,1L,35455L)).thenReturn(emptyList);
		ResponseEntity<List<PricesDTO>> re1 = pricesController.getByHourInterval(t1,1L,35455L);
		assertEquals(re1.getStatusCodeValue(),404);
	}

	@Test
	void shouldWorkCauseListWithContent() {
		ArrayList<PricesDTO> listWithPrice = new ArrayList<>();
		listWithPrice.add(pricesDTO);
		LocalDateTime time = LocalDateTime.parse("2020-07-14T15:00:00");
		when(pricesService.getPriceIntoHours(time,1L,35455L)).thenReturn(listWithPrice);
		ResponseEntity<List<PricesDTO>> responseEntity = pricesController.getByHourInterval(time,1L,35455L);
		assertEquals(responseEntity.getStatusCodeValue(), 200);
	}

}
