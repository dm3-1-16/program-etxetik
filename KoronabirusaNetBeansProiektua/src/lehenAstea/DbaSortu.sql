/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Idoia Madariaga (Ane Tubiak bidalitako lana oinarritzat hartuta)
 *
 */
DROP DATABASE KoronabirusaDB;
CREATE DATABASE KoronabirusaDB;
USE KoronabirusaDB
CREATE TABLE Herrialdeak(herrialdea VARCHAR(50) PRIMARY KEY, populazioa INT, azalera INT);
CREATE TABLE Estatistikak(eguna DATE, herrialdea VARCHAR(50), kutsatuak INT, hildakoak INT, 
        PRIMARY KEY (eguna, herrialdea),
        FOREIGN KEY (herrialdea) REFERENCES Herrialdeak(herrialdea));

--Erabiltzaile bat sortu beharko bagenu:
CREATE USER ikaslea IDENTIFIED BY 'ikaslea';
GRANT SELECT,INSERT,DELETE,UPDATE ON KoronabirusaDB.* TO ikaslea;