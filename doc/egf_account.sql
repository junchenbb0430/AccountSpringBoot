/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/11/10 22:26:53                          */
/*==============================================================*/


/*==============================================================*/
/* Table: EGF_ACCOUNT                                           */
/*==============================================================*/
create table EGF_ACCOUNT
(
   ACCOUNT_NO           varchar(32) not null comment '账户id',
   ACCOUNT_TYPE         varchar(2) not null comment '账户类型',
   BALANCE              numeric(15,2) not null comment '余额',
   FREEZE_AMOUNT        numeric(15,2) not null comment '冻结金额',
   STATUS               CHAR(1) not null comment '激活状态',
   CARD_ID              varchar(32) comment '客户id',
   ALIAS_NAME           varchar(32) comment '别名',
   ACCOUNT_TITLE        varchar(10) comment '账户标题',
   ACCOUNT_DIRECTION    CHAR(1) not null default 'C' comment '结账方向',
   DEPOSIT_AMOUNT       numeric(15,2) not null default 0 comment '充值额度',
   SYSTEM_AMOUNT        numeric(15,2) comment '系统金额',
   FREEZE_MODEL         varchar(5) comment '冻结模式',
   PREVIOUS_BALANCE     numeric(15,2) comment '上期余额',
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
   ACCOUNT_NO           varchar(20) not null comment '账户id',
   FREEZE_TYPE          varchar(20) not null comment '冻结类型',
   FREEZE_AMOUNT        numeric(15,2) not null default 0 comment '冻结金额',
   SYSTEM_AMOUNT        numeric(15,2) comment '缓存金额',
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
   ACCOUNT_NO           varchar(20) not null comment '账户id',
   OUT_ORDER_NO         varchar(32) not null comment '外部订单号',
   TRANS_TYPE           varchar(5) not null comment '交易类型',
   AMOUNT               numeric(15,2) not null comment '金额',
   FREEZE_TYPE          varchar(5) not null comment '冻结类型',
   TOTAL_FREEZE_AMOUNT  numeric(15,2) not null comment '总冻结金额',
   TYPE_FREEZE_AMOUNT   numeric(15,2) not null comment '类型冻结金额',
   FREEZE_MEMO          varchar(256) comment '冻结备注',
   BEYOND_ORDER_NO      varchar(32),
   TRANS_TIME           TIMESTAMP comment '交易时间',
   CREATE_TIME          TIMESTAMP not null comment '创建时间',
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
   INST_ACCOUNT_NO      varchar(20) not null comment '账户id',
   ACCOUNT_TYPE         varchar(2) not null comment '账户类型',
   CURRENCY             varchar(3) not null default '156' comment '货币类型',
   BALANCE              numeric(15,2) not null comment '余额',
   ENABLED_STATUS       varchar(1) not null comment '激活状态',
   ALIAS_NAME           varchar(32) comment '别名',
   ACCOUNT_TITLE        varchar(10) comment '账户标题',
   BALANCE_DIRECTION    varchar(1) not null default 'C' comment '结账方向',
   SYSTEM_AMOUNT        numeric(15,2) comment '系统金额',
   TRANS_RULE           varchar(1) comment '是否校验交易规则',
   PREVIOUS_BALANCE     numeric(15,2) comment '上期余额',
   LAST_TRANS_DATE      varchar(8) comment '最后交易日期',
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
   INST_ACCOUNT_LOG_ID  varchar(32) not null comment '交易日志ID',
   INST_ACCOUNT_NO      varchar(20) comment '账户id',
   TRANS_DATE           varchar(8) comment '交易日期',
   TRANS_CODE           varchar(4) comment '交易码',
   SUB_TRANS_CODE       varchar(4) comment '子交易码',
   TRANS_BALANCE        numeric(15,2) comment '交易时余额',
   TRANS_AMOUNT         numeric(15,2) comment '交易金额',
   BALANCE              numeric(15,2) comment '总余额',
   TRANS_CURRENCY       varchar(3) comment '币种',
   TRANS_ACCOUNT        varchar(20) comment '账户',
   OTHER_ACCOUNT        varchar(20) comment '对方账户',
   TRANS_MEMO           varchar(256) comment '备注',
   OTHER_ACCOUNT_LOG    varchar(32) comment '对方日志id',
   ACCOUNT_TYPE         varchar(8) comment '账户类型',
   OTHER_ACCOUNT_TYPE   varchar(8) comment '对方账户类型',
   INST_CHANNEL_API     varchar(32) comment '清算渠道',
   BANK_NAME            varchar(100) comment '银行名',
   PAY_BANK_NAME        varchar(100) comment '支付银行名',
   BANK_ID              varchar(15) comment '银行id',
   PAY_BANK_ID          varchar(15) comment '支付银行id',
   OUT_ORDER_NO         varchar(32) comment '外部订单号',
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
   ACCOUNT_LOG_ID       varchar(32) not null comment '交易日志ID',
   ACCOUNT_NO           varchar(20) comment '账户id',
   TRANS_DATE           varchar(8) comment '交易日期',
   TRANS_CODE           varchar(4) comment '交易码',
   SUB_TRANS_CODE       varchar(8) comment '子交易码',
   TRANS_BALANCE        numeric(17,2) comment '交易时余额',
   TRANS_AMOUNT         numeric(17,2) comment '交易金额',
   BALANCE              numeric(17,2) comment '总余额',
   TRANS_CURRENCY       varchar(3) comment '币种',
   TRANS_ACCOUNT        varchar(20) comment '账户',
   OTHER_ACCOUNT        varchar(20) comment '对方账户',
   TRANS_MEMO           varchar(256) comment '备注',
   OTHER_ACCOUNT_LOG    varchar(32) comment '对方日志id',
   ACCOUNT_TYPE         varchar(2) comment '账户类型',
   OTHER_ACCOUNT_TYPE   varchar(2) comment '对方账户类型',
   INST_CHANNEL         varchar(32) comment '清算渠道',
   BANK_NAME            varchar(100) comment '银行名',
   PAY_BANK_NAME        varchar(100) comment '支付银行名',
   BANK_ID              varchar(15) comment '银行id',
   PAY_BANK_ID          varchar(15) comment '支付银行id',
   OUT_ORDER_NO         varchar(32) comment '外部订单号',
   TRANS_TYPE           varchar(4),
   BEYOND_ORDER_NO      varchar(64),
   CREATE_TIME          timestamp not null comment '创建日期',
   UPDATE_TIME          timestamp,
   primary key (ACCOUNT_LOG_ID),
   key AK_UAFL_OUT_ORDER_NO (OUT_ORDER_NO, ACCOUNT_NO)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

