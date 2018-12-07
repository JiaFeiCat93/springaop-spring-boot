#数据库cloudDB01
drop database if exists cloudDB01;

create database cloudDB01 character set utf8;

use cloudDB01;

create table `user`(
	id int unsigned not null primary key auto_increment,
	username varchar(60),
	password varchar(60),
	db_source varchar(60)
);

insert into `user`(username,password,db_source) values('张三','123456',database());
insert into `user`(username,password,db_source) values('李四','111111',database());
insert into `user`(username,password,db_source) values('艾克','123456',database());


#数据库cloudDB02
drop database if exists cloudDB02;

create database cloudDB02 character set utf8;

use cloudDB02;

create table `user`(
	id int unsigned not null primary key auto_increment,
	username varchar(60),
	password varchar(60),
	db_source varchar(60)
);

insert into `user`(username,password,db_source) values('张三','123456',database());
insert into `user`(username,password,db_source) values('李四','111111',database());
insert into `user`(username,password,db_source) values('艾克','123456',database());


#数据库cloudDB03
drop database if exists cloudDB03;

create database cloudDB03 character set utf8;

use cloudDB03;

create table `user`(
	id int unsigned not null primary key auto_increment,
	username varchar(60),
	password varchar(60),
	db_source varchar(60)
);

insert into `user`(username,password,db_source) values('张三','123456',database());
insert into `user`(username,password,db_source) values('李四','111111',database());
insert into `user`(username,password,db_source) values('艾克','123456',database());

