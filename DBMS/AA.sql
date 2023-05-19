create table table1(id INT , name VARCHAR(20) not null , age INT not null , PRIMARY KEY (id));
insert into db1.table1(id, name, age) values( 1, 'Amulya', 23);
insert into table1(id, name, age) values( 2, 'Avar', 22);

create table Employee(id int , name varchar(20) not null, dept varchar(20), salary int  , primary key (id) );
insert into db1.Employee (id ,name, dept, salary) values ( 11 , 'Amulya' ,'Java', 50);
insert into db1.Employee (id,name, dept, salary) values ( 22 , 'Avar' , 'Java' , 40);
insert into db1.Employee (id,name, dept, salary) values ( 24 , 'Ava' , 'Js' , 20);
insert into db1.Employee (id,name, dept, salary) values ( 29 , 'var' , 'Js' , 30);
insert into db1.Employee (id,name, dept, salary) values ( 2 , 'who' , 'hehe' , 60);

create view myview1 as 
select * from db1.Employee
where dept='Java';

-- grant all on *.* to amulya@localhost;
-- revoke  all, grant option from amulya@localhost;
grant all on db1.* to amulya@localhost;
-- grant all on db1.table1 to amulya@localhost; 

show grants;

update db1.Employee
set salary=77
where dept = 'Java';

alter table db1.Employee
add age int;

alter table db1.Employee
rename column age to m_age;

select * from db1.Employee t1
inner join  db1.table1 t2 
on t1.id=t2.id;

select *from db1.Employee E1, db1.Employee E2 
where E1.id!=E2.id and E1.dept=E2.dept;

Create Trigger triggerrr1
after update
on Employee for each row
Begin
   -- some declarations
End


