package demo.lvlInditex.pruebatecnica.Infrastracture.DTO;

import lombok.*;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PricesDTO {
    private Long brandID;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long priceList;

    private Long productID;

    private Long priority;

    private Double price;

    private String curr;

}
