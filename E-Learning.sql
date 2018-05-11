/*
Navicat MySQL Data Transfer

Source Server         : JSP_visit_database
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : E-Learning

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2018-04-28 19:06:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bookType
-- ----------------------------
DROP TABLE IF EXISTS `bookType`;
CREATE TABLE `bookType` (
  `bookId` int(12) NOT NULL AUTO_INCREMENT,
  `bookType` varchar(12) NOT NULL,
  PRIMARY KEY (`bookId`),
  KEY `bookType` (`bookType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookType
-- ----------------------------

-- ----------------------------
-- Table structure for directionType
-- ----------------------------
DROP TABLE IF EXISTS `directionType`;
CREATE TABLE `directionType` (
  `id` int(11) NOT NULL,
  `directionType` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of directionType
-- ----------------------------

-- ----------------------------
-- Table structure for infoResource
-- ----------------------------
DROP TABLE IF EXISTS `infoResource`;
CREATE TABLE `infoResource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picture` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `type` (`type`),
  CONSTRAINT `inforesource_ibfk_1` FOREIGN KEY (`type`) REFERENCES `infoType` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of infoResource
-- ----------------------------
INSERT INTO `infoResource` VALUES ('1', '/imgSource/youth0.jpg', '余生只待你 【青春】', '1');
INSERT INTO `infoResource` VALUES ('3', '/imgSource/youth1.jpg', '晚安我爱的人【青春】', '1');
INSERT INTO `infoResource` VALUES ('4', '/imgSource/youth2.jpg', '陪安东尼度过漫长岁月【青春】', '1');
INSERT INTO `infoResource` VALUES ('5', '/imgSource/youth3.jpg', '再,遇见【青春】', '1');
INSERT INTO `infoResource` VALUES ('6', '/imgSource/youth4.jpg', '杂的文【青春】', '1');
INSERT INTO `infoResource` VALUES ('7', '/imgSource/youth5.jpg', '惜流光【青春】', '1');
INSERT INTO `infoResource` VALUES ('8', '/imgSource/youth6.jpg', '杀手的礼物【青春】', '1');
INSERT INTO `infoResource` VALUES ('9', '/imgSource/youth7.jpg', '在成为平凡的大人前【青春】', '1');
INSERT INTO `infoResource` VALUES ('10', '/imgSource/biography0.jpg', '黄金家族【传记】', '2');
INSERT INTO `infoResource` VALUES ('11', '/imgSource/biography1.jpg', '崛起之沃伦巴菲特【传记】', '2');
INSERT INTO `infoResource` VALUES ('12', '/imgSource/biography2.jpg', '成功的失败者【传记】', '2');
INSERT INTO `infoResource` VALUES ('13', '/imgSource/biography3.jpg', '晏子春秋【传记】', '2');
INSERT INTO `infoResource` VALUES ('14', '/imgSource/biography4.jpg', '朱安传【传记】', '2');
INSERT INTO `infoResource` VALUES ('15', '/imgSource/biography5.jpg', '康熙传【传记】', '2');
INSERT INTO `infoResource` VALUES ('16', '/imgSource/biography6.jpg', '31天穿越罗布泊【传记】', '2');
INSERT INTO `infoResource` VALUES ('17', '/imgSource/biography7.jpg', '吴清源回忆录【传记】', '2');
INSERT INTO `infoResource` VALUES ('18', '/imgSource/bj0.jpg', '北京史【北京】', '3');
INSERT INTO `infoResource` VALUES ('19', '/imgSource/bj1.jpg', '北京历史文化【北京】', '3');
INSERT INTO `infoResource` VALUES ('20', '/imgSource/bj2.jpg', '老北京的趣闻传说【北京】', '3');
INSERT INTO `infoResource` VALUES ('21', '/imgSource/bj3.jpg', '北京的洋市民【北京】', '3');
INSERT INTO `infoResource` VALUES ('22', '/imgSource/bj4.jpg', '胡同里的姑奶奶【北京】', '3');
INSERT INTO `infoResource` VALUES ('23', '/imgSource/bj5.jpg', '北京历史地图集【北京】', '3');
INSERT INTO `infoResource` VALUES ('24', '/imgSource/bj6.jpg', '北京历史故事【北京】', '3');
INSERT INTO `infoResource` VALUES ('25', '/imgSource/bj7.jpg', '北京的隐秘角落【北京】', '3');
INSERT INTO `infoResource` VALUES ('26', '/imgSource/hz0.jpg', '杭州园林【杭州】', '4');
INSERT INTO `infoResource` VALUES ('27', '/imgSource/hz1.jpg', '杭州的水【杭州】', '4');
INSERT INTO `infoResource` VALUES ('28', '/imgSource/hz2.jpg', '郁达夫的杭州【杭州】', '4');
INSERT INTO `infoResource` VALUES ('29', '/imgSource/hz3.jpg', '杭州产业成长的逻辑【杭州】', '4');
INSERT INTO `infoResource` VALUES ('30', '/imgSource/hz4.jpg', '吃定你了杭州【杭州】', '4');
INSERT INTO `infoResource` VALUES ('31', '/imgSource/hz5.jpg', '杭州沦陷之前后【杭州】', '4');
INSERT INTO `infoResource` VALUES ('32', '/imgSource/hz6.jpg', '影响世界的杭州科学家【杭州】', '4');
INSERT INTO `infoResource` VALUES ('33', '/imgSource/hz7.jpg', '不一样的旅店【杭州】', '4');
INSERT INTO `infoResource` VALUES ('34', '/imgSource/finance0.jpg', '投资理财入门【经济】', '6');
INSERT INTO `infoResource` VALUES ('35', '/imgSource/finance1.jpg', '投资心理学【经济】', '6');
INSERT INTO `infoResource` VALUES ('36', '/imgSource/finance2.jpg', '管理学【经济】', '6');
INSERT INTO `infoResource` VALUES ('37', '/imgSource/finance3.jpg', '管理沟通【经济】', '6');
INSERT INTO `infoResource` VALUES ('38', '/imgSource/finance4.jpg', '巴菲特之道【经济】', '6');
INSERT INTO `infoResource` VALUES ('39', '/imgSource/finance5.jpg', '资本金融学【经济】', '6');
INSERT INTO `infoResource` VALUES ('40', '/imgSource/finance6.jpg', '蛛网【经济】', '6');
INSERT INTO `infoResource` VALUES ('41', '/imgSource/finance7.jpg', '投资的头号法则【经济】', '6');
INSERT INTO `infoResource` VALUES ('42', '/imgSource/IT0.jpg', 'C++ Primer Plus【IT】', '5');
INSERT INTO `infoResource` VALUES ('43', '/imgSource/IT1.jpg', 'IT项目管理【IT】', '5');
INSERT INTO `infoResource` VALUES ('44', '/imgSource/IT2.jpg', 'Qt编程快速入门【IT】', '5');
INSERT INTO `infoResource` VALUES ('45', '/imgSource/IT3.jpg', 'Linux私房菜【IT】', '5');
INSERT INTO `infoResource` VALUES ('46', '/imgSource/IT4.jpg', '程序员的成长课【IT】', '5');
INSERT INTO `infoResource` VALUES ('47', '/imgSource/IT5.jpg', 'Google运维解密【IT】', '5');
INSERT INTO `infoResource` VALUES ('48', '/imgSource/IT6.jpg', 'php和mysql开发【IT】', '5');
INSERT INTO `infoResource` VALUES ('49', '/imgSource/IT7.jpg', '大数据运营【IT】', '5');

-- ----------------------------
-- Table structure for infoType
-- ----------------------------
DROP TABLE IF EXISTS `infoType`;
CREATE TABLE `infoType` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of infoType
-- ----------------------------
INSERT INTO `infoType` VALUES ('1', '青春类书籍');
INSERT INTO `infoType` VALUES ('2', '传记类书籍');
INSERT INTO `infoType` VALUES ('3', '北京');
INSERT INTO `infoType` VALUES ('4', '杭州2');
INSERT INTO `infoType` VALUES ('5', 'IT');
INSERT INTO `infoType` VALUES ('6', '经济');
INSERT INTO `infoType` VALUES ('7', '');

-- ----------------------------
-- Table structure for interestBook
-- ----------------------------
DROP TABLE IF EXISTS `interestBook`;
CREATE TABLE `interestBook` (
  `userId` varchar(32) NOT NULL,
  `book1` varchar(12) DEFAULT NULL,
  `book2` varchar(12) DEFAULT NULL,
  `book3` varchar(12) DEFAULT NULL,
  KEY `userId` (`userId`),
  KEY `book1` (`book1`),
  KEY `book2` (`book2`),
  KEY `book3` (`book3`),
  CONSTRAINT `interestbook_ibfk_2` FOREIGN KEY (`book1`) REFERENCES `bookType` (`bookType`),
  CONSTRAINT `interestbook_ibfk_3` FOREIGN KEY (`book2`) REFERENCES `bookType` (`bookType`),
  CONSTRAINT `interestbook_ibfk_4` FOREIGN KEY (`book3`) REFERENCES `bookType` (`bookType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interestBook
-- ----------------------------
INSERT INTO `interestBook` VALUES ('364bfab7c84e4a8b98982ce667118147', null, null, null);
INSERT INTO `interestBook` VALUES ('0a5c057c82e14f839573edbf10c160e6', null, null, null);
INSERT INTO `interestBook` VALUES ('a7f7bac3a0bd483ab1998cf72c6129c7', null, null, null);

-- ----------------------------
-- Table structure for interestCity
-- ----------------------------
DROP TABLE IF EXISTS `interestCity`;
CREATE TABLE `interestCity` (
  `userId` varchar(32) NOT NULL,
  `city1` varchar(32) DEFAULT NULL,
  `city2` varchar(32) DEFAULT NULL,
  `city3` varchar(32) DEFAULT NULL,
  KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interestCity
-- ----------------------------
INSERT INTO `interestCity` VALUES ('364bfab7c84e4a8b98982ce667118147', null, null, null);
INSERT INTO `interestCity` VALUES ('0a5c057c82e14f839573edbf10c160e6', null, null, null);
INSERT INTO `interestCity` VALUES ('a7f7bac3a0bd483ab1998cf72c6129c7', null, null, null);

-- ----------------------------
-- Table structure for interestDirection
-- ----------------------------
DROP TABLE IF EXISTS `interestDirection`;
CREATE TABLE `interestDirection` (
  `userId` varchar(32) NOT NULL,
  `direction1` int(12) DEFAULT NULL,
  `direction2` int(12) DEFAULT NULL,
  `direction3` int(12) DEFAULT NULL,
  KEY `userId` (`userId`),
  KEY `direction1` (`direction1`),
  KEY `direction2` (`direction2`),
  KEY `direction3` (`direction3`),
  CONSTRAINT `interestdirection_ibfk_2` FOREIGN KEY (`direction1`) REFERENCES `directionType` (`id`),
  CONSTRAINT `interestdirection_ibfk_3` FOREIGN KEY (`direction2`) REFERENCES `directionType` (`id`),
  CONSTRAINT `interestdirection_ibfk_4` FOREIGN KEY (`direction3`) REFERENCES `directionType` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interestDirection
-- ----------------------------
INSERT INTO `interestDirection` VALUES ('364bfab7c84e4a8b98982ce667118147', null, null, null);
INSERT INTO `interestDirection` VALUES ('0a5c057c82e14f839573edbf10c160e6', null, null, null);
INSERT INTO `interestDirection` VALUES ('a7f7bac3a0bd483ab1998cf72c6129c7', null, null, null);

-- ----------------------------
-- Table structure for jobType
-- ----------------------------
DROP TABLE IF EXISTS `jobType`;
CREATE TABLE `jobType` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `job` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `job` (`job`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jobType
-- ----------------------------
INSERT INTO `jobType` VALUES ('2', 'java工程师');
INSERT INTO `jobType` VALUES ('4', 'UI设计师');
INSERT INTO `jobType` VALUES ('1', '前端工程师');
INSERT INTO `jobType` VALUES ('3', '安卓开发');
INSERT INTO `jobType` VALUES ('5', '数据库工程师');
INSERT INTO `jobType` VALUES ('6', '测试工程师');

-- ----------------------------
-- Table structure for searchContent
-- ----------------------------
DROP TABLE IF EXISTS `searchContent`;
CREATE TABLE `searchContent` (
  `userId` varchar(32) NOT NULL,
  `frontEndFoundation` int(12) DEFAULT '0',
  `frontEndAdvance` int(12) DEFAULT '0',
  `backEnd` int(12) DEFAULT '0',
  `mobileDevelop` int(12) DEFAULT '0',
  `database666` int(12) DEFAULT '0',
  `recentTechItem` int(12) DEFAULT '0',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of searchContent
-- ----------------------------
INSERT INTO `searchContent` VALUES ('0a5c057c82e14f839573edbf10c160e6', '0', '0', '0', '0', '0', '0');
INSERT INTO `searchContent` VALUES ('364bfab7c84e4a8b98982ce667118147', '106', '102', '103', '105', '101', '2');
INSERT INTO `searchContent` VALUES ('a7f7bac3a0bd483ab1998cf72c6129c7', '9', '0', '3', '1', '0', '2');

-- ----------------------------
-- Table structure for searchResource
-- ----------------------------
DROP TABLE IF EXISTS `searchResource`;
CREATE TABLE `searchResource` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `picture` varchar(64) NOT NULL,
  `title` varchar(32) NOT NULL,
  `details` varchar(2000) NOT NULL,
  `type` int(32) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of searchResource
-- ----------------------------
INSERT INTO `searchResource` VALUES ('1', '/imgSource/java01.jpg', 'Java入门第一季', '本教程从Java环境搭建、工具使用、基础语法开始，带你入门', '4');
INSERT INTO `searchResource` VALUES ('3', '/imgSource/java02.jpg', 'Java入门第二季', 'Java 面向对象编程基本实现原理，进一步探索 Java 世界的奥秘', '4');
INSERT INTO `searchResource` VALUES ('4', '/imgSource/java03.jpg', 'Java入门第三季', 'Java中你必须懂得常用技能，不容错过的精彩，快来加入吧', '4');
INSERT INTO `searchResource` VALUES ('5', '/imgSource/java04.jpg', '全面解析Java注解', '注解Java中的常用技能，通过实战演示注解在实际项目中的应用', '4');
INSERT INTO `searchResource` VALUES ('7', '/imgSource/java05.jpg', 'Java实现Base64加密', 'Java实现Base64加密，本课程是Java加解密必备的入门基础', '4');
INSERT INTO `searchResource` VALUES ('8', '/imgSource/java06.jpg', 'Java Socket应用---通信是这样练成的', '分享的是 Java 中的网络编程，使用Socket实现网络聊天通信', '4');
INSERT INTO `searchResource` VALUES ('9', '/imgSource/java07.jpg', '反射——Java高级开发必须懂的', '反射,Java高级开发必须要懂的知识点，学好Java高级课程的基础', '4');
INSERT INTO `searchResource` VALUES ('10', '/imgSource/java08.jpg', 'Java实现图片水印', '从实现图片添加单个文字水印开始，逐步深入，到批量添加水印功能', '4');
INSERT INTO `searchResource` VALUES ('11', '/imgSource/Android01.jpg', 'Android核心技术', '15天精讲精练Android核心技术', '5');
INSERT INTO `searchResource` VALUES ('13', '/imgSource/Android02.jpg', 'Android与H5互调', 'Java代码与H5代码相互调用的基本方法', '5');
INSERT INTO `searchResource` VALUES ('15', '/imgSource/Android03.jpg', 'Android Studio入门', '【第十五季】Android Studio入门及使用技巧', '5');
INSERT INTO `searchResource` VALUES ('16', '/imgSource/Android04.jpg', 'Android万能播放器', '【第十二季】30分钟打造Android万能播放器', '5');
INSERT INTO `searchResource` VALUES ('17', '/imgSource/Android05.jpg', 'Android从入门到实战', '【第六季】20天Android从入门到实战', '5');
INSERT INTO `searchResource` VALUES ('18', '/imgSource/Android06.jpg', 'Android高薪就业', '【第十三季】Android高薪就业攻略', '5');
INSERT INTO `searchResource` VALUES ('19', '/imgSource/Android07.jpg', 'Android应用', '【第九季】开发你的第一个Android应用-来电拦截专家', '5');
INSERT INTO `searchResource` VALUES ('20', '/imgSource/Android08.jpg', 'Android与H5互调', '【第十六季】玩转Android与H5互调', '5');
INSERT INTO `searchResource` VALUES ('21', '/imgSource/mongoDB.png', 'MongoDB夯实基础', 'MongoDB 是使用最广泛的 NoSQL 数据库之一，在实际项目中应用也越来越广。', '6');
INSERT INTO `searchResource` VALUES ('22', '/imgSource/css01.jpg', 'HTML+CSS基础', '103集实战教学入门必备', '2');
INSERT INTO `searchResource` VALUES ('23', '/imgSource/css02.jpg', '系统讲解CSS工作应用', 'CSS是前端的看家本领之一 ，从实际工作需求角度出发带你吃透CSS知识体系！', '2');
INSERT INTO `searchResource` VALUES ('24', '/imgSource/css03.jpg', 'CSS3特效实战', '幽灵按钮、翻书效果、饼状图', '2');
INSERT INTO `searchResource` VALUES ('25', '/imgSource/css04.jpg', 'CSS Sprite图应用', '必学的大型网站实用技术，让你快速掌握CSS Sprite雪碧图技术', '2');
INSERT INTO `searchResource` VALUES ('26', '/imgSource/css05.jpg', 'CSS深入理解之margin', '本CSS教程带你深入讲解CSS的margin属性，解决你多年困惑', '2');
INSERT INTO `searchResource` VALUES ('28', '/imgSource/css06.jpg', 'css3', '全面剖析css3', '2');
INSERT INTO `searchResource` VALUES ('29', '/imgSource/css07.jpg', 'css禅意花园', 'css设计领域经典例子禅意花园，36个设计让你彻底了解css', '2');
INSERT INTO `searchResource` VALUES ('30', '/imgSource/css08.jpg', '重拾CSS的乐趣', '开发中使用CSS时的一些经验感悟，魔法哥带你玩儿转有乐趣的CSS', '2');
INSERT INTO `searchResource` VALUES ('31', '/imgSource/angular.png', 'AngularJS入门', 'AngularJS基本语法，双向数据绑定，指令，表达式，MVC，MVVM, 模块对象，控制器对象，作用域对象等知识点。', '7');
INSERT INTO `searchResource` VALUES ('32', '/imgSource/angular0.jpg', 'Angular CLI基础', '', '7');
INSERT INTO `searchResource` VALUES ('33', '/imgSource/angular1.jpg', 'AngularJS表单验证', '', '7');
INSERT INTO `searchResource` VALUES ('34', '/imgSource/angular2.jpg', 'AngularJS实战', '', '7');
INSERT INTO `searchResource` VALUES ('35', '/imgSource/angular3.jpg', '阿里懒懒交流会', '', '7');
INSERT INTO `searchResource` VALUES ('36', '/imgSource/angular4.jpg', 'AngularJS开发Web应用', '', '7');
INSERT INTO `searchResource` VALUES ('37', '/imgSource/react0.jpg', 'React组件', '', '8');
INSERT INTO `searchResource` VALUES ('38', '/imgSource/react1.jpg', 'React构建播放器', '', '8');
INSERT INTO `searchResource` VALUES ('39', '/imgSource/react3.jpg', 'Redux技术流', '', '8');
INSERT INTO `searchResource` VALUES ('40', '/imgSource/react2.jpg', 'ReactNative入门', '', '8');
INSERT INTO `searchResource` VALUES ('41', '/imgSource/react4.jpg', 'React入门', '', '8');
INSERT INTO `searchResource` VALUES ('42', '/imgSource/python0.jpg', 'python-collections', '', '9');
INSERT INTO `searchResource` VALUES ('43', '/imgSource/python1.jpg', 'Python全栈案例', '', '9');
INSERT INTO `searchResource` VALUES ('44', '/imgSource/python2.jpg', 'Python自动化运维', '', '9');
INSERT INTO `searchResource` VALUES ('45', '/imgSource/python3.jpg', 'Python-web开发', '', '9');
INSERT INTO `searchResource` VALUES ('46', '/imgSource/python4.jpg', 'Python-面向对象', '', '9');
INSERT INTO `searchResource` VALUES ('47', '/imgSource/c0.jpg', 'C语言结构体', '', '10');
INSERT INTO `searchResource` VALUES ('48', '/imgSource/c1.jpg', 'C语言指针与内存', '', '10');
INSERT INTO `searchResource` VALUES ('49', '/imgSource/c2.jpg', 'C语言编程基本原理', '', '10');
INSERT INTO `searchResource` VALUES ('50', '/imgSource/c3.jpg', 'C语言入门', '', '10');
INSERT INTO `searchResource` VALUES ('51', '/imgSource/MongoDB0.jpg', 'MongoDB复制集监控', '', '6');
INSERT INTO `searchResource` VALUES ('52', '/imgSource/MongoDB1.jpg', 'MongoDB容灾核心选举', '', '6');
INSERT INTO `searchResource` VALUES ('53', '/imgSource/MongoDB2.jpg', 'MongoDB同步机制', '', '6');
INSERT INTO `searchResource` VALUES ('54', '/imgSource/MongoDB3.jpg', 'MongoDB搭建复制集', '', '6');
INSERT INTO `searchResource` VALUES ('55', '/imgSource/MongoDB4.jpg', 'MongoDB入门', '', '6');
INSERT INTO `searchResource` VALUES ('56', '/imgSource/mysql0.jpg', 'MySQL复制功能实战', '', '11');
INSERT INTO `searchResource` VALUES ('57', '/imgSource/mysql1.jpg', 'MySQL5.7新特性', '', '11');
INSERT INTO `searchResource` VALUES ('58', '/imgSource/mysql2.jpg', 'MySQL开发技巧', '', '11');
INSERT INTO `searchResource` VALUES ('59', '/imgSource/mysql3.jpg', 'MySQL性能优化', '', '11');
INSERT INTO `searchResource` VALUES ('60', '/imgSource/mysql4.jpg', 'MyCAT入门与应用', '', '11');
INSERT INTO `searchResource` VALUES ('61', '/imgSource/big0.jpg', 'Hadoop基础演练', '', '12');
INSERT INTO `searchResource` VALUES ('62', '/imgSource/big1.jpg', 'ElasticStack入门', '', '12');
INSERT INTO `searchResource` VALUES ('63', '/imgSource/big2.jpg', 'AWS云计算', '', '12');
INSERT INTO `searchResource` VALUES ('64', '/imgSource/big3.jpg', 'ElasticSearch入门', '', '12');
INSERT INTO `searchResource` VALUES ('65', '/imgSource/big4.jpg', 'HBase入门', '', '12');
INSERT INTO `searchResource` VALUES ('66', '/imgSource/UI0.jpg', 'Sketch入门', '', '13');
INSERT INTO `searchResource` VALUES ('67', '/imgSource/UI1.jpg', 'UI版式设计', '', '13');
INSERT INTO `searchResource` VALUES ('68', '/imgSource/UI2.jpg', '移动UI设计基础', '', '13');
INSERT INTO `searchResource` VALUES ('69', '/imgSource/UI3.jpg', 'Axure入门', '', '13');
INSERT INTO `searchResource` VALUES ('70', '/imgSource/UI4.jpg', 'Web-UI设计', '', '13');
INSERT INTO `searchResource` VALUES ('71', '/imgSource/test0.jpg', '游戏测试入门', '', '14');
INSERT INTO `searchResource` VALUES ('72', '/imgSource/test1.jpg', '自动化测试框架', '', '14');
INSERT INTO `searchResource` VALUES ('73', '/imgSource/test2.jpg', '手游安全测试', '', '14');
INSERT INTO `searchResource` VALUES ('74', '/imgSource/test3.jpg', '如何写好测试用例', '', '14');
INSERT INTO `searchResource` VALUES ('75', '/imgSource/test4.jpg', '接口测试基础', '', '14');
INSERT INTO `searchResource` VALUES ('76', '/imgSource/intelligence0.jpg', '人工智能常用库Numpy', '', '15');
INSERT INTO `searchResource` VALUES ('77', '/imgSource/intelligence1.jpg', '神经网络简介', '', '15');
INSERT INTO `searchResource` VALUES ('78', '/imgSource/intelligence2.jpg', '人工智能之机器学习', '', '15');
INSERT INTO `searchResource` VALUES ('79', '/imgSource/intelligence3.jpg', '机器学习理论篇', '', '15');
INSERT INTO `searchResource` VALUES ('80', '/imgSource/intelligence4.jpg', '人工智能之线性回归', '', '15');

-- ----------------------------
-- Table structure for technologyType
-- ----------------------------
DROP TABLE IF EXISTS `technologyType`;
CREATE TABLE `technologyType` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `technology` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`technology`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of technologyType
-- ----------------------------
INSERT INTO `technologyType` VALUES ('1', 'html');
INSERT INTO `technologyType` VALUES ('2', 'css');
INSERT INTO `technologyType` VALUES ('3', 'javascript');
INSERT INTO `technologyType` VALUES ('4', 'java');
INSERT INTO `technologyType` VALUES ('5', 'android');
INSERT INTO `technologyType` VALUES ('6', 'mongodb');
INSERT INTO `technologyType` VALUES ('7', 'angularjs');
INSERT INTO `technologyType` VALUES ('8', 'react');
INSERT INTO `technologyType` VALUES ('9', 'python');
INSERT INTO `technologyType` VALUES ('10', 'c');
INSERT INTO `technologyType` VALUES ('11', 'mysql');
INSERT INTO `technologyType` VALUES ('12', '大数据');
INSERT INTO `technologyType` VALUES ('13', 'UI设计');
INSERT INTO `technologyType` VALUES ('14', '测试');
INSERT INTO `technologyType` VALUES ('15', '人工智能');

-- ----------------------------
-- Table structure for userInfo
-- ----------------------------
DROP TABLE IF EXISTS `userInfo`;
CREATE TABLE `userInfo` (
  `id` varchar(32) NOT NULL,
  `email` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `headPortrait` varchar(255) DEFAULT NULL,
  `trueName` varchar(32) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `graduatedSchool` varchar(32) DEFAULT NULL,
  `job` varchar(32) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `job` (`job`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userInfo
-- ----------------------------
INSERT INTO `userInfo` VALUES ('0a5c057c82e14f839573edbf10c160e6', 'hcc', '123456', null, null, null, null, null, null, '0');
INSERT INTO `userInfo` VALUES ('364bfab7c84e4a8b98982ce667118147', 'zrw402@qq.com', '123456', null, 'zrw', 'M', '2018-04-12', 'zjnu', 'student', '1');
INSERT INTO `userInfo` VALUES ('a7f7bac3a0bd483ab1998cf72c6129c7', 'hccfighting@gmail.com', '123456', null, 'hcc', 'F', '2018-04-15', 'zjbangbangda', 'student', '1');
