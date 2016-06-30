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
-- Table structure for table `system_user_role`
--

DROP TABLE IF EXISTS `system_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `system_user_role` (
  `systemUserRoleId` int(11) NOT NULL AUTO_INCREMENT,
  `user_userId` bigint(20) DEFAULT NULL,
  `userRole_userRoleId` int(11) DEFAULT NULL,
  PRIMARY KEY (`systemUserRoleId`),
  KEY `FK_8dikol012iamk3b9nmv48wkk2` (`user_userId`),
  KEY `FK_i9xsn4atr67xlgcoy4akj0uv2` (`userRole_userRoleId`),
  CONSTRAINT `FK_8dikol012iamk3b9nmv48wkk2` FOREIGN KEY (`user_userId`) REFERENCES `users` (`userId`),
  CONSTRAINT `FK_i9xsn4atr67xlgcoy4akj0uv2` FOREIGN KEY (`userRole_userRoleId`) REFERENCES `user_role` (`userRoleId`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `system_user_role`
--

LOCK TABLES `system_user_role` WRITE;
/*!40000 ALTER TABLE `system_user_role` DISABLE KEYS */;
INSERT INTO `system_user_role` VALUES (1,1,2),(2,1,2),(3,2,2),(4,3,2),(5,4,2),(6,5,2),(7,6,2),(8,7,2),(9,8,2),(10,9,2),(11,10,2),(12,11,2),(13,12,2),(14,13,2),(15,14,2),(16,15,2),(17,16,2),(18,17,2),(19,18,2),(20,19,2),(21,20,2),(22,21,2),(23,22,2),(24,23,2),(25,24,2),(26,25,2),(27,26,2),(28,27,2),(29,28,2),(30,29,2),(31,30,2),(32,31,2),(33,32,2),(34,33,2),(35,34,2),(36,35,2),(37,36,2),(38,37,2),(39,38,2),(40,39,2),(41,40,2),(42,41,2),(43,42,2),(44,43,2),(45,44,2),(46,45,2),(47,46,2),(48,47,2),(49,48,2),(50,49,2),(51,50,2),(52,51,1);
/*!40000 ALTER TABLE `system_user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-30 18:31:56
