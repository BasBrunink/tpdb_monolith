create table public.resort
(
    id   uuid not null
        primary key,
    name varchar(255)
);

alter table public.resort
    owner to tpdb;



create table public.park
(
    park_type   smallint
        constraint park_park_type_check
            check ((park_type >= 0) AND (park_type <= 11)),
    id          uuid not null
        primary key,
    resort_id   uuid
        constraint parkToResort
            references public.resort,
    address     varchar(255),
    area        varchar(255),
    description varchar(255),
    gopro       varchar(255),
    latitude    varchar(255),
    longitude   varchar(255),
    name        varchar(255),
    status      varchar(255),
    timezone    varchar(255),
    website     varchar(255),
    wifi        varchar(255)
);

alter table public.park
    owner to tpdb;



create table public.attraction
(
    id      uuid not null
        primary key,
    park_id uuid
        constraint attractionToPark
            references public.park,
    name    varchar(255)
);

alter table public.attraction
    owner to tpdb;

create table public.ride
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
        constraint rideToPark
            references public.park,
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

alter table public.ride
    owner to tpdb;

