UPDATE alocacao_medicos
SET data_alocacao = ?, horario_alocacao = ?, codigo_medico = ?, codigo_clinica = ?, codigo_especialidade = ?
WHERE data_alocacao = ? AND horario_alocacao = ? AND codigo_medico = ?;

UPDATE clinicas
SET cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?
WHERE codigo_clinica = ?;

UPDATE consultas
SET codigo_paciente = ?, codigo_medico = ?, data_alocacao = ?, horario_alocacao = ?, duracao = ?, tipo_consulta = ?, cancelada = ?, sintomas = ?, possivel_molestia = ?, prescricao = ?
WHERE codigo_consulta = ?;

UPDATE convenios
SET nome_fantasia = ?, razao_social = ?, cnpj = ?, telefone = ?, contato = ?, site = ?
WHERE codigo_convenio = ?;

UPDATE empresas
SET codigo_convenio = ?, nome_fantasia = ?, razao_social = ?, cnpj = ?, telefone = ?, contato = ?, site = ?
WHERE codigo_empresa = ?;

UPDATE especialidades
SET descricao = ?
WHERE codigo_especialidade = ?; 

UPDATE medicos
SET nome = ?, data_nascimento = ?, rg = ?, cpf = ?, sexo = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, telefone = ?, celular = ?, email = ?, crm = ?
WHERE codigo_medico = ?;

UPDATE pacientes
SET codigo_empresa = ?, nome = ?, data_nascimento = ?, rg = ?, cpf = ?, sexo = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, telefone = ?, celular = ?, email = ?
WHERE codigo_paciente = ?;