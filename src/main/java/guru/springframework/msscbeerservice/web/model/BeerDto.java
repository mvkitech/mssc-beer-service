package guru.springframework.msscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	private String beerName;
	
	@NotBlank
	private BeerStyleEnum beerStyle;

	@Positive
	@NotBlank
	private Long upc;

	@Positive
	@NotBlank
	private BigDecimal price;
	
	private Integer quantityOnHand;
}
