create table Language (
    id varchar(255) not null,
    name varchar(255) not null,
    author varchar(255) not null,
    file_extension varchar(255) not null,
    primary key(id)
);

insert into Language values('java', 'java', 'James Gosling', 'javac');
insert into Language values('cpp', 'C++', 'Bjarne Stroustrup', 'cpp');
insert into Language values('csharp', 'C#', 'Andres Hejlsberg', 'cs');
insert into Language values('perl', 'Perl', 'Larry Wall', 'pl');
insert into Language values('haskel', 'Haskell', 'Simon Peyton', 'hs');
insert into Language values('lua', 'Lua', 'Luiz Henrique', 'lua');
insert into Language values('python', '4Python', 'Guido van Rossum', 'py');