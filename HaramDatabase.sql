CREATE SCHEMA `db_project` ;
CREATE TABLE `Hotels` (
  `reservationNo`varchar(45) NOT NULL,
  `nameOfHotels` varchar(45) DEFAULT NULL,
  `PriceOfHotels`INT(4) DEFAULT NULL,
  `Arrive`varchar(20) DEFAULT NULL,
  `leave` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`reservationNo`)
) ;
##############################################################################
CREATE TABLE `TicketOfWorship` (
  `worshipTicketNo` varchar(10) NOT NULL,
  `WorshipType` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`worshipTicketNo`)
) ;
##############################################################################
CREATE TABLE `Visitors` (
  `visitorID` INT(45) NOT NULL,
  `firstName`varchar(20) DEFAULT NULL,
  `lastName`varchar(20) DEFAULT NULL,
  `age` INT(4) NOT NULL,
  `gender` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`visitorID`)
) ;
##############################################################################
CREATE TABLE `Transport` (
  `ticketsNo` varchar(20) NOT NULL,
  `TransportType`varchar(20) DEFAULT NULL,
  `PriceOfTransport` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ticketsNo`)
) ;
##############################################################################
CREATE TABLE `Visitor_phone` (
  `visitorID` INT(45) NOT NULL,
  `phoneNo` INT(45) NOT NULL,
   PRIMARY KEY (`visitorID`,`phoneNo`),
   CONSTRAINT Visitor_phone_FK FOREIGN KEY (visitorID) REFERENCES Visitors(visitorID) ON DELETE CASCADE
) ;
##############################################################################
CREATE TABLE `Book` (
  `visitorID` INT(45) NOT NULL,
  `reservationNo`varchar(45) NOT NULL,
  PRIMARY KEY (`visitorID`,`reservationNo`),
  CONSTRAINT Book_FK1 FOREIGN KEY (visitorID) REFERENCES Visitors(visitorID) ON DELETE CASCADE,
  CONSTRAINT Book_FK2 FOREIGN KEY (reservationNo) REFERENCES Hotels(reservationNo) ON DELETE CASCADE
) ;
##############################################################################
CREATE TABLE `Reservations` (
  `worshipTicketNo` varchar(10) NOT NULL,
  `visitorID` INT(45) NOT NULL,
  `ticketsNo` varchar(10) NOT NULL,
  `Rtime` varchar(20) DEFAULT NULL,
  `day` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`worshipTicketNo`,`visitorID`,`ticketsNo`),
   CONSTRAINT Reservations_FK1 FOREIGN KEY (visitorID) REFERENCES Visitors(visitorID) ON DELETE CASCADE,
  CONSTRAINT Reservations_FK2 FOREIGN KEY (ticketsNo) REFERENCES Transport(ticketsNo) ON DELETE CASCADE,
  CONSTRAINT Reservations_FK3 FOREIGN KEY (worshipTicketNo) REFERENCES TicketOfWorship(worshipTicketNo) ON DELETE CASCADE
) ;
##############################################################################
INSERT INTO Hotels
 VALUES ('01','Seven Garden Hotel', 1000,'10-01-2021', '12-01-2021');
INSERT INTO Hotels 
VALUES ('02','Narcissus Al Hamra Hotel', 1600, '15/01/2021', '20/01/2021');
INSERT INTO Hotels
 VALUES ('03', 'Mirage Hotel', 970, '20/02/2021', '23/02/2021');
INSERT INTO Hotels
 VALUES ('04', 'The Ritz-Carlton\'', 990,'25/02/2021', '29/02/2021');
INSERT INTO Hotels
 VALUES ('05','Velar Inn Hotel', 899,'4/03/2021', '7/03/2021');
INSERT INTO Hotels
 VALUES ('06','Hilton Suites Makkah‬ ', 850, '10/03/2021', '14/03/2021');
INSERT INTO Hotels
 VALUES ('07 ','Swissotel Al Maqam Makkah‬',660, '7/04/2021', '9/04/2021');
INSERT INTO Hotels
 VALUES ('08', 'Makkah Hotel‬', 798,'19/04/2021','22/04/2021');
INSERT INTO Hotels
 VALUES ('09', 'Jabal Omar Conrad Makkah‬',500, '11/05/2021', '12/05/2021');
##############################################################################
INSERT INTO Visitors
 VALUES (12534, 'Manal', 'Alatas', 22, 'Female');
INSERT INTO Visitors 
VALUES (14325, 'Ola', 'Sultan', 44, 'Female');
INSERT INTO Visitors 
VALUES (15432, 'Mohamed', 'Alotaibi', 19,'Male');
INSERT INTO Visitors
 VALUES (21345, 'Weed', 'Alqahtani', 46,'Female');
INSERT INTO Visitors
 VALUES (23451, 'Nura', 'Alzahhrani', 22,'Female');
INSERT INTO Visitors
 VALUES (34529, 'yara', 'Salem', 40,'Female');
INSERT INTO Visitors
 VALUES (43215, 'Deem', 'Fawaz', 34,'Female');
INSERT INTO Visitors
 VALUES (45321, 'Tareq', 'Mohsen', 15, 'Male');
INSERT INTO Visitors
 VALUES (53214, 'Abdullah','bashab', 53,'Male');
INSERT INTO Visitors
 VALUES (54321, 'Dalal', 'Almarzoq', 60, 'Female');
##############################################################################
INSERT INTO Transport
 VALUES('B-1', 'BUS','10');
INSERT INTO Transport
 VALUES ('B-2', 'BUS','10');
INSERT INTO Transport 
VALUES ('B-3', 'BUS','10');
INSERT INTO Transport 
VALUES ('C-1', 'CAR','40');
INSERT INTO Transport
 VALUES ('C-2', 'CAR','40');
INSERT INTO Transport 
VALUES ('C-3', 'CAR','40');
INSERT INTO Transport
 VALUES ('T-1', 'TRAIN','30');
INSERT INTO Transport
 VALUES ('T-2', 'TRAIN','30');
INSERT INTO Transport
 VALUES ('T-3', 'TRAIN','30');
INSERT INTO Transport
 VALUES ('C-4', 'CAR', '40');
##############################################################################
INSERT INTO TicketOfWorship
 VALUES ('H-1','Hajj');
INSERT INTO TicketOfWorship 
VALUES ('O-3', 'Omrah');
INSERT INTO TicketOfWorship 
VALUES ('H-2', 'Hajj');
INSERT INTO TicketOfWorship
 VALUES ('P-1','Pray');
INSERT INTO TicketOfWorship
 VALUES ('O-1','Omrah');
INSERT INTO TicketOfWorship 
VALUES ('P-4','Pray');
INSERT INTO TicketOfWorship 
VALUES ('P-2','Pray');
INSERT INTO TicketOfWorship 
VALUES ('H-3','Hajj');
INSERT INTO TicketOfWorship 
VALUES ('P-3','Pray');
INSERT INTO TicketOfWorship 
VALUES ('O-2','Omrah');
##############################################################################
INSERT INTO Visitor_phone
 VALUES (14325, 509327879);
INSERT INTO Visitor_phone
 VALUES (15432, 503746518);
INSERT INTO Visitor_phone
 VALUES (21345, 103412139);
INSERT INTO Visitor_phone
 VALUES (23451, 304545636);
INSERT INTO Visitor_phone
 VALUES (34529, 902878321);
INSERT INTO Visitor_phone 
VALUES (43215, 302421984);
INSERT INTO Visitor_phone 
VALUES (45321, 304311452);
INSERT INTO Visitor_phone
 VALUES (53214, 203434228);
INSERT INTO Visitor_phone
 VALUES (54321, 408426467);
 ##############################################################################
 INSERT INTO Book
 VALUES (14325,'01');
INSERT INTO Book 
VALUES (15432,'02');
INSERT INTO Book 
VALUES (21345,'03');
INSERT INTO Book 
VALUES (23451,'04');
INSERT INTO Book 
VALUES (34529,'05');
INSERT INTO Book
 VALUES (43215,'06');
INSERT INTO Book
 VALUES (45321,'07');
INSERT INTO Book 
VALUES (53214,'08');
INSERT INTO Book
 VALUES (54321,'09');
##############################################################################
INSERT INTO Reservations
 VALUES ('H-1', 14325,'T-1','4:30AM', 'sunday');
INSERT INTO Reservations
 VALUES ('O-3',23451, 'T-3', '6:00PM', 'wendsday');
INSERT INTO Reservations
 VALUES ('H-2',54321,'C-4','4:30AM', 'monday');
INSERT INTO Reservations
 VALUES ('P-1',12534, 'C-1','5:00 AM','tusday');
INSERT INTO Reservations
 VALUES ('O-1',45321,'T-2', '3:00PM', 'sutrday');
INSERT INTO Reservations
 VALUES ('P-4', 15432,'B-1', '11:40AM','monday');
INSERT INTO Reservations
 VALUES ('P-2', 34529, 'C-2', '7:00PM','thursday');
INSERT INTO Reservations
 VALUES ('H-3', 53214, 'B-2', '4:00AM','sunday');
INSERT INTO Reservations
 VALUES ('P-3',21345, 'B-3', '3:50PM', 'tusday');
INSERT INTO Reservations
 VALUES ('O-2', 43215, 'C-3', '12:00PM', 'friday');
#############################################################################
 UPDATE Transport
 SET PriceOfTransport=PriceOfTransport*1.5;
##############################################################################
DELETE FROM Visitor_phone
WHERE phoneNo='408426467';
##############################################################################
SELECT  PriceOfHotels , nameOfHotels
FROM    hotels
ORDER BY PriceOfHotels ASC ; 
##############################################################################
SELECT TransportType,COUNT(ticketsNo) AS totalTickets
FROM   transport
GROUP BY TransportType; 
##############################################################################
SELECT Rtime,COUNT(visitorID) AS totalVisitor 
FROM   reservations
WHERE  Rtime = '4:30AM';  
##############################################################################
SELECT * 
FROM   hotels
WHERE  reservationNo =(SELECT reservationNo
					   FROM   book 
                       WHERE  visitorID =53214); 
##############################################################################
SELECT visitorID,firstName 
FROM   visitors 
WHERE  visitorID IN (SELECT DISTINCT visitorID
				   FROM   reservations
                   WHERE  worshipTicketNO IN (SELECT worshipTicketNO
                                              FROM   ticketofworship 
                                              WHERE  WorshipType = 'Omrah')); 
##############################################################################
SELECT WorshipType ,COUNT(worshipTicketNo) as numberOfWorshipers
from ticketofworship 
group by WorshipType
having  WorshipType='Pray' 
##############################################################################
SELECT COUNT(age) as numberOfVisitors
from visitors
where  age > 18
##############################################################################
SELECT  TransportType,PriceOfTransport 
from transport
group by  TransportType 
##############################################################################
SELECT  nameOfHotels , PriceOfHotels
from hotels
where  PriceOfHotels > 845 
order by PriceOfHotels 
##############################################################################
SELECT COUNT(t.worshipTicketNo) as numberOfWorshipersInTusday
from ticketofworship t, reservations r 
where  WorshipType = 'Pray' and r.day= 'tusday' and t.worshipTicketNo = r.worshipTicketNo 
