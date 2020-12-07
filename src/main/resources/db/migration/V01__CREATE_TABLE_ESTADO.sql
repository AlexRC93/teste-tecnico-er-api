CREATE TABLE IF NOT EXISTS estado (
	id serial PRIMARY KEY,
	descricao VARCHAR(100) NOT NULL,
	bandeira VARCHAR(300)
);

insert into estado (descricao, bandeira) values('Rio Grande do Sul', 'https://estado.rs.gov.br/upload/recortes/201707/20075647_1210628_GDO.jpg');
insert into estado (descricao, bandeira) values('Santa Catarina', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Bandeira_de_Santa_Catarina.svg/1280px-Bandeira_de_Santa_Catarina.svg.png');
insert into estado (descricao, bandeira) values('Paraná', 'https://www.blocknews.com.br/wp-content/uploads/2020/07/parana2.jpg');

