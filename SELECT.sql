set FOREIGN_KEY_CHECKS=0;
use Trabalho;
-- 1)
SELECT * FROM Projetos;

-- 2)
SELECT 
Projetos.NOME,
Projetos.CODIGO_INTERNO,
Projetos.Resposta_RESULTADO
from Projetos where Resposta_RESULTADO = 'null';

-- 3)
SELECT 
Projetos.NOME as nome ,
Area_De_Conhecimento.id as area_conhecimento,
Grande_Area.ID as Grande_area
from Projetos,Grande_Area,Area_De_Conhecimento where Area_De_Conhecimento.Grande_Area_ID=Grande_Area.ID and
Projetos.area_de_conhecimento_ID=Area_De_Conhecimento.id order by Grande_Area.id desc ;

-- 4)
SELECT 
COUNT(Projetos.Area_De_conhecimento_ID),
Area_De_Conhecimento.id,
Area_De_Conhecimento.descricao
from Projetos,Area_De_Conhecimento where Projetos.Area_De_conhecimento_ID = Area_De_Conhecimento.id
group by Projetos.area_de_conhecimento_id;


-- 5)
SELECT 
Projetos.NOME,
Projetos.CODIGO_INTERNO,
Projetos.Resposta_RESULTADO,
Pesquisador.NOME,
Pesquisador.CPF,
AVALIADOR.nome,
AVALIADOR.cpf
FROM Pesquisador,Projetos,AVALIADOR where Projetos.Pesquisador_CPF=Pesquisador.CPF AND
Projetos.avaliador_cpf = AVALIADOR.cpf ORDER BY Resposta_RESULTADO;

-- 6)
SELECT 
max(Projetos.avaliador_cpf),
AVALIADOR.nome
FROM AVALIADOR,Projetos where Projetos.avaliador_cpf=AVALIADOR.cpf ;

-- 7)
SELECT 
max(Projetos.pesquisador_cpf),
Pesquisador.nome,
Pesquisador.cpf,
Projetos.codigo_interno
from Projetos,Pesquisador where Projetos.pesquisador_cpf=Pesquisador.cpf;


-- 8)
SELECT 
Pesquisador.nome,
Pesquisador.cpf,
Projetos.orcamento
from Projetos,Pesquisador where Projetos.pesquisador_cpf=Pesquisador.cpf
order by orcamento desc ;

-- 9)
SELECT 
Projetos.nome,
Projetos.codigo_interno,
Pesquisador.nome,
Pesquisador.cpf,
Grau_Academico.descricao
from Pesquisador,Projetos,Grau_Academico where Projetos.pesquisador_cpf=Pesquisador.cpf and
Grau_Academico.descricao = 'Doutor';

-- 10)
SELECT 
Projetos.nome,
Projetos.codigo_interno,
Pesquisador.nome,
Pesquisador.cpf,
AVALIADOR.nome,
AVALIADOR.cpf,
Grau_Academico.descricao
from Projetos,Pesquisador,AVALIADOR,Grau_Academico
where Projetos.pesquisador_cpf=Pesquisador.cpf ='Mestre' and
Projetos.avaliador_cpf=AVALIADOR.cpf = 'Doutor' ;


