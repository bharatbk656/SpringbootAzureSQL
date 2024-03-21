package com.rest.azure.springazurerestpoc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class UserDetails {
    @Id
    @Generated
    private int id;
    private String userName;
    private String dept;
    private long salary;
}
