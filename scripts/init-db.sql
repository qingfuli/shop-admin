create table CELLPHONES(
       ID integer not null primary key,
       NAME varchar2(128),
       DESCRIPTION varchar2(1024),
       PRICE integer                     -- 价格（单位分，整数）
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

create table CELLPHONE_DETAILS(
       CELLPHONE_ID integer not null primary key,
       BRAND varchar2(128),    -- 品牌
       MODEL varchar2(128),    -- 型号
       OS varchar2(128),       -- 操作系统（IOS、Android、Windows Phone）
       CPUBRAND varchar2(128), -- CPU品牌（高通、联发科）
       RAM integer,            -- 内存（单位GB，整数）
       STORAGE integer,        -- 存储容量（单位GB，整数）
       COLOR varchar2(32)      -- 颜色
);

alter table CELLPHONE_DETAILS
      add constraint FK_CELLPHONE_DET_CELLPHONES foreign key (CELLPHONE_ID)
      references CELLPHONES (ID);
      
insert into CELLPHONES(NAME,DESCRIPTION,PRICE) values('AppleiPhone X','iPhone X...',709900);
insert into CELLPHONE_DETAILS(CELLPHONE_ID,BRAND,MODEL,OS,CPUBRAND,RAM,STORAGE,COLOR) 
       values(1,'Apple','iPhone X','ios','A11',3,64,'深空灰');

insert into CELLPHONES(NAME,DESCRIPTION,PRICE) values('华为荣耀Play','华为荣耀Play...',199900);
insert into CELLPHONE_DETAILS(CELLPHONE_ID,BRAND,MODEL,OS,CPUBRAND,RAM,STORAGE,COLOR) 
       values(2,'华为（HUAWEI）','荣耀Play','Android','A11',4,64,'幻夜黑');

insert into CELLPHONES(NAME,DESCRIPTION,PRICE) values('小米8SE','小米8SE...',179900);
insert into CELLPHONE_DETAILS(CELLPHONE_ID,BRAND,MODEL,OS,CPUBRAND,RAM,STORAGE,COLOR) 
       values(3,'小米（MI）','小米8 SE','Android','骁龙（Snapdragon)',6,64,'灰色');
       
