use sappusavari_db;

/* add roles */
INSERT INTO `sappusavari_db`.`user_role` (`userRoleId`, `authority`) VALUES (1, 'ROLE_ADMIN');
INSERT INTO `sappusavari_db`.`user_role` (`userRoleId`, `authority`) VALUES (2, 'ROLE_USER');

/* add users */
INSERT INTO `sappusavari_db`.`users` (`userId`, `activeStatus`, `address`, `dateOfBirth`, `firstName`, `homeNo`, `lastName`, `mobileNo`, `password`, `username`, `workNo`) VALUES ('1', '1', 'Galle', '1-1-1', 'isuru', '123', 'dewasurendra', '123', '123', 'isuru@gmail.com', '123');

/* add user roles */
INSERT INTO `sappusavari_db`.`system_user_role` (`systemUserRoleId`, `user_userId`, `userRole_userRoleId`) VALUES ('1', '1', '1');
INSERT INTO `sappusavari_db`.`system_user_role` (`systemUserRoleId`, `user_userId`, `userRole_userRoleId`) VALUES ('2', '1', '2');

/* add district list */
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('1', 'Ampara', '063');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('2', 'Anuradhapura', '025');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('3', 'Avissawella', '036');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('4', 'Badulla', '055');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('5', 'Bandarawela', '057');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('6', 'Batticaloa', '065');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('7', 'Chilaw', '032');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('8', 'Colombo', '011');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('9', 'Galle', '091');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('10', 'Hambantota', '047');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('11', 'Hatton', '051');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('12', 'Jaffna', '021');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('13', 'Kalmunai', '067');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('14', 'Kalutara', '034');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('15', 'Kandy', '081');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('16', 'Kegalle', '035');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('17', 'Kurunegala', '037');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('18', 'Mannar', '023');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('19', 'Matale', '066');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('20', 'Matara', '041');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('21', 'Nawalapitiya', '054');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('22', 'Negombo', '031');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('23', 'Nuwara Eliya', '052');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('24', 'Panadura', '038');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('25', 'Polonnaruwa', '027');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('26', 'Ratnapura', '045');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('27', 'Trincomalee', '026');
INSERT INTO `sappusavari_db`.`districts` (`districtId`, `districtName`, `districtTelCode`) VALUES ('28', 'Vavuniya', '024');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('1','Akkarepattu','1');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('2','Ampara','1');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('3','Kalmunai','1');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('4','Sainthamaturutha','1');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('5','Adalaichenai','1');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('6','Other','1');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('7','Anuradhapura','2');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('8','Kekirawa','2');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('9','Tambuttegama','2');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('10','Eppawala','2');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('11','Nochchiyagama','2');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('12','Other','2');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('13','Avissawella','3');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('14','Other','3');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('15','Badulla','4');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('16','Welimada','4');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('17','Mahiyanganaya','4');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('18','Diyatalawa','4');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('19','Other','4');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('20','Badarawela','5');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('21','Other','5');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('22','Batticaloa','6');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('23','Kattankudi','6');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('24','Valaichenai','6');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('25','Eravur','6');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('26','Kaluwanchikudi','6');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('27','Other','6');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('28','Chilaw','7');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('29','Other','7');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('30','Akarawita','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('31','Akuregoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('32','Angoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('33','Athurugiriya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('34','Avissawella','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('35','Batawala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('36','Battaramulla','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('37','Batugampola','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('38','Bellanwila','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('39','Bokundara','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('40','Bope','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('41','Boralesgamuwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('42','Colombo 1','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('43','Colombo 10','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('44','Colombo 11','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('45','Colombo 12','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('46','Colombo 13','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('47','Colombo 14','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('48','Colombo 15','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('49','Colombo 2','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('50','Colombo 3','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('51','Colombo 4','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('52','Colombo 5','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('53','Colombo 7','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('54','Colombo 8','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('55','Colombo 9','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('56','Dedigamuwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('57','Deltara','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('58','Ethul Kotte','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('59','Gangodawilla','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('60','Godagama','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('61','Gonapola','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('62','Gothatuwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('63','Habarakada','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('64','Handapangoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('65','Hanwella','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('66','Hewainna','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('67','Hiripitya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('68','Hokandara','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('69','Horagala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('70','Ingiriya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('71','Jalthara','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('72','Kaduwela','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('73','Kahathuduwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('74','Kahawala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('75','Kalatuwawa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('76','Kaluaggala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('77','Kalubowila','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('78','Katubedda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('79','Kelaniya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('80','Kesbewa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('81','Kiriwattuduwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('82','Kohuwala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('83','Kolonnawa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('84','Kosgama','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('85','Koswatta','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('86','Kotikawatta','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('87','Kottawa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('88','Kotte','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('89','Madapatha','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('90','Madiwela','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('91','Malabe','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('92','Maradana','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('93','Mattegoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('94','Meegoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('95','Meepe','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('96','Mirihana','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('97','Moragahahena','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('98','Moraketiya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('99','Moratuwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('100','Mount Lavinia','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('101','Mullegama','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('102','Mulleriyawa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('103','Napawela','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('104','Navagamuwa','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('105','Nawala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('106','Padukka','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('107','Pannipitiya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('108','Pelawatta','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('109','Peliyagoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('110','Pepiliyana','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('111','Piliyandala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('112','Pita Kotte','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('113','Pitipana Homagama','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('114','Polgasowita','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('115','Puwakpitiya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('116','Rajagiriya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('117','Ranala','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('118','Ratmalana','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('119','Siddamulla','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('120','Sri Jayawardenapura Kotte','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('121','Talawatugoda','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('122','Thalapathpitiya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('123','Thimbirigasyaya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('124','Thummodara','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('125','Waga','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('126','Watareka','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('127','Weliwita','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('128','Wellampitiya','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('129','Wellawatte','8');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('130','Other','8');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('131','Galle','9');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('132','Ambalangoda','9');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('133','Elpitiya','9');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('134','Hikkaduwa','9');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('135','Baddegama','9');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('136','Other','9');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('137','Tangalla','10');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('138','Beliatta','10');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('139','Ambalantota','10');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('140','Tissamaharama','10');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('141','Hambantota','10');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('142','Other','10');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('143','Hatton','11');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('144','Other','11');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('145','Jaffna','12');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('146','Nallur','12');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('147','Chavakachcheri','12');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('148','Point Pedro','12');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('149','Manipay','12');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('150','Other','12');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('151','Kalmunai','13');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('152','Other','13');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('153','Kalutara','14');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('154','Other','14');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('155','Kandy','15');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('156','Katugastota','15');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('157','Gampola','15');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('158','Peradeniya','15');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('159','Akurana','15');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('160','Other','15');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('161','Kegalle','16');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('162','Mawanella','16');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('163','Warakapola','16');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('164','Rabukkana','16');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('165','Ruwanwella','16');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('166','Other','16');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('167','Mannar','17');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('168','Nanattan','17');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('169','Murunkan','17');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('170','Chilavathurai','17');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('171','Adampan','17');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('172','Other','17');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('173','Matale','18');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('174','Dambulla','18');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('175','Galewela','18');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('176','Ukuwela','18');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('177','Palapathwela','18');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('178','Other','18');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('179','Matara','19');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('180','Weligama','19');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('181','Akuressa','19');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('182','Dikwella','19');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('183','Hakmana','19');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('184','Other','19');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('185','Nawalapitiya','20');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('186','Other','20');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('187','Negombo','21');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('188','Other','21');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('189','Nuwara Eliiya','22');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('190','Ginigathhena','22');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('191','Kotmale','22');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('192','Talawakele','22');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('193','Other','22');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('194','Panadura','23');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('195','Other','23');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('196','Polonnaruwa','24');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('197','Higurakgoda','24');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('198','Kaduruwela','24');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('199','Medirigiriya','24');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('200','Jayasiripura','24');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('201','Other','24');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('202','Ratnapura','25');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('203','Embilipitiya','25');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('204','Balangoda','25');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('205','Eheliyagoda','25');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('206','Kuruwita','25');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('207','Other','25');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('208','Trincomalee','26');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('209','Kinniya','26');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('210','Kantalai','26');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('211','Chinabay','26');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('212','Nilaveli','26');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('213','Other','26');

INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('214','Vavuniya South','27');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('215','Vavuniya North','27');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('216','Cheddikulam','27');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('217','Omanthai','27');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('218','Kilinochchi','27');
INSERT INTO `sappusavari_db`.`popular_areas` (`areaId`, `areaName`, `district_districtId`) VALUES ('219','Other','27');

/* add product category list */
INSERT INTO `sappusavari_db`.`product_categories` (`productCategoryId`, `categoryName`) VALUES ('1', 'ELECTRONICS');
INSERT INTO `sappusavari_db`.`product_categories` (`productCategoryId`, `categoryName`) VALUES ('2', 'VEHICLE');
INSERT INTO `sappusavari_db`.`product_categories` (`productCategoryId`, `categoryName`) VALUES ('3', 'PROPERTY');
INSERT INTO `sappusavari_db`.`product_categories` (`productCategoryId`, `categoryName`) VALUES ('4', 'OTHER');

/* add product sub category list */
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('1', 'MOBILEPHONE', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('2', 'MOBILEPHONEACCESSORIES', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('3', 'COMPUTER', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('4', 'COMPUTERACCESSORIES', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('5', 'TV', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('6', 'CAMERA', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('7', 'AUDIO', '1');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('8', 'OTHER', '1');

INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('9', 'CAR', '2');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('10', 'MOTORBIKE', '2');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('11', 'THREEWHEELER', '2');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('12', 'VANBUS', '2');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('13', 'AUTOPART', '2');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('14', 'OTHER', '2');

INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('15', 'LAND', '3');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('16', 'HOUSE', '3');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('17', 'APARTMENT', '3');
INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('18', 'OTHER', '3');

INSERT INTO `sappusavari_db`.`product_sub_categories` (`productSubCategoryId`, `subCategoryName`, `productCategory_productCategoryId`) VALUES ('19', 'OTHER', '4');







