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
	nombre NVARCHAR(80) NOT NULL,
	apellidos NVARCHAR(100) NOT NULL,
	numCelular NVARCHAR(40) NOT NULL,
	codigoemp NVARCHAR(40) NOT NULL,
	clave NVARCHAR(40) NOT NULL
	)
	
	
SELECT * FROM Productos

SELECT * FROM Empleado


INSERT INTO Bodega(nombre, descripcion)
VALUES('Bodega principal','La tienda')

INSERT INTO Bodega(nombre, descripcion)
VALUES('Bodega secundaria','Donde se almacenan mas productos')

INSERT INTO Bodega(nombre, descripcion)
VALUES('Bodega de repuesto','Donde se almacenan mas productos')



INSERT INTO Productos(Codigo, Nombre, Descripcion, Precio, Estado,idBodega)
VALUES(0001,'Pelota','Redondo',20,1,1)

INSERT INTO Productos(Codigo, Nombre, Descripcion, Precio, Estado,idBodega)
VALUES(0002,'Caja','Cuadrado',12,1,1)




INSERT INTO Empleado(codigoemp,nombre,apellidos,numCelular, clave)
VALUES('0001','Hanssel','Carcache Aguilar','869854213','123')

INSERT INTO Empleado(codigoemp,nombre,apellidos,numCelular, clave)
VALUES('0002','Rubén','Mojica Aguilar','353584987','123')

