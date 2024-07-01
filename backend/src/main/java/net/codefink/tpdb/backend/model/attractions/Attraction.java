package net.codefink.tpdb.backend.model.attractions;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.codefink.tpdb.backend.model.Park;

import java.util.UUID;


@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Attraction {


  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String name;
  @ManyToOne
  private Park park;


}
