package com.ehomepay.reconciliation.dao;

import com.ehomepay.reconciliation.entity.CheckUnifiedOrderEntity;

public interface CheckUnifiedOrderMapper {
    int deleteByPrimaryKey(Short pkid);

    int insert(CheckUnifiedOrderEntity record);

    int insertSelective(CheckUnifiedOrderEntity record);

    CheckUnifiedOrderEntity selectByPrimaryKey(Short pkid);

    int updateByPrimaryKeySelective(CheckUnifiedOrderEntity record);

    int updateByPrimaryKey(CheckUnifiedOrderEntity record);
}