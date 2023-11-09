package web.mappers;

import onlymr.microservicebeer.client.domain.Beer;
import org.mapstruct.Mapper;
import web.web_model.BeerDto;

@Mapper(uses ={DateMapper.class})
public interface BeerMapper {
    BeerDto beerToDto (Beer beer);

    Beer beerDtoToBeer (BeerDto beerDto);
}
