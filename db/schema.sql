CREATE TABLE post (
   id SERIAL PRIMARY KEY,
   name TEXT
);

CREATE TABLE candidate (
    id SERIAL PRIMARY KEY,
    name TEXT,
    cityId INTEGER
);

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name TEXT,
    email VARCHAR (50) UNIQUE,
    password TEXT
);

CREATE TABLE cities (
    id SERIAL PRIMARY KEY,
    name TEXT
);

INSERT INTO cities(name) VALUES ('Астрахань');
INSERT INTO cities(name) VALUES ('Краснодар');
INSERT INTO cities(name) VALUES ('Новосибирск');
INSERT INTO cities(name) VALUES ('Красноярск');
INSERT INTO cities(name) VALUES ('Волгоград');