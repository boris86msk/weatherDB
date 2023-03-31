create table location(
    id            bigserial not null,
    country       varchar(255),
    lat           varchar(255),
    lon           varchar(255),
    location_name varchar(255),
    region        varchar(255),
    primary key (id)
)
