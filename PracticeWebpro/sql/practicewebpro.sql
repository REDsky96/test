drop database if exists practicewebpro;
create database practicewebpro;
use practicewebpro;

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);