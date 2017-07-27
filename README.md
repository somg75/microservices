# microservices


CREATE TABLE `msadb`.`item` (
  `item_id` INT(10) NOT NULL AUTO_INCREMENT,
  `item_name` VARCHAR(100) NOT NULL,
  `item_category` VARCHAR(100) NOT NULL,
  `item_sku` VARCHAR(50) NOT NULL,
  `item_manufacturer` VARCHAR(100) NULL DEFAULT 'NA',
  `itm_mrp` INT NULL DEFAULT 0,
  PRIMARY KEY (`item_id`))
COMMENT = '	';


CREATE TABLE `msadb`.`item_review` (
  `item_review_id` INT(10) NOT NULL AUTO_INCREMENT,
  `item_id` INT(10) NOT NULL,
  `item_review_comment` VARCHAR(500) NULL,
  `item_reviewer_name` VARCHAR(45) NOT NULL,
  `item_review_date` DATETIME NOT NULL,
  `item_review_rating` TINYINT(5) NULL,
  PRIMARY KEY (`item_review_id`),
  INDEX `item_to_review_fk_idx` (`item_id` ASC),
  CONSTRAINT `item_to_review_fk`
    FOREIGN KEY (`item_id`)
    REFERENCES `msadb`.`item` (`item_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
Hystrix:
http://localhost:8701/hystrix

Eureka:
http://localhost:8761/
