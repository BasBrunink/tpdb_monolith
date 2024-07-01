insert into public.park(park_type, created_at, updated_at, created_by_id, id, resort_id, updated_by_id, name)
values (2, '2024-07-01 15:41:02.000000', '2024-07-01 15:41:02.000000',
        (select id from users where first_name = 'system'), gen_random_uuid(),
        (select id from resort where name = 'Europa-park Resort'), (select id from users where first_name = 'system'),
        'Europa-park'),
       (2, '2024-07-01 15:41:02.000000', '2024-07-01 15:41:02.000000',
        (select id from users where first_name = 'system'), gen_random_uuid(),
        (select id from resort where name = 'Europa-park Resort'), (select id from users where first_name = 'system'),
        'Rulantica')

