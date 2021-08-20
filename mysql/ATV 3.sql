create database db_ESCOLA;

use db_ESCOLA;

create table tb_estudantes(
id bigint(5) auto_increment,
estudante varchar(25) not null,
maiornota int (6),
aniversario date,
matricula int(4),
recuperação varchar (30),
primary key (id)
);
insert into  tb_estudantes(estudante,maiornota,aniversario, matricula,recuperação) values ("GOKU", 10,'1996-01-08','3243',"matematica");
insert into  tb_estudantes(estudante,maiornota,aniversario, matricula,recuperação) values ("VEGETA", 9,'2095-07-04','0141',"sociologia");
insert into  tb_estudantes(estudante,maiornota,aniversario, matricula,recuperação) values ("GOHAN", 10,'2025-05-02','9932',"geografia");
insert into  tb_estudantes(estudante,maiornota,aniversario, matricula,recuperação) values ("GOTEN", 8,'2027-04-08','1251',"portugues");
insert into  tb_estudantes(estudante,maiornota,aniversario, matricula,recuperação) values ("MAJIN BOO", 3,'1920-03-05','0001',"TODAS");
select * from tb_estudantes;

select * from tb_estudantes where maiornota < 7;
select * from tb_estudantes where maiornota > 7;

update tb_estudantes set notao= 9 where id = 1;


