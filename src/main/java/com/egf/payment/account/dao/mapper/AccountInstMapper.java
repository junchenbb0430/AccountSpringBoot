package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.AccountInstEntity;

public interface AccountInstMapper {
    int deleteByPrimaryKey(String instAccountNo);

    int insert(AccountInstEntity record);

    int insertSelective(AccountInstEntity record);

    AccountInstEntity selectByPrimaryKey(String instAccountNo);

    int updateByPrimaryKeySelective(AccountInstEntity record);

    int updateByPrimaryKey(AccountInstEntity record);
}