create table Product_Master(
    ProducrNo varchar2(6),
    Description varchar2(15),
    ProfitPercentage int,
    UnitMeasure varchar2(10),
    QtyOnHand int,
    ReorderLVL int,
    SellPrice int,
    CostPrice int

);
insert into Product_Master values('P00001','1.44floppies',5,'Piece',200,50,350,250);
insert into Product_Master values('P03453','Monitors',6,'Piece',150,50,500,350);
insert into Product_Master values('P06734','Mouse',5,'Piece',100,20,600,450);
insert into Product_Master values('P07865','1.22floppy',5,'Piece',100,20,750,500);
insert into Product_Master values('P07885','Keyboard',2,'Piece',150,50,850,550);
insert into Product_Master values('P07965','CDDive',2.5,'Piece',80,30,700,450);
insert into Product_Master values('P07965','540HDD',4,'Piece',80,30,700,450);
insert into Product_Master values('P07965','1.44Drive',4,'Piece',70,30,300,175);
insert into Product_Master values('P08865','1.22Drive',5,'Piece',75,30,450,300);

