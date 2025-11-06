CREATE DATABASE stockstats;

CREATE SCHEMA stock_stats_app;

CREATE TABLE role
(
    value varchar(128)
);

CREATE TABLE users
(
    id       bigint GENERATED AS IDENTITY,
    name     varchar(128),
    login    varchar(50)  NOT NULL UNIQUE,
    password varchar(128) NOT NULL,
    role     varchar(128) NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id),
    CONSTRAINT user_fk FOREIGN KEY (role)
);