drop table employee;
create table employee
(
   id       bigint not null auto_increment
   , name   varchar(50) NOT NULL
   , email   varchar(100) NOT NULL
   , gender   varchar(1) NOT NULL
   , department   varchar(10) NOT NULL
   , birth date NOT NULL
   ,primary key (id)
);

drop table department;
create table department
(
   id       bigint not null auto_increment
   , departmentName   varchar(50)
   ,primary key (id)
);