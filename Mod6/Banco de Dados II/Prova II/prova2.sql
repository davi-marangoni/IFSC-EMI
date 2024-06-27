CREATE TABLE ProdutoDavi (
  idProdutoDavi INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome VARCHAR(35)  NULL  ,
  SomaEstoque REAL  NULL DEFAULT 0 ,
  SomaValor REAL  NULL DEFAULT 0 ,
  Unidade VARCHAR(3)  NULL    ,
PRIMARY KEY(idProdutoDavi));

CREATE TABLE FabricaDavi (
  idFabricaDavi INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome VARCHAR(35)  NULL  ,
  SomaValor REAL  NULL DEFAULT 0   ,
PRIMARY KEY(idFabricaDavi));

CREATE TABLE ProducaoDavi (
  idProducaoDavi INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  FabricaDavi_idFabricaDavi INTEGER UNSIGNED  NOT NULL  ,
  Nome VARCHAR(50)  NULL  ,
  DataProducao DATE  NULL  ,
  SomaValor REAL  NULL DEFAULT 0   ,
PRIMARY KEY(idProducaoDavi)  ,
INDEX ProducaoDavi_FKIndex1(FabricaDavi_idFabricaDavi),
  FOREIGN KEY(FabricaDavi_idFabricaDavi)
    REFERENCES FabricaDavi(idFabricaDavi)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);

CREATE TABLE PHP (
  ProducaoDavi_idProducaoDavi INTEGER UNSIGNED  NOT NULL  ,
  ProdutoDavi_idProdutoDavi INTEGER UNSIGNED  NOT NULL  ,
  Quantidade REAL  NULL  ,
  ValorUnitario REAL  NULL    ,
PRIMARY KEY(ProducaoDavi_idProducaoDavi, ProdutoDavi_idProdutoDavi)  ,
INDEX ProducaoDavi_has_ProdutoDavi_FKIndex1(ProducaoDavi_idProducaoDavi)  ,
INDEX ProducaoDavi_has_ProdutoDavi_FKIndex2(ProdutoDavi_idProdutoDavi),
  FOREIGN KEY(ProducaoDavi_idProducaoDavi)
    REFERENCES ProducaoDavi(idProducaoDavi)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(ProdutoDavi_idProdutoDavi)
    REFERENCES ProdutoDavi(idProdutoDavi)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);


TGInsertPHP 
Begin 
UPDATE ProdutoDavi SET SomaEstoque=SomaEstoque+NEW.Quantidade
WHERE IdProdutoDavi=NEW.ProdutoDavi_idProdutoDavi;
UPDATE ProdutoDavi SET SomaValor=SomaValor+NEW.Quantidade*NEW.ValorUnitario
WHERE IdProdutoDavi=NEW.ProdutoDavi_idProdutoDavi; 
UPDATE ProducaoDavi SET SomaValor=SomaValor+NEW.QUantidade*NEW.ValorUnitario
WHERE IdProducaoDavi=NEW.ProducaoDavi_idProducaoDavi;
END


TgUpdateFabrica
Begin
UPDATE FabricaDavi
SET SomaValor=SomaValor+NEW.SomaValor-OLD.SomaValor
WHERE FabricaDavi.idFabricaDavi=NEW.FabricaDavi_idFabricaDavi;
END


TgDeletePHP
BEGIN
UPDATE ProdutoDavi
SET SomaEstoque=SomaEstoque-OLD.Quantidade
WHERE idProdutoDavi=OLD.ProdutoDavi_idProdutoDavi;
UPDATE ProducaoDavi 
SET SomaValor=SomaValor-OLD.Quantidade*OLD.ValorUnitario
WHERE IdProducaoDavi=OLD.ProducaoDavi_idProducaoDavi;
END


TgUpdatePHP
BEGIN
UPDATE ProdutoDavi
SET SomaEstoque=NEW.Quantidade-OLD.Quantidade 
WHERE idProdutoDavi=NEW.ProdutoDavi_idProdutoDavi;
UPDATE ProducaoDavi
SET SomaValor=SomaValor+(NEW.Quantidade*NEW.ValorUnitario)-(OLD.Quantidade*OLD.ValorUnitario)
WHERE idProcucaoDavi=NEW.ProducaoDavi_idProducaoDavi;
END


INSERT INTO FabricaDavi(Nome) VALUES ('Fabrica 1'),('Fabrica 2'), ('Fabrica 3');

INSERT INTO ProdutoDavi(Nome,Unidade) VALUES 
('Caixa de papelão tamanho P', 'uni'), 
('Caixa de papelão tamanho M', 'uni'), 
('Caixa de papelão tamanho G', 'uni');


INSERT INTO ProducaoDavi(FabricaDavi_idFabricaDavi, Nome ,DataProducao) VALUES
(1, 'Caixas de papelão para o Mecanica', '2021-05-30'),
(2, 'Caixas de papelão para o loja de roupa', '2021-05-30'),
(3, 'Caixas de papelão para o loja de calçado', '2021-05-30');


INSERT INTO PHP(ProducaoDavi_idProducaoDavi, ProdutoDavi_idProdutoDavi,Quantidade,ValorUnitario) VALUES (1,1,100,1.5);
INSERT INTO PHP(ProducaoDavi_idProducaoDavi, ProdutoDavi_idProdutoDavi,Quantidade,ValorUnitario) VALUES (1,2,100,4);
INSERT INTO PHP(ProducaoDavi_idProducaoDavi, ProdutoDavi_idProdutoDavi,Quantidade,ValorUnitario) VALUES (1,3,100,2);