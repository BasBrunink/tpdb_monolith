package net.codefink.tpdb.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  @OneToOne
  private User createdBy;
  @OneToOne
  private User updatedBy;
}
