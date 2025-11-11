package Controller;

import lombok.AllArgsConstructor;
import model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.VehicleService;

@RestController
@RequestMapping("/vehicles")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    @PostMapping
    public ResponseEntity<Vehicle> create(@RequestBody VehicleDTO vehicleDTO) {
        Vehicle vehicle = vehicleService.create(vehicleDTO);
        return new ResponseEntity<Vehicle>(vehicle, HttpStatus.CREATED);
    }
    @PutMapping("/{id}/clients")
    public ResponseEntity<Vehicle> update(@PathVariable long id, @RequestBody @Valid VehicleUpdateDTO vehicleUpdateDTO) {
        Vehicle vehicle = vehicleService.update(id, vehicleUpdateDTO);
        if (vehicle != null){
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        if (vehicleService.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
