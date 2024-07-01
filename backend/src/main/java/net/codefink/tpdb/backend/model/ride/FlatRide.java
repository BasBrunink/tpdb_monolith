package net.codefink.tpdb.backend.model.ride;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Builder
@AllArgsConstructor

@Getter
public class FlatRide extends Ride {
}
