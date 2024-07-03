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
public class DarkRide extends Ride{
  private String height;
  private String length;
  private String topSpeed;

  @OneToOne
  private RideSystem rideSystem; // needs enum



}
