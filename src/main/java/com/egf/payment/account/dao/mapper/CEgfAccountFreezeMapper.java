package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.EgfAccountFreezeEntity;

public interface CEgfAccountFreezeMapper {
    int deleteByPrimaryKey(String freezeId);

    int insert(EgfAccountFreezeEntity record);

    int insertSelective(EgfAccountFreezeEntity record);

    EgfAccountFreezeEntity selectByPrimaryKey(String freezeId);

    int updateByPrimaryKeySelective(EgfAccountFreezeEntity record);

    int updateByPrimaryKey(EgfAccountFreezeEntity record);
}