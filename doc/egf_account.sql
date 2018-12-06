/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/11/10 22:26:53                          */
/*==============================================================*/


/*==============================================================*/
/* Table: EGF_ACCOUNT                                           */
/*==============================================================*/
create table EGF_ACCOUNT
(
   ACCOUNT_NO           varchar(32) not null comment '�˻�id',
   ACCOUNT_TYPE         varchar(2) not null comment '�˻�����',
   BALANCE              numeric(15,2) not null comment '���',
   FREEZE_AMOUNT        numeric(15,2) not null comment '������',
   STATUS               CHAR(1) not null comment '����״̬',
   CARD_ID              varchar(32) comment '�ͻ�id',
   ALIAS_NAME           varchar(32) comment '����',
   ACCOUNT_TITLE        varchar(10) comment '�˻�����',
   ACCOUNT_DIRECTION    CHAR(1) not null default 'C' comment '���˷���',
   DEPOSIT_AMOUNT       numeric(15,2) not null default 0 comment '��ֵ���',
   SYSTEM_AMOUNT        numeric(15,2) comment 'ϵͳ���',
   FREEZE_MODEL         varchar(5) comment '����ģʽ',
   PREVIOUS_BALANCE     numeric(15,2) comment '�������',
   CREATE_TIME          timestamp,
   UPDATE_TIME          timestamp,
   primary key (ACCOUNT_NO),
   key AK_UA_CARD_ID (CARD_ID)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: EGF_ACCOUNT_FREEZE                                    */
/*==============================================================*/
create table EGF_ACCOUNT_FREEZE
(
   FREEZE_ID            varchar(20) not null comment 'ID',
   ACCOUNT_NO           varchar(20) not null comment '�˻�id',
   FREEZE_TYPE          varchar(20) not null comment '��������',
   FREEZE_AMOUNT        numeric(15,2) not null default 0 comment '������',
   SYSTEM_AMOUNT        numeric(15,2) comment '������',
   CREATE_TIME          timestamp not null,
   UPDATE_TIME          timestamp,
   primary key (FREEZE_ID),
   key AK_ACCOUNT_FREEZE (FREEZE_TYPE, ACCOUNT_NO)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: EGF_ACCOUNT_FREEZE_LOG                                */
/*==============================================================*/
create table EGF_ACCOUNT_FREEZE_LOG
(
   FREEZE_ID_LOG        varchar(32) not null comment 'ID',
   ACCOUNT_NO           varchar(20) not null comment '�˻�id',
   OUT_ORDER_NO         varchar(32) not null comment '�ⲿ������',
   TRANS_TYPE           varchar(5) not null comment '��������',
   AMOUNT               numeric(15,2) not null comment '���',
   FREEZE_TYPE          varchar(5) not null comment '��������',
   TOTAL_FREEZE_AMOUNT  numeric(15,2) not null comment '�ܶ�����',
   TYPE_FREEZE_AMOUNT   numeric(15,2) not null comment '���Ͷ�����',
   FREEZE_MEMO          varchar(256) comment '���ᱸע',
   BEYOND_ORDER_NO      varchar(32),
   TRANS_TIME           TIMESTAMP comment '����ʱ��',
   CREATE_TIME          TIMESTAMP not null comment '����ʱ��',
   UPDATE_TIME          TIMESTAMP,
   primary key (FREEZE_ID_LOG),
   key AK_UAFL_OUT_ORDER_NO (OUT_ORDER_NO, TRANS_TYPE)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: EGF_ACCOUNT_INST                                      */
/*==============================================================*/
create table EGF_ACCOUNT_INST
(
   INST_ACCOUNT_NO      varchar(20) not null comment '�˻�id',
   ACCOUNT_TYPE         varchar(2) not null comment '�˻�����',
   CURRENCY             varchar(3) not null default '156' comment '��������',
   BALANCE              numeric(15,2) not null comment '���',
   ENABLED_STATUS       varchar(1) not null comment '����״̬',
   ALIAS_NAME           varchar(32) comment '����',
   ACCOUNT_TITLE        varchar(10) comment '�˻�����',
   BALANCE_DIRECTION    varchar(1) not null default 'C' comment '���˷���',
   SYSTEM_AMOUNT        numeric(15,2) comment 'ϵͳ���',
   TRANS_RULE           varchar(1) comment '�Ƿ�У�齻�׹���',
   PREVIOUS_BALANCE     numeric(15,2) comment '�������',
   LAST_TRANS_DATE      varchar(8) comment '���������',
   INST_CHANNEL_API     varchar(32),
   CREATE_TIME          TIMESTAMP not null,
   UPDATE_TIME          TIMESTAMP,
   primary key (INST_ACCOUNT_NO),
   key AK_UAI_INST_CHANNEL_API (INST_CHANNEL_API, BALANCE_DIRECTION)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: EGF_ACCOUNT_INST_LOG                                  */
/*==============================================================*/
create table EGF_ACCOUNT_INST_LOG
(
   INST_ACCOUNT_LOG_ID  varchar(32) not null comment '������־ID',
   INST_ACCOUNT_NO      varchar(20) comment '�˻�id',
   TRANS_DATE           varchar(8) comment '��������',
   TRANS_CODE           varchar(4) comment '������',
   SUB_TRANS_CODE       varchar(4) comment '�ӽ�����',
   TRANS_BALANCE        numeric(15,2) comment '����ʱ���',
   TRANS_AMOUNT         numeric(15,2) comment '���׽��',
   BALANCE              numeric(15,2) comment '�����',
   TRANS_CURRENCY       varchar(3) comment '����',
   TRANS_ACCOUNT        varchar(20) comment '�˻�',
   OTHER_ACCOUNT        varchar(20) comment '�Է��˻�',
   TRANS_MEMO           varchar(256) comment '��ע',
   OTHER_ACCOUNT_LOG    varchar(32) comment '�Է���־id',
   ACCOUNT_TYPE         varchar(8) comment '�˻�����',
   OTHER_ACCOUNT_TYPE   varchar(8) comment '�Է��˻�����',
   INST_CHANNEL_API     varchar(32) comment '��������',
   BANK_NAME            varchar(100) comment '������',
   PAY_BANK_NAME        varchar(100) comment '֧��������',
   BANK_ID              varchar(15) comment '����id',
   PAY_BANK_ID          varchar(15) comment '֧������id',
   OUT_ORDER_NO         varchar(32) comment '�ⲿ������',
   ACTION_TYPE          varchar(2),
   BEYOND_ORDER_NO      varchar(32),
   CREATE_TIME          timestamp not null,
   primary key (INST_ACCOUNT_LOG_ID),
   key AK_UAIL_OUT_ORDER_NO (OUT_ORDER_NO)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: EGF_ACCOUNT_LOG                                       */
/*==============================================================*/
create table EGF_ACCOUNT_LOG
(
   ACCOUNT_LOG_ID       varchar(32) not null comment '������־ID',
   ACCOUNT_NO           varchar(20) comment '�˻�id',
   TRANS_DATE           varchar(8) comment '��������',
   TRANS_CODE           varchar(4) comment '������',
   SUB_TRANS_CODE       varchar(8) comment '�ӽ�����',
   TRANS_BALANCE        numeric(17,2) comment '����ʱ���',
   TRANS_AMOUNT         numeric(17,2) comment '���׽��',
   BALANCE              numeric(17,2) comment '�����',
   TRANS_CURRENCY       varchar(3) comment '����',
   TRANS_ACCOUNT        varchar(20) comment '�˻�',
   OTHER_ACCOUNT        varchar(20) comment '�Է��˻�',
   TRANS_MEMO           varchar(256) comment '��ע',
   OTHER_ACCOUNT_LOG    varchar(32) comment '�Է���־id',
   ACCOUNT_TYPE         varchar(2) comment '�˻�����',
   OTHER_ACCOUNT_TYPE   varchar(2) comment '�Է��˻�����',
   INST_CHANNEL         varchar(32) comment '��������',
   BANK_NAME            varchar(100) comment '������',
   PAY_BANK_NAME        varchar(100) comment '֧��������',
   BANK_ID              varchar(15) comment '����id',
   PAY_BANK_ID          varchar(15) comment '֧������id',
   OUT_ORDER_NO         varchar(32) comment '�ⲿ������',
   TRANS_TYPE           varchar(4),
   BEYOND_ORDER_NO      varchar(64),
   CREATE_TIME          timestamp not null comment '��������',
   UPDATE_TIME          timestamp,
   primary key (ACCOUNT_LOG_ID),
   key AK_UAFL_OUT_ORDER_NO (OUT_ORDER_NO, ACCOUNT_NO)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

