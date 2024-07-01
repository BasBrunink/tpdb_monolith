create table attraction
(
    id      uuid not null
        primary key,
    park_id uuid
        constraint fkonay82solf069swn6px2u0p1c
            references park,
    name    varchar(255)
);

alter table attraction
    owner to tpdb;

