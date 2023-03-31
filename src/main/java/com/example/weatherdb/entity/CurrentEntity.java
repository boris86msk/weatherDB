package com.example.weatherdb.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "current")
public class CurrentEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "localData")
    private LocalDate  localData;

    @Column(name = "temp_c")
    private Double temp_c;

    @Column(name = "wind_ms")
    private Double wind_ms;

    @Column(name = "gust_ms")
    private Double gust_ms;

    @Column(name = "wind_dir")
    private String wind_dir;

    @Column(name = "pressure_mb")
    private Double pressure_mb;

    @Column(name = "humidity")
    private Integer humidity;

    @Column(name = "cloud")
    private Integer cloud;

    @Column(name = "uv")
    private Double uv;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationEntity locationEntity;
}
