create table Planetas(
idPlaneta int not null,
Nome varchar(50) not null,
rotacao float not null,
orbita float not null,
diametro float not null,
clima varchar(50) not null,
populacao int not null,
)
go
alter table Planetas add constraint PK_Planetas primary key (idPlaneta);

create table Pilotos(
idPiloto int not null,
nome varchar(200) not null,
anoNascimento varchar(10) not null,
idPlaneta int not null,
)
go
alter table Pilotos add constraint PK_Pilotos primary key (idPiloto);
go
alter table Pilotos add constraint FK_pilotos_Planeta foreign key (idPlaneta) references Planetas(idPlaneta)

create table PilotosNaves(
idPiloto int not null,
idNave int not null,
flagAutorizado bit not null,
)
go
alter table PilotosNaves add constraint PK_PilotosNaves primary key (idPiloto, idNave);
go
alter table PilotosNaves add constraint FK_PilotosNaves_Piloto foreign key (idPiloto) references Pilotos(idPiloto)
go
alter table PilotosNaves add constraint FK_PilotosNaves_Naves foreign key(idNave) references Naves(idNave)
go
alter table PilotosNaves add constraint DF_PilotosNaves_flagAutorizado default (1) for flagAutorizado

create table HistoricoViagens(
idNave int not null,
idPiloto int not null,
dtSaida datetime not null,
dtChegada datetime not null
)
go
alter table HistoricoViagens add constraint FK_HistoricoViagens_PilotosNaves foreign key (idPiloto, idNave) references PilotosNaves (idPiloto, idNave)
go
alter table HistoricoViagens check constraint FK_HistoricoViagens_PilotosNaves


select t1.*,
t2.nome,
t3.Nome
from HistoricoViagens t1
inner join Pilotos t2
on t1.idPiloto = t2.idPiloto
inner join Naves t3
on t1.idNave = t3.idNave

select case
when count(dtSaida) <> count(dtChegada) then 1
else 0
end Viajando,
count(dtSaida),
count(dtChegada)
from HistoricoViagens
where idPiloto = 14

select * from HistoricoViagens

delete from PilotosNaves where idPiloto = 14 and idNave = 10
