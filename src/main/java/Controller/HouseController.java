package Controller;

import model.House;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.HouseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class HouseController {


    private final HouseService houseService;

    @GetMapping
    public ResponseEntity<List<House>> listAll(@RequestParam Optional<String> zipcode) {
        List<House> listHouses = this.houseService.listAll(zipcode);
        return new ResponseEntity<>(listHouses, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<House> create(@RequestBody HouseDTO houseDTO) {
        House house = houseService.create(houseDTO);
        return new ResponseEntity<House>(house, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<House> update(@PathVariable long id, @RequestBody @Valid HouseUpdateDTO houseUpdateDTO) {
        House house = houseService.update(id, houseUpdateDTO);
        if (house != null){
            return new ResponseEntity<>(house, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        if (houseService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

