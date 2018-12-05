package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.AccountFreezeLogEntity;

public interface AccountFreezeLogMapper {
    int deleteByPrimaryKey(String freezeIdLog);

    int insert(AccountFreezeLogEntity record);

    int insertSelective(AccountFreezeLogEntity record);

    AccountFreezeLogEntity selectByPrimaryKey(String freezeIdLog);

    int updateByPrimaryKeySelective(AccountFreezeLogEntity record);

    int updateByPrimaryKey(AccountFreezeLogEntity record);
}