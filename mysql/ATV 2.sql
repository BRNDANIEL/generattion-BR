create database db_lojinha;

use db_lojinha;

create table tb_produtos(
id bigint(8) auto_increment,
produto varchar(25) not null,
preço int (6),
validade date,
nmr_registro int(4),
setor varchar (30),
primary key (id)
);
insert into  tb_produtos(produto,preço,validade, nmr_registro,setor) values ("queijo especial gramas", 500,'2022-01-08','0001',"frios");
insert into  tb_produtos(produto,preço,validade, nmr_registro,setor) values ("tamaras do nilo  kilo", 300,'2022-09-10','0345',"naturais");
insert into tb_produtos(produto,preço,validade, nmr_registro,setor) values ("vinho old piece", 1500,'20-01-08','0204',"bebidas");
insert into tb_produtos(produto,preço,validade, nmr_registro,setor) values ("chocolate belga gramas", 100,'2022-01-08','1205',"doces");
insert into tb_produtos(produto,preço,validade, nmr_registro,setor) values ("cerveja big mens lata", 30,'2023-04-05','1125',"bebidas");
insert into tb_produtos(produto,preço,validade, nmr_registro,setor) values ("picanha argentina platinum kilo", 400,'2022-01-10','4356',"carnes");
insert into tb_produtos(produto,preço,validade, nmr_registro,setor) values ("coca-cola garrafa", 10,'2022-01-03','6305',"bebidas");
select * from tb_produtos;

select * from tb_produtos where preço < 500;
select * from tb_produtos where preço > 500;

update tb_produtos set preço= 550 where id = 1;


