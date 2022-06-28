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
	
	
	
	
	
		계정 -> 서비스 기능 : 회원정보(가입,찾기,변경), 꽃, 편지 -> 편지서비스(꽃, 편지지(안에 폰트 변경기능), 입금기능)
		
	maven.apache-org-webapp
	아파치 톰캣8 다운로드
	64-bit window zip 다운
	자바파일에 톰캣 풀기
	
	시스템환경변수 - 시스템 변수
	새로 만들기 = 변수이름 : CATALINA_HOME 변수값:경로
	path에 %CATALINA_HOME%\bin넣기
	cmd에 startup
	tomcat - conf- logging.properties
	
	47번에
	java.util.logging.ConsoleHandler.encoding = EUC-KR
	
	69번에 URIEncoding="UTF-8"/> 추가
	
	prom.xml에 18번째줄
	<maven.compiler.source>1.11</maven.compiler.source>
    <maven.compiler.target>1.11</maven.compiler.target>
    
    https://mvnrepository.com/에서 servlet api 검색 Java Servlet API 3.1.0 복사
    붙여넣기
    
    jsp 검색
    JavaServer Pages(TM) API » 2.3.3 복사
    붙여넣기
    
    jstl 검색
    JSTL » 1.2 복사
    붙여넣기
    
    ----------------------------------------------------------------------
    stateless
    
    HTTP 요청메소드 GET, POST, PUT...
    클라이언트 - > 서버
    URL (GET, POST)
    
    서버 -> 클라이언트
    응답 응답코드(상태코드) : 성공이 아닐떄 404코드
    컨텐츠타입 ( 텍스트, 영상, 사진 )
    컨텐츠 (body <HTML></HTML>) 실제 화면 표시 영역
    HTML,JS는 서버에 위치하고 처리는 클라이언트에서 한다.
    
    servlet/JSP
    위치가 서버이고 처리도 서버에서 한 후 결과만 HTML로 보낸다 (server side page)
    
    웹 사이트 : 정적 문서로 구성된 사이트
    URL 구성
    	protocol://host:port/path/file
    	http://www.season.com:80/spring/april.html
    	http://www.season.com/spring/april.html
    	http://www.season.com
    
    파라메터
    	주소 뒤에 추가로 붙는 데이터
    	?를 사용하하여 주소 경로와 구분
    	http://www.season.com/spring/april.html?weather=sunny&temp=25
    
    HTTP 메소드(GET)
    	요청 방식에 따라 크게 GET/POST 구분
    	GET 요청 방식
    		단순히 서버에게 자원(HTML, 이미지, 문서)을 URL을 통해 요청하는 방식
    		필요한 데이터를 URL뒤에 덧붙여 전송
    		데이터 크기 제약이 있으며 북마킹을 허용(지원)
    		브라우저 캐싱에 의한 보안 문제야기
    	POST 요청 방식
    		주로 폼에서 사용되는 방식으로 웹 컨텐츠의 내용을 변경하기 위해 사용
    		필요한 데이터를 HTTP요청의 메세지 바디를 통해 전송
    		데이터의 양이 많거나 URL에 노출되지 말아야할 때 사용
    
    웹 애플리케이션
    	웹 사이트 + Dynamic working service (CGI Processing)
    	CGI (Common Gateway Interface)
    		- 웹 서버에 존재하는 프로그램을 호출할 수 있는 기술
    		- Perl, C 등 다양한 언어로 작성
    		- Process loading 방식 
    	
    	ASP.NET, Servlet/JSP  <-웹 컴포넌트
    			 tomcat 	<- 웹 컨테이너
    웹 컨테이너
    	- 웹 컴포넌트(Servlet/JSP, 등) 실행 관리를 위한 프레임워크
    	  ex) 톰캣, 레진, Glassfish 등
    	- 서블릿과 웹서버간의 커뮤니케이션 지원
    	- 서블릿 라이프사이클 관리
    	- 요청에 대한 멀티 스레딩 지원
    	- 보안 및 오류에 대한 처리 지원
    	
    
    
    
    
    
    
    
    
    
    
    
 */
}
