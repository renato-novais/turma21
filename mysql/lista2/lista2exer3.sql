create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_produto(
id int auto_increment,
nome varchar(255),


primary key (id)
);



create table tb_categoria(
id int auto_increment,

produto_id int,
primary key (id),
foreign key (produto_id) references tb_produto (id)
);







drop database db_farmacia_do_bem;
