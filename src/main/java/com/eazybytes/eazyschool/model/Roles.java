package com.eazybytes.eazyschool.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name="roles")
public class Roles extends BaseEntity {

    @Id
    @Column(name="role_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private long roleId;

    private String roleName;

}
