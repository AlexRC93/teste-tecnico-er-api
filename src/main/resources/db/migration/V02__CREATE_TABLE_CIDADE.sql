CREATE TABLE IF NOT EXISTS cidade (
	id serial PRIMARY KEY,
	descricao VARCHAR(100) NOT NULL,
	estado_id INT8 NOT NULL,
	qtd_cidadoes INT8 NOT NULL,
	FOREIGN KEY (estado_id) REFERENCES estado (id)
);

insert into cidade (descricao, estado_id, qtd_cidadoes) values('Porto Alegre', 1, 1409000);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Pelotas', 1, 306193);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Gramado', 1, 31655);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Caxias do Sul', 1, 415822);

insert into cidade (descricao, estado_id, qtd_cidadoes) values('Florianópolis', 2, 249477);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Blumenau', 2, 352460);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('São José', 2, 250181);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Itajaí', 2, 200565);

insert into cidade (descricao, estado_id, qtd_cidadoes) values('Curitiba', 3, 1752000);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Maringá', 3, 342310);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Londrina', 3, 485822);
insert into cidade (descricao, estado_id, qtd_cidadoes) values('Cascavel', 3, 266835);