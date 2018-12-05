package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.AccountFreezeEntity;

public interface AccountFreezeMapper {
    int deleteByPrimaryKey(String freezeId);

    int insert(AccountFreezeEntity record);

    int insertSelective(AccountFreezeEntity record);

    AccountFreezeEntity selectByPrimaryKey(String freezeId);

    int updateByPrimaryKeySelective(AccountFreezeEntity record);

    int updateByPrimaryKey(AccountFreezeEntity record);
}