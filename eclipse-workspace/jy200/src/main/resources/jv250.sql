DROP TABLE Sample10;
CREATE TABLE Sample10 (
	no			INT(11)			DEFAULT NULL,
	name		VARCHAR(20) 	DEFAULT NULL,
	birthday	DATE			DEFAULT NULL,
	address		VARCHAR(40) 	DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '1999-08-12', '서울 태해''''안로291');
INSERT INTO Sample10 VALUES (3, '장비', '1996-03-07', '대구 달성군 대실');

CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(14)		NOT NULL,
	userId		VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(60)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

ALTER TABLE Customer CHANGE customerId userId VARCHAR(16) NOT NULL;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, phone, customerID, passwd) VALUES ('유비', '901213-1234567', '010-2323-2323', 'java', '1111');
INSERT INTO Customer (name, ssn, phone, customerID, passwd) VALUES ('관우', '902314-2345678', '010-4545-4545', 'mysql', '2222');
INSERT INTO Customer (name, ssn, phone, customerID, passwd) VALUES ('장비', '961578-1523267', '010-9988-9988', 'maven', '3233');

UPDATE Customer SET ssn='901212-1234567', phone='010-3434-4444' WHERE cid=1001;

DELETE FROM Customer WHERE cid=1005;

DROP TABLE Account;
CREATE TABLE Account (
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)		NOT NULL,	  		-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
) AUTO_INCREMENT = 3001

INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId) VALUES ('123-45-6789', 10000.0, 5.0, 50000.0, 'S', 1004);
INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId) VALUES ('456-78-2678', 20000.0, 2.5, 100000.0, 'C', 1006);

SELECT * FROM Account;

DELETE FROM Account WHERE aid=3001;

/* inner join
 * 교집함 부분만 가져오기 때문에 가장빠르다 */
SELECT * FROM Account, Customer
WHERE Account.customerId = Customer.cid AND Customer.ssn = '961578-1523267';

-- inner join 작성방식
SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid
WHERE c.ssn = '970824-1234567';















