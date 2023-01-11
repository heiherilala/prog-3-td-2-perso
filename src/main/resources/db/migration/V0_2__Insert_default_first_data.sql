insert into team ("name")
values ('barsa'), ('real'), ('inter');

insert into play_against (datetime, stadium, team_a_id, team_b_id)
values ('2021-01-01T00:30.00Z', 'Mahamasina', 1, 2),
('2021-07-01T09:30.00Z', 'Tohamasina', 2, 3),
('2022-10-01T06:30.00Z', 'Mahamasina', 1, 3);

insert into player (name, number, team_id)
values ('Herilala', 1, 1), ('Lova', 2, 1), ('Misaina', 1, 2), ('Soa', 1, 3),('Mandresy', 2, 3),('Maya', 3, 3);

insert into sponsor (name)
values ('Rafanomezantsoa'), ('Ny Aina');

insert into team_have_sponsor (team_id, sponsor_id)
values (1, 1), (2, 1), (3, 2), (1, 2),(2, 2),(3, 2);