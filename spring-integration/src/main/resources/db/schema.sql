CREATE SEQUENCE SPRINGNUMBER_SEQUENCE START WITH 1 INCREMENT BY 1;


CREATE TABLE T_SPRING_NUMBER (
  ID INT NOT NULL AUTO_INCREMENT,
  SPRING_NUMBER INT
);

INSERT INTO T_SPRING_NUMBER VALUES (1, 123);
INSERT INTO T_SPRING_NUMBER VALUES (2, 5);
INSERT INTO T_SPRING_NUMBER VALUES (3, 7);