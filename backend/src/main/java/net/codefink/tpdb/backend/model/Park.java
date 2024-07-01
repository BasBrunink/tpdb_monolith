package net.codefink.tpdb.backend.model;

import jakarta.persistence.*;
import lombok.*;
import net.codefink.tpdb.backend.model.attractions.*;
import net.codefink.tpdb.backend.model.ride.DarkRide;
import net.codefink.tpdb.backend.model.ride.FlatRide;
import net.codefink.tpdb.backend.model.ride.RollerCoaster;
import net.codefink.tpdb.backend.model.types.ParkType;

import java.util.List;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Park extends BaseModel{
  @ManyToOne
  private Resort resort;

  @OneToMany(mappedBy = "park")
  private List<Attraction> attractions;
  @OneToMany(mappedBy = "park")
  private List<DarkRide> darkRides;
  @OneToMany(mappedBy = "park")
  private List<FlatRide> flatRides;
  @OneToMany(mappedBy = "park")
  private List<RollerCoaster> RollerCoasters;

  private String name;
  private ParkType parkType;
  private String description;
  private String status;
  private String timezone;
  private String website;
  private String latitude;
  private String longitude;
  private String address;
  private String wifi;
  private String gopro;
  private String area;

}
