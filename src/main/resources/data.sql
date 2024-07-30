DROP TABLE IF EXISTS "Orders";
CREATE TABLE "Orders"(id INT PRIMARY KEY, type VARCHAR(255), price INT, quantity INT);
INSERT INTO "Orders" VALUES(1, 'Buy', 10, 5);
INSERT INTO "Orders" VALUES(2, 'Sell', 15, 2);

DROP TABLE IF EXISTS Clients;
CREATE TABLE Clients(id INT PRIMARY KEY, name VARCHAR(255), acctNo INT, balance INT);
INSERT INTO Clients VALUES(1, 'Peter', 1001, 2000);
INSERT INTO Clients VALUES(2, 'David', 1002, 3500);

DROP TABLE IF EXISTS Transactions;
CREATE TABLE Transactions(id INT PRIMARY KEY, orderId INT, buyerId INT, sellerId INT, timestamp TIMESTAMP, status VARCHAR(255));
INSERT INTO Transactions VALUES(1, 1, 1001, 1002, CURRENT_TIMESTAMP, 'Completed');
INSERT INTO Transactions VALUES(2, 2, 1002, 1001, CURRENT_TIMESTAMP, 'Pending');