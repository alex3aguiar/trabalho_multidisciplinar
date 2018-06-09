DELETE FROM alocacao_medicos WHERE data_alocacao = ? AND horario_alocacao = ? AND codigo_medico = ?;

DELETE FROM clinicas WHERE codigo_clinica = ?;

DELETE FROM consultas WHERE codigo_consulta = ?;

DELETE FROM convenios WHERE codigo_convenio = ?;

DELETE FROM empresas WHERE codigo_empresa = ?;

DELETE FROM especialidades WHERE codigo_especialidade = ?;

DELETE FROM medicos WHERE codigo_medico = ?;

DELETE FROM pacientes WHERE codigo_paciente = ?;