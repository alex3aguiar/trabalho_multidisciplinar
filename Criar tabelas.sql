CREATE TABLE alocacao_medicos(
	codigo_clinica SMALLINT(5) NOT NULL,
	codigo_medico SMALLINT(5) NOT NULL,
	dia_semana SMALLINT(1) NOT NULL,
	horario TIME(6) NOT NULL,
	CHECK (dia_semana >= 1 AND dia_semana <= 7)
);

CREATE TABLE clinicas(
	codigo_clinica SMALLINT(5) UNIQUE NOT NULL,
	cep CHAR(9) NOT NULL,
	logradouro VARCHAR(60) NOT NULL,
	numero CHAR(6) NOT NULL,
	bairro VARCHAR(50) NOT NULL,
	cidade VARCHAR(50) NOT NULL,
	estado CHAR(2) NOT NULL
);

CREATE TABLE consultas (
	codigo_consulta SMALLINT(5) UNIQUE NOT NULL,
	codigo_paciente SMALLINT(5) NOT NULL,
	codigo_medico SMALLINT(5) NOT NULL,
	codigo_clinica SMALLINT(5) NOT NULL,
	data_consulta DATE NOT NULL,
	horario_consulta TIME(6) NOT NULL,
	tipo_consulta SMALLINT(1) NOT NULL,
	cancelada BIT NOT NULL,
	sintomas VARCHAR(255),
	possivel_molestia VARCHAR(255),
	prescricao VARCHAR(255),
	CHECK (tipo_consulta = 0 OR tipo_consulta = 1)
);

CREATE TABLE convenios (
	codigo_convenio SMALLINT(5) UNIQUE NOT NULL,
	nome_fantasia VARCHAR(50) NOT NULL,
	razao_social VARCHAR(255) NOT NULL,
	cnpj CHAR(18) UNIQUE NOT NULL,
	telefone CHAR(9),
	contato VARCHAR(50) NOT NULL,
	site VARCHAR(255)
);

CREATE TABLE empresas (
	codigo_empresa SMALLINT(5) UNIQUE NOT NULL,
	codigo_convenio SMALLINT(5) NOT NULL,
	nome_fantasia VARCHAR(50) NOT NULL,
	razao_social VARCHAR(255) NOT NULL,
	cnpj CHAR(18) UNIQUE NOT NULL,
	telefone CHAR(9),
	contato VARCHAR(50) NOT NULL,
	site VARCHAR(255)
);

CREATE TABLE especialidade_clinica (
	codigo_especialidade SMALLINT(5) NOT NULL,
	codigo_clinica SMALLINT(5) NOT NULL,
	dia_semana SMALLINT(1) NOT NULL,
	horario TIME(6) NOT NULL,
	CHECK (dia_semana >= 1 AND dia_semana <= 7)
);

CREATE TABLE especialidade_medico (
	codigo_especialidade SMALLINT(5) NOT NULL,
	codigo_medico SMALLINT(5) NOT NULL
);

CREATE TABLE especialidades (
	codigo_especialidade SMALLINT(5) UNIQUE NOT NULL,
	descricao VARCHAR(255) NOT NULL
);

CREATE TABLE medicos (
	codigo_medico SMALLINT(5) UNIQUE NOT NULL,
	nome VARCHAR(50) NOT NULL,
	data_nascimento DATE NOT NULL,
	rg CHAR(13) UNIQUE NOT NULL,
	cpf CHAR(14) UNIQUE NOT NULL,
	sexo CHAR(2) NOT NULL,
	cep CHAR(9) NOT NULL,
	logradouro VARCHAR(60) NOT NULL,
	numero CHAR(6) NOT NULL,
	bairro VARCHAR(50) NOT NULL,
	cidade VARCHAR(50) NOT NULL,
	estado CHAR(2) NOT NULL,
	telefone CHAR(9),
	celular CHAR(10),
	email VARCHAR(255),
	crm CHAR(13),
	CHECK (sexo = 'M' OR sexo = 'F' OR sexo = 'O')
);

CREATE TABLE pacientes (
	codigo_paciente SMALLINT(5) UNIQUE NOT NULL,
	codigo_empresa SMALLINT(5) NOT NULL,
	nome VARCHAR(50) NOT NULL,
	data_nascimento DATE NOT NULL,
	rg CHAR(13) UNIQUE NOT NULL,
	cpf CHAR(14) UNIQUE NOT NULL,
	sexo CHAR(2) NOT NULL,
	cep CHAR(9) NOT NULL,
	logradouro VARCHAR(60) NOT NULL,
	numero CHAR(6) NOT NULL,
	bairro VARCHAR(50) NOT NULL,
	cidade VARCHAR(50) NOT NULL,
	estado CHAR(2) NOT NULL,
	telefone CHAR(9),
	celular CHAR(10),
	email VARCHAR(255),
	CHECK (sexo = 'M' OR sexo = 'F' OR sexo = 'O')
);