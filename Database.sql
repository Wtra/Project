-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 26, 2015 at 10:24 AM
-- Server version: 5.6.13
-- PHP Version: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `speldb`
--
CREATE DATABASE IF NOT EXISTS `speldb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `speldb`;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Binnenspel'),
(2, 'Buitenspel');

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(2500) NOT NULL,
  `username` varchar(50) NOT NULL,
  `datum` date DEFAULT NULL,
  `spelId` int(11) NOT NULL,
  `reactieVerwijderen` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `spelIdComment_fk` (`spelId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `comment`, `username`, `datum`, `spelId`, `reactieVerwijderen`) VALUES
(1, 'Ideaal spel voor meerdere personen!', 'Wouter Aerts', '2015-01-14', 1, 0),
(2, 'Wij hebben het met 30 gespeeld, dan kan je best spelen met meerdere jagers.', 'Kamil', '2015-01-14', 1, 2),
(3, 'Je kan zelf ook een ganzenbordspel ontwerpen met bijhorende opdrachten', 'Niko Beekaert', '2015-01-15', 2, 0),
(10, 'tof!', 'Wouter', '2015-01-23', 1, 1),
(11, 'Amai, das een tof spel!', 'Wouter', '2015-01-23', 1, 0),
(12, 'Leuk spelletje!', 'Joke', '2015-01-23', 1, 2),
(13, 'Amai, tof spel!', 'Jonas', '2015-01-26', 1, 1),
(14, 'khdpina', 'Frans', '2015-01-26', 1, 15),
(15, 'darmod', 'Joline', '2015-01-26', 2, 36),
(16, 'ldjoijra', 'Nick', '2015-01-26', 6, 13),
(17, 'khdkjarhluiah', '', '2015-01-26', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `spel`
--

CREATE TABLE IF NOT EXISTS `spel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titel` varchar(128) NOT NULL,
  `omschrijvingSpel` varchar(1000) NOT NULL,
  `benodigdheden` varchar(250) NOT NULL,
  `counter` int(11) NOT NULL,
  `aantalPersonenVanaf` int(11) NOT NULL,
  `aantalPersonenTot` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `spelIdCategory_fk` (`categoryId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `spel`
--

INSERT INTO `spel` (`id`, `titel`, `omschrijvingSpel`, `benodigdheden`, `counter`, `aantalPersonenVanaf`, `aantalPersonenTot`, `categoryId`) VALUES
(1, 'Jagerbal', 'Een van de spelers is de jager, de anderen zijn de konijnen. De jager, die herkenbaar is aan bv. een das of sjaal, tracht de konijnen te raken met de bal. Hij mag niet lopen met de bal in de handen, maar dribbelen en stuiteren zijn toegestaan zolang hij alleen jager is.  Een konijn dat aangeraakt is met de bal, wordt ook jager en doet zijn das of sjaal om. Vanaf dat ogenblik proberen de jagers door samenspel, zonder dribbelen, stuiteren of te lopen met de bal in de hand,maar alleen door naar elkaar te gooien) de andere konijnen in te sluiten en af te werpen.  Welke konijnen blijven het langst leven ?', 'bal, fazant', 76, 4, 15, 2),
(2, 'Ganzenbord', 'Bij Ganzenbord gooien de spelers om de beurt met de dobbelsteen, de speler met het hoogst aantal ogen mag beginnen. Hij plaatst zijn pion het aantal vakjes vooruit als hij heeft gegooid. Wordt er bij deze eerste worp een 4 of 5 gegooid Ã  moet de pion naar vakje 53 worden geplaatst Wordt er bij deze eerste worp een 3 of 6 gegooid Ã  moet de pion naar vakje 26 worden geplaatst.Kom je op vakje 6,19,31,52,58 gelden er bijzondere regels zoals staan beschreven in de handleiding. Kom je op een vakje met een gans mag de speler nogmaals hetzelfde aantal vakjes vooruit.Als je terecht komt op een vakje waar een pion staat van een andere speler, moet je terug naar het vakje van je vorige plaats.', 'Het ganzenbordspel', 5, 4, 6, 1),
(3, 'Vlaggenroof', 'Het is eigenlijk leiding vs de groep. De groep krijgt een vlag mee en mogen zich gaan verstoppen met de vlag. de vlag moet op zichtbare hoogte hangen. De bedoeling is dat de leiding de vlag komt pikken, en de vlag tot op een afgesproken punt brengt zonder getikt te worden. De kinderen moeten de vlag bewaken en zorgen dat de leiding niet te dicht in de buurt komt van de vlag. ', 'vlag', 3, 5, 25, 2),
(4, 'Bospoeperkesspel', 'De stoeipartijen van de poepers en de vrouwen gebeuren in een poepkot. Er zijn vier koten op het terrein. De partij gaat enkel door als het koppel op hetzelfde moment kan binnengeraken. Bij een fluitsignaal wordt er doorgeschoven van poepkot. Wij zijn uiteraard volledig voor vrije seks, dus een condoom is een must. Deze kunnen gekocht worden bij de leiding in ruil voor een opdracht. Er is ook een zaadcel en een eicel nodig. Deze liggen in de kampen. Ze mogen slechts Ã©Ã©n bij hebben. Worden ze getikt door de venten of de boswachters moeten ze dit afgeven en terugkeren naar hun kamp.', 'Eieren, bloem, zakjes, water, verf, kurken, klkakebuizen', 0, 4, 9, 1),
(5, 'Ballekastamp', 'De term platte tekst wordt ook wel gebruikt als term voor documentinhoud in een tekstueel documentformaat, dat wil zeggen, documentinhoud die altijd wordt geÃ?Â¯nterpreteerd als tekst, dat wil zeggen als een reeks lettertekens in een bepaalde tekstcodering. In deze betekenis staat de term in tegenstelling tot binaire inhoud.Een voorbeeld is, opnieuw, het HTML-document. HTML is een tekstuele markuptaal: een HTML-document bestaat altijd uit een reeks lettertekens in een voor mensen leesbaar alfabet, en is dus altijd te bekijken als platte tekst (in de vorige betekenis). Dit geldt bijvoorbeeld niet voor het .doc-formaat van Microsoft Word.Het is niet duidelijk hoe algemeen dit gebruik van de term is.', 'bal', 0, 3, 19, 2),
(6, 'Paintball', 'Een van de spelers is de jager, de anderen zijn de konijnen. De jager, die herkenbaar is aan bv. een das of sjaal, tracht de konijnen te raken met de bal. Hij mag niet lopen met de bal in de handen, maar dribbelen en stuiteren zijn toegestaan zolang hij alleen jager is. Een konijn dat aangeraakt is met de bal, wordt ook jager en doet zijn das of sjaal om. Vanaf dat ogenblik proberen de jagers door samenspel, zonder dribbelen, stuiteren of te lopen met de bal in de hand,maar alleen door naar elkaar te gooien) de andere konijnen in te sluiten en af te werpen. Welke konijnen blijven het langst leven ? ', 'paintball geweer', 1, 5, 12, 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `spelIdComment_fk` FOREIGN KEY (`spelId`) REFERENCES `spel` (`id`);

--
-- Constraints for table `spel`
--
ALTER TABLE `spel`
  ADD CONSTRAINT `spelIdCategory_fk` FOREIGN KEY (`categoryId`) REFERENCES `category` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
