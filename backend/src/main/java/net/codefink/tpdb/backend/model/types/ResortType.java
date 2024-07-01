package net.codefink.tpdb.backend.model.types;

import lombok.Getter;

@Getter
public enum ResortType {
  THEMED_RESORT("Themed Resort");


  ResortType(String fullName) {
    this.fullName = fullName;
  }

  private final String fullName;
}
