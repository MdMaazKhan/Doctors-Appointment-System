-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: doctorsdb
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doctorsinfo`
--

DROP TABLE IF EXISTS `doctorsinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctorsinfo` (
  `SerialNo` int(11) NOT NULL AUTO_INCREMENT,
  `HospitalName` varchar(100) DEFAULT NULL,
  `DoctorName` varchar(100) DEFAULT NULL,
  `AreaOfExpertise` varchar(100) DEFAULT NULL,
  `Timings` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SerialNo`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctorsinfo`
--

LOCK TABLES `doctorsinfo` WRITE;
/*!40000 ALTER TABLE `doctorsinfo` DISABLE KEYS */;
INSERT INTO `doctorsinfo` VALUES (1,'Fatima','akhtar','dentist','13-14'),(2,'Fatima','khalid','ENT','18-20'),(3,'Fatima','munna','ortho','12-16'),(4,'apollo','sunny','headache','20-22'),(5,'apollo','verma','stomach','15-16'),(6,'mahindra','ramesh','chu','15-19'),(7,'mahindra','rashid','ent','12-20'),(8,'mahindra','akash','ortho','8-12'),(9,'fatima','rishi','surgeon','12-17'),(10,'mahindra','kamran','surgeon','1-4'),(11,'fatima','akhtar','ent','13-18'),(12,'mahindra','munna','dentist','12-21'),(13,'fatima','chunnu','surgeon','8-12');
/*!40000 ALTER TABLE `doctorsinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-11 14:01:38
