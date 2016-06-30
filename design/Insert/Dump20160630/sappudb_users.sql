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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT,
  `accuracy` int(11) NOT NULL,
  `activeStatus` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `dateOfBirth` datetime DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `homeNo` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `latitude` double NOT NULL,
  `longtitude` double NOT NULL,
  `mobileNo` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `profilePic` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `workNo` varchar(255) DEFAULT NULL,
  `isDelete` bit(1) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,40,1,'No 188.17, Moris Road, Millidduwa, Galle','1988-01-21 00:00:00','isuru','0912241384','dewasurendra',6.79701585,79.90198061,'0711574677','123',NULL,'isuru@gmail.com','0912241384','\0'),(2,40,1,'No 123/12, Gambada Road, Colombo','1986-02-20 00:00:00','kamal','0912241384','nanayakkara',6.79602508,79.89683211,'071567489','123',NULL,'kamal@gmail.com','0912241384','\0'),(3,46,1,'No 187/12, rajarata Road, Kandy','1980-01-04 00:00:00','ranjith','0912241384','madusanka',6.79861387,79.90293682,'07773245244','123',NULL,'ranjith@gmail.com','0912241384','\0'),(4,0,1,'No 123/53, Sambudha Road, Matara','1980-03-12 00:00:00','sunil','0912241384','gamlath',6.79861387,79.90293682,'071567489','123',NULL,'sunil@gmail.com','0912241384','\0'),(5,0,1,'No 147/12, rajarata Road, Kandy','1980-03-12 00:00:00','saman','0912241384','rajapaksha',6.79861327,79.90293622,'071567489','123',NULL,'saman@gmail.com','0912241384','\0'),(6,1,1,'No 187/15, wishaka road, Colombo','1986-02-20 12:00:01','thilina','912241385','Wijekoon',7.79861327,80.90293622,'71567489','123',NULL,'thilina@gmail.com','912241385','\0'),(7,2,1,'No 240/30, Ramanayaka Road, Matara','1986-02-20 12:00:02','salinda','912241386','Ramanayaka',8.79861327,81.90293622,'71567489','123',NULL,'salinda@gmail.com','912241386','\0'),(8,3,1,'No 120/20, Graceland, Horana','1986-02-20 12:00:03','malik','912241387','Samaradiwakara',9.79861327,82.90293622,'71567489','123',NULL,'malik@gmail.com','912241387','\0'),(9,4,1,'No 230/45, Milliduwa, Galle','1986-02-20 12:00:04','nadeeshani','912241388','Dewasurendra',10.79861327,83.90293622,'71567489','123',NULL,'nadeeshani@gmail.com','912241388','\0'),(10,5,1,'No 89/65, Rockland Road, Nuwaraeliya','1986-02-20 12:00:05','pabasara','912241389','Dewasurendra',11.79861327,84.90293622,'71567489','123',NULL,'pabasara@gmail.com','912241389','\0'),(11,6,1,'No 187/15, wishaka road, Colombo','1986-02-20 12:00:06','thlina','912241390','Athukorala',12.79861327,85.90293622,'71567489','123',NULL,'thlina@gmail.com','912241390','\0'),(12,7,1,'No 784/09, Sabaragamuwa Road, Bandarawela','1986-02-20 12:00:07','kasun','912241391','Seneverathne',13.79861327,86.90293622,'71567489','123',NULL,'kasun@gmail.com','912241391','\0'),(13,8,1,'No 34/76, Palaka Road, Katugasthota','1986-02-20 12:00:08','udaya','912241392','rajapaksha',14.79861327,87.90293622,'71567489','123',NULL,'udaya@gmail.com','912241392','\0'),(14,9,1,'No 63/09, Keerthi Road, Ambalangoda','1986-02-20 12:00:09','shamil','912241393','Ramanayaka',15.79861327,88.90293622,'71567489','123',NULL,'shamil@gmail.com','912241393','\0'),(15,10,1,'No 147/12, rajarata Road, Kandy','1986-02-20 12:00:10','wajira','912241394','Rubasinghe',16.79861327,89.90293622,'71567489','123',NULL,'wajira@gmail.com','912241394','\0'),(16,11,1,'No 89/65, Rockland Road, Nuwaraeliya','1986-02-20 12:00:11','shamilka','912241395','Samaradiwakara',17.79861327,90.90293622,'71567489','123',NULL,'shamilka@gmail.com','912241395','\0'),(17,12,1,'No 120/20, Graceland, Horana','1986-02-20 12:00:12','dishan','912241396','Wijekoon',18.79861327,91.90293622,'71567489','123',NULL,'dishan@gmail.com','912241396','\0'),(18,13,1,'No 240/30, Ramanayaka Road, Matara','1986-02-20 12:00:13','panil','912241397','Rubasinghe',19.79861327,92.90293622,'71567489','123',NULL,'panil@gmail.com','912241397','\0'),(19,14,1,'No 34/76, Palaka Road, Katugasthota','1986-02-20 12:00:14','danushka','912241398','Athukorala',20.79861327,93.90293622,'71567489','123',NULL,'danushka@gmail.com','912241398','\0'),(20,15,1,'No 784/09, Sabaragamuwa Road, Bandarawela','1986-02-20 12:00:15','ashini','912241399','Seneverathne',21.79861327,94.90293622,'71567489','123',NULL,'ashini@gmail.com','912241399','\0'),(21,16,1,'No 187/15, wishaka road, Colombo','1986-02-20 12:00:16','nishan','912241400','Rubasinghe',22.79861327,95.90293622,'71567489','123',NULL,'nishan@gmail.com','912241400','\0'),(22,17,1,'No 89/65, Rockland Road, Nuwaraeliya','1986-02-20 12:00:17','praveeni','912241401','rajapaksha',23.79861327,96.90293622,'71567489','123',NULL,'praveeni@gmail.com','912241401','\0'),(23,18,1,'No 34/76, Palaka Road, Katugasthota','1986-02-20 12:00:18','manjula','912241402','Athukorala',24.79861327,97.90293622,'71567489','123',NULL,'manjula@gmail.com','912241402','\0'),(24,19,1,'No 240/30, Ramanayaka Road, Matara','1986-02-20 12:00:19','arunya','912241403','Ramanayaka',25.79861327,98.90293622,'71567489','123',NULL,'arunya@gmail.com','912241403','\0'),(25,20,1,'No 230/45, Milliduwa, Galle','1986-02-20 12:00:20','gayan','912241404','Doluweera',26.79861327,99.90293622,'71567489','123',NULL,'gayan@gmail.com','912241404','\0'),(26,21,1,'No 147/12, rajarata Road, Kandy','1986-02-20 12:00:21','roshan','912241405','Samaradiwakara',27.79861327,100.9029362,'71567489','123',NULL,'roshan@gmail.com','912241405','\0'),(27,22,1,'No 240/30, Ramanayaka Road, Matara','1986-02-20 12:00:22','sudeera','912241406','Wijerathne',28.79861327,101.9029362,'71567489','123',NULL,'sudeera@gmail.com','912241406','\0'),(28,23,1,'No 120/20, Graceland, Horana','1986-02-20 12:00:23','kevin','912241407','Perera',29.79861327,102.9029362,'71567489','123',NULL,'kevin@gmail.com','912241407','\0'),(29,24,1,'No 784/09, Sabaragamuwa Road, Bandarawela','1986-02-20 12:00:24','telan','912241408','Dewasurendra',30.79861327,103.9029362,'71567489','123',NULL,'telan@gmail.com','912241408','\0'),(30,25,1,'No 187/15, wishaka road, Colombo','1986-02-20 12:00:25','rasanga','912241409','Doluweera',31.79861327,104.9029362,'71567489','123',NULL,'rasanga@gmail.com','912241409','\0'),(31,26,1,'No 34/76, Palaka Road, Katugasthota','1986-02-20 12:00:26','prasan','912241410','Wijekoon',32.79861327,105.9029362,'71567489','123',NULL,'prasan@gmail.com','912241410','\0'),(32,27,1,'No 230/45, Milliduwa, Galle','1986-02-20 12:00:27','shaun','912241411','Wijerathne',33.79861327,106.9029362,'71567489','123',NULL,'shaun@gmail.com','912241411','\0'),(33,28,1,'No 89/65, Rockland Road, Nuwaraeliya','1986-02-20 12:00:28','wijaya','912241412','Rubasinghe',34.79861327,107.9029362,'71567489','123',NULL,'wijaya@gmail.com','912241412','\0'),(34,29,1,'No 240/30, Ramanayaka Road, Matara','1986-02-20 12:00:29','sujan','912241413','Doluweera',35.79861327,108.9029362,'71567489','123',NULL,'sujan@gmail.com','912241413','\0'),(35,30,1,'No 120/20, Graceland, Horana','1986-02-20 12:00:30','rajan','912241414','Ramanayaka',36.79861327,109.9029362,'71567489','123',NULL,'rajan@gmail.com','912241414','\0'),(36,31,1,'No 784/09, Sabaragamuwa Road, Bandarawela','1986-02-20 12:00:31','sakya','912241415','Wijerathne',37.79861327,110.9029362,'71567489','123',NULL,'sakya@gmail.com','912241415','\0'),(37,32,1,'No 34/76, Palaka Road, Katugasthota','1986-02-20 12:00:32','ranjan','912241416','Samaradiwakara',38.79861327,111.9029362,'71567489','123',NULL,'ranjan@gmail.com','912241416','\0'),(38,33,1,'No 147/12, rajarata Road, Kandy','1986-02-20 12:00:33','dilshan','912241417','Wijekoon',39.79861327,112.9029362,'71567489','123',NULL,'dilshan@gmail.com','912241417','\0'),(39,34,1,'No 230/45, Milliduwa, Galle','1986-02-20 12:00:34','akila','912241418','Seneverathne',40.79861327,113.9029362,'71567489','123',NULL,'akila@gmail.com','912241418','\0'),(40,35,1,'No 784/09, Sabaragamuwa Road, Bandarawela','1986-02-20 12:00:35','chamilka','912241419','Rubasinghe',41.79861327,114.9029362,'71567489','123',NULL,'chamilka@gmail.com','912241419','\0'),(41,36,1,'No 89/65, Rockland Road, Nuwaraeliya','1986-02-20 12:00:36','ishara','912241420','Athukorala',42.79861327,115.9029362,'71567489','123',NULL,'ishara@gmail.com','912241420','\0'),(42,37,1,'No 187/15, wishaka road, Colombo','1986-02-20 12:00:37','malki','912241421','Seneverathne',43.79861327,116.9029362,'71567489','123',NULL,'malki@gmail.com','912241421','\0'),(43,38,1,'No 230/45, Milliduwa, Galle','1986-02-20 12:00:38','chitra','912241422','rajapaksha',44.79861327,117.9029362,'71567489','123',NULL,'chitra@gmail.com','912241422','\0'),(44,39,1,'No 120/20, Graceland, Horana','1986-02-20 12:00:39','bandu','912241423','Dewasurendra',45.79861327,118.9029362,'71567489','123',NULL,'bandu@gmail.com','912241423','\0'),(45,40,1,'No 784/09, Sabaragamuwa Road, Bandarawela','1986-02-20 12:00:40','anjula','912241424','Samaradiwakara',46.79861327,119.9029362,'71567489','123',NULL,'anjula@gmail.com','912241424','\0'),(46,41,1,'No 89/65, Rockland Road, Nuwaraeliya','1986-02-20 12:00:41','nilluka','912241425','Athukorala',47.79861327,120.9029362,'71567489','123',NULL,'nilluka@gmail.com','912241425','\0'),(47,42,1,'No 230/45, Milliduwa, Galle','1986-02-20 12:00:42','senuth','912241426','Wijekoon',48.79861327,121.9029362,'71567489','123',NULL,'senuth@gmail.com','912241426','\0'),(48,43,1,'No 147/12, rajarata Road, Kandy','1986-02-20 12:00:43','rashmi','912241427','Dewasurendra',49.79861327,122.9029362,'71567489','123',NULL,'rashmi@gmail.com','912241427','\0'),(49,44,1,'No 240/30, Ramanayaka Road, Matara','1986-02-20 12:00:44','wishaka','912241428','Ramanayaka',50.79861327,123.9029362,'71567489','123',NULL,'wishaka@gmail.com','912241428','\0'),(50,45,1,'No 187/15, wishaka road, Colombo','1986-02-20 12:00:45','ramya','912241429','rajapaksha',51.79861327,124.9029362,'71567489','123',NULL,'ramya@gmail.com','912241429','\0'),(51,45,1,'Address','1986-02-20 12:00:45','admin','912241429','admin',51.79861327,124.9029362,'71567489','123',NULL,'admin@gmail.com','912241429','\0');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-30 18:31:50
