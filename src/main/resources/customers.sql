CREATE KEYSPACE seckin_de WITH replication={'class':'SimpleStrategy', 'replication_factor':1};

CREATE KEYSPACE seckin_tr WITH replication={'class':'SimpleStrategy', 'replication_factor':1};

use seckin_tr;

CREATE TABLE customer(customer_id int PRIMARY KEY, customer_name text, customer_address text);

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(11, 'Ahmet', 'Bursa');

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(12, 'Kaan', 'Eskisehir');

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(13, 'Murat', 'Istanbul');

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(14, 'Davut', 'Gaziantep');

use seckin_de;

CREATE TABLE customer(customer_id int PRIMARY KEY, customer_name text, customer_address text);

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(21, 'Robert', 'Berlin');

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(22, 'David', 'Hamburg');

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(23, 'Adam', 'Munich');

INSERT INTO customer (customer_id, customer_name, customer_address) VALUES(24, 'Karl', 'Frankfurt');