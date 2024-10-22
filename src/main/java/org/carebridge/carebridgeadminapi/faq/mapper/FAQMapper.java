package org.carebridge.carebridgeadminapi.faq.mapper;
import org.carebridge.carebridgeadminapi.faq.dto.FAQUpdateDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;

import java.util.List;

public interface FAQMapper {

    // FAQ 조회
    List<FAQListDTO> getAllFAQs();

    // FAQ 추가
    void insertFAQ(FAQUpdateDTO faqUpdateDTO);

    // FAQ 수정
    void updateFAQ(FAQUpdateDTO faqUpdateDTO);

    // FAQ 삭제
    void softDeleteFAQ(long fno);

}
