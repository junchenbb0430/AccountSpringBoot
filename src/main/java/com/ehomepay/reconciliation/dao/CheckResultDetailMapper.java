package com.ehomepay.reconciliation.dao;

import com.ehomepay.reconciliation.entity.CheckResultDetailEntity;

public interface CheckResultDetailMapper {
    int deleteByPrimaryKey(Short pkid);

    int insert(CheckResultDetailEntity record);

    int insertSelective(CheckResultDetailEntity record);

    CheckResultDetailEntity selectByPrimaryKey(Short pkid);

    int updateByPrimaryKeySelective(CheckResultDetailEntity record);

    int updateByPrimaryKey(CheckResultDetailEntity record);
}