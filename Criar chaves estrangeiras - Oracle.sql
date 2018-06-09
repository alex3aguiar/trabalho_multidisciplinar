ALTER TABLE alocacao_medicos
ADD CONSTRAINT FK_ALOCACAO_MEDICOS_CLINICAS FOREIGN KEY(codigo_clinica) REFERENCES clinicas(codigo_clinica);

ALTER TABLE alocacao_medicos
ADD CONSTRAINT FK_ALOCACAO_MEDICOS_ESPECIALIDADES FOREIGN KEY(codigo_especialidade) REFERENCES especialidades(codigo_especialidade);

ALTER TABLE consultas
ADD CONSTRAINT FK_ALOCACAO_MEDICOS_CONSULTAS FOREIGN KEY(data_alocacao, horario_alocacao, codigo_medico)
REFERENCES alocacao_medicos(data_alocacao, horario_alocacao, codigo_medico);

ALTER TABLE alocacao_medicos
ADD CONSTRAINT FK_ALOCACAO_MEDICOS_MEDICOS FOREIGN KEY(codigo_medico) REFERENCES medicos(codigo_medico);

ALTER TABLE empresas 
ADD CONSTRAINT FK_CONVENIOS_EMPRESAS FOREIGN KEY(codigo_convenio) REFERENCES convenios(codigo_convenio);

ALTER TABLE pacientes
ADD CONSTRAINT FK_EMPRESAS_PACIENTES FOREIGN KEY(codigo_empresa) REFERENCES empresas(codigo_empresa);

ALTER TABLE consultas
ADD CONSTRAINT FK_PACIENTES_CONSULTAS FOREIGN KEY(codigo_paciente) REFERENCES pacientes(codigo_paciente);