CREATE TABLE team (
  id serial PRIMARY KEY,
  "name" VARCHAR(150) NOT NULL
);

CREATE TABLE play_against (
  id serial PRIMARY KEY,
  datetime timestamp with time zone not null default now(),
  stadium VARCHAR(150),
  team_a_id INT NOT NULL REFERENCES team(id),
  team_b_id INT NOT NULL REFERENCES team(id)
);

CREATE TABLE player (
  id serial PRIMARY KEY,
  name VARCHAR(150) NOT NULL,
  number INT NOT NULL,
  team_id INT NOT NULL REFERENCES team(id)
);

CREATE TABLE sponsor (
  id serial PRIMARY KEY,
  name VARCHAR(150) NOT NULL
);

CREATE TABLE team_have_sponsor (
  id serial PRIMARY KEY,
  team_id INT REFERENCES team(id),
  sponsor_id INT REFERENCES sponsor(id)
);

