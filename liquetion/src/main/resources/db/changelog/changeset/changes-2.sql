--liquibase formatted sql

--changeset Maksim Kachan:2

INSERT INTO USERS (id, first_name, last_name, birthday, registration_date)
VALUES (nextval('USERS_SEC'), 'Maksim', 'Kachan', '1994-10-01', '2022-04-01');
INSERT INTO USERS (id, first_name, last_name, birthday, registration_date)
VALUES (nextval('USERS_SEC'), 'Anna', 'Kachan', '1997-06-22', '2022-04-02');
INSERT INTO USERS (id, first_name, last_name, birthday, registration_date)
VALUES (nextval('USERS_SEC'), 'Lesia', 'Kachan', '1968-03-31', '2022-04-03');