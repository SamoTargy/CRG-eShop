-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hostiteľ: 127.0.0.1
-- Čas generovania: St 08.Jún 2022, 14:59
-- Verzia serveru: 10.4.22-MariaDB
-- Verzia PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databáza: `obchodik2`
--

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `aktulanyucet`
--

CREATE TABLE `aktulanyucet` (
  `Meno` text NOT NULL,
  `Priezvisko` text NOT NULL,
  `PrihlasMeno` text NOT NULL,
  `Heslo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Sťahujem dáta pre tabuľku `aktulanyucet`
--

INSERT INTO `aktulanyucet` (`Meno`, `Priezvisko`, `PrihlasMeno`, `Heslo`) VALUES
('Jano', 'Dudo', 'JanoDudo', 'Heslo');

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `kosik`
--

CREATE TABLE `kosik` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `ucty`
--

CREATE TABLE `ucty` (
  `Meno` text NOT NULL,
  `Priezvisko` text NOT NULL,
  `PrihlasMeno` text NOT NULL,
  `Heslo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Sťahujem dáta pre tabuľku `ucty`
--

INSERT INTO `ucty` (`Meno`, `Priezvisko`, `PrihlasMeno`, `Heslo`) VALUES
('1', '', '', '1'),
('Pavel', 'Virdzek', 'PavelVirdzek', 'Heslo'),
('Jano', 'Dudo', 'JanoDudo', 'Heslo');

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `uctyadmin`
--

CREATE TABLE `uctyadmin` (
  `Meno` text NOT NULL,
  `Heslo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Sťahujem dáta pre tabuľku `uctyadmin`
--

INSERT INTO `uctyadmin` (`Meno`, `Heslo`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `zisky`
--

CREATE TABLE `zisky` (
  `zisk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Sťahujem dáta pre tabuľku `zisky`
--

INSERT INTO `zisky` (`zisk`) VALUES
(4),
(10),
(4),
(4),
(4),
(2),
(4),
(2),
(2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
