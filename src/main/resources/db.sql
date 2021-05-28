CREATE TABLE `university`.`groups`
(
    `group_id` INT         NOT NULL AUTO_INCREMENT,
    `gr_name`  VARCHAR(45) NULL,
    PRIMARY KEY (`group_id`)
);

INSERT INTO `university`.`groups` (`group_id`, `gr_name`)
VALUES ('1', 'D');
INSERT INTO `university`.`groups` (`group_id`, `gr_name`)
VALUES ('2', 'S');

CREATE TABLE `university`.`students`
(
    `id`           INT         NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(45) NULL,
    `surname`      VARCHAR(45) NULL,
    `phone_number` VARCHAR(20) NULL,
    `group_id`     INT         NULL,
    PRIMARY KEY (`id`)
);

ALTER TABLE `university`.`students`
    ADD CONSTRAINT `gk`
        FOREIGN KEY (`group_id`)
            REFERENCES `university`.`groups` (`group_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION;


INSERT INTO `university`.`students` (`id`, `name`, `surname`, `phone_number`, `group_id`)
VALUES ('1', 'FFF', 'w45uyh', '322223322', '1');
INSERT INTO `university`.`students` (`id`, `name`, `surname`, `phone_number`, `group_id`)
VALUES ('2', 'dsdfs', 'rthyhy', '231456', '1');
INSERT INTO `university`.`students` (`id`, `name`, `surname`, `phone_number`, `group_id`)
VALUES ('3', 'sdfg', 'thty6tf', '1234567890', '2');


CREATE TABLE `university`.`faculty`
(
    `faculty_id`           INT          NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(255) NULL,
    `phone_number` VARCHAR(20)  NULL,
    `group_id`     INT          NULL,
    PRIMARY KEY (`faculty_id`),
    CONSTRAINT `fk`
        FOREIGN KEY (`group_id`)
            REFERENCES `university`.`groups` (`group_id`)
            ON DELETE RESTRICT
            ON UPDATE RESTRICT
);

INSERT INTO `university`.`faculty` (`faculty_id`, `name`, `phone_number`, `group_id`) VALUES ('1', 'a', '3445', '1');
INSERT INTO `university`.`faculty` (`faculty_id`, `name`, `phone_number`, `group_id`) VALUES ('2', 'b', '34567', '2');