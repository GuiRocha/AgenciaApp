CREATE TEMPORARY TABLE Tabela_temp
SELECT 
Tabela_temp.ID,
Projetos.orcamento,
Projetos.codigo_interno FROM
Projetos
WHERE Resposta_resultado like '%null%' 
 ORDER BY orcamento DESC
 LIMIT 2;

SELECT * FROM SELECT_UPDATE;

UPDATE Projetos SET Resposta_resultado = 'Aprovado', DATA_DE_RESPOSTA = now() WHERE ID IN (SELECT ID FROM Tabela_temp);