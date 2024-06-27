// Criar BD:

CREATE TABLE PedalDavi (
 idPedalDavi INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
 DataPedal DATE NULL ,
 Nome VARCHAR(50) NULL ,
 Cidade VARCHAR(50) NULL ,
 Distancia REAL NULL ,
PRIMARY KEY(idPedalDavi));
CREATE TABLE CiclistaDavi (
 idCiclistaDavi INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
 Nome VARCHAR(50) NULL ,
 SomaDistancia REAL NULL DEFAULT 0 ,
 SomaPedal INTEGER UNSIGNED NULL DEFAULT 0 ,
PRIMARY KEY(idCiclistaDavi));
CREATE TABLE PedalDavi_has_CiclistaDavi (
 PedalDavi_idPedalDavi INTEGER UNSIGNED NOT NULL ,
 CiclistaDavi_idCiclistaDavi INTEGER UNSIGNED NOT NULL ,
PRIMARY KEY(PedalDavi_idPedalDavi, CiclistaDavi_idCiclistaDavi) ,
INDEX PedalDavi_has_CiclistaDavi_FKIndex1(PedalDavi_idPedalDavi) ,
INDEX PedalDavi_has_CiclistaDavi_FKIndex2(CiclistaDavi_idCiclistaDavi),
 FOREIGN KEY(PedalDavi_idPedalDavi)
 REFERENCES PedalDavi(idPedalDavi)
 ON DELETE NO ACTION
 ON UPDATE NO ACTION,
 FOREIGN KEY(CiclistaDavi_idCiclistaDavi)
 REFERENCES CiclistaDavi(idCiclistaDavi)
 ON DELETE NO ACTION
 ON UPDATE NO ACTION);


// Criar StoredProcedure: 
// ProcBuscaDistancia:
BEGIN
SELECT distancia INTO vardistancia FROM pedalDavi
WHERE idPedalDavi=varidpedal;
END


// TgInsertPHC: 
BEGIN
CALL ProcBuscaDistancia(NEW.PedalDavi_idPedalDavi,@VarDistancia);
UPDATE CiclistaDavi SET SomaDistancia=SomaDistancia+@VarDistancia
WHERE IdCiclistaDavi=NEW.CiclistaDavi_IdCiclistaDavi;
UPDATE CiclistaDavi SET SomaPedal=SomaPedal+1
where IdCiclistaDavi=NEW.CiclistaDavi_IdCiclistaDavi;
END


// TgDeletePHC:
BEGIN
CALL ProcBuscaDistancia(OLD.PedalDavi_idPedalDavi,@VarDistancia);
UPDATE CiclistaDavi SET SomaDistancia=SomaDistancia-@VarDistancia
where IdCiclistaDavi=OLD.CiclistaDavi_IdCiclistaDavi;
UPDATE CiclistaDavi SET SomaPedal=SomaPedal-1
where IdCiclistaDavi=OLD.CiclistaDavi_IdCiclistaDavi;
END

// INSERTS: 

INSERT INTO pedalDavi (DataPedal,Nome,Cidade,Distancia) VALUES ('2021-09-08', 'Pedal1', 'Chapecó', '100');
INSERT INTO pedalDavi (DataPedal,Nome,Cidade,Distancia) VALUES ('2021-09-08', 'Pedal2', 'Chapecó', '120');
INSERT INTO pedalDavi (DataPedal,Nome,Cidade,Distancia) VALUES ('2021-09-08', 'Pedal3', 'Chapecó', '130');

INSERT INTO ciclistaDavi (Nome,SomaDistancia,SomaPedal) VALUES ('Davi', '0', '0');
INSERT INTO ciclistaDavi (Nome,SomaDistancia,SomaPedal) VALUES ('Matheus', '0', '0');
INSERT INTO ciclistaDavi (Nome,SomaDistancia,SomaPedal) VALUES ('Paulo', '0', '0');


INSERT INTO pedalDavi_has_ciclistaDavi (PedalDavi_idPedalDavi, CiclistaDavi_idCiclistaDavi) VALUES ('1', '1');
INSERT INTO pedalDavi_has_ciclistaDavi (PedalDavi_idPedalDavi, CiclistaDavi_idCiclistaDavi) VALUES ('2', '2');
INSERT INTO pedalDavi_has_ciclistaDavi (PedalDavi_idPedalDavi, CiclistaDavi_idCiclistaDavi) VALUES ('3', '3');
