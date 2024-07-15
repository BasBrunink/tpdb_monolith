package net.codefink.tpdb.backend.model.types.ridetype;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public class ArticleToRideTypeDto {
  private UUID rideTypeId;
  private UUID articleId;
}
