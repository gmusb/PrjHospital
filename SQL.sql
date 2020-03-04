create database hospital;

use hospital;

create table Hospital(
id int auto_increment primary key,
nm_hospital varchar(45) not null,
ds_endereco varchar(200) not null
);

create table ProntoSocorro(
cd int auto_increment primary key,
id_hospital int not null,
ds_endereco varchar(200) not null,
foreign key(id_hospital) references Hospital(id)
);

create table Pacientes(
cd int auto_increment primary key,
nm_paciente varchar(200) not null,
nr_cpf varchar(14) not null,
nr_rg varchar(20) not null,
nr_idade int not null,
ds_senha varchar(200) not null,
id_hospital int not null,
foreign key(id_hospital) references Hospital(id)
);

create table funcionarios(
cd int auto_increment primary key,
nm_funcionario varchar(200) not null,
nr_cpf varchar(14) not null,
nr_rg varchar(20) not null,
nr_idade int not null,
ds_senha varchar(200) not null,
vl_hora decimal(5,2) not null,
id_hospital int not null,
foreign key(id_hospital) references Hospital(id)
);

create table Medicos(
cd int auto_increment primary key,
nr_crm varchar(45) not null,
ds_especialidades varchar(45) not null,
id_funcionario int not null,
foreign key(id_funcionario) references funcionarios(cd)
);

create table Enfermeiros(
cd int auto_increment primary key,
nr_corem varchar(45) not null,
id_funcionario int not null,
foreign key(id_funcionario) references funcionarios(cd)
);