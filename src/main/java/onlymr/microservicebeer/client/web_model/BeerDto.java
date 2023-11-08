package onlymr.microservicebeer.client.web_model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;


    @NotBlank
    private String beername;

    @NotNull
    private BeerStyleEnum beerStyle;
    enum BeerStyleEnum {

    }

    @Positive
    @NotNull
    private long upc;


    @NotNull
    @Positive
    private BigDecimal price;


    private Integer qualityOnHand;

}
