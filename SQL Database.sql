#create database sprintplanung;

use sprintplanung;

#CREATE USER sqluser IDENTIFIED BY 'sqluserpw';

#grant usage on *.* to sqluser@localhost identified by 'sqluserpw';
#grant all privileges  on sprintplanung.* to sqluser@localhost;

CREATE TABLE aufgabe (
id INT NOT NULL AUTO_INCREMENT,
bezeichnung VARCHAR(30) NOT NULL,
anlagedatum DATE NOT NULL,
standardaufgabe BOOLEAN,
aktuellerstatus VARCHAR(10),
geschätzteraufwand INT NOT NULL,
realeraufwand INT NOT NULL,
kommentar VARCHAR(180),
PRIMARY KEY (id)
);