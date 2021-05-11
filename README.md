# Board
spring mvc project for board

## * 개발 환경

- IDE : STS 4
- SERVER : tomcat 9.0
- MAVEN 3.6.3
- SPRING 5.2.9
- JDK 1.8
- ORACLE 11.2.0.2.0
- Tiles 3.0.8

css template : nicepage 소프트웨어(UI 레이아웃 등) 사용하여 tiles에 활용할 소스 추출









## * 설치시 오라클 쿼리문

======================= TABLE ======================  
```
CREATE TABLE BOARD1  
(  
  ID NUMBER NOT NULL,
  TITLE NVARCHAR2(100) NOT NULL,
  WRITER_ID NVARCHAR2(50) NOT NULL,
  CONTENT CLOB,
  REGDATE TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL,
  HIT NUMBER DEFAULT 0 NOT NULL ,
  FILES NVARCHAR2(1000),
  PUB NUMBER(1,0) DEFAULT 1 NOT NULL
);
```
========================= VIEW =======================  
```
CREATE VIEW BOARD1_VIEW  
AS  
SELECT * FROM (  
    SELECT ROWNUM NUM, N.* FROM (  
        SELECT * FROM BOARD1 ORDER BY REGDATE DESC  
    ) N   
);  
```
======================== SEQUENCE =========================  
```
CREATE SEQUENCE SEQ_ID  
INCREMENT BY 1  
START WITH 1  
MAXVALUE 100000  
CYCLE;  
```

