set FOREIGN_KEY_CHECKS=0;
USE Trabalho;

INSERT INTO Grau_Academico (id,descricao) VALUES
('1','Doutor'),
('2','Mestre');

INSERT INTO Instituicao(id,descricao) VALUES
('1','São Judas'),
('2','Uninove');

INSERT INTO Grande_Area(id,descricao) VALUES 
('1', 'Engenharias'),
('2' , 'Ciências Humanas'),
('3',  'Ciências da Saúde'); 

INSERT INTO Area_De_Conhecimento(ID,DESCRICAO,Grande_Area_ID) VALUES 	
(1, 'Engenharia Civil',1), 
(2,'Engenharia Elétrica',1), 
(3,'Engenharia Mecânica',1),
(4, 'Filosofia',2), 
(5,'Sociologia',2),
(6,'História',2),
(7,'Medicina',3), 
(8,'Farmácia',3), 
(9,'Nutrição',3);

INSERT INTO Projetos(NOME,DURACAO,AVALIADOR_CPF,PESQUISADOR_CPF,CODIGO_INTERNO,
AREA_DE_PESQUISA,ORCAMENTO,Resposta_RESULTADO,AREA_DE_PESQUISA_CODIGO,Area_De_Conhecimento_ID,DATA_DE_ENTREGA,DATA_DE_RESPOSTA) VALUES
('Decolando','56','56664253','519674254','8850','Saúde',500.00,'null',1,1,'2019/08/01','2019/09/01'),
('Vida','30','56664253','519674254','7756','Saúde',1.000,'null',1,2,'2019/09/04','2019/09/05'),
('Construindo','80','64826889','519674254','6690','Saúde',1.500,'null',2,3,'2019/10/08','2019/09/09'),
('Remedios','21','64826889','519674254','4854','Saúde',700.00,'null',3,4,'2019/10/25','2019/09/11'),
('Nutrindo Vidas','74','897151555','64829459',	'6984','Saúde',600.00,'null',4,5,'2019/12/25','2019/10/15'),
('Vidas Amadas','64','56664253','64829459',	'9958','Matemática',400.00,'APROVADO',6,6,'2019/10/20','2019/10/13'),
('Automação','87','897151555','697158452','9778','Matemática',900.00,'APROVADO',7,7,'2019/12/20','2019/10/23'),
('Fios','38','56664253','697158452','8475','Matemática',350.00,'APROVADO',8,8,'2019/08/24','2019/10/25'),
('Carros','14','56664253','654781365','3454','Matemática',900.00,'APROVADO',9,9,'2019/05/20','2019/08/20'),
('Caminhões','36','64826889','654781365','1221','Matemática',1.700,'APROVADO',10,1,'2019/05/02','2019/08/25'),
('Casas','46','985781325','647158934','3123','Matemática',3.500,'APROVADO',1,2,'2019/09/20','2019/07/01'),
('Fios de Cobre','47','64826889','324896158','3119','Matemática',850.00,'APROVADO',2,3,'2019/06/03','2019/06/20'),
('Amando Professores','51','985781325','659874125',	'1515','Humanas',970.00, 'REPROVADO',3,4,'2019/07/20','2019/08/06'),
('Professores Legais','48','56664253','214587463','9652','Humanas',740.00,'REPROVADO',4,5,'2019/09/25','2019/05/02'),
('Nota 10','85','985781325','325485623','4115','Humanas',745.00,'REPROVADO',5,6,'2019/05/20','2019/10/20'),
('Estudando o Mundo','68','458158874','314585852','3479','Humanas',650.00,'REPROVADO',6,7,'2019/05/20','2019/08/20'),
('Estudar nao é vida','31',	'458158874','314585852','9895','Humanas',980.00,'REPROVADO',7,8,'2019/04/17','2019/09/20'),
('Vivendo e Aprendendo','79','458158874','654781365','6554','Humanas',950.00,'APROVADO',8,9,'2019/05/20','2019/09/25'),
('Aprender','97','458158874','324896158','3228','Humanas',380.00,'APROVADO',9,9,'2019/05/20','2019/11/20');

INSERT INTO  Pesquisador(NOME,CPF,RG,SEXO,DATA_DE_NASCIMENTO,GRAU_ACADEMICO_ID,INSTITUICAO_ID) VALUES 
('Arthur','519674254','854754745','M','1965/05/25','2','1'),
('Vinicius','64829459','354478621','M','1980/05/18','2','2'),
('Lucas','697158452','214585696','M','1966/12/15','2','1'),
('Carlos','654781365','325696574','M','1980/04/13','1','2'),
('Junior','647158934','142563314','M','1985/08/25','1','1'),
('João','324896158', '256965478','M','1990/02/28','1','2'),
('Paulo','659874125','244852585','M','1978/08/05','1','1'),
('Gabriel','214587463','356585547','M','1968/06/22','1','2'),
('Elfo','325485623','956554785','M','1965/07/16','1','1'),
('Eduardo','314585852','012554785','M','1980/03/19','1','2');

INSERT INTO  AVALIADOR(NOME,CPF,RG,SEXO,DATA_DE_NASCIMENTO,GRAU_ACADEMICO_ID,INSTITUICAO_ID) VALUES 
('Claudio','56664253','952754765','M','1965/05/25','2','1'),
('Amanda','64826889','354478621','F','1980/05/20','2','1'),
('Bruno','897151555','654585658','M','1985/01/17','1','1'),
('Rosana','985781325','155696554','F','1972/06/02','1','2'),
('Siberia','458158874','2525665165','F','1983/04/15','1','2');



