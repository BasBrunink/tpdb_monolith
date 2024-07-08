create table ride_type
(
    created_at    timestamp(6),
    updated_at    timestamp(6),
    created_by_id uuid
        unique
        constraint fkdexwt8k48r9409xhfcykkr0k5
            references users,
    id            uuid not null
        primary key,
    updated_by_id uuid
        unique
        constraint fkmk1mb07dxxppxlshnp9mges61
            references users,
    description   varchar(255),
    category      varchar(255),
    name          varchar(255)
);

alter table ride_type
    owner to tpdb;


-- auto-generated definition
create table ride_system
(
    created_at    timestamp(6),
    updated_at    timestamp(6),
    created_by_id uuid
        unique
        constraint fkdexwt8k48r9409xhfcykkr0k5
            references users,
    id            uuid not null
        primary key,
    ride_type_id  uuid
        unique
        constraint fki6k1fmo334ypa8p3mkvqxwin0
            references ride_type,
    updated_by_id uuid
        unique
        constraint fkmk1mb07dxxppxlshnp9mges61
            references users,
    description   varchar(255),
    name          varchar(255)
);

alter table ride_system
    owner to tpdb;


