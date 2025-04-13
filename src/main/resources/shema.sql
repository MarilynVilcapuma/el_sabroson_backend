-- Active: 1744516391827@@127.0.0.1@1433
CREATE TABLE producto (
    id_producto INT IDENTITY(1,1) PRIMARY KEY,  
    categoria CHAR(1) NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    descripcion VARCHAR(150) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    estado NVARCHAR(200) DEFAULT 'ACTIVO'
);

SELECT* FROM producto;