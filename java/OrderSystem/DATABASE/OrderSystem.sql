create database Mail

-- 用户表
CREATE TABLE User_Info (
    User_Id int PRIMARY KEY identity(1,1),
    User_Name varchar(20) NOT NULL,
    User_pwd varchar(6) NOT NULL,
    User_phone varchar(11) NOT NULL,
    User_Money Decimal(9,2) NOT NULL DEFAULT 3000,
    User_Date varchar(20) NOT NULL,
    User_vip int NOT NULL DEFAULT 0
)

-- 商品表
CREATE TABLE Commodity_Info (
    Commodity_Id int PRIMARY KEY identity(1,1),
    Commodity_name varchar(20) NOT NULL,
    Commodity_info varchar(50) NOT NULL,
    Commodity_price decimal(9,2) NOT NULL,
    Commodity_number int NOT NULL
)
-- 购物车表
CREATE TABLE Car_Info (
    Car_Id int PRIMARY KEY identity(1,1),
    Car_Commodity_Id int NOT NULL FOREIGN KEY (Car_Commodity_Id) REFERENCES Commodity_Info(Commodity_Id),
    Car_Commodity_number int NOT NULL,
    Car_user_Id int NOT NULL,
)
alter table Car_Info
add constraint FK_Car_Car_Commodity_Id
foreign key(Car_Commodity_Id) references Commodity_Info(Commodity_Id)
-- 向商品表添加测试数据
INSERT INTO Commodity_Info (Commodity_name, Commodity_info, Commodity_price, Commodity_number) VALUES
('商品1', '这是商品1的介绍', 100.00, 50),
('商品2', '这是商品2的介绍', 200.00, 30),
('商品3', '这是商品3的介绍', 150.00, 20),
('商品4', '这是商品4的介绍', 300.00, 10),
('商品5', '这是商品5的介绍', 80.00, 40);

select c.Car_Id,m.Commodity_name,c.Car_Commodity_number,m.Commodity_price, m.Commodity_price*c.Car_Commodity_number from Car_Info c, Commodity_Info m, User_Info u where u.User_Id = c.Car_user_Id
and c.Car_Commodity_Id = m.Commodity_Id

INSERT INTO User_Info (User_Name,User_pwd,User_phone,User_Money,User_Date,User_vip) VALUES()