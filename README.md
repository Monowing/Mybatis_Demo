# Mybatis_Demo
springboot整合Mybatis简单demo


#数据库为mybatis_demo

创建数据：


-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'laowang', '112233');
INSERT INTO `tb_user` VALUES ('2', 'laoli', '123456');
INSERT INTO `tb_user` VALUES ('3', 'clg', '123456');
INSERT INTO `tb_user` VALUES ('4', '1clg1', '123456');
INSERT INTO `tb_user` VALUES ('5', 'clg2', '123456');
