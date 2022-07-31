use library;

create table books
(
    id  int auto_increment not null
        primary key,
    name           varchar(255) not null,
    description    varchar(255) not null,
    genre          varchar(255) not null,
    author         varchar(255)  not null
);
