package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.AccountLogEntity;

public interface AccountLogMapper {
    int deleteByPrimaryKey(String accountLogId);

    int insert(AccountLogEntity record);

    int insertSelective(AccountLogEntity record);

    AccountLogEntity selectByPrimaryKey(String accountLogId);

    int updateByPrimaryKeySelective(AccountLogEntity record);

    int updateByPrimaryKey(AccountLogEntity record);
}