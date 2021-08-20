create database db_generation_game_online;
use db_generation_game_online;

create table classe (
id bigint primary key auto_increment,
classe varchar(20),
arma varchar(20),
raça varchar(20));


create table tb_personagem(
id bigint primary key auto_increment,
nome varchar (50),
forca int,
defesa int,
mana int,
lv int,
pet varchar(50),
classe_id bigint,
foreign key (classe_id) references classe (id)
);
insert into classe (classe,arma,raça) values ("mago","cajado","elfo"),
("guerreiro","espada grende","humano"),
("berseker", "machado duplo", "orc"),
("thief","adagas","khajits"),
("arqueiro","arco", "elfo da floresta");

insert into tb_personagem (nome,forca,defesa,mana,lv,pet,classe_id) values("merlin", 2290,2300, 600, 94, "dragão", 1),
("arthur",2300, 2400,270,85,"pegasus" , 2),
("skkar",1550,195,7220,90,"lobo",3),
("loki", 1325,200,2180,80,"serpente", 4),
("sylvyan",2190,250,3320,78,"aguia", 5),
("casandra", 2500,1480,750,101,"pluto", 1),
("kratos",1900,2300,250,95,"atreus",3),
("mihawk",1850,2110,300,82,"falcão",1);
select * from tb_personagem where forca < 2000;
select * from tb_personagem where defesa > 1000 <2000;
select * from tb_personagem where nome like 'c%';

select * from tb_personagem
    inner join classe on classe.id = tb_personagem.classe_id;

select * from classe
    inner join tb_personagem on classe.id = tb_personagem.classe_id 
    where classe like "%Arqueiro%";
	









