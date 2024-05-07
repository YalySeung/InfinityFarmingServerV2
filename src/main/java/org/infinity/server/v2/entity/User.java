package org.infinity.server.v2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class User {
    Integer userSeq;
    String id;
    LocalDate registTime;
    LocalDate lastLoginTime;
}
