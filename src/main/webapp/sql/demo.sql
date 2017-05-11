CREATE TABLE `user` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(45) DEFAULT NULL,
    `gender` varchar(4) DEFAULT '男',
    `age` int(11) DEFAULT 0,
    `phone` varchar(15) NOT NULL,
    `email` varchar(45) DEFAULT NULL,
    `major` varchar(20) DEFAULT NULL,
    `school` varchar(45) DEFAULT NULL,
    `address` varchar(200) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `id_UNIQUE` (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

select  id, name ,phone from user;