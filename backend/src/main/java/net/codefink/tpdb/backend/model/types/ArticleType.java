package net.codefink.tpdb.backend.model.types;

public enum ArticleType {
  HISTORY("History"),
  FACTS("Facts"),

  GENERAL("General");
  ArticleType(String fullName) {
    this.fullName = fullName;
  }

  private final String fullName;
}
