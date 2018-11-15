create database Empresa

use Empresa
create table tipo(
id_tipo int(11) primary key,
nombre varchar(45)
)
create table tb_Usuario(
idUser int primary key  auto_increment,
Usuario varchar(45) ,
pwdUser varchar(45),
Correo varchar(45),
nomUser varchar(45),
apeUser varchar(60),
last_Sesion datetime,
id_tipo int(11) ,
foreign key (id_tipo) references tipo(id_tipo)
)
drop database Usuario
insert into tipo values(1,'Administrador')
insert into tipo values(2,'Usuario')

insert into tb_Usuario (usuario,pwdUser) values('admin','admin')

select*from tb_Usuario
select*from tipo


DELIMITER $$
CREATE PROCEDURE Sign_in(usr varchar(45), pws char(45))
BEGIN
select * from Usuario
 where usuario = usr and pwdUser = pws;
END $$
DELIMITER ;
execute Sign_in 'admin','admin';
