/*
MySQL Data Transfer
Source Host: localhost
Source Database: car4s
Target Host: localhost
Target Database: car4s
Date: 2013/3/5 23:15:15
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for apply_out
-- ----------------------------
DROP TABLE IF EXISTS `apply_out`;
CREATE TABLE `apply_out` (
  `apply_out_id` int(10) NOT NULL AUTO_INCREMENT,
  `apply_out_nameid` int(10) DEFAULT NULL,
  `apply_out_time` varchar(20) NOT NULL,
  `apply_out_destination` varchar(30) NOT NULL,
  `apply_out_needtimes` varchar(10) NOT NULL,
  `apply_out_reasons` text,
  `apply_out_state` int(5) DEFAULT NULL,
  `apply_out_needtools` text,
  `shenpi_out_nameid` int(10) DEFAULT NULL,
  `shenpi_out_advice` text,
  `shenpi_reuslt` varchar(5) DEFAULT NULL,
  `apply_read_state` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`apply_out_id`),
  KEY `app_out_name` (`apply_out_nameid`),
  KEY `shenpi_name` (`shenpi_out_nameid`),
  CONSTRAINT `apply_out_name` FOREIGN KEY (`apply_out_nameid`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `shenpi_out_name` FOREIGN KEY (`shenpi_out_nameid`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for apply_repare
-- ----------------------------
DROP TABLE IF EXISTS `apply_repare`;
CREATE TABLE `apply_repare` (
  `apply_repare_id` int(10) NOT NULL AUTO_INCREMENT,
  `apply_repare_name` int(10) NOT NULL,
  `apply_repare_time` varchar(20) NOT NULL,
  `apply_baoxiu_time` varchar(20) DEFAULT NULL,
  `repare_reasons` text,
  `user_package` int(10) NOT NULL,
  `repare_needtime` varchar(10) NOT NULL,
  `repare_plan` text,
  `apply_repare_state` int(5) NOT NULL,
  `shenpi_name` int(10) DEFAULT NULL,
  `shenpi_advice` text,
  `apply_result` varchar(20) DEFAULT NULL,
  `apply_read_state` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`apply_repare_id`),
  KEY `applyname` (`apply_repare_name`),
  KEY `shenpiname` (`shenpi_name`),
  KEY `user_package` (`user_package`),
  CONSTRAINT `applyname` FOREIGN KEY (`apply_repare_name`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `apply_repare_ibfk_1` FOREIGN KEY (`user_package`) REFERENCES `carpackage` (`package_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `shenpiname` FOREIGN KEY (`shenpi_name`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for apply_tools
-- ----------------------------
DROP TABLE IF EXISTS `apply_tools`;
CREATE TABLE `apply_tools` (
  `apply_tools_id` int(10) NOT NULL AUTO_INCREMENT,
  `apply_tools_name` int(10) NOT NULL,
  `repareshenpi` varchar(50) DEFAULT NULL,
  `apple_tools_time` varchar(20) DEFAULT NULL,
  `apply_repare_id` int(10) DEFAULT NULL,
  `shenpi_name` int(10) DEFAULT NULL,
  `apply_tools` varchar(100) NOT NULL,
  `apply_tools_state` int(5) NOT NULL,
  `apply_tools_results` varchar(20) DEFAULT NULL,
  `apply_tools_note` text,
  `apply_read_state` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`apply_tools_id`),
  KEY `apply_tools_name` (`apply_tools_name`),
  KEY `shenpi_name` (`shenpi_name`),
  KEY `weixiuid` (`apply_repare_id`),
  CONSTRAINT `apply_tools_ibfk_1` FOREIGN KEY (`apply_tools_name`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `apply_tools_ibfk_2` FOREIGN KEY (`shenpi_name`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `weixiuid` FOREIGN KEY (`apply_repare_id`) REFERENCES `apply_repare` (`apply_repare_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for baoyang
-- ----------------------------
DROP TABLE IF EXISTS `baoyang`;
CREATE TABLE `baoyang` (
  `baoyang_id` int(10) NOT NULL AUTO_INCREMENT,
  `car_name` int(10) NOT NULL,
  `baoyang_name` int(10) NOT NULL,
  `baoyang_time` varchar(50) DEFAULT NULL,
  `before_state` varchar(20) DEFAULT NULL,
  `baoyang_item` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`baoyang_id`),
  KEY `baouserid` (`car_name`),
  KEY `baoyang_name` (`baoyang_name`),
  CONSTRAINT `baoyang_ibfk_1` FOREIGN KEY (`baoyang_name`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ownerid` FOREIGN KEY (`car_name`) REFERENCES `carowner` (`owner_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for carowner
-- ----------------------------
DROP TABLE IF EXISTS `carowner`;
CREATE TABLE `carowner` (
  `owner_id` int(10) NOT NULL AUTO_INCREMENT,
  `ower_name` varchar(50) DEFAULT NULL,
  `ower_pwd` varchar(50) DEFAULT NULL,
  `ower_truename` varchar(50) NOT NULL,
  `ower_cartype` varchar(20) NOT NULL,
  `ower_sex` varchar(5) DEFAULT NULL,
  `ower_jop` varchar(50) DEFAULT NULL,
  `ower_telephone` varchar(20) NOT NULL,
  `ower_addr` varchar(50) NOT NULL,
  `use_package` int(10) DEFAULT NULL,
  `pack_effecttime` varchar(20) DEFAULT NULL,
  `account_left` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`owner_id`),
  KEY `ower_name` (`ower_name`),
  KEY `packageid` (`use_package`),
  CONSTRAINT `packageid` FOREIGN KEY (`use_package`) REFERENCES `carpackage` (`package_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for carpackage
-- ----------------------------
DROP TABLE IF EXISTS `carpackage`;
CREATE TABLE `carpackage` (
  `package_id` int(10) NOT NULL AUTO_INCREMENT,
  `package_name` varchar(50) DEFAULT NULL,
  `package_details` text,
  `package_maker` int(10) DEFAULT NULL,
  `package_time` varchar(10) DEFAULT NULL,
  `package_cost` int(10) DEFAULT NULL,
  PRIMARY KEY (`package_id`),
  KEY `package_name` (`package_name`),
  KEY `yuangongid` (`package_maker`),
  CONSTRAINT `yuangongid` FOREIGN KEY (`package_maker`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `order_type` tinyint(5) NOT NULL,
  `order_maker` varchar(50) NOT NULL,
  `order_note` text,
  `order_time` varchar(20) DEFAULT NULL,
  `order_arr_name` varchar(50) NOT NULL,
  `order_state` tinyint(5) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `makername` (`order_maker`),
  KEY `arrname` (`order_arr_name`),
  CONSTRAINT `arrname` FOREIGN KEY (`order_arr_name`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `makername` FOREIGN KEY (`order_maker`) REFERENCES `carowner` (`ower_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for repare
-- ----------------------------
DROP TABLE IF EXISTS `repare`;
CREATE TABLE `repare` (
  `weixd_id` int(10) NOT NULL AUTO_INCREMENT,
  `repare_name` varchar(50) NOT NULL,
  `car_name` varchar(50) NOT NULL,
  `repare_resons` varchar(255) NOT NULL,
  `repare_time` varchar(255) NOT NULL,
  `repare_plan` text NOT NULL,
  `repare_tools` varchar(200) NOT NULL,
  `repare_result` varchar(10) NOT NULL,
  `repare_sum` varchar(10) NOT NULL,
  `zhuguanname` varchar(50) NOT NULL,
  PRIMARY KEY (`weixd_id`),
  KEY `owername` (`car_name`),
  KEY `reparename` (`repare_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `truename` varchar(50) DEFAULT NULL,
  `right1` int(5) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `user_note` text,
  PRIMARY KEY (`userid`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `apply_out` VALUES ('1', '1', '2012-02-01', '河南郑州', '5天', '上门修车', '0', '保险杠；3个', null, '小心行事，以免功败垂成', '', '未读');
INSERT INTO `apply_out` VALUES ('2', '2', '555', '健康送', '5天', '顾客请求前去汽车液压器。。。。', '1', '保险杠；3个', '2', '感觉好看', '同意', '已读');
INSERT INTO `apply_out` VALUES ('3', '1', '555', '和第三个发', '5天', '顾客请求前去汽车液压器。。。。 ', '1', '保险杠；3个 ', '2', '谨慎办事，早去早回', '同意', '未读');
INSERT INTO `apply_out` VALUES ('4', '1', '777', '国大使馆', '3天', '公司仓库轮胎数量不足。。。。', '0', '保险杠；3个', null, '部分代表', null, '未读');
INSERT INTO `apply_out` VALUES ('5', '2', '555', '开了个店', '5天', ' fdgd ', '1', '保险杠；3个', null, '', '', '已读');
INSERT INTO `apply_out` VALUES ('6', '1', '555', '等手法', '5天', '将开工时间', '0', '保险杠；3个', null, '三都过结合上方的', '', '未读');
INSERT INTO `apply_out` VALUES ('7', '1', '555', '爱上', '5天', '和健康和空间', '0', '保险杠；3个', null, '会尽快汇款', '', '未读');
INSERT INTO `apply_out` VALUES ('8', '2', '', '河北石家庄', '5天', ' 地方很多', '0', '保险杠；3个', null, null, null, '未读');
INSERT INTO `apply_out` VALUES ('9', '2', '2013-02-22 15:46:35', '河北石家庄', '5天', ' truth', '0', null, null, null, null, '未读');
INSERT INTO `apply_repare` VALUES ('1', '4', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 宽度规划打开了', '0', null, null, null, '未读');
INSERT INTO `apply_repare` VALUES ('2', '1', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 大范甘迪', '0', null, null, null, '未读');
INSERT INTO `apply_repare` VALUES ('3', '1', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 空间和顾客', '1', '2', null, null, '未读');
INSERT INTO `apply_repare` VALUES ('4', '3', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 让他热帖', '0', null, null, null, '未读');
INSERT INTO `apply_repare` VALUES ('5', '3', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 打个广告', '1', '2', null, null, '已读');
INSERT INTO `apply_repare` VALUES ('6', '3', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 大股东', '1', '2', null, null, '已读');
INSERT INTO `apply_repare` VALUES ('7', '3', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', '健康双方都', '1', '2', null, null, '已读');
INSERT INTO `apply_repare` VALUES ('8', '3', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', '尽快恢复健康', '1', '2', null, null, '未读');
INSERT INTO `apply_repare` VALUES ('9', '3', '2012-01-03', '2012-01-02', '刹车失灵', '1', '2天', ' 让世人', '1', '2', null, null, '未读');
INSERT INTO `apply_repare` VALUES ('10', '3', '2013-01-29 14:42:58', '2013-01-28 14:42:54', '刹车失灵', '1', '2天', ' 环境发生的话', '1', '2', null, null, '已读');
INSERT INTO `apply_tools` VALUES ('1', '4', '申少博', '2012-06-25', '2', null, '保险杠:1个,股份:1个,', '0', null, null, '未读');
INSERT INTO `apply_tools` VALUES ('2', '1', '申少博', '2012-06-25', '2', null, '保险杠:1个,不错:1个,', '0', null, null, '未读');
INSERT INTO `apply_tools` VALUES ('3', '8', '申少博', '2012-06-25', '3', '7', '保险杠:1个,百分点:1个, ', '1', null, '请与2012-06-28日到仓库领取  ', '未读');
INSERT INTO `apply_tools` VALUES ('4', '2', '申少博', '2013-01-28 16:44:47', '3', null, '保险杠:1个,空间的官方能看见:1个,', '0', null, null, '未读');
INSERT INTO `baoyang` VALUES ('1', '2', '2', '1111', '正常', '刹车,洗车,洗车,');
INSERT INTO `baoyang` VALUES ('2', '2', '2', '22222', '正常', '轮胎,洗车,洗车,');
INSERT INTO `baoyang` VALUES ('3', '2', '2', '55555', '正常', '刹车,洗车,洗车,');
INSERT INTO `baoyang` VALUES ('4', '2', '2', '2013-01-28 09:08:06', '正常', '洗车,洗车,');
INSERT INTO `baoyang` VALUES ('5', '2', '2', '555', '正常', '洗车,洗车,');
INSERT INTO `baoyang` VALUES ('6', '2', '2', '555', '正常', '洗车,洗车,');
INSERT INTO `baoyang` VALUES ('7', '2', '2', '555', '正常', '洗车,');
INSERT INTO `carowner` VALUES ('1', '1232', '123', '杨元庆', '北京现代', '男', '联想董事长', '123123123', '北京市海淀区', '1', '2012-03-06', '2000');
INSERT INTO `carowner` VALUES ('2', '1231', '123', '刘军', '雪弗兰', '男', 'thinkpad负责人', '12311313213', '北京市朝阳区', '1', '2012-03-05', '3000');
INSERT INTO `carowner` VALUES ('3', '1233', '123', '董卿', '别克', '女', '中央电视台', '4564654646', '北京市东城区', '1', '2011-03-05', '1000');
INSERT INTO `carowner` VALUES ('8', '1235', '123', '??', '??A6', '?', '?????', '18237576163', '???????', '1', '2012-07-08', '1500?');
INSERT INTO `carowner` VALUES ('10', '1235', '123', '??', '??A6', '?', '?????', '18237576163', '???????', '1', '2012-07-08', '1500?');
INSERT INTO `carowner` VALUES ('11', '1235', '123', '???', '??A6', '?', '?????', '18237576163', '???????', '1', '2012-07-08', '1500?');
INSERT INTO `carowner` VALUES ('12', '1235', '123', '?三', '奥迪A6', '男', '平?山学院', '18237576163', '平?山市新?路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('13', '1235', '123', '?三', '奥迪A6', '男', '平?山学院', '18237576163', '平?山市新?路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('14', '1235', '123', '?三', '奥迪A6', '男', '平?山学院', '18237576163', '平?山市新?路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('15', '1235', '123', '?三', '奥迪A6', '男', '平?山学院', '18237576163', '平?山市新?路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('16', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('17', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('18', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('19', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('20', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('21', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('22', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('23', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('24', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('25', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('26', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('27', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('28', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('29', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('30', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('31', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('32', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('33', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('34', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('35', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('36', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('37', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('38', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('39', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('40', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('41', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('42', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('43', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('44', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('45', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('46', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('47', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('48', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('49', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('50', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('51', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('52', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('53', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('54', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('55', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('56', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('57', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('58', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('59', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('60', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('61', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('62', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('63', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('64', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('65', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('66', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('67', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('68', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('69', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('70', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('71', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('72', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carowner` VALUES ('73', '1235', '123', '张三', '奥迪A6', '男', '平顶山学院', '18237576163', '平顶山市新华路', '1', '2012-07-08', '1500元');
INSERT INTO `carpackage` VALUES ('1', '保养在身边', '一年付清5000员，一年之内随意洗车打蜡，任何时间都可进行保养', '2', '2012-01-01', '6000');
INSERT INTO `carpackage` VALUES ('9', '你好', ' 2', '1', '2012-09-05', '5000');
INSERT INTO `carpackage` VALUES ('10', '好得很', ' 3', '1', '2012-09-05', '5000');
INSERT INTO `carpackage` VALUES ('11', '牛叉', ' 2', '1', '2012-09-05', '5000');
INSERT INTO `carpackage` VALUES ('12', '彭冲', ' 22', '1', '2012-09-05', '5000');
INSERT INTO `carpackage` VALUES ('13', '号套餐', ' 5555', '1', '2012-09-05', '5000');
INSERT INTO `carpackage` VALUES ('14', '不错不错', '结合上规范和坚实的健康了圣诞节', '1', '2012-09-05', '5000');
INSERT INTO `carpackage` VALUES ('15', '保养在身边', ' 肯定将收购手机打开后果', '1', '2012-09-05', '5000');
INSERT INTO `repare` VALUES ('1', '张三', '李四', '刹车失灵', '', ' 规范和规范化', '保险杠:1个,', '更换液压器', '800元', '申少博');
INSERT INTO `repare` VALUES ('2', '张三', '李四', '刹车失灵', '', ' ', '保险杠:1个,fdhcf:1个,cbcv:1个,', '更换液压器', '800元', '申少博');
INSERT INTO `repare` VALUES ('3', '张三', '李四', '刹车失灵', '', ' tyutryuu', '保险杠:1个,terhert:1个,rtherht:1个,', '更换液压器', '800元', '申少博');
INSERT INTO `repare` VALUES ('4', '张三', '李四', '刹车失灵', '2013-02-21 13:48:27', ' 环境规划局', '保险杠:1个,得到:1个,', '更换液压器', '800元', '申少博');
INSERT INTO `user` VALUES ('1', '1240', '123', '小张', '1', '技术部', '技术不错');
INSERT INTO `user` VALUES ('2', '1230', '123', '小李', '0', '经理', '领导有方');
INSERT INTO `user` VALUES ('3', '1210', '123', '小周', '1', '技术部', '技术不错');
INSERT INTO `user` VALUES ('4', '1220', '123', '小曹', '1', '技术部', '技术不错');
INSERT INTO `user` VALUES ('5', '1220', null, null, null, null, null);
INSERT INTO `user` VALUES ('6', '1220', null, null, null, null, null);
INSERT INTO `user` VALUES ('7', '1230', null, null, null, null, null);
INSERT INTO `user` VALUES ('8', '1220', null, null, null, null, null);
