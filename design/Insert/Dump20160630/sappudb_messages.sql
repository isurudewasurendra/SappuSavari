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
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `messageId` bigint(20) NOT NULL AUTO_INCREMENT,
  `createdDateTime` datetime DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `readStatus` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `updatedDateTime` datetime DEFAULT NULL,
  `receiver_userId` bigint(20) DEFAULT NULL,
  `sender_userId` bigint(20) DEFAULT NULL,
  `productId` bigint(20) NOT NULL,
  `isDelete` bit(1) NOT NULL,
  PRIMARY KEY (`messageId`),
  KEY `FK_nyobq1g2p4j8b9h6ug76ier6h` (`receiver_userId`),
  KEY `FK_ta89c5iu5w195qdddopvqx6sa` (`sender_userId`),
  CONSTRAINT `FK_nyobq1g2p4j8b9h6ug76ier6h` FOREIGN KEY (`receiver_userId`) REFERENCES `users` (`userId`),
  CONSTRAINT `FK_ta89c5iu5w195qdddopvqx6sa` FOREIGN KEY (`sender_userId`) REFERENCES `users` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (1,'2016-04-07 15:08:18','Do you have origial papers?','NO','this is reagarding the nissan leaf','2016-04-07 15:08:18',4,1,12,'\0');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-30 18:31:51
