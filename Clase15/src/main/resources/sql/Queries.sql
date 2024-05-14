-- Consultas de pruebas

-- 1- Obtener todos los alumnos con sus respectivos cursos:
SELECT alumnos.id, alumnos.nombre, alumnos.apellido, cursos.titulo
        FROM alumnos
        JOIN cursos ON alumnos.id_curso = cursos.id;

-- 2- Obtener los alumnos que están inscritos en cursos impartidos por el profesor 'Juan Pérez':
SELECT alumnos.id, alumnos.nombre, alumnos.apellido, cursos.titulo, cursos.profesor
        FROM alumnos
        JOIN cursos ON alumnos.id_curso = cursos.id
        WHERE cursos.profesor = 'Juan Pérez';

-- 3- Obtener los cursos y sus respectivos alumnos, ordenados por el nombre del curso:
SELECT cursos.id, cursos.titulo, alumnos.nombre, alumnos.apellido
        FROM cursos
        JOIN alumnos ON cursos.id = alumnos.id_curso
        ORDER BY cursos.titulo;

-- 4- Obtener los alumnos que están inscritos en cursos que se imparten los martes:
SELECT alumnos.id, alumnos.nombre, alumnos.apellido, cursos.titulo, cursos.dia
        FROM alumnos
        JOIN cursos ON alumnos.id_curso = cursos.id
        WHERE cursos.dia = 'MARTES';

-- 5- Obtener los alumnos y los cursos en los que están inscritos, mostrando solo aquellos cursos que tienen más de 2 alumnos inscritos:
SELECT alumnos.id, alumnos.nombre, alumnos.apellido, cursos.titulo, cursos.profesor
        FROM alumnos
        JOIN cursos ON alumnos.id_curso = cursos.id
        WHERE cursos.id IN (
                SELECT id_curso FROM alumnos GROUP BY id_curso HAVING COUNT(*) > 2
        );