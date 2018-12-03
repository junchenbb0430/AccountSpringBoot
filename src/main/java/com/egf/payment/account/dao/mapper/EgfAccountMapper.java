package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.EgfAccountEntity;

public interface EgfAccountMapper {
    int deleteByPrimaryKey(String accountNo);

    int insert(EgfAccountEntity record);

    int insertSelective(EgfAccountEntity record);

    EgfAccountEntity selectByPrimaryKey(String accountNo);

    int updateByPrimaryKeySelective(EgfAccountEntity record);

    int updateByPrimaryKey(EgfAccountEntity record);
}