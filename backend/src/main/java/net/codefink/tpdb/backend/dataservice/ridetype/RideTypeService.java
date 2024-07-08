package net.codefink.tpdb.backend.dataservice.ridetype;

import net.codefink.tpdb.backend.model.types.RideType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RideTypeService {

  private final RideTypeRepository rideTypeRepository;

  public RideTypeService(RideTypeRepository rideTypeRepository) {
    this.rideTypeRepository = rideTypeRepository;
  }

  //Create a new ride type
  public Optional<RideType> createRideType(RideType rideType) {
    return Optional.of(rideTypeRepository.save(rideType));
  }
  //Read a ride type

  //Read by ID
  public Optional<RideType> getRideType(UUID id) {
    return rideTypeRepository.findById(id);
  }

  //Read all
  public List<RideType> getRideType() {
    return rideTypeRepository.findAll();
  }

  //Update a ride type
  public Optional<RideType> updateRideType(UUID id, RideType rideType) {
    Optional<RideType> rideTypeOptional = rideTypeRepository.findById(id);
    if (rideTypeOptional.isPresent()) {
      RideType rideTypeToUpdate = rideTypeOptional.get();
      //set the ride type attributes
      return Optional.of(rideTypeRepository.save(rideTypeToUpdate));
    } else {
      return Optional.of(rideTypeRepository.save(rideType));
    }
  }

  //Delete a ride type
  public void deleteRideType(UUID id) {
    rideTypeRepository.deleteById(id);
  }
}
