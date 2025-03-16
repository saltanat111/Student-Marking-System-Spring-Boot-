create schema if not exists markStudentJoulnal;

drop table if exists admins;
create table admins (id bigint primary key auto_increment, admin_username varchar(80), admin_password varchar(80));

drop table if exists teachers;
create table teachers (id bigint primary key auto_increment, teacher_username varchar(80), teacher_password varchar(80), teacher_course varchar(80), teacher_course_id integer);

drop table if exists parents;
create table parents (id bigint primary key auto_increment, parent_username varchar(80), parent_password varchar(80), student_id integer);

drop table if exists students;
create table students (id bigint primary key auto_increment, student_id integer, student_username varchar(80), student_password varchar(80));

drop table if exists marks;
create table marks (id bigint primary key auto_increment, student_id integer, teacher_course varchar(80), mark int);

insert into admins (admin_username, admin_password) values ('admin', 'admin123');

insert into teachers (teacher_username, teacher_password, teacher_course, teacher_course_id) values ('Nadejda Kirillovna', 'teacher123N', 'history', 1);
insert into teachers (teacher_username, teacher_password, teacher_course, teacher_course_id) values ('Jazgul Annazarova', 'teacher123J', 'biology', 2);
insert into teachers (teacher_username, teacher_password, teacher_course, teacher_course_id) values ('Elchibek Kerimbaev', 'teacher123E', 'physics', 3);
insert into teachers (teacher_username, teacher_password, teacher_course, teacher_course_id) values ('Diana Nusratullaeva', 'teacher123D', 'math', 4);
insert into teachers (teacher_username, teacher_password, teacher_course, teacher_course_id) values ('Aygerim Melisovna', 'teacher123A', 'geography', 5);

insert into parents (parent_username, parent_password, student_id) values ('Andrey Bolkonskiy', 'parent123A', 1);
insert into parents (parent_username, parent_password, student_id) values ('Pyer Bezuhov', 'parent123P', 2);
insert into parents (parent_username, parent_password, student_id) values ('Natasha Rostova', 'parent123N', 3);
insert into parents (parent_username, parent_password, student_id) values ('Chadskiy Alecksandr', 'parent123C', 4);
insert into parents (parent_username, parent_password, student_id) values ('Grigoriy Pechorin', 'parent123G', 5);
insert into parents (parent_username, parent_password, student_id) values ('Tatyana Larina', 'parent123T', 6);
insert into parents (parent_username, parent_password, student_id) values ('Elizabet Bennet', 'parent123E', 7);

insert into students (student_id, student_username, student_password) values (1, 'Arina Petrovna', 'student123A');
insert into students (student_id, student_username, student_password) values (2, 'Irina Lisitsina', 'student123I');
insert into students (student_id, student_username, student_password) values (3, 'Nastya Alekseevna', 'student123N');
insert into students (student_id, student_username, student_password) values (4, 'Elen Kuragina', 'student123E');
insert into students (student_id, student_username, student_password) values (5, 'Vera Nickolaevna', 'student123V');
insert into students (student_id, student_username, student_password) values (6, 'Mariya Ostrovskaya', 'student123M');
insert into students (student_id, student_username, student_password) values (7, 'Sofya Kovalevskaya', 'student123S');

insert into marks (student_id, teacher_course, mark) values (1, 'history', 89);
insert into marks (student_id, teacher_course, mark) values (1, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (1, 'biology', 92);
insert into marks (student_id, teacher_course, mark) values (1, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (1, 'geography', 97);
insert into marks (student_id, teacher_course, mark) values (2, 'history', 96);
insert into marks (student_id, teacher_course, mark) values (2, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (2, 'biology', 94);
insert into marks (student_id, teacher_course, mark) values (2, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (2, 'geography', 91);
insert into marks (student_id, teacher_course, mark) values (3, 'history', 96);
insert into marks (student_id, teacher_course, mark) values (3, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (3, 'biology', 94);
insert into marks (student_id, teacher_course, mark) values (3, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (3, 'geography', 91);
insert into marks (student_id, teacher_course, mark) values (4, 'history', 96);
insert into marks (student_id, teacher_course, mark) values (4, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (4, 'biology', 94);
insert into marks (student_id, teacher_course, mark) values (4, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (4, 'geography', 91);
insert into marks (student_id, teacher_course, mark) values (5, 'history', 96);
insert into marks (student_id, teacher_course, mark) values (5, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (5, 'biology', 94);
insert into marks (student_id, teacher_course, mark) values (5, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (5, 'geography', 91);
insert into marks (student_id, teacher_course, mark) values (6, 'history', 96);
insert into marks (student_id, teacher_course, mark) values (6, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (6, 'biology', 94);
insert into marks (student_id, teacher_course, mark) values (6, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (6, 'geography', 91);
insert into marks (student_id, teacher_course, mark) values (7, 'history', 96);
insert into marks (student_id, teacher_course, mark) values (7, 'physics', 100);
insert into marks (student_id, teacher_course, mark) values (7, 'biology', 94);
insert into marks (student_id, teacher_course, mark) values (7, 'math', 98);
insert into marks (student_id, teacher_course, mark) values (7, 'geography', 91);
