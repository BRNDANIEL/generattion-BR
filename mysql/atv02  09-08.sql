create database db_pizzaria_legal;

use db_pizzaria_legal; 

create table tb_categoria (
	id int primary key auto_increment,
    nomePizzaolo varchar (50),
    sabor varchar (50),
    adicional boolean
);

create table tb_pizza(
	id int primary key auto_increment,
	nome varchar (50),
	tamanho varchar (50),
    ingrediente varchar (50),
    preco decimal (6,2),
    borda boolean,
    categoria_id int,
    foreign key(categoria_id) references tb_categoria (id)
);

insert into tb_categoria (nomePizzaolo, sabor, adicional) values ("Bruno", "salgada", true);
insert into tb_categoria (nomePizzaolo, sabor, adicional) values ("Daniel", "salgada", false);
insert into tb_categoria (nomePizzaolo, sabor, adicional) values ("Fernandes", "doce", false);
insert into tb_categoria (nomePizzaolo, sabor, adicional) values ("Valero", "doce", true);
insert into tb_categoria (nomePizzaolo, sabor, adicional) values ("BRN", "salgada", false);

select * from tb_categoria;

insert into tb_pizza(nome, tamanho, ingrediente, preco, borda, categoria_id) values 
("frango", "Grande", "frango com catupiry", 35.50, true, 1),
("marguerita", "gigante", "queijo tomate",60.00, true, 2),
("peperone","brotinho", "peperone queijo", 25.00, true, 3),
("portuguesa", "media", "queijo presunto ovo cozido", 49.50, false, 4),
("prestigio", "Grande", "chocolate coco", 45.00,true, 5),
("bacon", "brotinho", "bacon e queijo", 25.00, false, 1),
("caipira", "Grande", "frango milho", 55.00, true, 3),
("morango", "gigante", "morango chocolate", 70.00, true, 5);

select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco > 29.00 and preco < 60.00;
select * from tb_pizza where nome like "%C%";

select * from tb_pizza
    inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
select * from tb_pizza
    inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
    where sabor like "%doce%";

