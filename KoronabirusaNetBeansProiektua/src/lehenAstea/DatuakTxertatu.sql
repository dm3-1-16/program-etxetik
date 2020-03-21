/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Idoia Madariaga (Ane Tubiak bidalitako lana oinarritzat hartuta)
 *
 */

INSERT INTO Herrialdeak VALUES("China", 1395380000, 9562910), 
                              ("Corea del sur", 51635000, 100339), 
                              ("España", 46934632, 505935), 
                              ("Iran", 82360000, 1745150), 
                              ("Italia", 60359546, 301340);

INSERT INTO Estatistikak VALUES('2020-03-01', "Corea del sur", 2000, 47);
INSERT INTO Estatistikak VALUES('2020-03-01', "Italia", 10087, 632);
INSERT INTO Estatistikak VALUES('2020-03-01', "Iran", 700, 243);
INSERT INTO Estatistikak VALUES('2020-03-01', "España", 1352, 52);
INSERT INTO Estatistikak VALUES('2020-03-01', "China", 73046, 2650);
INSERT INTO Estatistikak VALUES('2020-03-14', "Corea del sur", 8086, 72);
INSERT INTO Estatistikak VALUES('2020-03-14', "Italia", 17660, 1266);
INSERT INTO Estatistikak VALUES('2020-03-14', "Iran",12729, 611);
INSERT INTO Estatistikak VALUES('2020-03-14', "España", 6252, 193);
INSERT INTO Estatistikak VALUES('2020-03-14', "China", 80945, 3189);

-- Bi sententzia hauek errore eman behar dute:
INSERT INTO Estatistikak VALUES('2020-03-14', "Iran",10000, 100); -- Duplicate Primary Key
INSERT INTO Estatistikak VALUES('2020-03-14', "USA",10000, 100); -- Foreign Key fails