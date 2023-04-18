package demo.lvlInditex.pruebatecnica.Infrastracture.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PricesDTO {
    @JsonProperty(value = "BRAND_ID")
    private Long brandID;

    @JsonProperty(value = "START_DATE")
    private LocalDateTime startDate;

    @JsonProperty(value ="END_DATE")
    private LocalDateTime endDate;

    @JsonProperty(value = "PRICE_LIST")
    private Long priceList;

    @JsonProperty(value = "PRODUCT_ID")
    private Long productID;

    @JsonProperty(value = "PRIORITY")
    private Long priority;

    @JsonProperty(value = "PRICE")
    private Double price;

    @JsonProperty (value = "CURR")
    private String curr;

}
