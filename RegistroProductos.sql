CREATE TABLE Productos(
	Id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	Codigo INT NOT NULL,
	Nombre NVARCHAR(60) NOT NULL,
	Descripcion NVARCHAR(100),
	Precio INT NOT NULL,
	Estado INT NOT NULL
	)

SELECT * FROM Productos

INSERT INTO Productos(Codigo, Nombre, Descripcion, Precio, Estado)
VALUES(0001,'Pelota','Redondo',20,1)

INSERT INTO Productos(Codigo, Nombre, Descripcion, Precio, Estado)
VALUES(0002,'Caja','Cuadrado',12,1)