insert into public.resort(created_at, updated_at, created_by_id, id, updated_by_id, name)
VALUES
    ('2024-07-01 15:41:02.000000','2024-07-01 15:41:02.000000',(select id from users where first_name= 'system'),gen_random_uuid(), (select id from users where first_name= 'system'),'Europa-park Resort')