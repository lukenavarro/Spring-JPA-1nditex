package demo.lvlInditex.pruebatecnica.Model.Entities;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "PRICES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prices {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "BRAND_ID")
    private Long brandID;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    @Column (name = "PRICE_LIST")
    private Long priceList;
    @Column (name = "PRIORITY")
    private Long priority;
    @Column(name = "PRODUCT_ID")
    private Long productID;
    @Column (name = "PRICE")
    private Double price;
    @Column (name = "CURR")
    private String curr;





}
