-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: proyecto
-- ------------------------------------------------------
-- Server version	5.5.8-log

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
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('1010','Jazmin','Parra','Soto','2017-05-29','1998-12-12','6144581416','Av. Mexico 7','F',''),('1011','Araly','Rincon','Jacquez','2017-12-12','1978-08-26','6148970245','Av. Brasil 78','M',''),('1012','Alonso','Flores','Miramontes','2017-05-30','1973-06-05','6149562084','Av. Villalba 9','M',''),('1013','Jaime','Robles','Alarcon','2017-01-19','1985-10-05','6148956078','Av. Argentina 96','M',''),('1014','Raul','Rivera','Sanchez','2016-04-25','1996-08-23','6143588720','Av. España 21','M',''),('1015','Pedro','Chavez','Marquez','2017-09-15','1997-10-08','6145207898','Av. USA 31','M',NULL),('1016','Luis','Sanchez','Rivera','2017-08-26','1995-08-03','6140025786','Av. LA 63','M',''),('1017','Martin','Marrufo','Garcia','2016-10-05','1993-02-01','6145874102','Av. Uruguay 96','M',NULL),('1018','Luisa','Quintanilla','Lopez','2018-04-08','1991-09-08','6148952206','Av. Chile 74','F',NULL),('1019','Ana','Rodriguez','Martinez','2015-12-31','1990-06-29','6145984506','Av. Ecuador 21','F',NULL),('1020','Perla','Aguilar','Garcia','2016-08-19','2000-10-01','6147895823','Av. Puerto Rico 32','F',NULL),('1021','Leonardo','Estrada','Chan','2017-10-15','2001-04-22','6148749501','Av. Londres 32','M',NULL),('1022','David','Orrantia','Morales','2016-06-28','1999-05-12','6145985610','Av. Marruecos 320','M',NULL),('1023','Alejandro','Curiel','Muñoz','2017-12-12','1998-03-20','6145874650','Av. Dubai 32','M',NULL),('1024','Francisco','Marquez','Rios','2017-03-26','1995-03-29','6145786204','Av. Noruega 877','M',NULL),('1025','Maria','Villalobos','Daniels','2018-01-01','1989-08-07','6145789565','Av. Japon 359','F',NULL),('1026','Leticia','Gonzalez','Vazquez','2016-10-03','1996-07-08','6148987965','Av. China 98','F',NULL),('1027','Patricia','Toral','Acosta','2017-08-19','1993-05-26','6147412589','Av. Alemania 320','F',NULL),('1028','Fernando','Rincon','Bravo','2016-02-25','1997-10-06','6144414795','Av. Holanda 25','M',NULL),('1029','Mario','Flores','Lisboa','2017-05-12','1998-03-26','6147849517','Av. Guatemala 36','M',NULL),('1030','Marisela','Enriquez','Corona','2018-11-12','1998-02-10','6147851689','Av. Valencia 26','F',NULL),('1031','Alejandro','Chavez','Castillo','2017-08-23','1998-10-02','6147998513','Av. Canada 26','M',NULL),('1032','Andres','Flores','Mendez','2016-07-15','1993-12-30','6145984956','Av. Italia 652','M',NULL),('1033','Ruben','Hernandez','Chavez','2017-01-23','1993-05-30','6141227624','Ca¤ada Fogalleja 123B 12§F','M',NULL),('1034','Luis Raul','Arzola','Due¤as','2017-11-19','1993-03-28','6144471740','Ca¤ada Desembalumessin 21 14§E','M',NULL),('1035','Avery','Smith',' Carter','2016-11-29','2017-09-10','6141238274','Ca¤ada Embeinin desenrajol… 247B 2§D','F',NULL),('1036','Ella','Johnson','Mitchell','2017-12-30','2000-11-12','6148273498','Carrer Esmorteiran poetitzada 122A 16§H','F',NULL),('1037','Scarlett','Williams','Perez','2018-02-06','1986-02-08','6149873412','Glorieta Sent¡rem desempomar¡eu acromatitzari','F',NULL),('1038','Elijah','Jones','Roberts','2017-05-30','1987-03-26','6141344910','C. Comercial Desprove‹ssen desempilau paganit','M',NULL),('1039','Ethan','Brown','Turner','2018-03-28','1996-05-10','6143454243','Plaza Sola‡…s esterrequessen 99B 20§A','M',NULL),('1040','Alexander','Davis','Phillips','2016-05-10','1996-10-05','6145563577','Ca¤ada Garruladora cardigasses 230B 13§B','M',NULL),('1041','Charlotte','Miller','Campbell','2017-06-22','1996-05-08','6147672910','Alameda Ejacul‚ssim 10B 20§G','F',NULL),('1042','Abigail','Wilson','Parker','2018-03-01','1993-07-21','6149782243','Calle Arrenglares 264A 5§E','F',NULL),('1043','Lucas','Moore','Evans','2016-11-11','2000-11-16','6141891576','Acceso Uniformitz…reu evagine bedora subminis','M',NULL),('1044','Matthew','Taylor','Edwards','2017-08-20','1996-04-17','6144000919','Acceso Garfir… cavalcadors vintejar‚ mes•fit ','M',NULL),('1045','Aiden','Anderson','Collins','2017-09-10','2000-12-01','6146110243','V¡a Porcastrella 106B 13§D','M',NULL),('1046','Emma','Thomas','Stewart','2016-05-05','1993-10-19','6148219577','Ca¤ada Escarramicada poblatines desenfonyis g','F',NULL),('1047','Olivia','Jackson','Sanchez','2017-10-09','1995-06-05','6149328910','Urbanizaci¢n Afili…rem termenejava 187B 15§F','F',NULL),('1048','Ava','White','Morris','2017-10-10','1997-10-08','6142438243','Pasaje Zel‚ssem socorro grafilassin 7A 19§D','F',NULL),('1049','Sophia','Harris','Rogers','2016-09-22','1993-08-10','6144547577','Pasaje Vedareu perpetr‚ssim consentidors 54B ','F',NULL),('1050','Isabella','Martin','Reed','2018-05-10','1997-12-23','6146656910','Calle Pitart postermejaria clofoll¢s analúlŠr','F',NULL),('1051','Mia','Thompson','Cook','2017-10-20','1996-05-22','6148766244','Acceso Reescalf… amarguegessis estrompassaren','F',NULL),('1052','James','Garcia','Morgan','2018-03-12','1995-02-02','6140875577','Calle Santificant refusar¡em 164 14§B','M',NULL),('1053','Benjamin','Martinez','Bell','2016-09-25','1995-06-04','6142984910','Ronda Capllev¡ 212 16§A','M',NULL),('1054','Jacob','Robinson','Murphy','2017-02-03','1996-12-05','6145094244','Alameda Cint…reu concorreguera escucar¡em per','M',NULL),('1055','Michael','Clark','Bailey','2017-04-23','1979-06-23','6147203577','Plaza Compartiment…vem entreoeixo piulejaria ','M',NULL),('1056','Logan','Rodriguez','Rivera','2017-05-05','1982-05-29','6149312911','Carrer Penyorat balm…veu desempalessin 18','M',NULL),('1057','Emily','Lewis','Cooper','2018-10-08','1954-09-10','6141422244','Traves¡a Entronitzaci¢ canus¡s 149','F',NULL),('1058','Harper','Lee','Richardson','2016-05-03','1987-09-21','6143531577','Acceso Adscrites 271B 6§A','F',NULL),('1059','Elizabeth','Walker','Cox','2018-06-11','0000-00-00','6145640911','Avenida Tal…mics 95','F',NULL),('1060','Sofia','Hall','Howard','2017-10-06','1998-01-01','6197750244','Carrer G…lates descodificar¡eu violent‚s 123','F',NULL),('1061','Madison','Allen','Ward','2016-01-01','1990-08-29','6149859578','Ronda Hal•fobes compagin‚ssem afilador 85B','F',NULL),('1062','Liam','Young','Torres','2017-10-10','1952-12-25','6141968911','Urbanizaci¢n Rasclumegem clatellejar‚ germani','M',NULL),('1063','William','Hernandez','Peterson','2016-04-05','1978-09-13','6144078244','Urbanizaci¢n Adveresses reglament circumspecc','M',NULL),('1064','Mason','King','Gray','2017-05-04','1992-05-06','6146187578','C. Comercial Coercir…s 10A 18§D','M',NULL),('1065','Oliver','Wright','Ramirez','2018-01-23','2000-06-28','6148296911','Ronda Bigeminats adaptessen desenfitau sindiq','M',NULL),('1066','Daniel','Lopez','James','2017-05-29','1993-05-19','6140406245','Glorieta Varaven embarcament trufejareu estam','M',NULL),('1067','Noah','Hill','Watson','2016-09-10','1992-05-18','6142515578','Pasadizo Nitrificaren teratomatoses 86A 13§A','M',NULL),('1068','Jackson','Scott','Brooks','2017-08-18','1995-11-16','6144624911','Pasaje Gatgej…vem 160A','M',NULL),('1069','Amelia','Green','Kelly','2018-04-28','1993-12-12','6146734245','Calle Campus albard…ssim 23A 4§H','F',NULL),('1070','Evelyn','Adams','Sanders','2017-06-08','1976-10-05','6148843578','Acceso Empiles 133 6§A','F',NULL),('1071','Israel','Castro','Jimenez','2016-12-25','2000-06-06','6141254685','Calle Aldama','M',NULL),('1072','Shinji','Kawawa','Fuu','2016-08-25','1962-04-23','647895264','France Avenue','M','KAFS620423706'),('2356','Ernest','Hittler','McFlare','2018-05-23','1994-05-28','6547894628','Calle Nazi 78','M','0');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES ('0001','Miguel','Balderrama','Marrufo','1997-03-23','2017-04-13','6144878278','Av. Homero 5','M',''),('0002','Karely','Aguilar','Arzate','1997-10-06','2014-08-29','6145879628','Av. Verde 7','F',''),('0003','Israel','Garcia','Acosta','1997-05-25','2016-04-26','6148920259','Av. Morada 8','M',''),('0004','Martin','Alanis','Rivera','1995-12-21','2017-05-28','6147895035','Av. Rosa 98','M',''),('0005','Juan','Lopez','Perez','1996-12-25','2018-12-08','6147200599','Av. Azul 3','M',''),('0006','Luis','Sanchez','Robles','1995-04-12','2017-10-26','6147410478','Av. Amarilla 89','M',''),('0007','Luisa','Alanis','Rivera','1994-09-28','2015-08-22','6140014587','Av. Celeste 89 ','F',''),('0008','Javier','Conde','Carrera','1997-11-05','2017-10-15','6147896325','Av. Turquesa 89','M',''),('0009','Diego','Aguilar','Estrada','1992-02-02','2016-04-26','6140125789','Av. Morada 78','M',''),('0010','Rubi','Ochoa','Rodriguez','1995-07-20','2017-06-06','6144471740','Av. Gris 894','M',''),('0011','Karla','Ramirez','Araujo','1996-01-23','2015-07-07','6145132187','Av. Rosa','F',''),('0012','Jose','Torres','Cardenas','1998-05-05','2016-10-12','6147862114','Av. Rojo 48','M',''),('0013','Alejandro','Rodriguez','Rodriguez','1994-06-08','2016-01-08','6148795106','Av. Amarillo 7','M',''),('0014','Maria','Estrada','Orrantia','1997-08-29','2015-12-25','6146843105','Av. Celeste 7','F',''),('0015','Luis','Marquez','Perez','1997-12-12','2018-07-08','6148950231','Av. Turquesa ','M',''),('0016','Karla','Martinez','Lopez','1998-01-28','2015-10-29','6142651245','Calle Juarez 4','F',NULL),('0017','Carlos','Ramirez','Acosta','1997-05-21','2017-09-18','6147894926','Av. Aguilas 459','M','RAAC970521216'),('0018','Regina','Verduzco','Trump','1992-10-26','2018-02-26','6144568426','Av. Juarez 956','F','VETR921026229');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `entregas`
--

