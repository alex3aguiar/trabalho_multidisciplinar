SELECT * FROM alocacao_medicos;

SELECT * FROM clinicas;

SELECT * FROM consultas;

SELECT * FROM convenios;

SELECT * FROM empresas;

SELECT * FROM especialidades;

SELECT * FROM medicos;

SELECT * FROM pacientes;

/* Manter histórico */
SELECT medicos.nome, consultas.data_alocacao, consultas.horario_alocacao, consultas.duracao, consultas.cancelada, consultas.tipo_consulta, 
		consultas.sintomas, consultas.possivel_molestia, consultas.prescricao
FROM (SELECT data_alocacao, horario_alocacao, duracao, tipo_consulta, cancelada, sintomas, possivel_molestia, prescricao
		FROM consultas WHERE codigo_paciente = ?) AS c
	INNER JOIN
	 (SELECT alocacao_medicos.data_alocacao, alocacao_medicos.horario_alocacao, alocacao_medicos.codigo_medico, medicos.nome
		FROM alocacao_medicos INNER JOIN medicos ON alocacao_medicos.codigo_medico = medicos.codigo_medico
		WHERE alocacao_medicos.codigo_especialidade = ?) AS m
	ON c.data_alocacao = m.data_alocacao AND c.horario_alocacao = m.horario_alocacao;