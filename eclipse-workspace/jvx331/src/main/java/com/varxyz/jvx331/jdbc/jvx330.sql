CREATE TABLE Customer(
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(30)		NOT NULL,
	passwd			VARCHAR(20)		NOT NULL,
	name			VARCHAR(20)		NOT NULL,
	ssn				VARCHAR(14)		NOT NULL, -- 123456-7890123
	phone			VARCHAR(13)		NOT NULL, -- 010-1234-5678
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer;
SELECT count(*) FROM Customer;
DELETE FROM Customer WHERE cid=1012;

CREATE TABLE Account (
	aid				BIGINT		PRIMARY KEY AUTO_INCREMENT,
	customerId		BIGINT		NOT NULL,
	accountNum		CHAR(11)	NOT NULL,		-- 000-00-0000
	accType			CHAR(1)		NOT NULL DEFAULT 'S',
	balance			DOUBLE		NOT NULL DEFAULT 0,
	interestRate	DOUBLE		NOT NULL DEFAULT 0.0,
	overAmount		DOUBLE		NOT NULL DEFAULT 0.0,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK
		FOREIGN KEY(customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;
DROP TABLE Account;



CREATE TABLE MenuItem (
	mid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	categoryId	VARCHAR(20)		NOT NULL,
	name_kor	VARCHAR(20)		NOT NULL,
	name_eng	VARCHAR(20)		NOT NULL,
	balance		DOUBLE			NOT NULL,
	ice			BOOLEAN			NOT NULL	DEFAULT 0,
	img			VARCHAR(60)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 101;


CREATE TABLE Category (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	cname		VARCHAR(20)		NOT NULL,
	sub_name	VARCHAR(20)		NOT NULL,
	categoryId	VARCHAR(20)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE Sub_Category (
	sid			VARCHAR(20)		PRIMARY KEY AUTO_INCREMENT,
	name		VARCHAR(20)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
);
















