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
    	
    Servlet 인터페이스와 서블릿 라이프사이클
    	init()/service()/destroy()/getServletConfig()...
    	초기화 / 기능정하기  / 
		1. 요청에 의해 특정 서블릿 호출
		2. 해당 서블릿 생성 및 로드
		3. init() 메소드 호출	(최초 1회 호출)
    	4. service() 메소드 호출	(doGet, doPost, 등)
    	5. destroy() 메소드 호출	(소멸직전에 1번 호출)
    	
    회원가입 폼(add_user.html)
    	회원 아이디	: uesrId
    	비밀번호		: passwd
    	이름			: userName
    	주민번호		: ssn (앞의 6자리만)
    	이메일1		: email (아이디)
    	이메일2		: email2(메인도메인 ex: naver.com. gmail.com....)
    	관심분야		: concerns(체크박스 : 다중 선택가능, ex: Java, Servlet/JSP, EJB, Android, Spring..)
    
    회원가입 서블릿(AddUserServlet.java)
    	회원이 등록한 정보를 받아 회원가입에서 입력한 정보를 출력
    
    회원가입 폼 작성시, 스크립트나 css 사용가능
    체크박스처럼 하나 이상의 값이 전달되는 경우 서블릿에서 파라메터 정보 받는 법
    	String[] concerns = request.getParameterValues("concerns");
    
    Tomcat
    	webapps
    		root	(webapp)
    		jv300	(webapp)
    			mod003
    				abc.html
    				(abc.view = classes/mod003/AbcServlet.class) 논리상 여기에 위치
    			WEB-INF
    				web.xml
    				classes
    					com.varxyz.jv300
    					mod003
    						AbcServlet.class
    						
    파일경로 표시 과정 변화 : WEB-INF/classes -> servlet/c.v.jv300~ -> mod003/abc.view
    jv300을 jv300.war로 압축하여 서버에 올리면 서버가 컴파일
    
    
    Servlet 정의
    <servlet>
  		<servlet-name>CountTest</servlet-name> 
  		<servlet-class>com.varxyz.jv300.mod002.CountTest</servlet-class> 파일이름이지만 name으로 정의
  	</servlet>
    
    <servlet-mapping>
  		<servlet-name>CountTest</servlet-name> 서블릿의 이름을 넣어 불러옴
  		<url-pattern>/hello.view</url-pattern> 
  	</servlet-mapping>
    
    
    Servlet 만들고 urlmapping 변경하기
    
    
    
    ----------------------------------------------------------------------
    JSP (Java Server Page)
    	- 사용자를 위한 동적 뷰를 제공한다.
    	- 프리젠테이션 코드를 서블릿이 아닌 JSP를 통해 작성함으로써 코드 작성을 간소화
    	- 서블릿과 JSP를 상호보완적으로 사용함으로써 Model2 아키텍쳐 기반의 애플리케이션을 작성한다. 
    	- 웹 디자이너와 프로그래머의 역할 구분을 보다 증진시킨다.
    	
    JSP 특징
    	- 기본적으로 JSP는 서블릿 인스턴스로 변환된다.
    	- JSP페이지를 작성한 후 저장하면 컨테이너에 의해 (자바)소스변환, 컴파일, 실행이 자동으로 이뤄진다.
    		hello.jsp ===> hello.java	===> hello.class	===> 실행(서블릿)
    				translation			compile				runtime
    	- JSP는 서블릿보다 작성 과정이 간단하지만 디버깅은 상대적으로 어렵다.
    
    JSP 라이프사이클
    	- 기본적으로 서블릿과 동일
    	- jspInit()메소드
    		초기화, 오버라이딩
    	- jspDestroy()메소드
    		소멸, 해제, 오버라이딩
    	- _jspService()메소드
    		jsp페이지 자신, 오버라이딩 불가능
    
    JSP 파일 저장 위치
    	- JSP는 html과 동일 위치상에 저장 가능
    	- WEB-INF의 하위 폴더에서도 저장 가능
    
    JSP 주요 태그
    	주석			:	<%-- --%>
    	지시자		:	<%@ page %>, <%@ inclued %>, <%@ taglib %> 첫 줄
    	(directive)
    	스크립팅		:	<%! 멤버 선언 %>, <% 자바 코드 %>, <%= 출력 %>
    	엘리먼트
    	표현식		:	${표현식}
    	커스텀 태그	: 	JSTL
    
    Page 지시자:
    	import="java.util.*"
    	contentType="text/html; charset=UTF-8"	MIME타입과 문자 인코딩 설정
    	session=true (디폴트값은 true)				해당 페이지가 세션을 지원하려면 true
    	errorPage="에러를 처리할 페이지"
    	isErrorPage ="true" (디폴트값은 false)		이 값이 true일 때 execption 내장 객체를 사용가능
    	pageEncoding							JSP페이지의 문자 인코딩을 정의 ( ISO-8859-1)
    	isELIgnored, isThreadSafe, language, extends, buffer, autoFlush, info
    	
    스크립틀릿
    	JSP페이지 내에서 자바 코드를 사용할 수 있도록 한다.
    	주의할 점은 스크립틀릿 내의 자바코드와 HTML코드는 분리되어서 처리되어야 한다.
    	스크립틀릿 코드의 남용은 코드에 대한 가독성을 떨어뜨리고 유지보수를 어렵게 한다.
    	<%
    		if(age > 10) {
    	%>
    			You need a ticket.
    	<%
    		}else {
    	%>
    			You are free.
    	<%
    		}
    	%>
    	
    표현식
    	Ten is <%= (2 * 5) %>    //  Ten is 10 으로 출력
    	Thank you, <b> <%= name %> </b> for registration.
    	The Current day and time is <%= new java.until.Date() %>
    
    	
    ----------------------------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 */
}
