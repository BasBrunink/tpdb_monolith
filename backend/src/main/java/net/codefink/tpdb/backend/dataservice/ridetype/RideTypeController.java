package net.codefink.tpdb.backend.dataservice.ridetype;

import net.codefink.tpdb.backend.model.ride.Ride;
import net.codefink.tpdb.backend.model.types.ridetype.CreateRideTypeDto;
import net.codefink.tpdb.backend.model.types.ridetype.RideType;
import net.codefink.tpdb.backend.model.types.ridetype.UpdateRideTypeDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController("/api/ridetype")
public class RideTypeController {

  private final RideTypeService rideTypeService;


  public RideTypeController(RideTypeService rideTypeService) {
    this.rideTypeService = rideTypeService;
  }

  //Create a new ride type
  @PostMapping()
  public Optional<RideType> createRideType(CreateRideTypeDto dto) {
    return rideTypeService.createRideType(
        RideType.builder()
            .name(dto.getName())
            .description(dto.getDescription())
            .category(dto.getCategory())
            .build());
  }
  //Read a ride type

  //Read all
  @GetMapping()
  public List<RideType> getAllRideTypes() {
    return rideTypeService.getAllRideTypes();
  }
  //Read by ID

  @GetMapping("{id}")
  public Optional<RideType> getRideTypesById(@PathVariable String id) {
    return rideTypeService.getRideType(UUID.fromString(id));
  }

  //Update a ride type
  @PutMapping("{id}")
  public Optional<RideType> updateRideTypeById(@PathVariable String id, UpdateRideTypeDto dto) {
    return rideTypeService.updateRideType(UUID.fromString(id), dto);
  }

  //Delete a ride type
  @DeleteMapping("{id}")
  public void deleterideById(@PathVariable String id) {
    rideTypeService.deleteRideType(UUID.fromString(id));
  }
}
