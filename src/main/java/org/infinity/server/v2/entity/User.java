package org.infinity.server.v2.entity;

import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class User {
    Integer userSeq;
    String id;
    LocalDate registTime;
    LocalDate lastLoginTime;
}
