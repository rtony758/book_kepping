DROP TABLE IF EXISTS bills;
DROP TABLE IF EXISTS bill_type;

CREATE TABLE bill_type
(id INT PRIMARY KEY AUTO_INCREMENT
,name VARCHAR(50) NOT NULL
);

CREATE TABLE bills(
id INT PRIMARY KEY AUTO_INCREMENT
,title VARCHAR(50)
,bill_time DATE
,type_id INT
,explain VARCHAR(500)
);

ALTER TABLE bills ADD CONSTRAINT pk_type_id FOREIGN KEY (type_id)
REFERENCES bill_type(id);

INSERT INTO bill_type(name) VALUES ('不限');
INSERT INTO bill_type(name) VALUES ('支出');
INSERT INTO bill_type(name) VALUES ('收入');
INSERT INTO bill_type(name) VALUES ('转账');
INSERT INTO bill_type(name) VALUES ('借出');
INSERT INTO bill_type(name) VALUES ('借入');
INSERT INTO bill_type(name) VALUES ('还入');
INSERT INTO bill_type(name) VALUES ('还出');