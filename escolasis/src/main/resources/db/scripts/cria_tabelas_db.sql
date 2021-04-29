create table tab_pessoa (cpf_pessoa varchar(11), nome_pessoa varchar(100) not null, dt_nascto_pessoa date, id_papel_pessoa bigserial);
alter table tab_pessoa add constraint tab_pessoa_pk primary key (cpf_pessoa);
--
create table tab_teste_git (col1 numeric, col2 varchar(100));
--
create table tab_audit_pessoa(cpf_pessoa varchar(11), dt_insert timestamp default current_timestamp, dt_update timestamp default current_timestamp);
alter table tab_audit_pessoa add constraint tab_audit_pessoa_pk primary key (cpf_pessoa);
--
create table tab_papel_pessoa (id_papel_pessoa bigserial, nome_papel_pessoa varchar(50) not null, dt_insert timestamp default current_timestamp, dt_update timestamp default current_timestamp);
alter table tab_papel_pessoa add constraint tab_papel_pessoa_pk primary key (id_papel_pessoa);
--
create table tab_telefone_pessoa (id_telefone_pessoa bigserial, ddi_telefone varchar(2), ddd_telefone varchar(2), numero_telefone varchar(9), tipo_telefone varchar(10), telefone_cpf_pessoa varchar(11), dt_insert timestamp default current_timestamp, dt_update timestamp default current_timestamp);
alter table tab_telefone_pessoa add constraint tab_telefone_pessoa_pk primary key (id_telefone_pessoa);
-- foreign Keys
alter table tab_pessoa add constraint pessoa_papel_pessoa_fk foreign key (id_papel_pessoa) references tab_papel_pessoa(id_papel_pessoa);
alter table tab_telefone_pessoa add constraint telefone_pessoa_fk foreign key (telefone_cpf_pessoa) references tab_pessoa(cpf_pessoa); 
alter table tab_audit_pessoa add constraint pessoa_audit_pessoa_fk foreign key (cpf_pessoa) references tab_pessoa (cpf_pessoa);