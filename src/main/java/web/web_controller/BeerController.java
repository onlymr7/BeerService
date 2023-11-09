package web.web_controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import web.web_model.BeerDto;

import java.util.UUID;
@Validated
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@NotNull @PathVariable("beerId") UUID beerId){

        // Todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody @Validated BeerDto beerDto) {

        //Todo Impl
        return new ResponseEntity(HttpStatus.CREATED);
    }


    public ResponseEntity updateBeer (@PathVariable("beerId") UUID beerId, @RequestBody  @Validated BeerDto beerDto){

        //To do Impl
        return new ResponseEntity (HttpStatus.NO_CONTENT);

    }
}
