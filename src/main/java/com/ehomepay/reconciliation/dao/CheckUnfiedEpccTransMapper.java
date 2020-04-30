package com.ehomepay.reconciliation.dao;

import com.ehomepay.reconciliation.entity.CheckUnfiedEpccTransEntity;

public interface CheckUnfiedEpccTransMapper {
    int deleteByPrimaryKey(Short pkid);

    int insert(CheckUnfiedEpccTransEntity record);

    int insertSelective(CheckUnfiedEpccTransEntity record);

    CheckUnfiedEpccTransEntity selectByPrimaryKey(Short pkid);

    int updateByPrimaryKeySelective(CheckUnfiedEpccTransEntity record);

    int updateByPrimaryKey(CheckUnfiedEpccTransEntity record);
}