-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 01-Dez-2022 às 19:46
-- Versão do servidor: 8.0.27
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `rpg`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens`
--

DROP TABLE IF EXISTS `itens`;
CREATE TABLE IF NOT EXISTS `itens` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(20) DEFAULT NULL,
  `Nome` varchar(50) DEFAULT NULL,
  `Tamanho` int DEFAULT NULL,
  `Dano` varchar(20) DEFAULT NULL,
  `player` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `player` (`player`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `itens`
--

INSERT INTO `itens` (`ID`, `Tipo`, `Nome`, `Tamanho`, `Dano`, `player`) VALUES
(1, 'Espada (pesada)', 'Legado de Ahamkara', 212, '120', ''),
(2, 'Machado (médio)', 'Admonisher', 168, '36', 'Gustavo Gallace'),
(3, 'Espada (leve)', 'Katana de Glavenus', 80, '25', ''),
(4, 'Espada (leve)', 'Katana de Aegir Leviathan', 110, '30', ''),
(7, 'Trindade Carniçal', 'Arco', 135, '24', 'Robert Winstons');

-- --------------------------------------------------------

--
-- Estrutura da tabela `personagem`
--

DROP TABLE IF EXISTS `personagem`;
CREATE TABLE IF NOT EXISTS `personagem` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) DEFAULT NULL,
  `Player` varchar(50) DEFAULT NULL,
  `Sexo` varchar(20) DEFAULT NULL,
  `Classe` varchar(20) DEFAULT NULL,
  `Raca` varchar(20) DEFAULT NULL,
  `Stg` int DEFAULT NULL,
  `Dtx` int DEFAULT NULL,
  `Inte` int DEFAULT NULL,
  `cons` int DEFAULT NULL,
  `Cha` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `personagem`
--

INSERT INTO `personagem` (`ID`, `Nome`, `Player`, `Sexo`, `Classe`, `Raca`, `Stg`, `Dtx`, `Inte`, `cons`, `Cha`) VALUES
(1, 'Gustavo Gallace', 'Tigas', 'Masculino', 'Rogue', 'Humano', 1, 2, 2, 2, 2),
(4, 'Robert Winston', 'Leozao', 'Masculino', 'Bardo', 'Elfo', 1, 2, 2, 1, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `player`
--

DROP TABLE IF EXISTS `player`;
CREATE TABLE IF NOT EXISTS `player` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) DEFAULT NULL,
  `Login` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Senha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `player`
--

INSERT INTO `player` (`ID`, `Nome`, `Login`, `Email`, `Senha`) VALUES
(1, 'Thiago', 'Tigas', 'pdctiga@email.com', '123'),
(2, 'Leonardo', 'Leozao', NULL, '123'),
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
