package org.carebridge.carebridgeadminapi.time.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {

    String getTime();
}
