
use db_RH;

create table tb_funci(
id bigint(5) auto_increment,
nome varchar(25) not null,
salario int (6),
contratação date,
nmr_registro int(4),
setor varchar (30),
primary key (id)
);
insert into  tb_funci(nome,salario,contratação, nmr_registro,setor) values ("Bruno Daniel", 2500,'2012-01-08','0001',"TI");
insert into  tb_funci(nome,salario,contratação, nmr_registro,setor) values ("Son Goku", 5500,'2012-03-05','0003',"SEGURANÇA");
insert into  tb_funci(nome,salario,contratação, nmr_registro,setor) values ("trafalgar law", 4500,'2012-01-08','0004',"ENFERMARIA");
insert into  tb_funci(nome,salario,contratação, nmr_registro,setor) values ("naruto uzumali", 9500,'2012-01-08','0005',"PRESIDENCIA");
select * from tb_funci;

select * from tb_funci where salario < 2000;
select * from tb_funci where salario > 2000;

update tb_funci set salario= 1999 where id = 1;


