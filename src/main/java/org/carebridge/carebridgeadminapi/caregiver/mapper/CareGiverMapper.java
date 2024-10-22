package org.carebridge.carebridgeadminapi.caregiver.mapper;

import org.apache.ibatis.annotations.Param;
import org.carebridge.carebridgeadminapi.caregiver.dto.CareGiverListDTO;
import org.carebridge.carebridgeadminapi.caregiver.dto.CareGiverReadDTO;
import org.carebridge.carebridgeadminapi.caregiver.dto.CareGiverRegisterDTO;
import org.carebridge.carebridgeadminapi.caregiver.dto.CareGiverUpdateDTO;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;

import java.util.List;

public interface CareGiverMapper {

    List<CareGiverListDTO> getList(PageRequest pageRequest);

    int count(PageRequest pageRequest);

    Long insert(CareGiverRegisterDTO registerDTO);

    void delete(Long cgno);

    void update( @Param("cgno") Long cgno, @Param("dto") CareGiverUpdateDTO dto);

    CareGiverReadDTO getOne(Long cgno);
}
