DROP DATABASE IF EXISTS auth;
CREATE DATABASE IF NOT EXISTS auth;

USE auth;

CREATE TABLE users(
	id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    `password` VARCHAR(64) NOT NULL
)ENGINE=INNODB;

