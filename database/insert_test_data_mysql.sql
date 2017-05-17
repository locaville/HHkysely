INSERT INTO
	tyyppi
VALUES
	(1,'checkbox'),
	(2,'monivalinta'),
	(3,'teksti');

INSERT INTO
	kysely
VALUES
	(1,'Lemppareita!','koulukysely?','aktiivinen','2015-07-02','2015-07-06');

INSERT INTO
	vastaaja
VALUES
	(1,1),
	(2,1),
	(3,1),
	(4,1),
	(5,1),
	(6,1);

INSERT INTO
	kysymys
VALUES
	(1,'Mistä pidät eniten?',1,2),
	(2,'Mistä pidät eniten?',1,2),
	(3,'Mistä pidät eniten?',1,2),
	(4,'Mistä pidät eniten?',1,2),
	(5,'Mistä pidät eniten?',1,2),
	(6,'Mistä pidät eniten?',1,2),
	(7,'Anna palautetta?',1,3);
	
INSERT INTO
	vaihtoehto
VALUES
	(666,'',1),
	(1,'maito',1),
	(2,'leipä',1),
	(3,'mehu',1),
	(4,'auto',2),
	(5,'lentokone',2),
	(6,'laiva',2),
	(7,'pop',3),
	(8,'rock',3),
	(9,'heavy',3),
	(10,'',7);
	
INSERT INTO
	vastaus
VALUES

	(1,'',1,1,1),
	(2,'',4,2,1),
	(3,'',7,3,1),
	(4,'',7,4,1),
	(5,'',7,5,1),
	(6,'',7,6,1),
	(7,'Paska',10,7,1);