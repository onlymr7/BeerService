package onlymr.microservicebeer.client.web_controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import onlymr.microservicebeer.client.web_model.BeerDto;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        // Todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto) {

        //Todo Impl
        return new ResponseEntity(HttpStatus.CREATED);
    }


    public ResponseEntity updateBeer (@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){

        //To do Impl
        return new ResponseEntity (HttpStatus.NO_CONTENT);

    }
}
