package com.varxyz.jy200.mod001;

public class Memo {
	
/**
 * try {
		예외 발생 가능성이 있는 코드
	}catch ( Exception )   {
		예외발생시 처리할 코드
	}finally {
		예외발생유뮤와 관계없이 처리할 코드
	}
	
	-----------------------------------
	Set <--- HashSet
	중복X, 순서X
	
	List <--- ArrayList
	중복O, 순서O
	
	Map <--- HashMap
	(key-value)쌍으로 저장
	
	----------------------------------------------------------------------
	DBMS
	데이터 테이블의 가로 recode 세로 column
	테이블 : class
	recode : 객체
	column : method
	cmd -> mysql -u root -p
	-> password입력
	mysql -> show databases;  		// 사용중인 데이터베이스 보기
	show table; // 사용중인 테이블 목록
	->  select host, user from user;  // 사용중인 유저 보기
	->  create user 'jv250'@localhost identified by 'jv250'; // 아이디 생성  앞의 jv250은 아이디 뒤의 jv250은 비밀번호
	--> create database jv250 default character set utf8;    // 이름이 jv250인 데이터 베이스 생성
	--> grant all privileges on jv250.* to 'jv250'@localhost with grant option;  // jv250 이름을 가진 로컬호스트에게 모든 권한을 위임하겟다.
	
	이클립스 연동
	pom.xml에 추가
	<dependencies>
  		<dependency>
  			<groupId>mysql</groupId>
  			<artifactId>mysql-connector-java</artifactId>
  			<version>8.0.29</version>
  	  	</dependency>
  	</dependencies>
	----------------------------------------------------------------------
	SQL (Structured Query Language)
	
	1. DQL (Data Query Language)
		SELECT
		
	2. DML (Data Mainpulation Language)
		INSERT
		UPDATE
		DELETE
		
	3. DDL (Data Definition Language)
		CREATE
		ALTER
		DROP
		TRUNCATE
		RENAME
		
	4. DCL (Data Control Language)
		GRANT 권한부여
		REVOKE 권한해제
		
	5. TCL (Transaction Control Language)
		COMMIT
		ROLLBACK
	
	----------------------------------------------------------------------
	JDBC (Java DataBase Conectivity)
	java.sql.*
	javax.sql.*
	
	----------------------------------------------------------------------
	domain에는 핵심영역
	
	
	----------------------------------------------------------------------
	회사에서 TO가 낫을때 뽑는 이유
	
	final은 생성과 동시에 초기화 해줘야한다.
	최소한 생성자에서 넣어야함
	객체가 만들어기전에 값을 넣어야 한다.
	
	static initializer
	static {
		
	}
	
	JDBC값들을 파일에 저장 : 바뀐것을 제공 해야할때 서버를 내리지 않기위해,
	소스에 넣으면 소스를 뒤져야한다.
	8bit = 1byte
	
	char = 2byte = 16bit
	
	int = 2^32 부호비트제외하면 31  4byte 
	doulbe = 8byte
	
	
	byte[] b = buffer
	buffer = read는 1byte지만 buffer는 모아서간다
	
	/가 있으면 상대주소
	없으면 절대주소
	
	CREATE INDEX CustomerIndex ON Customer(ssn);
 */
}
