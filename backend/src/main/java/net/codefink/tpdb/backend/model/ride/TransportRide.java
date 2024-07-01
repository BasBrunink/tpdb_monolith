package net.codefink.tpdb.backend.model.ride;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.codefink.tpdb.backend.model.types.TransportVehicleType;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TransportRide extends Ride {

  //Technical Data
  private String length;
  private String topSpeed;
  private TransportVehicleType vehicleType; // needs enum

  private String numberOfTrains;
  private String numberOfCarsPerTrain;
  private String numberOfRowsPerCar;
  private String seatsPerRow;


}
