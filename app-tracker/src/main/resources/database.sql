CREATE TABLE `app-tracker`.`user_info` (
 UserId int primary key auto_increment,
Email varchar(255) unique not null,
UserName varchar(255) unique not null,
PasswordHash varchar(255) not null,
RegDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
LastLogin TIMESTAMP,
Activr BOOLEAN DEFAULT true
);

insert into app_tracker.user_credentials(UserId,Email,UserName,PasswordHash,RegDate,Active) values ('1','radhika','842046@cognizant.com','radhika23',current_date(),true);

select * from user_info;