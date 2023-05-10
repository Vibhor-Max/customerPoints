CREATE TABLE CUSTOMER (cust_id int, CUSTOMER_NAME VARCHAR(max) );
CREATE TABLE TRANSACTION (tran_id int,cust_id int ,tran_date DATE,amt int);
INSERT INTO CUSTOMER(cust_id,CUSTOMER_NAME) values (1,'JaneDoe');
INSERT INTO CUSTOMER(cust_id,CUSTOMER_NAME) values (2,'JaneDoe2');
INSERT INTO CUSTOMER(cust_id,CUSTOMER_NAME) values (3,'JaneDoe3');
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (001,1,'2023-05-09',120);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (002,1,'2023-05-09',89);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (003,1,'2022-04-08',160);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (004,1,'2022-03-01',78);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (005,1,'2021-02-04',132);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (006,1,'2021-02-05',143);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (007,2,'2020-01-05',123);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (008,2,'2020-01-25',84);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (009,2,'2019-03-04',102);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (010,2,'2019-03-01',210);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (011,2,'2018-02-27',120);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (012,2,'2018-04-15',68);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (013,3,'2017-04-05',101);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (014,3,'2017-03-27',82);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (015,3,'2016-03-04',240);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (016,3,'2016-03-01',113);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (017,3,'2015-03-27',580);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (018,3,'2015-04-20',675);
INSERT INTO TRANSACTION(tran_id,cust_id,tran_date,amt) VALUES (019,3,'2015-03-14',101);
COMMIT;