package com.benliu.mapper;

import java.util.List;

import com.benliu.entity.VMac;

/**
 * Created by Administrator on 2017/12/26.
 */
public interface VMacMapper {

    List<VMac> getVMacByLineId(int lineId);

}
