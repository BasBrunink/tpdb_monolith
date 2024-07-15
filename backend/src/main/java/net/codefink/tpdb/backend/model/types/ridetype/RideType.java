package net.codefink.tpdb.backend.model.types.ridetype;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import net.codefink.tpdb.backend.model.Article;
import net.codefink.tpdb.backend.model.BaseModel;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RideType extends BaseModel {
  private String name;
  private String description;
  private String category;
  @OneToMany(mappedBy = "subject")
  private List<Article> articles;
  
}
