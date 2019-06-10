USE Trabalho;

-- 1)

delete 
avaliador.CPF,
Grau_Academico.ID
from avaliador,Grau_Academico where avaliador.Grau_Academico_ID=Grau_Academico.ID and Grau_Academico.ID = 'Doutor';
