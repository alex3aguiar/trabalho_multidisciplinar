INSERT INTO alocacao_medicos(data_alocacao, horario_alocacao, codigo_medico, codigo_clinica, codigo_especialidade)
VALUES (?, ?, ?, ?, ?);

INSERT INTO clinicas(cep, logradouro, numero, bairro, cidade, estado)
VALUES (?, ?, ?, ?, ?, ?);

INSERT INTO consultas(codigo_paciente, codigo_medico, data_alocacao, horario_alocacao, duracao, tipo_consulta, cancelada, sintomas, possivel_molestia, prescricao)
VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

INSERT INTO convenios(nome_fantasia, razao_social, cnpj, telefone, contato, site)
VALUES (?, ?, ?, ?, ?, ?);

INSERT INTO empresas(codigo_convenio, nome_fantasia, razao_social, cnpj, telefone, contato, site)
VALUES (?, ?, ?, ?, ?, ?, ?);

INSERT INTO especialidades(descricao)
VALUES (?);

INSERT INTO medicos(nome, data_nascimento, rg, cpf, sexo, cep, logradouro, numero, bairro, cidade, estado, telefone, celular, email, crm)
VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

INSERT INTO pacientes(codigo_empresa, nome, data_nascimento, rg, cpf, sexo, cep, logradouro, numero, bairro, cidade, estado, telefone, celular, email)
VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
