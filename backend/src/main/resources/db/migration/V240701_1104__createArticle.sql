create table article
(
    article_type  smallint
        constraint article_article_type_check
            check ((article_type >= 0) AND (article_type <= 2)),
    created_at    timestamp(6),
    updated_at    timestamp(6),
    author_id     uuid
        unique
        constraint fkmjgtny2i22jf4dqncmd436s0u
            references users,
    created_by_id uuid
        constraint fkdexwt8k48r9409xhfcykkr0k5
            references users,
    id            uuid not null
        primary key,
    subject_id    uuid,
    updated_by_id uuid

        constraint fkmk1mb07dxxppxlshnp9mges61
            references users,
    content       varchar(255),
    title         varchar(255)
);

alter table article
    owner to tpdb;

