--En este archivo utilice la instancia INSERT especificando unicamenta las columnas necesarias que ocuparemos
--dejando que el campo id se genere automaticamente porque en el schema.sql esta definido ya el AUTO_INCREMENT

-- Insert Profesor
INSERT INTO profesor (nombre) VALUES ('Alexander Campos');
INSERT INTO profesor (nombre) VALUES ('Kevin Jiménez');
INSERT INTO profesor (nombre) VALUES ('Emerson Cartagena');
INSERT INTO profesor (nombre) VALUES ('Mario Alvarado');
INSERT INTO profesor (nombre) VALUES ('Alfonso Rivera');


-- Insert Materias
INSERT INTO materia (nombre, id_profesor) VALUES ('Desarrollo de Aplic. Web Frameworks Laboratorio', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Diseño y Programación de software Multiplataforma', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Desarrollo de Aplic. Web con Soft. Interpret.en el Servidor', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Desarrollo de Aplic. Web Frameworks Teoria', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Servidores en Plataformas Propietarias', 1);


-- Insert Alumnos
INSERT INTO alumno (nombre, apellido) VALUES ('Jessica', 'Alvarez');
INSERT INTO alumno (nombre, apellido) VALUES ('Alejandro', 'Sanchez');
INSERT INTO alumno (nombre, apellido) VALUES ('Jose', 'Campos');
INSERT INTO alumno (nombre, apellido) VALUES ('Karla', 'Rodriguez');
INSERT INTO alumno (nombre, apellido) VALUES ('Lidia', 'Arevalo');

--Insert Alumno_Materia
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES ( 1, 1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES ( 2, 2);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES ( 3, 3);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES ( 4, 4);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES ( 5, 5);