LOCK TABLES `entregas` WRITE;
/*!40000 ALTER TABLE `entregas` DISABLE KEYS */;
INSERT INTO `entregas` VALUES (1,'2020',90000,'2018-05-22'),(2,'2021',90000,'2018-05-22');
/*!40000 ALTER TABLE `entregas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1111,'LAPTOP DELL',8340,5000,19),(1112,'LAPTOP Imac',21200,18000,14),(1113,'USB 4',80,20,19),(1114,'USB 8',120,70,18),(1115,'USB 16',150,75,20),(1116,'USB 32',280,100,28),(1117,'TERABYTE',1500,800,16),(1118,'DISCO DURO',1200,570,29),(1119,'ADAPTADOR USB',50,20,30),(1120,'MOUSE AL',220,120,20),(1121,'MOUSE INAL',400,200,22),(1122,'TECLADO AL',200,100,34),(1123,'TECLADO INAL',600,350,20),(1124,'AUDIFONOS SONY AL',700,350,12),(1125,'AUDIFONOS SONY INAL',1200,500,12),(1126,'AUDIFONOS SAMSUNG AL',800,300,12),(1127,'AUDIFONOS SAMSUNG INAL',1500,900,6),(1128,'AUDIFONOS BEATS',3000,1880,8),(1129,'MONITOR SAMSUNG 17',5000,2750,7),(1130,'MONITOR SAMSUNG 15',4300,3250,8),(1131,'MONITOR DELL 15',3400,2299,8),(1132,'MONITOR DELL 17',3999,2888,9),(1133,'MEMORIA RAM 4 GB',919,300,12),(1134,'MEMORIA RAM 8 GB',1200,500,13),(1135,'MEMORIA RAM 16 GB',2600,900,9),(1136,'PROCESADOR I7',6400,4289,4),(1137,'PROCESADOR I9',45450,35820,5),(1138,'CABLE HDMI 1M',100,20,26),(1139,'CABLE HDMI 3M',150,35,24),(4948,'Laptop HP',8200,4700,5),(5050,'Laptop LENOVO',9000,5000,15),(7979,'MICRO SD 4 GB',100,20,20),(8989,'Laptop TOSHIBA',7500,4282,28);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES ('2020','ACME','John Antuna','Zapopan','JA@gmail.com','6143471749'),('2021','UMBRELLA','Marie Arpero','Nezahualc¢yotl','MarieAr@disco.com','6144371740'),('2022','DHARMA','Karla Abarca','Le¢n','KarlaAb@peri.com','6144571410'),('2023','STARK','Maria Barros','Guadalajara','MariaBarr@Sony.com','6145237961'),('2024','CAPSULE','Karina Villanueva','Ciudad de M‚xico','KarVilla@samsung.com','6145787791'),('2025','CYBERDYNE','Helena Montejano','Chihuahua','HelMont@Beats.com','6146337622'),('2026','ROBOTICS','Selene Faxardo','Hermosillo','SelFa@dell.com','6146887452'),('2027','PLANET EXP','Alejandro Lopez','Saltillo','AleLop@ram.com','6147437283'),('2028','GRINGOTTS','Octavio Mendia','Mexicali','OctavMendi@procesador.com','6147987113'),('2029','INGEN','Paola Ghicuey','Culiac n Rosales','PaoChi@hdmi.com','6148536944'),('2030','MOMCORP','Ramiro Montiel','M‚rida','RamiMontie@apple.com','6149086774'),('2031','WEYLAND','Ilse Osegueda','Ciudad de M‚xico','IlsOse@toshiba.com','6149636605'),('2032','LEXCORP','Perla Olmos','Guadalajara','PerlOlmo@adp.com','6141186435'),('2033','OMNI','Gabriel Maya','M‚rida','GabMay@lenovo.com','6145736265'),('2034','DAYLY','Mario Mitzi','Ciudad de M‚xico','MarMit@terabyte.com','6141286096'),('5052','STAR','Smith Burns','El Paso','Burns@dell.com','9124568263'),('7890','OCEANIC','Luis Perez','Guadalajara','Perez.Luis@HP.com','6145892365');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `resumen`
--

LOCK TABLES `resumen` WRITE;
/*!40000 ALTER TABLE `resumen` DISABLE KEYS */;
INSERT INTO `resumen` VALUES (1,690960,110554,580406,31,22289);
/*!40000 ALTER TABLE `resumen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (2,'1010','0003',24600.0000,'2018-05-18'),(3,'1014','0002',18000.0000,'2018-05-18'),(4,'1010','0002',16400.0000,'2018-05-18'),(5,'1014','0009',7500.0000,'2018-05-18'),(6,'1014','0003',24600.0000,'2018-05-18'),(7,'1010','0005',27000.0000,'2018-05-18'),(8,'1010','0003',30000.0000,'2018-05-18'),(10,'1014','0006',37500.0000,'2018-05-18'),(11,'1010','0003',15000.0000,'2018-05-18'),(12,'1010','0003',18000.0000,'2018-05-18'),(13,'1010','0002',8200.0000,'2018-05-18'),(14,'1010','0004',24700.0000,'2018-05-18'),(15,'1010','0001',24700.0000,'2018-05-18'),(16,'1014','0004',9000.0000,'2018-05-18'),(17,'1010','0003',24700.0000,'2018-05-18'),(18,'1014','0005',49400.0000,'2018-05-18'),(19,'1010','0003',48700.0000,'2018-05-18'),(21,'1010','0004',27000.0000,'2018-05-18'),(22,'1010','0004',40500.0000,'2018-05-18'),(23,'1014','0006',49400.0000,'2018-05-18'),(24,'1071','0001',95200.0000,'2018-05-20'),(25,'1016','0006',8600.0000,'2018-05-20'),(26,'1015','0003',8340.0000,'2018-05-20'),(27,'1014','0006',5000.0000,'2018-05-20'),(28,'1016','0003',6400.0000,'2018-05-21'),(29,'1047','0003',21200.0000,'2018-05-23'),(30,'1046','0004',3000.0000,'2018-05-23'),(31,'1046','0004',3000.0000,'2018-05-23'),(38,'1022','0009',240.0000,'2018-05-23'),(39,'1011','0003',15000.0000,'2018-05-24'),(40,'1010','0004',80.0000,'2018-06-01');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `proyecto`.`ventas_AFTER_INSERT` AFTER INSERT ON `ventas` FOR EACH ROW
BEGIN
	declare total int;
    declare total2 int;
    declare total3 double;
    declare IVA double;
    declare final int;
    
    select sum(monto) into total from ventas;
    update resumen set TotalVentas = total
    where id = 1;
    
    select count(NoVenta) into total2 from ventas;
    update resumen set NoOrdenes = total2
    where id = 1;
    
    set total3 = total/total2;
    
    update resumen set Ticket = total3
    where id = 1;
    
    set IVA = total*0.16;
    update resumen set IVA = IVA;
	
    set final = total - IVA;
    update resumen set VentasNetas = final
    where id = 1;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `proyecto`.`ventas_AFTER_DELETE` AFTER DELETE ON `ventas` FOR EACH ROW
BEGIN
	declare total int;
    declare total2 int;
    declare total3 double;
    declare IVA double;
    declare final int;
    
    select sum(monto) into total from ventas;
    update resumen set TotalVentas = total
    where id = 1;
    
    select count(NoVenta) into total2 from ventas;
    update resumen set NoOrdenes = total2
    where id = 1;
    
    set total3 = total/total2;
    
    update resumen set Ticket = total3
    where id = 1;
    
    set IVA = total*0.16;
    update resumen set IVA = IVA;
	
    set final = total - IVA;
    update resumen set VentasNetas = final
    where id = 1;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'proyecto'
--

--
-- Dumping routines for database 'proyecto'
--
/*!50003 DROP FUNCTION IF EXISTS `aumenta_stock` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `aumenta_stock`(nom text, suma int) RETURNS int(11)
    DETERMINISTIC
BEGIN
	update producto set stock = stock+suma 
    where nombre = nom;
RETURN 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `disminuye_stock` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `disminuye_stock`(nom text, resta int) RETURNS int(11)
    DETERMINISTIC
BEGIN
	update producto set stock = stock-resta
    where nombre = nom;
RETURN 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `RFC` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `RFC`(nombre text, apellido_pat text, apellido_mat text, fecha_nac date) RETURNS text CHARSET latin1
    DETERMINISTIC
BEGIN
	declare cadena_ape_pat text;
    declare cadena_ape_mat text;
    declare cadena_nom text;
    declare annio int;
    declare mes int;
    declare dia int;
    declare cadena_mes text;
    declare cadena_dia text;
    
    declare cadena_fecha text;
    
    declare numero_alea int;
    
    declare resu text; 
    
    -- Sirve para saber los primeros caracteres a la izquierda --
    set cadena_ape_pat = UPPER(left(apellido_pat,2));
    
    -- Verificamos si exise el ap materno --
    if length(apellido_mat) > 0 then
		set cadena_ape_mat = left(apellido_mat,1);
	else -- Si no existe, se agrega una x --
		set cadena_ape_mat = 'x';
	end if;
    set cadena_nom = left(nombre,1);
    
    set annio = year(fecha_nac);
    set dia = dayofmonth(fecha_nac);
    set mes = month(fecha_nac);
    
    if dia < 10 then
		set cadena_dia = concat('0', dia);
	else
		set cadena_dia = concat(dia);
	end if;
    
    if mes < 10 then
		set cadena_mes = concat('0', mes);
	else
		set cadena_mes = concat(mes);
	end if;
    
    set numero_alea = floor(rand()*1000);
    
    set cadena_fecha = concat(right(concat(annio),2), cadena_mes, cadena_dia);
    
    set resu = concat(cadena_ape_pat, cadena_ape_mat, cadena_nom, cadena_fecha, concat(numero_alea));
RETURN resu;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-02 11:03:07
