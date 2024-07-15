package net.codefink.tpdb.backend.model.types.ridetype;


import lombok.Getter;

@Getter
public class CreateRideTypeDto {
  private String name;
  private String description;
  private String category;
}
