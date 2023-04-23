USE test_db;

CREATE TABLE person (
  no INT NOT NULL,
  age INT NOT NULL,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (no)
);

INSERT INTO person (no, age, name) VALUES (1, 29, '조재철');
INSERT INTO person (no, age, name) VALUES (2, 29, '조현진');
