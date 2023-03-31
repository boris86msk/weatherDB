package com.example.weatherdb.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "location")
public class LocationEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "location_name")
    private String name;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lon")
    private String lon;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "locationEntity", fetch = FetchType.LAZY)
    private List<CurrentEntity> currentEntityList;


}
