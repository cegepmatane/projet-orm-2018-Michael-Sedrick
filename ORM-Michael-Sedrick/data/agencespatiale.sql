-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 10, 2018 at 07:47 PM
-- Server version: 5.7.20
-- PHP Version: 7.1.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agencespatiale`
--

-- --------------------------------------------------------

--
-- Table structure for table `exoplanetes`
--

CREATE TABLE `exoplanetes` (
  `planete` varchar(18) DEFAULT NULL,
  `etoile` varchar(16) DEFAULT NULL,
  `typeEtoile` varchar(5) DEFAULT NULL,
  `masse` varchar(19) DEFAULT NULL,
  `rayon` varchar(19) DEFAULT NULL,
  `flux` varchar(19) DEFAULT NULL,
  `temperature` varchar(18) DEFAULT NULL,
  `periode` varchar(19) DEFAULT NULL,
  `distance` varchar(19) DEFAULT NULL,
  `zone` varchar(25) DEFAULT NULL,
  `ist` decimal(3,2) DEFAULT NULL,
  `sph` decimal(3,2) DEFAULT NULL,
  `hzd` varchar(6) DEFAULT NULL,
  `hzc` varchar(5) DEFAULT NULL,
  `hza` varchar(6) DEFAULT NULL,
  `pClasse` varchar(22) DEFAULT NULL,
  `hClasse` varchar(14) DEFAULT NULL,
  `phi` decimal(3,2) DEFAULT NULL,
  `distance2` varchar(19) DEFAULT NULL,
  `status` varchar(18) DEFAULT NULL,
  `decouverte` varchar(13) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `exoplanetes`
--

INSERT INTO `exoplanetes` (`planete`, `etoile`, `typeEtoile`, `masse`, `rayon`, `flux`, `temperature`, `periode`, `distance`, `zone`, `ist`, `sph`, `hzd`, `hzc`, `hza`, `pClasse`, `hClasse`, `phi`, `distance2`, `status`, `decouverte`, `id`) VALUES
('jeff', 'cdsaf', 'fewqf', 'hih', 'hihih', 'hihiu', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 44),
('Proxima Centauri b', 'Proxima Centauri', 'M6Ve', '=1.3', '0.8 – 1.1 – 1.4', '0.65', '234', '11.186', '4.22', 'conservative habitable', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2),
('Gliese 667 Cc', 'Gliese 667 C', 'M3V', '=3.8', '1.1 – 1.5 – 2.0', '0.88', '277', '28.143 ± 0.029', '23.62', 'conservative habitable', '0.84', '0.64', '-0.62', '-0.15', ' +0.21', 'Terrienne chaude', 'Mésoplanète', NULL, '2017-06-23 00:00:00', 'Confirmée', '2011', 3),
('Kepler-442b', 'Kepler-442', 'K?V', '8.2 – 2.3 – 1.0', '1.34', '0.70', '233', '112.3053', '1291.6', 'conservative habitable', '0.83', '0.98', '-0.72', '-0.15', ' +0.28', 'Super-terrienne chaude', 'Mésoplanète', NULL, '1291.6', 'Confirmée', '2015', 4),
('Kepler-452b', 'Kepler-452', 'G2V', '19.8 – 4.7 – 1.9', '1.50, 1.63', '2017-11-01 00:00:00', '265+15 -13', '384.8', '1402', 'conservative habitable', '0.83', '0.93', '-0.61', '-0.15', '-0.30', 'Super-terrienne chaude', 'Mésoplanète', NULL, '1400', 'Confirmée', '2015', 5),
('Wolf 1061c', 'Wolf 1061', 'M3V', '= 4.3', '1.1 – 1.6 – 2.0', '0.60', '223', '2017-09-17 00:00:00', '2017-08-13 00:00:00', 'conservative habitable', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 6),
('Kepler-1229b', 'Kepler-1229', 'M?V', '9.8 – 2.7 – 1.2', '2017-04-01 00:00:00', '0.49', '213', '86.8', '769', 'conservative habitable', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 7),
('Kapteyn b*', 'Kapteyn', 'sdM1', '= 4.8', '1.2 - 1.6 - 2.1', '0.43', '205', '48.6', '13', 'conservative habitable', '0.67', '0.00', ' +0.08', '-0.15', ' +0.57', 'Super-terrienne chaude', 'psychroplanète', NULL, '2017-07-12 00:00:00', 'Confirmée', '2014', 8),
('Kepler-62f', 'Kepler-62', 'K2V', '10.2 - 2.8 - 1.2', '1.41', '0.39', '244', '267.291', '1200', 'conservative habitable', '0.67', '0.00', '0.45', '-0.16', '0.19', 'Super-terrienne chaude', 'Psychroplanète', NULL, NULL, 'Confirmée', '2013', 9),
('Kepler-186f', 'Kepler-186', 'M1V', '4.7 - 1.5 - 0.6', '1.17', '0.29', '188', '129.9459', '561', 'conservative habitable', '0.64', '0.00', '0.48', '-0.17', '-0.26', 'Terrienne chaude', 'Psychroplanète', NULL, NULL, 'Confirmée', '2014', 10),
('Gliese 163 c', 'Gliese 163', 'M3.5V', '= 7.3', '1.3 – 1.8 – 2.3', '0.66', '230; 277', '2017-06-25 00:00:00', '49', 'optimistic habitable zone', '0.75', '0.02', '-0.96', '-0.14', ' +0.58', 'Super-terrienne chaude', 'Mésoplanète', NULL, '48.9', 'Confirmée', '2012', 29),
('K2-18 b', 'K2-18', 'M?V', '? – 16.5 – 6.0', '2017-02-02 00:00:00', '0.94', '272±15', '32.9', '111', 'optimistic habitable zone', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 30),
('Kepler-61b', 'Kepler-61', 'K7V', '? – 13.8 – 5.2', '2017-02-02 00:00:00', '1.27', '258, 273±13', '59.9', '1063', 'optimistic habitable zone', '0.73', '0.27', '-0.88', '-0.13', ' +1.24', 'Super-terrienne chaude', 'Mésoplanète', NULL, '1062.8', 'Confirmée', '2013', 31),
('Kepler-443b', 'Kepler-443', 'K?V', '? – 19.5 – 7.0', '2017-03-02 00:00:00', '0.89', '247', '177.7', '2540', 'optimistic habitable zone', '0.73', '0.91', '-0.49', '-0.13', ' +1.44', 'Super-terrienne chaude', 'Mésoplanète', NULL, '2564-04-01 00:00:00', 'Confirmée', '2015', 32),
('Kepler-22b', 'Kepler-22', 'G5V', '? – 20.4 – 7.2', '2.04; 2.4', '2017-11-01 00:00:00', '262', '289.9', '619', 'optimistic habitable zone', '0.71', '0.53', '-0.64', '-0.12', ' +1.79', 'Super-terrienne chaude', 'Mésoplanète', NULL, '619.4', 'Confirmée', '2011', 33),
('Gliese 422 b*', 'Gliese 422', 'M3.5V', '= 9.9', '1.4 – 2.0 – 2.6', '0.68', '231', '2017-02-26 00:00:00', '41', 'optimistic habitable zone', '0.71', '0.17', '-0.41', '-0.13', ' +1.11', 'Super-terrienne chaude', 'Mésoplanète', NULL, '41.3', 'Non-Confirmée', '2014', 34),
('K2-9b', 'K2-9', 'M?V', '? – 16.8 – 6.1', '2017-02-02 00:00:00', '1.38', '284±14, 314+67 -64', '2017-04-18 00:00:00', '359', 'optimistic habitable zone', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 35),
('Gliese 3293 c*', 'Gliese 3293', 'M2.5V', '= 8.6', '1.4 – 1.9 – 2.5', '0.60', '223', '48.1', '59', 'optimistic habitable zone', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 36),
('Kepler-298d', 'Kepler-298', 'K?V', '? – 26.8 – 9.1', '2017-05-02 00:00:00', '1.29', '271', '77.5', '1545', 'optimistic habitable zone', '0.68', '0.00', '-0.86', '-0.11', ' +2.11', 'Super-terrienne chaude', 'Mésoplanète', NULL, '1545', 'Confirmée', '2012', 37),
('Kepler-174d', 'Kepler-174', 'K?V', '? – 14.8 – 5.5', '2017-02-02 00:00:00', '0.43', '206', '247.4', '1174', 'optimistic habitable zone', '0.61', '0.00', ' +0.32', '-0.13', ' +1.77', 'Super-terrienne chaude', 'psychroplanète', NULL, '878.3', 'Confirmée', '2011', 38),
('Kepler-296f', 'Kepler-296', 'M?V', '28.7 – 6.1 – 2.5', '2017-08-01 00:00:00', '0.34', '198, 274.0±15.0', '63.3', '737', 'optimistic habitable zone', '0.78', '0.15', '-0.90', '-0.14', ' +0.53', 'Super-terrienne chaude', 'Mésoplanète', NULL, '1089.6', 'Confirmée', '2011', 39),
('Gliese 682 c', 'Gliese 682', 'M3.5V', '= 8.7', '1.4 – 1.9 – 2.5', '0.37', '198', '57.3', '17', 'optimistic habitable zone', '0.59', '0.00', ' +0.22', '-0.14', ' +1.19', 'Super-terrienne chaude', 'psychroplanète', NULL, '2017-06-16 00:00:00', 'Non-Confirmée', '2014', 40),
('KOI-4427 b*', 'KOI-4427', 'M?V', '38.5 – 7.4 – 3.0', '2017-08-01 00:00:00', '0.24', '179', '147.7', '782', 'optimistic habitable zone', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 41),
('Kepler-1638b', 'Kepler-1638', 'G4V', '42.7 – 7.9 – 3.1', '2017-09-01 00:00:00', '1.39', '276', '259.3', '2866', 'optimistic habitable zone', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 42),
('Kepler-1090b', 'Kepler-1090', 'G?V', '? – 16.8 – 6.1', '2017-03-02 00:00:00', '1.20', '267', '198.7', '2289', 'optimistic habitable zone', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 43);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exoplanetes`
--
ALTER TABLE `exoplanetes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exoplanetes`
--
ALTER TABLE `exoplanetes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
