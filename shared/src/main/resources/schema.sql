create table Vegetable (
	id identity,
	name varchar(128) not null,
	description varchar(1024)
);

insert into Vegetable (name, description) values ('veg', 'veg description');
