-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2014 at 03:28 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `extrememorning`
--
CREATE DATABASE IF NOT EXISTS `extrememorning` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `extrememorning`;

-- --------------------------------------------------------

--
-- Table structure for table `ansa`
--

CREATE TABLE IF NOT EXISTS `ansa` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Tyyppi` varchar(11) NOT NULL,
  `Damage` int(3) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `ansoitettu`
--

CREATE TABLE IF NOT EXISTS `ansoitettu` (
  `AnsaId` int(11) NOT NULL,
  `EsineNimi` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `esine`
--

CREATE TABLE IF NOT EXISTS `esine` (
  `Nimi` varchar(11) NOT NULL,
  `Tyyppi` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hero`
--

CREATE TABLE IF NOT EXISTS `hero` (
  `Nimi` varchar(11) NOT NULL,
  `Rotu` varchar(11) NOT NULL,
  `Hp` int(3) NOT NULL,
  `maxHp` int(3) NOT NULL,
  `Exp` int(3) NOT NULL,
  `Erikoiskyky` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `huone`
--

CREATE TABLE IF NOT EXISTS `huone` (
  `Id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Nimi` tinytext NOT NULL COMMENT 'kuvaava nimi huoneelle',
  `Väri` tinytext COMMENT 'jotain randomii',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `omistaa`
--

CREATE TABLE IF NOT EXISTS `omistaa` (
  `EsineNimi` varchar(11) NOT NULL,
  `HahmoNimi` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ovi`
--

CREATE TABLE IF NOT EXISTS `ovi` (
  `HuoneId1` int(11) NOT NULL,
  `HuoneId2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sisaltaa`
--

CREATE TABLE IF NOT EXISTS `sisaltaa` (
  `EsineId` int(11) NOT NULL,
  `HuoneId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vihulainen`
--

CREATE TABLE IF NOT EXISTS `vihulainen` (
  `Nimi` varchar(3) NOT NULL,
  `Rotu` varchar(11) NOT NULL,
  `Hp` int(3) NOT NULL,
  `MaxHp` int(3) NOT NULL,
  `Exp` int(3) NOT NULL,
  `Vaikeus` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
