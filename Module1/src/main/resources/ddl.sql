drop table employee;
create table employee
(
   id       bigint not null auto_increment
   , name   varchar(50)
   , email   varchar(100)
   , gender   varchar(1)
   , deparment   varchar(10)
   , birth datetime NOT NULL
   ,primary key (id)
);