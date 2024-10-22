package org.carebridge.carebridgeadminapi.caretaker.mapper;

import org.apache.ibatis.annotations.Param;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerDetailDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerUpdateDTO;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;

import java.util.List;

public interface CareTakerMapper {

    List<CareTakerDTO> careTakerList(PageRequest pageRequest);

    int count(PageRequest pageRequest);

    int delete(Long ctno);

    int update(@Param("ctno") Long ctno, @Param("dto") CareTakerUpdateDTO dto);

    CareTakerDetailDTO getOne(Long ctno);






}
