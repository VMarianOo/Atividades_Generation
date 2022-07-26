CREATE DATABASE DB_CIDADE_DOS_VEGETAIS;

USE DB_CIDADE_DOS_VEGETAIS;

CREATE TABLE TB_CATEGORIA(
ID BIGINT AUTO_INCREMENT,
CPF_NOTA VARCHAR(255),
PAGAMENTO VARCHAR(255),
PRIMARY KEY(ID)
);

CREATE TABLE TB_PRODUTO(
ID BIGINT AUTO_INCREMENT,
NOME VARCHAR(255),
PRECO DOUBLE,
PESO VARCHAR(255),
QUANTIDADE INT,
PRIMARY KEY(ID),
CATEGORIA_ID BIGINT,
FOREIGN KEY (CATEGORIA_ID) REFERENCES TB_CATEGORIA(ID)
);

SELECT * FROM TB_CATEGORIA;
SELECT * FROM TB_PRODUTO;

INSERT INTO TB_CATEGORIA (CPF_NOTA, PAGAMENTO) VALUE ("SIM", "DEBITO");
INSERT INTO TB_CATEGORIA (CPF_NOTA, PAGAMENTO) VALUE ("SIM", "CREDITO");
INSERT INTO TB_CATEGORIA (CPF_NOTA, PAGAMENTO) VALUE ("NÃO", "DINHEIRO");
INSERT INTO TB_CATEGORIA (CPF_NOTA, PAGAMENTO) VALUE ("SIM", "DINHEIRO");
INSERT INTO TB_CATEGORIA (CPF_NOTA, PAGAMENTO) VALUE ("NÃO", "DEBITO");

INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('Abacaxi', 19.25, '19 kg', 2, 1);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('Cebolas', 15.64, '2 kg', 2 , 3);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('Batata', 22.93, '6 kg', 3 , 2);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('​Brócolis', 50.00, '5 kg', 3, 4);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('Beterraba', 23.50, '10 kg', 1, 5);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('​Espinafre', 64.90, '50 kg', 2, 2);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('Couve', 10.20, '10 kg', 1, 3);
INSERT INTO TB_PRODUTO (NOME, PRECO, PESO, QUANTIDADE, CATEGORIA_ID) VALUES ('Alface', 40.60, '4 kg', 4, 4);

SELECT*FROM TB_PRODUTO WHERE PRECO > 50.00;

SELECT*FROM TB_PRODUTO WHERE PRECO >= 50.00 && VALOR <=150.00;

SELECT*FROM TB_PRODUTO WHERE TB_PRODUTO.NOME LIKE 'C%';

