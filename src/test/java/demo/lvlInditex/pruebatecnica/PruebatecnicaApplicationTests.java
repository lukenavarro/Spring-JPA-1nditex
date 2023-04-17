package demo.lvlInditex.pruebatecnica;

import demo.lvlInditex.pruebatecnica.Infrastracture.Controllers.PricesController;
import demo.lvlInditex.pruebatecnica.Infrastracture.DTO.PricesDTO;
import demo.lvlInditex.pruebatecnica.domain.UseCase.PricesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PruebatecnicaApplicationTests {

	@InjectMocks
	private PricesController pricesController;
	@Mock
	private PricesService pricesService;


	@Test
	void contextLoads() {
		ArrayList<PricesDTO> listaVacia = new ArrayList<>();
		LocalDateTime t1 = LocalDateTime.parse("2020-07-14T15:00:00");
		when(pricesService.getPriceIntoHours(any())).thenReturn(listaVacia);
		ResponseEntity<List<PricesDTO>> re1 = pricesController.getByHourInterval(t1);
		assertEquals(re1.getStatusCodeValue(),404);
	}

}
