-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hostiteľ: 127.0.0.1
-- Čas generovania: St 01.Jún 2022, 09:19
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
-- Databáza: `produkty`
--

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `bavorskabageta`
--

CREATE TABLE `bavorskabageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `debracinskabagetachilli`
--

CREATE TABLE `debracinskabagetachilli` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `debrecinskabageta`
--

CREATE TABLE `debrecinskabageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `kuraciabageta`
--

CREATE TABLE `kuraciabageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Sťahujem dáta pre tabuľku `kuraciabageta`
--

INSERT INTO `kuraciabageta` (`NazovProduktu`, `IDProduktu`, `CenaProduktu`, `Pocet`, `CenaCelkovo`) VALUES
('Kuracia Bagetka', 1, 2, 1, 0);

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `palivabageta`
--

CREATE TABLE `palivabageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `parizskabageta`
--

CREATE TABLE `parizskabageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `pecenaslaninkasendvic`
--

CREATE TABLE `pecenaslaninkasendvic` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `raznicibageta`
--

CREATE TABLE `raznicibageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `sunkovabageta`
--

CREATE TABLE `sunkovabageta` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `sunkovysendvic`
--

CREATE TABLE `sunkovysendvic` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `tuniakovysendvic`
--

CREATE TABLE `tuniakovysendvic` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Štruktúra tabuľky pre tabuľku `zaudenasunkasendvic`
--

CREATE TABLE `zaudenasunkasendvic` (
  `NazovProduktu` text NOT NULL,
  `IDProduktu` int(5) NOT NULL,
  `CenaProduktu` int(5) NOT NULL,
  `Pocet` int(5) NOT NULL,
  `CenaCelkovo` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
