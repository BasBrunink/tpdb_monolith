create table ride_system
(
    created_at    timestamp(6),
    updated_at    timestamp(6),
    created_by_id uuid

        constraint fkdexwt8k48r9409xhfcykkr0k5
            references users,
    id            uuid not null
        unique
        primary key,
    updated_by_id uuid

        constraint fkmk1mb07dxxppxlshnp9mges61
            references users,
    description   varchar(255),
    name          varchar(255)
);

alter table ride_system
    owner to tpdb;

-- auto-generated definition
create table roller_coaster
(
    baby_switch              boolean not null,
    barrier_free             boolean not null,
    big_boy_seats            boolean not null,
    fast_pass                boolean not null,
    fun_rating               integer not null,
    hydraulic_restraint      boolean not null,
    indoor                   boolean not null,
    pres_show                boolean not null,
    single_rider             boolean not null,
    surcharge                boolean not null,
    test_seat                boolean not null,
    theme_rating             integer not null,
    thrill_rating            integer not null,
    virtual_reality          boolean not null,
    id                       uuid    not null
        unique
        primary key,
    park_id                  uuid
        constraint fk688u6x97c8lbaty96uf94v8iy
            references park,
    acceleration             varchar(255),
    back_pack_handling       varchar(255),
    capacity                 varchar(255),
    category                 varchar(255),
    duration                 varchar(255),
    height                   varchar(255),
    inversions               varchar(255),
    latitude                 varchar(255),
    length                   varchar(255),
    length_accompanied       varchar(255),
    length_prohibited        varchar(255),
    length_un_accompanied    varchar(255),
    longitude                varchar(255),
    manufacturer             varchar(255),
    name                     varchar(255),
    number_of_cars_per_train varchar(255),
    number_of_rows_per_car   varchar(255),
    number_of_trains         varchar(255),
    operating_period         varchar(255),
    park_zone                varchar(255),
    restraint                varchar(255),
    seats_per_row            varchar(255),
    status                   varchar(255),
    top_speed                varchar(255),
    topgforce                varchar(255)
);

alter table roller_coaster
    owner to tpdb;

-- auto-generated definition
create table flat_ride
(
    baby_switch              boolean not null,
    barrier_free             boolean not null,
    big_boy_seats            boolean not null,
    fast_pass                boolean not null,
    fun_rating               integer not null,
    hydraulic_restraint      boolean not null,
    indoor                   boolean not null,
    pres_show                boolean not null,
    single_rider             boolean not null,
    surcharge                boolean not null,
    test_seat                boolean not null,
    theme_rating             integer not null,
    thrill_rating            integer not null,
    virtual_reality          boolean not null,
    id                       uuid    not null
        primary key,
    park_id                  uuid
        constraint fk688u6x97c8lbaty96uf94v8iy
            references park,
    back_pack_handling       varchar(255),
    capacity                 varchar(255),
    category                 varchar(255),
    duration                 varchar(255),
    latitude                 varchar(255),
    length_accompanied       varchar(255),
    length_prohibited        varchar(255),
    length_un_accompanied    varchar(255),
    longitude                varchar(255),
    manufacturer             varchar(255),
    name                     varchar(255),
    number_of_cars_per_train varchar(255),
    number_of_rows_per_car   varchar(255),
    number_of_trains         varchar(255),
    operating_period         varchar(255),
    park_zone                varchar(255),
    restraint                varchar(255),
    seats_per_row            varchar(255),
    status                   varchar(255)
);

alter table flat_ride
    owner to tpdb;

-- auto-generated definition
create table dark_ride
(
    baby_switch              boolean not null,
    barrier_free             boolean not null,
    big_boy_seats            boolean not null,
    fast_pass                boolean not null,
    fun_rating               integer not null,
    hydraulic_restraint      boolean not null,
    indoor                   boolean not null,
    pres_show                boolean not null,
    single_rider             boolean not null,
    surcharge                boolean not null,
    test_seat                boolean not null,
    theme_rating             integer not null,
    thrill_rating            integer not null,
    vehicle_type             smallint
        constraint dark_ride_vehicle_type_check
            check ((vehicle_type >= 0) AND (vehicle_type <= '-1'::integer)),
    virtual_reality          boolean not null,
    id                       uuid    not null
        primary key,
    park_id                  uuid
        constraint fk688u6x97c8lbaty96uf94v8iy
            references park,
    back_pack_handling       varchar(255),
    capacity                 varchar(255),
    category                 varchar(255),
    duration                 varchar(255),
    height                   varchar(255),
    latitude                 varchar(255),
    length                   varchar(255),
    length_accompanied       varchar(255),
    length_prohibited        varchar(255),
    length_un_accompanied    varchar(255),
    longitude                varchar(255),
    manufacturer             varchar(255),
    name                     varchar(255),
    number_of_cars_per_train varchar(255),
    number_of_rows_per_car   varchar(255),
    number_of_trains         varchar(255),
    operating_period         varchar(255),
    park_zone                varchar(255),
    restraint                varchar(255),
    seats_per_row            varchar(255),
    status                   varchar(255),
    top_speed                varchar(255)
);

alter table dark_ride
    owner to tpdb;

