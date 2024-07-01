package net.codefink.tpdb.backend.model.ride;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class RollerCoaster extends Ride{
  private String height;
  private String length;
  private String topSpeed;
  private String acceleration;
  private String topGForce;
  private String inversions;

  private  boolean bigBoySeats;
  private String numberOfTrains;
  private String numberOfCarsPerTrain;
  private String numberOfRowsPerCar;
  private String seatsPerRow;

}
