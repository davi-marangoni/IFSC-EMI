CREATE TABLE FabricaDavi (
  idFabricaDavi INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  NomeDavi VARCHAR(25)  NULL    ,
PRIMARY KEY(idFabricaDavi));

CREATE TABLE DestinoDavi (
  idDestinoDavi INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  NomeDavi VARCHAR(25)  NULL    ,
PRIMARY KEY(idDestinoDavi));

CREATE TABLE ProduzDavi (
  idProduzDavi INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  DestinoDavi_idDestinoDavi INTEGER UNSIGNED  NOT NULL  ,
  FabricaDavi_idFabricaDavi INTEGER UNSIGNED  NOT NULL  ,
  Nome VARCHAR(50)  NOT NULL  ,
  CorDavi VARCHAR(25)  NULL  ,
  Volume REAL  NULL  ,
  QuantidadeDavi REAL  NULL    ,
PRIMARY KEY(idProduzDavi)  ,
INDEX ProduzDavi_FKIndex1(FabricaDavi_idFabricaDavi)  ,
INDEX ProduzDavi_FKIndex2(DestinoDavi_idDestinoDavi),
  FOREIGN KEY(FabricaDavi_idFabricaDavi)
    REFERENCES FabricaDavi(idFabricaDavi)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(DestinoDavi_idDestinoDavi)
    REFERENCES DestinoDavi(idDestinoDavi)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);

// Inserindo na tabela fabrica 
INSERT INTO fabricaDavi(NomeDavi) VALUES ('Fabrica de caixas 1'),('Fabrica de caixas 2')
// Inserindo na tabela destino
INSERT INTO destinoDavi(NomeDavi) VALUES ('Sul'),('Oeste'),('Norte')
// Inserindo na tabela produz
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('1','1','Caixa de Papel Higienico 1','Branco','1','1')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('2','1','Caixa de Papel Higienico 2','Azul','1','1')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('3','1','Caixa de Papel Higienico 3','Rosa','1','1')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('1','2','Caixa de Papel Toalha 1','Vermelho','2','1')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('2','2','Caixa de Papel Toalha 2','Rosa','2','1')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('3','2','Caixa de Papel Toalha 3','Branco','2','1')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('1','2','Caixa de Papel Higienico 4','Laranja','7','2')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('2','2','Caixa de Papel Higienico 5','Azul','7','2')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('3','2','Caixa de Papel Higienico 6','Lilas','7','2')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('1','1','Caixa de Papel Toalha 4','Amarelo','5','2')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('2','1','Caixa de Papel Toalha 5','Verde','5','2')
INSERT INTO produzDavi(DestinoDavi_idDestinoDavi, FabricaDavi_idFabricaDavi, Nome, CorDavi, Volume, QuantidadeDavi) VALUES ('3','1','Caixa de Papel Toalha 6','Marrom','5','2')