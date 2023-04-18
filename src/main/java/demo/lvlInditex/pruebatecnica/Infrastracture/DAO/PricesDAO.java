package demo.lvlInditex.pruebatecnica.Infrastracture.DAO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "PRICES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PricesDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
    private Long id;
    @Column(name ="brand_ID")
    private Long brandID;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column (name = "END_DATE")
    private LocalDateTime endDate;
    @Column(name = "PRICE_LIST")
    private Long priceList;
    @Column(name = "PRODUCT_ID")
    private Long productID;
    @Column(name = "PRIORITY")
    private Long priority;
    @Column (name = "PRICE")
    private Double price;
    @Column(name = "CURR")
    private String curr;
}
