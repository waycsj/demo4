package com.example.demo4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
  @Id
  private int id;
  private String name;
  private String address;
  private String email;
  private int age;
}
