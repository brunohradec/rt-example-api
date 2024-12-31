-- liquibase formatted sql

-- changeset rt-example:1
-- comment: add example employees

create table if not exists employee (
    id bigint generated by default as identity,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255) not null,

    primary key(id),
    unique (email)
);

-- changeset rt-example:2
-- comment: add example jobs

create table if not exists job (
    id bigint generated by default as identity,
    name varchar(255) not null,
    description varchar(255),

    primary key(id)
);

-- changeset rt-example:3
-- comment: add example employees

insert into employee (first_name, last_name, email)
values
    ('John', 'Smith', 'john.smith@email.com'),
    ('Sarah', 'Johnson', 'sarah.j@email.com'),
    ('Michael', 'Williams', 'm.williams@email.com'),
    ('Emma', 'Brown', 'emma.b@email.com'),
    ('James', 'Jones', 'james.jones@email.com'),
    ('Lisa', 'Garcia', 'l.garcia@email.com'),
    ('David', 'Miller', 'david.m@email.com'),
    ('Jennifer', 'Davis', 'j.davis@email.com'),
    ('Robert', 'Rodriguez', 'robert.r@email.com'),
    ('Maria', 'Martinez', 'm.martinez@email.com'),
    ('William', 'Anderson', 'w.anderson@email.com'),
    ('Elizabeth', 'Taylor', 'e.taylor@email.com'),
    ('Richard', 'Thomas', 'r.thomas@email.com'),
    ('Patricia', 'Moore', 'p.moore@email.com'),
    ('Joseph', 'Jackson', 'j.jackson@email.com'),
    ('Margaret', 'White', 'm.white@email.com'),
    ('Charles', 'Lopez', 'c.lopez@email.com'),
    ('Susan', 'Lee', 's.lee@email.com'),
    ('Christopher', 'Gonzalez', 'c.gonzalez@email.com'),
    ('Jessica', 'Wilson', 'j.wilson@email.com');

-- changeset rt-example:4
-- comment: add example job

insert into job (name, description)
values
    ('Software Engineer', 'Develops and maintains software applications'),
    ('Sales Representative', 'Generates leads and closes sales with clients'),
    ('Marketing Manager', 'Oversees marketing campaigns and strategy'),
    ('HR Specialist', 'Manages employee relations and recruitment'),
    ('Financial Analyst', 'Analyzes financial data and prepares reports'),
    ('Project Manager', 'Coordinates project delivery and team management'),
    ('Data Scientist', 'Analyzes complex data sets and creates models'),
    ('Customer Support', 'Provides technical support to customers'),
    ('Product Manager', 'Drives product strategy and development'),
    ('Operations Manager', 'Oversees daily business operations');