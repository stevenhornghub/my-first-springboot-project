use library;

create table book
(
    id  int auto_increment not null
        primary key,
    name           varchar(255) not null UNIQUE,
    description    varchar(255) not null,
    genre          varchar(255) not null,
    author         varchar(255)  not null
);
