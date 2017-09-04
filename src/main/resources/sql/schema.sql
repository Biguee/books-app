

DROP TABLE IF EXISTS books;

-- change the format of ISBN   todo

CREATE TABLE books(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  AUTHOR VARCHAR(40) NOT NULL ,
  TITLE VARCHAR(40) NOT NULL,
  ISBN VARCHAR(15) NOT NULL
);

INSERT INTO books (ID, AUTHOR, TITLE, ISBN) VALUES (0, "Andrzej", "tytul1", "123");
INSERT INTO books (ID, AUTHOR, TITLE, ISBN) VALUES (0, "Adam", "tytul2", "321");

SELECT * FROM books;