create table users
(
    created_at    timestamp(6),
    updated_at    timestamp(6),
    created_by_id uuid

        constraint fkdexwt8k48r9409xhfcykkr0k5
            references users,
    id            uuid not null
        primary key,
    updated_by_id uuid

        constraint fkmk1mb07dxxppxlshnp9mges61
            references users,
    email         varchar(255),
    first_name    varchar(255),
    last_name     varchar(255),
    password      varchar(255),
    role          varchar(255),
    username      varchar(255)
);

alter table users
    owner to tpdb;

