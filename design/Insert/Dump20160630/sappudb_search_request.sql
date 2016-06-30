-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: sappudb
-- ------------------------------------------------------
-- Server version	5.6.25-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `search_request`
--

DROP TABLE IF EXISTS `search_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `search_request` (
  `searchRequestId` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `authenticity` varchar(255) DEFAULT NULL,
  `bodyType` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `createdDateTime` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `fuelType` varchar(255) DEFAULT NULL,
  `maxMillege` int(11) NOT NULL,
  `maxNoOfBathroom` int(11) NOT NULL,
  `maxNoOfRoom` int(11) NOT NULL,
  `maxPrice` double NOT NULL,
  `minMillege` int(11) NOT NULL,
  `minNoOfBathroom` int(11) NOT NULL,
  `minNoOfRoom` int(11) NOT NULL,
  `minPrice` double NOT NULL,
  `model` varchar(255) DEFAULT NULL,
  `modelYear` varchar(255) DEFAULT NULL,
  `productCondition` varchar(255) DEFAULT NULL,
  `productType` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `transmission` varchar(255) DEFAULT NULL,
  `popularArea_areaId` bigint(20) DEFAULT NULL,
  `productSubCategory_productSubCategoryId` bigint(20) DEFAULT NULL,
  `user_userId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`searchRequestId`),
  KEY `FK_jaxsi1bjadyc5wmurgfv1j24t` (`popularArea_areaId`),
  KEY `FK_iw5kc16bnroo7pn94480obgh8` (`productSubCategory_productSubCategoryId`),
  KEY `FK_230t22ee9sw894ovmtdak36co` (`user_userId`),
  CONSTRAINT `FK_230t22ee9sw894ovmtdak36co` FOREIGN KEY (`user_userId`) REFERENCES `users` (`userId`),
  CONSTRAINT `FK_iw5kc16bnroo7pn94480obgh8` FOREIGN KEY (`productSubCategory_productSubCategoryId`) REFERENCES `product_sub_categories` (`productSubCategoryId`),
  CONSTRAINT `FK_jaxsi1bjadyc5wmurgfv1j24t` FOREIGN KEY (`popularArea_areaId`) REFERENCES `popular_areas` (`areaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `search_request`
--

LOCK TABLES `search_request` WRITE;
/*!40000 ALTER TABLE `search_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `search_request` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-30 18:31:52
