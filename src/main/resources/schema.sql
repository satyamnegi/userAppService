CREATE TABLE PERSON (
	PERSONID INT NOT NULL AUTO_INCREMENT,
	FIRST_NAME VARCHAR(250) NOT NULL,
	LAST_NAME VARCHAR(250) NOT NULL,
	AGE INT NOT NULL,
	FAVOURITE_COLOUR VARCHAR(50) DEFAULT NULL,
	HOBBY VARCHAR(500) DEFAULT NULL
);