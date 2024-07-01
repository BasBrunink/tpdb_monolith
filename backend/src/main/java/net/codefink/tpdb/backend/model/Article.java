package net.codefink.tpdb.backend.model;

import jakarta.persistence.*;
import lombok.*;
import net.codefink.tpdb.backend.model.attractions.Attraction;
import net.codefink.tpdb.backend.model.types.ArticleType;
import net.codefink.tpdb.backend.model.types.RideSystem;


import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Article extends BaseModel {
  private ArticleType articleType;
  private String title;
  private String content;
  @OneToOne
  private User author;


  //Relations to subjects needs to be polymorphic
  @ManyToOne
  private BaseModel subject;







}
