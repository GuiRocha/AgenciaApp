set FOREIGN_KEY_CHECKS=0;
drop database Trabalho;
create database Trabalho;
use Trabalho;
create table Grau_Academico(
ID VARCHAR(45) NOT NULL,
DESCRICAO VARCHAR(45) NOT NULL,
PRIMARY KEY (ID)
);
 create table Instituicao(
 ID VARCHAR(45) NOT NULL ,
 DESCRICAO VARCHAR(45) NOT NULL,
 PRIMARY KEY (ID)
 );
create table Pesquisador (
NOME VARCHAR(45) NOT NULL,
CPF VARCHAR (45) NOT NULL,
RG VARCHAR (45) NOT NULL,
SEXO CHAR(2) NOT NULL,
DATA_DE_NASCIMENTO DATE NOT NULL,
AreaDePesquisa_CODIGO VARCHAR (45),
Instituicao_ID VARCHAR(45),
Grau_Academico_ID VARCHAR(45),
foreign key (Grau_Academico_ID) references Grau_Academico(ID),
foreign key (Instituicao_ID) references Instituicao(ID),
PRIMARY KEY (CPF)
);

create table AVALIADOR (
NOME VARCHAR(45) NOT NULL,
CPF VARCHAR (45) NOT NULL,
RG VARCHAR (45) NOT NULL,
SEXO CHAR(2) NOT NULL,
DATA_DE_NASCIMENTO DATE NOT NULL,
AreaDePesquisa_CODIGO VARCHAR (45),
Instituicao_ID VARCHAR(45),
Grau_Academico_ID VARCHAR(45),
foreign key (Grau_Academico_ID) references Grau_Academico(ID),
foreign key (Instituicao_ID ) references Instituicao(ID),
PRIMARY KEY (CPF)
);

create table Projetos (
NOME VARCHAR(45) ,
DURACAO VARCHAR(45),
CODIGO_INTERNO VARCHAR(15) not null,
DATA_DE_RESPOSTA date,
DATA_DE_ENTREGA datetime,
AREA_DE_PESQUISA VARCHAR(45)not null,
ORCAMENTO DOUBLE NOT NULL,
Resposta_RESULTADO VARCHAR (45),
AREA_DE_PESQUISA_CODIGO INT (45)not null,
AVALIADOR_CPF VARCHAR (45) not null,
Pesquisador_CPF VARCHAR (45)not null,
Area_De_conhecimento_ID varchar(45),
foreign key (Area_De_conhecimento_ID) references Area_De_Conhecimento(ID),
foreign key (Pesquisador_CPF) references Pesquisador(CPF),
foreign key (AVALIADOR_CPF) references AVALIADOR(CPF),
primary key (CODIGO_INTERNO)
);

create table Grande_Area (
ID VARCHAR (45) NOT NULL,
DESCRICAO VARCHAR(45)NOT NULL,
PRIMARY KEY (ID)
);
create table Area_De_Conhecimento (
ID VARCHAR (45) NOT NULL ,
DESCRICAO VARCHAR (45)NOT NULL,
Grande_Area_id VARCHAR (45),
foreign key (Grande_Area_ID) references Grande_Area(ID),
PRIMARY KEY (ID)
);