package net.codefink.tpdb.backend.model.ride;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.codefink.tpdb.backend.model.types.RideType;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FlatRide extends Ride {
  private String someThing;
}
