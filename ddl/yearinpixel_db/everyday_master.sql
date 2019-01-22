CREATE TABLE `yearinpixel_db.everyday_master` (
  `user_id` smallint(5) unsigned NOT NULL,
  `color` tinyint(4) NOT NULL,
  `today` date NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`,`today`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;