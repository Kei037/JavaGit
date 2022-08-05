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
DELETE FROM MenuItem WHERE mid=1006;


UPDATE Customer SET ssn='901212-1234567', phone='010-3434-4444' WHERE cid=1001;
-- inner join 작성방식
SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid
WHERE c.ssn = '970824-1234567';


/*
Berverage = 101
coffee = 501, fappuccino = 502, blended = 503, tea = 504, coldBrew = 505, juice = 506

Food = 102
bread = 507, cake = 508, sandwich = 509, snack = 510, icecream = 511
*/



CREATE TABLE Category (
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(20)		NOT NULL
)AUTO_INCREMENT = 101;
SELECT * FROM Category;

CREATE TABLE Sub_Category (
	sid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	categoryId		BIGINT			NOT NULL,
	sub_name		VARCHAR(20)		NOT NULL,
	CONSTRAINT Sub_Category_categoryId_FK
		FOREIGN KEY(categoryId) REFERENCES Category(cid)
)AUTO_INCREMENT = 501;
SELECT * FROM Sub_Category;

UPDATE Sub_Category SET sub_name = 'sandwich' WHERE sid = 509;

CREATE TABLE MenuItem (
	mid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	sub_categoryId	BIGINT			NOT NULL,
	name_kor		VARCHAR(20)		NOT NULL,
	name_eng		VARCHAR(20)		NOT NULL,
	balance			DOUBLE			NOT NULL,
	ice				BOOLEAN			NOT NULL	DEFAULT 0,
	img				VARCHAR(60)		NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT MenuItem_sub_categoryId_FK
		FOREIGN KEY(sub_categoryId) REFERENCES Sub_Category(sid)
)AUTO_INCREMENT = 1001;

SELECT * FROM MenuItem;

SELECT * FROM MenuItem WHERE ;

!DROP TABLE MenuItem;

INSERT INTO Category (name) VALUES ('Food');
INSERT INTO Sub_Category (categoryId, sub_name) VALUES (102, 'icecream');
INSERT INTO MenuItem (sub_categoryId, name_kor, name_eng, balance, ice, img)
VALUES (501, '아메리카노', 'Americano', 4500, false, 'C:\Users\Junyoung\Desktop\coffe_img');
INSERT INTO MenuItem (sub_categoryId, name_kor, name_eng, balance, ice, img)
VALUES (507, '블루베리베이글', 'BlueberryBagel', 4500, false, 'g42t2tt.jpg')


SELECT * FROM MenuItem LEFT JOIN Sub_Category 
ON MenuItem.sub_categoryId = Sub_Category.sid JOIN Category 
ON Sub_Category.categoryId = Category.cid;

UPDATE MenuItem LEFT JOIN Sub_Category ON MenuItem.sub_categoryId = Sub_Category.sid 
JOIN Category ON Sub_Category.categoryId = Category.cid SET sub_categoryId = 501 , 
name_kor = '카푸치노2',  balance = 5600, ice = true, img = '13d9d2d2.jpg', 
sid = 501, categoryId = 101, sub_name = 'coffee', cid = 101, name = 'Beverage' 
WHERE name_kor = '카푸치노1';

SELECT MenuItem.*, Sub_Category.sid, Category.cid FROM MenuItem LEFT JOIN Sub_Category 
ON MenuItem.Sub_categoryId = Sub_Category.sid JOIN Category 
ON Sub_Category.categoryId = Category.cid WHERE cid = 101;


UPDATE MenuItem SET sub_categoryId = 501, name_kor = '카푸치', name_eng = 'Cappuccin', 
balance = 5600.0, ice = true, img = 'e0689792.jpg' WHERE mid = 1002;














