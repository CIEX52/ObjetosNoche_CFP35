-- Active: 1715118358405@@127.0.0.1@3306
-- DML Data Manipulation Language (Lenguaje de Manipulación de Datos)
-- Insertamos Registros de Prueba

INSERT INTO cursos (id, titulo, profesor, dia, turno) VALUES
(1, 'Introducción a la Programación', 'Juan Pérez', 'LUNES', 'MAÑANA'),
(2, 'Diseño Gráfico Avanzado', 'María Rodríguez', 'MARTES', 'TARDE'),
(3, 'Inglés Intermedio', 'David Smith', 'MIERCOLES', 'NOCHE'),
(4, 'Marketing Digital', 'Laura Gómez', 'JUEVES', 'MAÑANA'),
(5, 'Finanzas Personales', 'Carlos Fernández', 'VIERNES', 'TARDE'),
(6, 'Desarrollo Web con HTML y CSS', 'Ana Torres', 'LUNES', 'NOCHE'),
(7, 'Contabilidad Básica', 'Roberto Ramírez', 'MARTES', 'MAÑANA'),
(8, 'Redes Informáticas', 'Sara López', 'MIERCOLES', 'TARDE'),
(9, 'Inteligencia Artificial', 'Pedro García', 'JUEVES', 'NOCHE'),
(10, 'Fotografía Profesional', 'Mónica Ruiz', 'VIERNES', 'MAÑANA'),
(11, 'Diseño de Interiores', 'Alejandro Herrera', 'LUNES', 'TARDE'),
(12, 'Programación Orientada a Objetos', 'Julia Martínez', 'MARTES', 'NOCHE'),
(13, 'Gestión de Proyectos', 'Daniel Castro', 'MIERCOLES', 'MAÑANA'),
(14, 'Psicología del Aprendizaje', 'Elena Paredes', 'JUEVES', 'TARDE'),
(15, 'Negocios Internacionales', 'Andrés Vargas', 'VIERNES', 'NOCHE'),
(16, 'Diseño de Videojuegos', 'Patricia Morales', 'LUNES', 'MAÑANA'),
(17, 'Introducción al Big Data', 'Roberto Sánchez', 'MARTES', 'TARDE'),
(18, 'Marketing en Redes Sociales', 'Laura Jiménez', 'MIERCOLES', 'NOCHE'),
(19, 'Programación en Python', 'Carlos Rodríguez', 'JUEVES', 'MAÑANA'),
(20, 'Diseño Editorial', 'María González', 'VIERNES', 'TARDE');

INSERT INTO alumnos (id, nombre, apellido, edad, id_curso) VALUES
(1, 'Alejandro', 'González', 20, 1),
(2, 'Sofía', 'Hernández', 22, 2),
(3, 'Lucía', 'Martínez', 25, 3),
(4, 'Mateo', 'López', 21, 4),
(5, 'Valentina', 'Pérez', 19, 5),
(6, 'Daniel', 'Gómez', 23, 6),
(7, 'María', 'Torres', 20, 7),
(8, 'Javier', 'Ramírez', 22, 8),
(9, 'Isabella', 'Fernández', 24, 9),
(10, 'Santiago', 'Vargas', 21, 10),
(11, 'Camila', 'Herrera', 19, 11),
(12, 'Nicolás', 'Martínez', 20, 12),
(13, 'Valeria', 'Castro', 22, 13),
(14, 'Andrés', 'Paredes', 25, 14),
(15, 'Mariana', 'Vargas', 21, 15),
(16, 'Emilio', 'Morales', 19, 16),
(17, 'Gabriela', 'Sánchez', 23, 17),
(18, 'Samuel', 'Jiménez', 24, 18),
(19, 'Fernanda', 'Rodríguez', 20, 19),
(20, 'Diego', 'González', 22, 20);

INSERT INTO alumnos (id, nombre, apellido, edad, id_curso) VALUES
(21, 'Giuseppe', 'Ricci', 23, 1),
(22, 'Francesca', 'Conti', 20, 2),
(23, 'Alessandro', 'Marino', 22, 3),
(24, 'Ludovica', 'Bianchi', 21, 4),
(25, 'Leonardo', 'Rossi', 24, 5);

INSERT INTO alumnos (id, nombre, apellido, edad, id_curso) VALUES
(26, 'Oleksandr', 'Kovalenko', 22, 6),
(27, 'Iryna', 'Petrova', 24, 7),
(28, 'Andriy', 'Ivanov', 20, 8),
(29, 'Kateryna', 'Kovalchuk', 23, 9),
(30, 'Oksana', 'Melnyk', 21, 10);

insert into alumnos (nombre,apellido,edad, id_curso) VALUES
('Javier','Stuart',34,1);

-- insert into alumnos (nombre,apellido,edad, id_curso) VALUES ('Javier','Stuart',3,1);
-- insert into alumnos (nombre,apellido,edad, id_curso) VALUES ('Javier','Stuart',333,1);
-- insert into alumnos (nombre,apellido,edad, id_curso) VALUES ('Javier','Stuart',3,1200);
select * from alumnos;

