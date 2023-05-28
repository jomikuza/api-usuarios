INSERT INTO roles (created_at, role_name, status) VALUES (NOW(), 'USER', 'ACTIVE');
INSERT INTO roles (created_at, role_name, status) VALUES (NOW(), 'MANAGER', 'ACTIVE');
INSERT INTO roles (created_at, role_name, status) VALUES (NOW(), 'SYSTEM ANALYST', 'ACTIVE');

INSERT INTO USUARIOS (age, role_id, created_at, last_name, name, status, username, email)
VALUES (23, 1, NOW(), 'CASAS', 'PABLO', 'ACTIVE', 'pablo123', 'casas@mail.com');

INSERT INTO USUARIOS (age, role_id, created_at, last_name, name, status, username, email)
VALUES (23, 2, NOW(), 'MARINEZ', 'CARLA', 'ACTIVE', 'carla123', 'martinez@mail.com');

INSERT INTO USUARIOS (age, role_id, created_at, last_name, name, status, username, email)
VALUES (23, 3, NOW(), 'JOTA', 'FFF', 'ACTIVE', 'carlasdfa123', 'asdf@mail.com');