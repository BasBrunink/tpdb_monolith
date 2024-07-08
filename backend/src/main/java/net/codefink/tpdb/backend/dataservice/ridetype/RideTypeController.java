package net.codefink.tpdb.backend.dataservice.ridetype;

import net.codefink.tpdb.backend.model.types.RideType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/api/ridetype")
public class RideTypeController {

  private final RideTypeService rideTypeService;

  public RideTypeController(RideTypeService rideTypeService) {
    this.rideTypeService = rideTypeService;
  }

  //Create a new ride type
  @PostMapping()
  public Optional<RideType> createRideType(RideType rideType) {
    return rideTypeService.createRideType(rideType);
  }
  //Read a ride type

  //Read by ID
  //Read all

  //Update a ride type

  //Delete a ride type
}
