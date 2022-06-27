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
	
	----------------------------------------------------------------------
	비즈니스 로직중 퍼스트 로직만 따로빼서 저장한것이 dao
	
	이거로딩, 레이지로딩
	이거로딩 : 객체안에 들어있는 겍체까지 한꺼번에 가져온다
	레이지로딩 : 객체하나만 가져오고 필요한것은 나중에 가져온다.
	
	프로젝트 정하기
	마지막 프로젝트 X
	뱅킹정도의 프로젝트
	수요일까지
	
	1. 만들고자 하는 어플리케이션(시스템)의 (비즈니스)목적
	2. 그 시스템에서 제공하는 요구사항
	2-1. 은행이라면 입금과 출금이 필요  		(기능적형태의 요구사항)
	2-2. 로그인과 출금과정에서 1시간걸리면 안됨	()
	2-3. 기능적요구사항을 위해 필요한 소프트웨어 요구사항 JDK, DB (소프트웨어적 요구사항)
	2-4. 만드는데 필요한 클레스들(클래스모델 등장)	(유스케이스 목록)
	
	
	
	
 */
}
