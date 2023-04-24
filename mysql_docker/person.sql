USE test_db;

CREATE TABLE person (
  no INT NOT NULL,
  age INT NOT NULL,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (no)
);

INSERT INTO person (no, age, name) VALUES (1, 29, 'joisfe');
INSERT INTO person (no, age, name) VALUES (2, 29, 'hyunjin-jo');
INSERT INTO person (no, age, name) VALUES (3, 27, 'kds3335k');
INSERT INTO person (no, age, name) VALUES (4, 26, 'semi-kim');
INSERT INTO person (no, age, name) VALUES (5, 26, 'bomin-kim');
