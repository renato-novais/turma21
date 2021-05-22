create database db_generation_game_online;

use db_generation_game_online;

create table tb_personagem(
id int auto_increment,
nome varchar(255) not null,
genero varchar(255) not null,
etnia varchar (255) not null,
classe varchar (255) not null,
nivel int not null,
primary key (id)
);

insert tb_personagem (nome, genero, etnia, classe, nivel) values ("Ragnar","Masculino","Brancx","Guerreirx",40);
insert tb_personagem (nome, genero, etnia, classe, nivel) values ("Lagertha","Feminino","Brancx","Arqueirx",40);
insert tb_personagem (nome, genero, etnia, classe, nivel) values ("Wanda","Feminino","Brancx","Magx",100);
insert tb_personagem (nome, genero, etnia, classe, nivel) values ("Okoye ","Feminino","Negrx","Guerreirx",60);
insert tb_personagem (nome, genero, etnia, classe, nivel) values ("Mulan","Feminino","Amarelx","Guerreirx",50);
insert tb_personagem (nome, genero, etnia, classe, nivel) values ("Gandalf","Masculino","Brancx","Magx",90);

create table tb_classe(
id int auto_increment,
ataque int not null,
defesa int not null,
personagem_id int not null,
primary key (id),
foreign key (personagem_id) references tb_personagem (id)
);

insert tb_classe (ataque, defesa, personagem_id) values (1800,1700,1);
insert tb_classe (ataque, defesa, personagem_id) values (2500,1500,2);
insert tb_classe (ataque, defesa, personagem_id) values (3000,1100,3);
insert tb_classe (ataque, defesa, personagem_id) values (2200,2200,4);
insert tb_classe (ataque, defesa, personagem_id) values (1900,1600,5);
insert tb_classe (ataque, defesa, personagem_id) values (2900,1300,6);

select * from tb_personagem;
select * from tb_classe;




