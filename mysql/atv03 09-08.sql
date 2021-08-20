create database db_farmacia_do_bem;
use db_farmacia_do_bem;
 create table tb_categoria(
 id bigint primary key auto_increment,
 higiene boolean,
 medicamentos boolean,
 suplementos boolean );
 
 create table tb_produto(
 id bigint primary key auto_increment,
 nome varchar(50),
 marca varchar (50),
 preco decimal(6,2),
 peso decimal (6,3),
 validade date,
categoria_id bigint,
foreign key(categoria_id) references tb_categoria (id));

insert into tb_categoria(higiene,medicamentos,suplementos)  values (false,false,true),
(true,false ,false),
(false,true,false),
(true,false,false),
(false,true,false);

insert into tb_produto(nome,marca,preco,peso,validade,categoria_id) values 
("wey","biotec",180.00,2.00,'2023-02-09',1),
("sabonete","p&g",5.00,0.80,'2025-06-12',2),
("lisador","MS",8.99, 0.120,'2025-12-10',3),
('barbeador',"gilete", 65.00, 0.300,'2030-10-12',4),
("biralaxina","biratec", 75.99,1.00,'2120-11-10',5);


select * from tb_produto where preco > 50.00;
select * from tb_produto where preco > 3.00 and preco < 60.00;
select * from tb_produto where nome like "%b%";



 select * from tb_categoria
    inner join tb_produto on tb_produto.categoria_id = tb_categoria.id;
select * from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
    where medicamentos=true;
 
 