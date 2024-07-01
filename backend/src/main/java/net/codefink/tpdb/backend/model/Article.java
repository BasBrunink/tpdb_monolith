package net.codefink.tpdb.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.codefink.tpdb.backend.model.types.ArticleType;
import net.codefink.tpdb.backend.model.types.RideSystem;


import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Article extends BaseModel {
  private ArticleType articleType;
  private String title;
  private String content;
  private String author;
  @ManyToOne
  private Park park;

  @ManyToOne
  private Resort resort;
  @ManyToOne
  private RideSystem rideSystem;



}
