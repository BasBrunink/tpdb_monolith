package net.codefink.tpdb.backend.dataservice.ridetype;

import net.codefink.tpdb.backend.model.types.ridetype.RideType;
import net.codefink.tpdb.backend.model.types.ridetype.UpdateRideTypeDto;
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
  public List<RideType> getAllRideTypes() {
    return rideTypeRepository.findAll();
  }

  //Update a ride type
  public Optional<RideType> updateRideType(UUID id, UpdateRideTypeDto dto) {
    Optional<RideType> toUpdate = rideTypeRepository.findById(id);
    return Optional.of(rideTypeRepository.save(RideType.builder().name(dto.getName()).category(dto.getCategory()).description(dto.getDescription()).build()));


  }

  //Delete a ride type
  public void deleteRideType(UUID id) {
    rideTypeRepository.deleteById(id);
  }


}
