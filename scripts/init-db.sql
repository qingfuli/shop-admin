create table CELLPHONES(
       ID integer not null primary key,
       NAME varchar2(128),
       DESCRIPTION varchar2(1024),
       PRICE integer,                    -- 价格（单位分，整数）
       BRAND varchar2(64),    -- 品牌
       MODEL varchar2(64),    -- 型号
       OS varchar2(64),       -- 操作系统（IOS、Android、Windows Phone）
       CPUBRAND varchar2(64), -- CPU品牌（高通、联发科）
       RAM integer,            -- 内存（单位GB，整数）
       STORAGE integer,        -- 存储容量（单位GB，整数）
       COLOR varchar2(32)      -- 颜色
);

create sequence SEQ_CELLPHONES
       minValue 1
       maxValue 99999
       start with 1
       increment by 1
       cache 20
       order;
       
create or replace trigger TRI_CELLPHONES_ID
  before insert on CELLPHONES  
  for each row
declare
  nextid number;
begin
  IF :new.ID IS NULL or :new.ID=0 THEN
    select SEQ_CELLPHONES.nextval
    into nextid
    from sys.dual;
    :new.ID:=nextid;
  end if;
end TRI_CELLPHONES_ID;

-- 插入数据      
insert into CELLPHONES(NAME,DESCRIPTION,PRICE,BRAND,MODEL,OS,CPUBRAND,RAM,STORAGE,COLOR) 
       values('AppleiPhone X','iPhone X...',709900,'Apple','iPhone X','ios','A11',3,64,'深空灰');

insert into CELLPHONES(NAME,DESCRIPTION,PRICE,BRAND,MODEL,OS,CPUBRAND,RAM,STORAGE,COLOR)
       values('华为荣耀Play','华为荣耀Play...',199900,'华为（HUAWEI）','荣耀Play','Android','麒麟970',4,64,'幻夜黑');

insert into CELLPHONES(NAME,DESCRIPTION,PRICE,BRAND,MODEL,OS,CPUBRAND,RAM,STORAGE,COLOR)
       values('小米8SE','小米8SE...',179900,'小米（MI）','小米8 SE','Android','骁龙（Snapdragon)',6,64,'灰色');
select id, name, description, price, brand, model, os, cpubrand, ram, storage, color from cellphones
-- 管理员表
create table OPERATORS(
       ID int not null primary key,
       USERNAME varchar2(128) not null,
       PASSWORD varchar2(128) not null,
       LAST_LOGIN_TIME date,
       DESCRIPTION varchar2(1024)
);

create sequence SEQ_OPERATORS
       minValue 1
       maxValue 99999
       start with 1
       increment by 1
       cache 20
       order;
       
create trigger TRI_OPERATORS_ID 
       before insert on OPERATORS 
       for each row 
         declare nextid number;
         begin 
           if :new.ID is null or :new.ID = 0 then
             select SEQ_OPERATORS.Nextval 
             into nextid 
             from sys.dual;
             :new.ID := nextid;
           end if;
end TRI_OPERATORS_ID;
-- 用户表
create table USERS(
       ID int not null primary key,
       USERNAME varchar2(128) not null,
       PASSWORD varchar2(128) not null,
       DESCRIPTION varchar2(1024)
);

create sequence SEQ_USERS
       minValue 1
       maxValue 99999
       start with 1
       increment by 1
       cache 20
       order;
       
create trigger TRI_USERS_ID 
       before insert on USERS 
       for each row 
         declare nextid number;
         begin 
           if :new.ID is null or :new.ID = 0 then
             select SEQ_USERS.Nextval 
             into nextid 
             from sys.dual;
             :new.ID := nextid;
           end if;
end TRI_USERS_ID;

