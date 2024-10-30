package org.carebridge.carebridgeadminapi.caregiver.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Param;
import org.carebridge.carebridgeadminapi.caregiver.dto.*;
import org.carebridge.carebridgeadminapi.caregiver.mapper.CareGiverMapper;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class CareGiverService {

    private final CareGiverMapper careGiverMapper;

    public PageResponse<CareGiverListDTO> getList(PageRequest pageRequest) {

        PageResponse<CareGiverListDTO> pageResponse =
                PageResponse.<CareGiverListDTO>with()
                        .list(careGiverMapper.getList(pageRequest))
                        .total(careGiverMapper.count(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }

    public void delete(Long cgno) {

        careGiverMapper.delete(cgno);
    }

    public void register(CareGiverRegisterDTO dto) {

        careGiverMapper.insert(dto);
    }

    public void update(Long cgno, CareGiverUpdateDTO dto) {

        careGiverMapper.update(cgno, dto);
    }

    public CareGiverReadDTO getApprovedOne(Long cgno) {

        return careGiverMapper.getApprovedOne(cgno);
    }

    public CareGiverReadDTO getNotApprovedOne(Long cgno) {

        return careGiverMapper.getNotApprovedOne(cgno);
    }

    public void approve(Long cgno) {

        careGiverMapper.approve(cgno);
    }

    public PageResponse<CareGiverListDTO> getNotApprovedGiverList(PageRequest pageRequest) {

        PageResponse<CareGiverListDTO> pageResponse =
                PageResponse.<CareGiverListDTO>with()
                        .list(careGiverMapper.getNotApprovedGiverList(pageRequest))
                        .total(careGiverMapper.countNotApproved(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }

    public PageResponse<CareGiverMatchedListDTO>
        getMatchedGiverList(@Param("cgno") Long cgno, @Param("pageRequest") PageRequest pageRequest) {

        PageResponse<CareGiverMatchedListDTO> pageResponse =
                PageResponse.<CareGiverMatchedListDTO>with()
                        .list(careGiverMapper.getMatchedGiverList(cgno, pageRequest))
                        .total(careGiverMapper.countMatchedList(cgno, pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }
}
