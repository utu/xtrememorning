-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Palvelin: localhost
-- Luontiaika: 12.06.2014 klo 15:53
-- Palvelimen versio: 5.5.31
-- PHP:n versio: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Tietokanta: `extrememorning`
--
CREATE DATABASE IF NOT EXISTS `extrememorning` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `extrememorning`;

-- --------------------------------------------------------

--
-- Rakenne taululle `ansa`
--

CREATE TABLE IF NOT EXISTS `ansa` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Tyyppi` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Damage` int(3) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Rakenne taululle `ansoitettu`
--

CREATE TABLE IF NOT EXISTS `ansoitettu` (
  `AnsaId` int(11) NOT NULL,
  `HuoneId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Vedos taulusta `ansoitettu`
--

INSERT INTO `ansoitettu` (`AnsaId`, `HuoneId`) VALUES
(1, 3);

-- --------------------------------------------------------

--
-- Rakenne taululle `esine`
--

CREATE TABLE IF NOT EXISTS `esine` (
  `EsineId` int(11) NOT NULL AUTO_INCREMENT,
  `Nimi` varchar(30) COLLATE utf8_bin NOT NULL,
  `Tyyppi` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`EsineId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=16 ;

--
-- Vedos taulusta `esine`
--

INSERT INTO `esine` (`EsineId`, `Nimi`, `Tyyppi`) VALUES
(2, 'plasma rifle', 'weapon'),
(3, 'knife', 'weapon'),
(4, 'cola bottle', 'healing'),
(5, 'cola can', 'healing'),
(6, 'cup of coffee', 'healing'),
(7, 'plasma sword', 'weapon'),
(8, 'computer', 'tool'),
(9, 'hammer', 'tool'),
(10, 'multimeter', 'tool'),
(11, 'flash grenade', 'weapon'),
(12, 'bacon', 'weapon'),
(13, 'key', 'tool'),
(14, 'calculator', 'tool'),
(15, 'first-aid kit', 'healing');

-- --------------------------------------------------------

--
-- Rakenne taululle `hero`
--

CREATE TABLE IF NOT EXISTS `hero` (
  `Nimi` varchar(30) COLLATE utf8_bin NOT NULL,
  `Rotu` varchar(30) COLLATE utf8_bin NOT NULL,
  `Hp` int(3) NOT NULL,
  `maxHp` int(3) NOT NULL,
  `Exp` int(3) NOT NULL,
  `Erikoiskyky` varchar(30) COLLATE utf8_bin NOT NULL,
  `HuoneId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Vedos taulusta `hero`
--

INSERT INTO `hero` (`Nimi`, `Rotu`, `Hp`, `maxHp`, `Exp`, `Erikoiskyky`, `HuoneId`) VALUES
('Masa', 'Alien', 90, 100, 0, 'speed cola ', 1),
('Gordon Hybels', 'Human', 100, 100, 0, 'Rocket Engineer', 2);

-- --------------------------------------------------------

--
-- Rakenne taululle `huone`
--

CREATE TABLE IF NOT EXISTS `huone` (
  `Id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Nimi` tinytext COLLATE utf8_bin NOT NULL COMMENT 'kuvaava nimi huoneelle',
  `Kuvaus` text COLLATE utf8_bin COMMENT 'jotain randomii',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=5 ;

--
-- Vedos taulusta `huone`
--

INSERT INTO `huone` (`Id`, `Nimi`, `Kuvaus`) VALUES
(1, 'Kitchen', 'a white space surrounded by many gadgets which you - after a long consideration - come up to think as some kind of food preparation systems. You may feel a little bit shocked ''cause their futuristic look''n feel.'),
(2, 'Armoury', 'a room and hundreds of plasmarifles and heavier weapons gleam in spooky gloomyness. '),
(3, 'Cockpit', 'a dark room and you can see through the windows your spaceship slowly approaching a large station. You realize you''re in the control room of the ship.'),
(4, 'Engine room', 'a dirty space in which electronic devices and a huge fusion reactor fill the scene. You''re in the engine room.');

-- --------------------------------------------------------

--
-- Rakenne taululle `omistaa`
--

CREATE TABLE IF NOT EXISTS `omistaa` (
  `EsineNimi` varchar(11) CHARACTER SET latin1 NOT NULL,
  `HahmoNimi` varchar(11) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Rakenne taululle `ovi`
--

CREATE TABLE IF NOT EXISTS `ovi` (
  `HuoneId1` int(11) NOT NULL,
  `HuoneId2` int(11) NOT NULL,
  `Vari` varchar(11) COLLATE utf8_bin NOT NULL,
  `isExit` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Vedos taulusta `ovi`
--

INSERT INTO `ovi` (`HuoneId1`, `HuoneId2`, `Vari`, `isExit`) VALUES
(1, 2, 'green', 0),
(1, 1, 'yellow', 0),
(2, 1, 'blue', 0),
(2, 3, 'black', 0),
(2, 4, 'pink', 0),
(3, 1, 'purple', 0),
(3, 3, 'gray', 1),
(4, 1, 'turquoise', 0);

-- --------------------------------------------------------

--
-- Rakenne taululle `sisaltaa`
--

CREATE TABLE IF NOT EXISTS `sisaltaa` (
  `EsineId` int(11) NOT NULL,
  `HuoneId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Vedos taulusta `sisaltaa`
--

INSERT INTO `sisaltaa` (`EsineId`, `HuoneId`) VALUES
(4, 1),
(5, 1),
(6, 1),
(2, 2),
(3, 2),
(7, 2),
(8, 3),
(9, 4),
(10, 4),
(11, 2),
(12, 1),
(13, 4),
(14, 3),
(15, 4);

-- --------------------------------------------------------

--
-- Rakenne taululle `vihulainen`
--

CREATE TABLE IF NOT EXISTS `vihulainen` (
  `Nimi` varchar(30) COLLATE utf8_bin NOT NULL,
  `Rotu` varchar(30) COLLATE utf8_bin NOT NULL,
  `Hp` int(3) NOT NULL,
  `MaxHp` int(3) NOT NULL,
  `Exp` int(3) NOT NULL,
  `Vaikeus` int(3) NOT NULL,
  `HuoneId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Vedos taulusta `vihulainen`
--

INSERT INTO `vihulainen` (`Nimi`, `Rotu`, `Hp`, `MaxHp`, `Exp`, `Vaikeus`, `HuoneId`) VALUES
('Furious Cosmic Fighter Camel', 'Unidentified Extraterrestial', 1000, 1000, 300, 7, 4),
('mouse', 'animal', 1, 1, 100, 10, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
