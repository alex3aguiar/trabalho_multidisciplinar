ALTER TABLE alocacao_medicos
ADD CONSTRAINT FK_ALOCACAO_MEDICOS_CLINICAS FOREIGN KEY(codigo_clinica) REFERENCES clinicas(codigo_clinica);

ALTER TABLE alocacao_medicos
ADD CONSTRAINT FK_ALOCACAO_MEDICOS_MEDICOS FOREIGN KEY(codigo_medico) REFERENCES medicos(codigo_medico);

ALTER TABLE consultas 
ADD CONSTRAINT FK_CLINICAS_CONSULTAS FOREIGN KEY(codigo_clinica) REFERENCES clinicas(codigo_clinica);

ALTER TABLE empresas 
ADD CONSTRAINT FK_CONVENIOS_EMPRESAS FOREIGN KEY(codigo_convenio) REFERENCES convenios(codigo_convenio);

ALTER TABLE pacientes
ADD CONSTRAINT FK_EMPRESAS_PACIENTES FOREIGN KEY(codigo_empresa) REFERENCES empresas(codigo_empresa);

ALTER TABLE especialidade_clinica 
ADD CONSTRAINT FK_ESPECIALIDADE_CLINICA_CLINICAS FOREIGN KEY(codigo_clinica) REFERENCES clinicas(codigo_clinica);

ALTER TABLE especialidade_clinica 
ADD CONSTRAINT PK_ESPECIALIDADE_CLINICA_ESPECIALIDADES FOREIGN KEY(codigo_especialidade) REFERENCES especialidades(codigo_especialidade);

ALTER TABLE especialidade_medico 
ADD CONSTRAINT FK_ESPECIALIDADE_MEDICO_ESPECIALIDADES FOREIGN KEY(codigo_especialidade) REFERENCES especialidades(codigo_especialidade);

ALTER TABLE especialidade_medico 
ADD CONSTRAINT FK_ESPECIALIDADE_MEDICO_MEDICOS FOREIGN KEY(codigo_medico) REFERENCES medicos(codigo_medico);

ALTER TABLE consultas 
ADD CONSTRAINT FK_MEDICOS_CONSULTAS FOREIGN KEY(codigo_medico) REFERENCES medicos(codigo_medico);

ALTER TABLE consultas
ADD CONSTRAINT FK_PACIENTES_CONSULTAS FOREIGN KEY(codigo_paciente) REFERENCES pacientes(codigo_paciente);