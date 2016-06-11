REM ******** TABLA DEPART: *********** 

DROP TABLE DEPART CASCADE CONSTRAINTS; 

CREATE TABLE DEPART (
 	DEPT_NO  NUMBER(2),
	DNOMBRE  VARCHAR2(14), 
 	LOC      VARCHAR2(14),
	CONSTRAINT DEP_PK PRIMARY KEY (DEPT_NO)
	);

INSERT INTO DEPART VALUES (10,'CONTABILIDAD','SEVILLA');
INSERT INTO DEPART VALUES (20,'INVESTIGACION','MADRID');
INSERT INTO DEPART VALUES (30,'VENTAS','BARCELONA');
INSERT INTO DEPART VALUES (40,'PRODUCCION','BILBAO');

COMMIT;

REM /*  ******** TABLA EMPLE: ************* */

DROP TABLE EMPLE CASCADE CONSTRAINTS; 

CREATE TABLE EMPLE (
 	EMP_NO    NUMBER(4),
 	APELLIDO  VARCHAR2(10),
 	OFICIO    VARCHAR2(10),
 	DIRECTOR  NUMBER(4) ,
 	FECHA_ALT DATE,
 	SALARIO   NUMBER(10),
 	COMISION  NUMBER(10),
 	DEPT_NO   NUMBER(2) NOT NULL,
	CONSTRAINT EMPLE_PK PRIMARY KEY (EMP_NO),
	CONSTRAINT EMPLE_DIR_FK FOREIGN KEY (DIRECTOR)
				REFERENCES EMPLE(EMP_NO)  ON DELETE SET NULL,
	CONSTRAINT EMPLE_DEP_FK FOREIGN KEY (DEPT_NO)
				REFERENCES DEPART(DEPT_NO) ON DELETE CASCADE);

INSERT INTO EMPLE VALUES (7839,'REY','PRESIDENTE',NULL,'17/11/1981',650000,NULL,10);
INSERT INTO EMPLE VALUES (7566,'JIMENEZ','DIRECTOR',7839,'02/04/1981',386750,NULL,20);
INSERT INTO EMPLE VALUES (7698,'NEGRO','DIRECTOR',7839,'01/05/1981',370500,NULL,30);
INSERT INTO EMPLE VALUES (7782,'CEREZO','DIRECTOR',7839,'09/06/1981',318500,NULL,10);
INSERT INTO EMPLE VALUES (7788,'GIL','ANALISTA',7566,'09/11/1981',390000,NULL,20);
INSERT INTO EMPLE VALUES (7902,'FERNANDEZ','ANALISTA',7566,'03/12/1981',390000,NULL,20);
INSERT INTO EMPLE VALUES (7499,'ARROYO','VENDEDOR',7698,'20/02/1980',208000,39000,30);
INSERT INTO EMPLE VALUES (7521,'SALA','VENDEDOR',7698,'22/02/1981',162500,65000,30);
INSERT INTO EMPLE VALUES (7654,'MARTIN','VENDEDOR',7698,'29/09/1981',162500,182000,30);
INSERT INTO EMPLE VALUES (7844,'TOVAR','VENDEDOR',7698,'08/09/1981',195000,0,30);
INSERT INTO EMPLE VALUES (7900,'JIMENO','EMPLEADO',7698,'03/12/1981',123500,NULL,30);
INSERT INTO EMPLE VALUES (7369,'SANCHEZ','EMPLEADO',7902,'17/12/1980',104000,NULL,20);
INSERT INTO EMPLE VALUES (7876,'ALONSO','EMPLEADO',7788,'23/09/1981',143000,NULL,20);
INSERT INTO EMPLE VALUES (7934,'MU�OZ','EMPLEADO',7782,'23/01/1982',169000,NULL,10);

COMMIT;
