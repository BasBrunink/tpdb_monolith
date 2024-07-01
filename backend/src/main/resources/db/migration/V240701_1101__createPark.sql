create table park
(
    park_type     smallint
        constraint park_park_type_check
            check ((park_type >= 0) AND (park_type <= 11)),
    created_at    timestamp(6),
    updated_at    timestamp(6),
    created_by_id uuid
        constraint fkdexwt8k48r9409xhfcykkr0k5
            references users,
    id            uuid not null
        primary key,
    resort_id     uuid
        constraint fkspvrp5g5oafaps4kn51vcup2p
            references resort,
    updated_by_id uuid

        constraint fkmk1mb07dxxppxlshnp9mges61
            references users,
    address       varchar(255),
    area          varchar(255),
    description   varchar(255),
    gopro         varchar(255),
    latitude      varchar(255),
    longitude     varchar(255),
    name          varchar(255),
    status        varchar(255),
    timezone      varchar(255),
    website       varchar(255),
    wifi          varchar(255)
);

alter table park
    owner to tpdb;

