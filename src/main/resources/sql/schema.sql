-- database
DROP DATABASE IF EXISTS books;
CREATE DATABASE books;

-- table "books"
DROP TABLE IF EXISTS books;
CREATE TABLE books(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  AUTHOR VARCHAR(100) NOT NULL ,
  TITLE VARCHAR(200) NOT NULL,
  ISBN VARCHAR(20) NOT NULL
);

-- sample fields to fill in the books table
INSERT INTO books (ID, AUTHOR, TITLE, ISBN) VALUES (0, "Ashton Hobbs", "Teach Yourself Java Database Programming with JDBC in 21 Days", "1-575-21123-8");
INSERT INTO books (ID, AUTHOR, TITLE, ISBN) VALUES (0, "Jeff Schneider, Rajeev Arora ", "Special Edition Using Enterprise Java", "0-789-70887-6");
INSERT INTO books (ID, AUTHOR, TITLE, ISBN) VALUES (0, "Laurence Vanhelsuwe, Andre Yee, Ivan Phillips, Goang-Tay Hsu", "Mastering Java", "0-782-11935-2");
INSERT INTO books (ID, AUTHOR, TITLE, ISBN) VALUES (0, "Alex Chafee, Rebecca Tapley", "The Official Gamelan Java Directory", "1-562-76449-7 ");
