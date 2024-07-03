package net.codefink.tpdb.backend.model.ride;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.codefink.tpdb.backend.model.types.RideSystem;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class RollerCoaster extends Ride{
  private int height;
  private int length;
  private int topSpeed;
  private int acceleration;
  private int topGForce;
  private int inversions;

  private boolean virtualReality;
  private boolean bigBoySeats;

  private int numberOfTrains;
  private int numberOfCarsPerTrain;
  private int numberOfRowsPerCar;
  private int seatsPerRow;

  @OneToOne
  private RideSystem rideSystem;
}
