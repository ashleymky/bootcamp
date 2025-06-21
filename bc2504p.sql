create database bootcamp_2504p;

use bootcamp_2504p;

create table staffs (
   id int,
   first_name varchar(100),
   last_name varchar(100),
   salary numeric(10,2)
);

select * from staffs;

-- DML - insert
insert into staffs (id, first_name, last_name, salary) values (1, 'Ashley', 'Mok', 20000);
insert into staffs (id, first_name, last_name, salary) values (2, 'Sally', 'Lau', 18000);

-- Another way to insert data
insert into staffs values (3, 'Oscar', 'Wong', 24000);

-- DML - Update
update staffs set salary = salary * 1.1 where first_name = 'Ashley';
select * from staffs;

insert into staffs values (4, 'Alex', 'Chan', 15000);

-- DML - Delete
delete from staffs where first_name = 'Sally';


-- select
-- 1. where AND OR
select * from staffs where last_name = 'Lau' and salary >20000;
select * from staffs where last_name = 'Chan' or salary <16000;
select * from staffs where last_name = 'Lau' or salary > 16000 and last_name = 'Chan'; -- AND first, and then OR
select * from staffs where (last_name = 'Lau' or salary > 16000) and last_name = 'Wong'; -- support ()

-- >, <, >=, <=, =, <>(不等於）

select * from staffs where last_name <> 'Lau';

-- * (all columns)
-- id, salary (specific column)
select id, salary from staffs;

-- alias
select t.id, t.salary from staffs t where t.salary > 20000;

-- order by
select t.*
from staffs t
where t.salary > 18000
order by t.first_name; -- by default ascending order

select t.*
from staffs t
where t.salary > 18000
order by t.first_name desc; -- descending order

-- group by
create table books (
   title varchar(100),
   genre varchar(100),
   price numeric(10,2)
);

insert into books(title, genre, price) values ('book1', 'adventure', 11.90);
insert into books(title, genre, price) values ('book2', 'fantasy', 8.49);
insert into books(title, genre, price) values ('book3', 'romance', 9.99);
insert into books(title, genre, price) values ('book4', 'adventure', 9.99);
insert into books(title, genre, price) values ('book5', 'fantasy', 7.99);
insert into books(title, genre, price) values ('book6', 'romance', 5.88);


select * from books;

select b.genre
, avg(b.price) as avg_price
, max(b.price) as max_price
, min(b.price) as min_price
, count(*) as no_of_books
, sum(b.price) as total_price
, min(length(b.title)) as min_length_title
from books b
group by b.genre;

-- Having : filter group
select b.genre, sum(b.price) as total_price -- step 4
from books b
where b.price < 9  -- step 1
group by b.genre -- step 2
having sum(b.price) > 10; -- step 3 need to eliminate sth jau use HAVING!

-- case insensitive
select * from staffs where last_name = 'chan';

-- String Operation
select t.*
, upper(t.first_name) upper_first_name
, lower(t.last_name) lower_last_name
, length(t.first_name)
, concat(t.first_name, ' ', t.last_name) as full_name
, substring(t.first_name, 1, 3) -- print 3 char value from 1st char
, replace(t.first_name, 'A', 'K')
, instr(t.first_name, 's') -- not found = 0, number of character: 2
from staffs t;

select b.genre
, round(avg(price), 2)
, floor(avg(price))
, ceil(avg(price))
, avg(price)
, power(2, 5)
from books b
group by b.genre

-- add column
alter table staffs add join_date date;
select * from staffs;

update staffs set join_date = STR_TO_DATE('2020-06-30', '%Y-%m-%d') where id = 1;
update staffs set join_date = STR_TO_DATE('2021-01-05', '%Y-%m-%d') where id = 4;
update staffs set join_date = STR_TO_DATE('2018-12-20', '%Y-%m-%d') where id = 3;

select * from staffs where join_date = STR_TO_DATE('2018-12-20', '%Y-%m-%d');
select * from staffs where join_date between '2018-11-20' and '2019-12-01';

select s.join_date, s.join_date + interval 3 month - interval 1 day as probabtion_end, s.*
from staffs s;

-- create table, varchar, numerics, integer, date, datetime
-- insert
-- group by + agg functions (max, min...)
-- group by + having

create table Children (
     id int,
     class varchar(100),
     nickname varchar(200),
     result varchar(100)
);

select * from Children;

insert into Children (id, class, nickname, result)  values (1, 'A', 'Bobby', 'A+');
insert into Children (id, class, nickname, result) values (2, 'B', 'Amy', 'B+');
insert into Children (id, class, nickname, result) values (3, 'C', 'Jack', 'C+');
insert into Children (id, class, nickname, result)  values (4, 'A', 'Bob', 'A+');
insert into Children (id, class, nickname, result) values (5, 'C', 'Annie', 'B+');
insert into Children (id, class, nickname, result) values (6, 'D', 'Zoey', 'C+');

alter table Children add grad_date date;
alter table Children add score numeric(10,2);

update Children set score = 100 where id = 1;
update Children set grad_date = '2022-08-31' where id = 1;
update Children set score = 90 where id = 2;
update Children set grad_date = '2023-01-31' where id = 2;
update Children set score = 80 where id = 3;
update Children set grad_date = '2024-04-30' where id = 3;

update Children set score = 80 where id = 4;
update Children set grad_date = '2022-08-31' where id = 4;
update Children set score = 90 where id = 5;
update Children set grad_date = '2023-01-31' where id = 5;
update Children set score = 100 where id = 6;
update Children set grad_date = '2024-04-30' where id = 6;

update Children set score = score * 1.1;
update Children set score = score / 1.1;
     
delete from Children where nickname is null;

select c.id
, avg(score) as avg_score
, max(c.score) as max_score
, min(c.score) as min_score
, count(*) as total_score
from Children c
group by c.id;


-- select b.genre, sum(b.price) as total_price -- step 4
-- from books b
-- where b.price < 9  -- step 1
-- group by b.genre -- step 2
-- having sum(b.price) > 10; -- step 3

-- Primary key + Foreign key
-- One to many, Many to Many, One to One(less)

-- A department has many employees
-- A employee belongs to one department (allow null department)

create table department (
    id int primary key,
    description varchar(100),
    code varchar(5)
);
insert into department values (1, 'Information Technology', 'IT');
select * from department;
insert into department values (1, 'ERROR', 'IT'); -- error
insert into department values (2, 'Human Resources', 'HR');


create table employees (
    id int primary key, -- PK = 'not null' + 'unique' + 'indexing'
    first_name varchar(50),
    last_name varchar(50),
    email varchar(50) not null unique, -- "unique" is a constriant
    department_id int not null, -- "not null" is a constriant
    FOREIGN KEY (department_id) references department(id) -- validate if the department_id exists in table departments
);

-- FK cannot ensure the value of department_id is non-null value
-- Every table has its PK

-- technically error and data invalid (FK helps safeguard invalid data)
-- insert into employees values (1, 'John', 'Lau', 'john@mail.com', 3);

insert into employees values (1, 'John', 'Lau', null); -- after setting "not null" constraint to department_id, error
insert into employees values (1, 'John', 'Lau', 'john@mail.com', 3);
-- insert into department values (3, 'Marketing', 'MKT');
insert into employees values (3, 'Boy', 'mok', 'boy@mail.com', 4);

select * from employees;
drop table employees;

-- Inner join
select *
from department dpt 
inner join employees EM
on EM.department_id = dpt.id;


-- Many to Many (Students vs courses)
create table students (
    id int primary key,
    student_card_id varchar(10) not null unique,
    name varchar(50) not null
    );
    
create table subjects (
    id int primary key,
    description varchar(50) not null
);

-- A student has no duplicated subject
-- A subject would not belong to the same student twice
-- The subject id exists in table students
-- The subject id exists in table subjects

create table student_subjects (
    id int primary key,
    student_id int not null, -- + unique not work as it is many
    subject_id int not null, -- + unique not work as it is many
    FOREIGN KEY (student_id) references students(id),
    FOREIGN KEY (subject_id) references subjects(id),
    unique(student_id, subject_id)
);
    
insert into students values (1, 'Num123', 'John');
insert into students values (2, 'Num124', 'Ben');

insert into subjects values (1, 'History');
insert into subjects values (2, 'Math');
insert into subjects values (3, 'English');

select * from students;
select * from subjects;

insert into student_subjects values (1, 2, 2); -- Ben + Math
insert into student_subjects values (2, 2, 3); -- Ben + Eng
insert into student_subjects values (3, 1, 1); -- John + History

select * from student_subjects;

-- Inner Join (~90%)

select ss.*, stu.*, sub.* -- (choose what column to show)
from student_subjects ss
inner join students stu 
on stu.id = ss.student_id
inner join subjects sub
on sub.id = ss.subject_id;

-- left Join
insert into students values (3, 'Num125', 'Mary');
-- find all students and with his registered subjects, including those students without subject
select *
from students stu
left join student_subjects ss
on stu.id = ss.student_id;


-- Exercise

create table regions (
    region_id int primary key,
    region_name varchar(25)
);

create table countries (
    country_id int primary key,
    country_name varchar(40),
    FOREIGN KEY (region_id) references regions(region_id)
);

create table locations (
    location_id int primary key,
    street_address varchar(25), 
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    FOREIGN KEY (country_id) references countries(country_id)
);

create table departments (
    department_id int primary key,
    department_name varchar(30),
    manager_id int,
    FOREIGN KEY (location_id) references locations(location_id)
);

create table job_history (
    employee_id int primary key,
    start_date int primary key,
    end_date int,
    job_id varchar(10),
    FOREIGN KEY (department_id) references departments(department_id)
);

create table jobs (
    job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary int,
    max_salary int
);

create table employees (
    FOREIGN KEY (employee_id) references job_history(employee_id),
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25) unique,
    phone_number varchar(20),
    hire_date date,
    FOREIGN KEY (job_id) references jobs(job_id),
    salary int,
    commission_pct int,
    manager_id int,
    FOREIGN KEY (department_id) references departments(department_id)
);

CREATE DATABASE BOOTCAMP_EXERCISE1;

USE BOOTCAMP_EXERCISE1;

