package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.AccountEntity;

public interface AccountMapper {
    int deleteByPrimaryKey(String accountNo);

    int insert(AccountEntity record);

    int insertSelective(AccountEntity record);

    AccountEntity selectByPrimaryKey(String accountNo);

    int updateByPrimaryKeySelective(AccountEntity record);

    int updateByPrimaryKey(AccountEntity record);
}