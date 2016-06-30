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
-- Table structure for table `popular_areas`
--

DROP TABLE IF EXISTS `popular_areas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `popular_areas` (
  `areaId` bigint(20) NOT NULL AUTO_INCREMENT,
  `areaName` varchar(255) DEFAULT NULL,
  `district_districtId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`areaId`),
  KEY `FK_5w1re2140bividfuchdagrohy` (`district_districtId`),
  CONSTRAINT `FK_5w1re2140bividfuchdagrohy` FOREIGN KEY (`district_districtId`) REFERENCES `districts` (`districtId`)
) ENGINE=InnoDB AUTO_INCREMENT=220 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `popular_areas`
--

LOCK TABLES `popular_areas` WRITE;
/*!40000 ALTER TABLE `popular_areas` DISABLE KEYS */;
INSERT INTO `popular_areas` VALUES (1,'Akkarepattu',1),(2,'Ampara',1),(3,'Kalmunai',1),(4,'Sainthamaturutha',1),(5,'Adalaichenai',1),(6,'Other',1),(7,'Anuradhapura',2),(8,'Kekirawa',2),(9,'Tambuttegama',2),(10,'Eppawala',2),(11,'Nochchiyagama',2),(12,'Other',2),(13,'Avissawella',3),(14,'Other',3),(15,'Badulla',4),(16,'Welimada',4),(17,'Mahiyanganaya',4),(18,'Diyatalawa',4),(19,'Other',4),(20,'Badarawela',5),(21,'Other',5),(22,'Batticaloa',6),(23,'Kattankudi',6),(24,'Valaichenai',6),(25,'Eravur',6),(26,'Kaluwanchikudi',6),(27,'Other',6),(28,'Chilaw',7),(29,'Other',7),(30,'Akarawita',8),(31,'Akuregoda',8),(32,'Angoda',8),(33,'Athurugiriya',8),(34,'Avissawella',8),(35,'Batawala',8),(36,'Battaramulla',8),(37,'Batugampola',8),(38,'Bellanwila',8),(39,'Bokundara',8),(40,'Bope',8),(41,'Boralesgamuwa',8),(42,'Colombo 1',8),(43,'Colombo 10',8),(44,'Colombo 11',8),(45,'Colombo 12',8),(46,'Colombo 13',8),(47,'Colombo 14',8),(48,'Colombo 15',8),(49,'Colombo 2',8),(50,'Colombo 3',8),(51,'Colombo 4',8),(52,'Colombo 5',8),(53,'Colombo 7',8),(54,'Colombo 8',8),(55,'Colombo 9',8),(56,'Dedigamuwa',8),(57,'Deltara',8),(58,'Ethul Kotte',8),(59,'Gangodawilla',8),(60,'Godagama',8),(61,'Gonapola',8),(62,'Gothatuwa',8),(63,'Habarakada',8),(64,'Handapangoda',8),(65,'Hanwella',8),(66,'Hewainna',8),(67,'Hiripitya',8),(68,'Hokandara',8),(69,'Horagala',8),(70,'Ingiriya',8),(71,'Jalthara',8),(72,'Kaduwela',8),(73,'Kahathuduwa',8),(74,'Kahawala',8),(75,'Kalatuwawa',8),(76,'Kaluaggala',8),(77,'Kalubowila',8),(78,'Katubedda',8),(79,'Kelaniya',8),(80,'Kesbewa',8),(81,'Kiriwattuduwa',8),(82,'Kohuwala',8),(83,'Kolonnawa',8),(84,'Kosgama',8),(85,'Koswatta',8),(86,'Kotikawatta',8),(87,'Kottawa',8),(88,'Kotte',8),(89,'Madapatha',8),(90,'Madiwela',8),(91,'Malabe',8),(92,'Maradana',8),(93,'Mattegoda',8),(94,'Meegoda',8),(95,'Meepe',8),(96,'Mirihana',8),(97,'Moragahahena',8),(98,'Moraketiya',8),(99,'Moratuwa',8),(100,'Mount Lavinia',8),(101,'Mullegama',8),(102,'Mulleriyawa',8),(103,'Napawela',8),(104,'Navagamuwa',8),(105,'Nawala',8),(106,'Padukka',8),(107,'Pannipitiya',8),(108,'Pelawatta',8),(109,'Peliyagoda',8),(110,'Pepiliyana',8),(111,'Piliyandala',8),(112,'Pita Kotte',8),(113,'Pitipana Homagama',8),(114,'Polgasowita',8),(115,'Puwakpitiya',8),(116,'Rajagiriya',8),(117,'Ranala',8),(118,'Ratmalana',8),(119,'Siddamulla',8),(120,'Sri Jayawardenapura Kotte',8),(121,'Talawatugoda',8),(122,'Thalapathpitiya',8),(123,'Thimbirigasyaya',8),(124,'Thummodara',8),(125,'Waga',8),(126,'Watareka',8),(127,'Weliwita',8),(128,'Wellampitiya',8),(129,'Wellawatte',8),(130,'Other',8),(131,'Galle',9),(132,'Ambalangoda',9),(133,'Elpitiya',9),(134,'Hikkaduwa',9),(135,'Baddegama',9),(136,'Other',9),(137,'Tangalla',10),(138,'Beliatta',10),(139,'Ambalantota',10),(140,'Tissamaharama',10),(141,'Hambantota',10),(142,'Other',10),(143,'Hatton',11),(144,'Other',11),(145,'Jaffna',12),(146,'Nallur',12),(147,'Chavakachcheri',12),(148,'Point Pedro',12),(149,'Manipay',12),(150,'Other',12),(151,'Kalmunai',13),(152,'Other',13),(153,'Kalutara',14),(154,'Other',14),(155,'Kandy',15),(156,'Katugastota',15),(157,'Gampola',15),(158,'Peradeniya',15),(159,'Akurana',15),(160,'Other',15),(161,'Kegalle',16),(162,'Mawanella',16),(163,'Warakapola',16),(164,'Rabukkana',16),(165,'Ruwanwella',16),(166,'Other',16),(167,'Mannar',17),(168,'Nanattan',17),(169,'Murunkan',17),(170,'Chilavathurai',17),(171,'Adampan',17),(172,'Other',17),(173,'Matale',18),(174,'Dambulla',18),(175,'Galewela',18),(176,'Ukuwela',18),(177,'Palapathwela',18),(178,'Other',18),(179,'Matara',19),(180,'Weligama',19),(181,'Akuressa',19),(182,'Dikwella',19),(183,'Hakmana',19),(184,'Other',19),(185,'Nawalapitiya',20),(186,'Other',20),(187,'Negombo',21),(188,'Other',21),(189,'Nuwara Eliiya',22),(190,'Ginigathhena',22),(191,'Kotmale',22),(192,'Talawakele',22),(193,'Other',22),(194,'Panadura',23),(195,'Other',23),(196,'Polonnaruwa',24),(197,'Higurakgoda',24),(198,'Kaduruwela',24),(199,'Medirigiriya',24),(200,'Jayasiripura',24),(201,'Other',24),(202,'Ratnapura',25),(203,'Embilipitiya',25),(204,'Balangoda',25),(205,'Eheliyagoda',25),(206,'Kuruwita',25),(207,'Other',25),(208,'Trincomalee',26),(209,'Kinniya',26),(210,'Kantalai',26),(211,'Chinabay',26),(212,'Nilaveli',26),(213,'Other',26),(214,'Vavuniya South',27),(215,'Vavuniya North',27),(216,'Cheddikulam',27),(217,'Omanthai',27),(218,'Kilinochchi',27),(219,'Other',27);
/*!40000 ALTER TABLE `popular_areas` ENABLE KEYS */;
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
