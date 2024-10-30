package org.carebridge.carebridgeadminapi.caregiver.mapper;

import org.apache.ibatis.annotations.Param;
import org.carebridge.carebridgeadminapi.caregiver.dto.*;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;

import java.util.List;

public interface CareGiverMapper {

    List<CareGiverListDTO> getList(PageRequest pageRequest);

    int count(PageRequest pageRequest);

    int countNotApproved(PageRequest pageRequest);

    int countMatchedList(@Param("cgno") Long cgno, @Param("pageRequest") PageRequest pageRequest);

    Long insert(CareGiverRegisterDTO registerDTO);

    void delete(Long cgno);

    void update( @Param("cgno") Long cgno, @Param("dto") CareGiverUpdateDTO dto);

    CareGiverReadDTO getApprovedOne(Long cgno);

    CareGiverReadDTO getNotApprovedOne(Long cgno);

    void approve(Long cgno);

    List<CareGiverListDTO> getNotApprovedGiverList(PageRequest pageRequest);

    List<CareGiverMatchedListDTO> getMatchedGiverList
            (@Param("cgno") Long cgno, @Param("pageRequest") PageRequest pageRequest);
}
