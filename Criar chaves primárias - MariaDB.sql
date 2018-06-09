ALTER TABLE alocacao_medicos
ADD CONSTRAINT PK_ALOCACAO_MEDICOS PRIMARY KEY(data_alocacao, horario_alocacao, codigo_medico);

ALTER TABLE clinicas
ADD PRIMARY KEY(codigo_clinica);

ALTER TABLE consultas 
ADD PRIMARY KEY(codigo_consulta);

ALTER TABLE convenios 
ADD PRIMARY KEY(codigo_convenio);

ALTER TABLE empresas
ADD PRIMARY KEY(codigo_empresa);

ALTER TABLE especialidades 
ADD PRIMARY KEY(codigo_especialidade);

ALTER TABLE medicos 
ADD PRIMARY KEY(codigo_medico);

ALTER TABLE pacientes 
ADD PRIMARY KEY(codigo_paciente);