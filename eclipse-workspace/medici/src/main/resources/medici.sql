CREATE TABLE Artworks (
	aid					BIGINT			PRIMARY KEY AUTO_INCREMENT,
	artworkName			VARCHAR(20)		NOT NULL,
	userId				VARCHAR(20)		NOT NULL	DEFAULT 'test',
	storage				VARCHAR(50)		NOT NULL,
	startPeriod			VARCHAR(20)		NOT NULL,
	endPeriod			VARCHAR(20)		NOT NULL,
	paymentLog			VARCHAR(40)		NOT NULL,
	test				BIGINT			NOT NULL,
	deliveryService		CHAR(1)			NOT NULL	DEFAULT 'N',
	regDate				TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Artworks_test_FK FOREIGN KEY (test) REFERENCES Wallet(wid)
) AUTO_INCREMENT = 1001;

SELECT * FROM Artworks;

DROP TABLE Artworks;

INSERT INTO Artworks (ArtworkName, userId, storage, startPeriod, endPeriod, paymentLog, test, deliveryService)
VALUES ('568-24-8342', 'young', '대구광역시 중구 반월당', '2022-07-04', '2022-08-02', '500', 6001, 'N');

UPDATE Artworks SET ssn='901212-1234567', phone='010-3434-4444' WHERE cid=1001;

CREATE TABLE Wallet (
	wid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	walletId	VARCHAR(20)		NOT NULL,
	balance		DOUBLE			NOT NULL	DEFAULT 0.0,
	regDate				TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 6001;

SELECT * FROM Wallet;

DROP TABLE Wallet;

INSERT INTO Wallet (walletId, balance) VALUES ('three', '50000.0');


update Artworks a, Wallet b set a.paymentLog = b.balance, a.[컬럼명2] = b.[컬럼명2]

where

	a.[컬럼명3] = b.[컬럼명3];

update Artworks a, Wallet b on a.userId = b.walletId set paymentLog = 3000;


DROP TABLE UserSignUp;
CREATE TABLE UserSignUp (
	pkUser			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	userId			VARCHAR(20)		DEFAULT NULL,
	passwd			VARCHAR(20)		DEFAULT NULL,
	koreanName		VARCHAR(20)		DEFAULT NULL,
	englishName		VARCHAR(30)		DEFAULT NULL,
	ssn				VARCHAR(20)		DEFAULT NULL,
	acaBackGround	VARCHAR(30)		DEFAULT NULL,
	major			VARCHAR(30)		DEFAULT NULL,
	careerYear		VARCHAR(20)		DEFAULT NULL,
	careerType		VARCHAR(30)		DEFAULT NULL,
	company			VARCHAR(30)		DEFAULT NULL,
	portpolio		VARCHAR(30)		DEFAULT NULL,
	mainGenre		VARCHAR(30)		DEFAULT NULL,
	priceAvg		VARCHAR(30)		DEFAULT NULL,
	salesRate		VARCHAR(30)		DEFAULT NULL,
	mainArtwork		VARCHAR(30)		DEFAULT NULL,
	phoneNumber		VARCHAR(30)		DEFAULT NULL,
	email			VARCHAR(30)		DEFAULT NULL,
	sns				VARCHAR(30)		DEFAULT NULL,
	gender			VARCHAR(10)		DEFAULT NULL,
	addr			VARCHAR(30)		DEFAULT NULL,
	level			VARCHAR(1)		DEFAULT 1,
	regDate			TIMESTAMP		DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1;

SELECT * FROM UserSignUp;

INSERT INTO UserSignUp (userId, passwd, koreanName, englishName, ssn, acaBackGround,
major, careerYear, careerType, company, portpolio, mainGenre, priceAvg, salesRate,
mainArtwork, phoneNumber, email, sns) 
VALUES('testid', 'pass123', '홍길동', 'KGB', '944121', '대학교 졸업', '미술과','1년이하',
'개인전', 'N', 'N', '조각', '10000', '없음', 'N', '010-1234-5678', 'test@naver.com', '인스타');

DROP TABLE board;
CREATE TABLE board(
	bId 		INT(4) 			NOT NULL AUTO_INCREMENT PRIMARY KEY,
	bName 		VARCHAR(20)		DEFAULT NULL,
	bTitle 		VARCHAR(100)	DEFAULT NULL,
	bContent 	VARCHAR(300)	DEFAULT NULL,
	bDate 		TIMESTAMP 		DEFAULT CURRENT_TIMESTAMP,
	bHit 		INT(4) 			DEFAULT NULL,
	bGroup 		INT(4)			DEFAULT NULL,
	bStep		INT(4)			DEFAULT NULL,
	bIndent 	INT(4)			DEFAULT NULL
)AUTO_INCREMENT = 1;

SELECT * FROM board;




DROP TABLE GalleryList;
CREATE TABLE GalleryList (
	gid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	galleryId		VARCHAR(20)		DEFAULT NULL,
	passwd			VARCHAR(60)		DEFAULT NULL,
	repreName		VARCHAR(60)		DEFAULT NULL,
	galleryName 	VARCHAR(20)		DEFAULT NULL,
	galleryScale	VARCHAR(20)		DEFAULT NULL,
	galleryAddr		VARCHAR(20)		DEFAULT NULL,
	galleryNumber	VARCHAR(20)		DEFAULT NULL,
	galleryEmail	VARCHAR(20)		DEFAULT NULL,
	gallerySns		VARCHAR(20)		DEFAULT NULL,
	regDate			TIMESTAMP		NOT NULL	 DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 11;

SELECT * FROM GalleryList;

INSERT INTO GalleryList (galleryId, passwd, repreName, galleryName, galleryScale, galleryAddr, galleryNumber, galleryEmail, gallerySns)
VALUES ('galleyId', 'passwd', 'repreName', 'galleyName', 'galleyScale', 'galleyAddr', 'galleyNumber', 'galleyEmail', 'galleySns');


