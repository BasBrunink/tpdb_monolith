package net.codefink.tpdb.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Resort extends BaseModel {
  private String name;
  @OneToMany(mappedBy = "resort")
  private List<Park> parks;

}
