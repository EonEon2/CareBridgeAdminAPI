package org.carebridge.carebridgeadminapi.faq.mapper;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.carebridge.carebridgeadminapi.faq.dto.FAQUpdateDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;

import java.util.List;

public interface FAQMapper {

    int count(PageRequest pageRequest);

    // FAQ 전체 조회
    List<FAQListDTO> getAllFAQs(PageRequest pageRequest);

    // FAQ 간병인 조회
    List<FAQListDTO> getGiverFAQs(PageRequest pageRequest);

    // FAQ 보호자 조회
    List<FAQListDTO> getTakerFAQs(PageRequest pageRequest);

    // FAQ 추가
    void insertFAQ(FAQUpdateDTO faqUpdateDTO);

    // FAQ 수정
    void updateFAQ(Long fno, FAQUpdateDTO faqUpdateDTO);

    // FAQ 삭제
    void softDeleteFAQ(long fno);

    // FAQ 상세 조회
    FAQUpdateDTO getOne(long fno);

}