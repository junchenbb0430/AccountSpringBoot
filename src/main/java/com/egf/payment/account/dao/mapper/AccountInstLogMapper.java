package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.AccountInstLogEntity;

public interface AccountInstLogMapper {
    int deleteByPrimaryKey(String instAccountLogId);

    int insert(AccountInstLogEntity record);

    int insertSelective(AccountInstLogEntity record);

    AccountInstLogEntity selectByPrimaryKey(String instAccountLogId);

    int updateByPrimaryKeySelective(AccountInstLogEntity record);

    int updateByPrimaryKey(AccountInstLogEntity record);
}