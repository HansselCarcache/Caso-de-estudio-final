USE master
GO
CREATE DATABASE RegistroProductos
GO
USE RegistroProductos
GO
CREATE TABLE Bodega(
	Id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	nombre NVARCHAR(40) NOT NULL,
	descripcion NVARCHAR(100)
	)
GO
CREATE TABLE Productos(
	Id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	Codigo INT NOT NULL,
	Nombre NVARCHAR(60) NOT NULL,
	Descripcion NVARCHAR(100),
	Precio INT NOT NULL,
	Estado INT NOT NULL,
	idBodega INT NOT NULL,
	FOREIGN KEY (idBodega) REFERENCES Bodega(id)
	)
GO
CREATE TABLE Empleado(
	Id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	codigoemp NVARCHAR(40) NOT NULL,
	clave NVARCHAR(40) NOT NULL,
	puesto NVARCHAR(50) NOT NULL
	)


SELECT * FROM Productos

SELECT * FROM Bodega


INSERT INTO Bodega(nombre, descripcion)
VALUES('Bodega principal','La tienda')

INSERT INTO Bodega(nombre, descripcion)
VALUES('Bodega secundaria','Donde se almacenan mas productos')



INSERT INTO Productos(Codigo, Nombre, Descripcion, Precio, Estado,idBodega)
VALUES(0001,'Pelota','Redondo',20,1,1)

INSERT INTO Productos(Codigo, Nombre, Descripcion, Precio, Estado,idBodega)
VALUES(0002,'Caja','Cuadrado',12,1,1)




INSERT INTO Empleado(codigoemp, clave, puesto)
VALUES('0001','123','Gerente')

INSERT INTO Empleado(codigoemp, clave, puesto)
VALUES('0002','123','Limpieza')

