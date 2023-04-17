package demo.lvlInditex.pruebatecnica.domain.model.entities;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prices {
    private Long ID;
    private Long brandID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long priceList;
    private Long productID;
    private Long priority;
    private Double price;
    private String curr;


}
