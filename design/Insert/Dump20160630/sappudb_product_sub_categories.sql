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
-- Table structure for table `product_sub_categories`
--

DROP TABLE IF EXISTS `product_sub_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_sub_categories` (
  `productSubCategoryId` bigint(20) NOT NULL AUTO_INCREMENT,
  `subCategoryName` varchar(255) DEFAULT NULL,
  `productCategory_productCategoryId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`productSubCategoryId`),
  KEY `FK_nmxxavsgebmaawmjctfmm03bw` (`productCategory_productCategoryId`),
  CONSTRAINT `FK_nmxxavsgebmaawmjctfmm03bw` FOREIGN KEY (`productCategory_productCategoryId`) REFERENCES `product_categories` (`productCategoryId`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_sub_categories`
--

LOCK TABLES `product_sub_categories` WRITE;
/*!40000 ALTER TABLE `product_sub_categories` DISABLE KEYS */;
INSERT INTO `product_sub_categories` VALUES (1,'MOBILEPHONE',1),(2,'MOBILEPHONEACCESSORIES',1),(3,'COMPUTER',1),(4,'COMPUTERACCESSORIES',1),(5,'TV',1),(6,'CAMERA',1),(7,'AUDIO',1),(8,'OTHER',1),(9,'CAR',2),(10,'MOTORBIKE',2),(11,'THREEWHEELER',2),(12,'VANBUS',2),(13,'AUTOPART',2),(14,'OTHER',2),(15,'LAND',3),(16,'HOUSE',3),(17,'APARTMENT',3),(18,'OTHER',3),(19,'OTHER',4),(20,'CAMERAACCESSORIES',1),(21,'FRIDGE',1);
/*!40000 ALTER TABLE `product_sub_categories` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-30 18:31:53
