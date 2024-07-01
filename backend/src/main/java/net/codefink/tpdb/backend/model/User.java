package net.codefink.tpdb.backend.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User extends BaseModel {
  private String username;
  private String password;
  private String email;
  private String firstName;
  private String lastName;
  private String role;
}
