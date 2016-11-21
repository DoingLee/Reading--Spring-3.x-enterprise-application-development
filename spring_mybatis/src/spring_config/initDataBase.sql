drop database if exists foo;
create database foo;

drop table if exists foo.address;
drop table if exists foo.user;

create table foo.user(uid bigint primary key auto_increment,name varchar(25) not null,age int(3),phone varchar(120),passwd varchar(12) not null) engine=InnoDB;

create table foo.address(aid bigint primary key auto_increment,	address varchar(255) not null,postCode varchar(6) not null,	ownerid bigint,	foreign key(ownerid) references foo.user(uid) on delete cascade ) engine=InnoDB;

insert into foo.user(name,age,phone,passwd) values('zhangsan',25,'13833221173','123456');
insert into foo.user(name,age,phone,passwd) values('lisi',22,'010-67333566','111111');

insert into foo.address(address,postCode,ownerid) values('baoding beishiqu','071000',1);
insert into foo.address(address,postCode,ownerid) values('baoding xinshiqu','071051',1);
insert into foo.address(address,postCode,ownerid) values('beijing','100001',2);