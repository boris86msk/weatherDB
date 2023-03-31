create table current(
    id          bigserial not null,
    cloud       integer,
    gust_ms     float(53),
    humidity    integer,
    local_data  date,
    pressure_mb float(53),
    temp_c      float(53),
    uv          float(53),
    wind_dir    varchar(255),
    wind_ms     float(53),
    location_id bigint,
    primary key (id)
)
