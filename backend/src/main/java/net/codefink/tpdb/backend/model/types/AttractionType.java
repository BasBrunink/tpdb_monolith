package net.codefink.tpdb.backend.model.types;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.codefink.tpdb.backend.model.Article;
import net.codefink.tpdb.backend.model.BaseModel;
import net.codefink.tpdb.backend.model.types.ridetype.RideType;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AttractionType extends BaseModel {
  private String name;
  @OneToOne
  private RideType rideType;
  private String description;
  @OneToMany(mappedBy = "subject")
  private List<Article> articles;
}

