package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.domain.Beer.BeerBuilder;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerDto.BeerDtoBuilder;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-16T09:45:25-0600",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        if ( beer.getUpc() != null ) {
            beerDto.upc( Long.parseLong( beer.getUpc() ) );
        }
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }

    @Override
    public BeerDto beerToBeerDtoWithInventory(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        if ( beer.getUpc() != null ) {
            beerDto.upc( Long.parseLong( beer.getUpc() ) );
        }
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        if ( dto.getVersion() != null ) {
            beer.version( dto.getVersion().longValue() );
        }
        beer.createdDate( dateMapper.asTimestamp( dto.getCreatedDate() ) );
        beer.lastModifiedDate( dateMapper.asTimestamp( dto.getLastModifiedDate() ) );
        beer.beerName( dto.getBeerName() );
        if ( dto.getBeerStyle() != null ) {
            beer.beerStyle( dto.getBeerStyle().name() );
        }
        if ( dto.getUpc() != null ) {
            beer.upc( String.valueOf( dto.getUpc() ) );
        }
        beer.price( dto.getPrice() );

        return beer.build();
    }
}
