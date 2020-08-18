drop table if exists sys_user;
create table sys_user(
    id bigint not null auto_increment,
    username varchar(50) not null,
    password varchar(100) not null,
    status int(1),
    rid bigint not null
    ,primary key (id)
);

drop table if exists sys_role;
create table sys_role(
    id bigint not null auto_increment,
    name varchar(30) not null,
    role_desc varchar(60) not null
    ,primary key (id)
);

drop table if exists employee;
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

drop table if exists department;
create table department
(
   id       bigint not null auto_increment
   , departmentName   varchar(50)
   ,primary key (id)
);