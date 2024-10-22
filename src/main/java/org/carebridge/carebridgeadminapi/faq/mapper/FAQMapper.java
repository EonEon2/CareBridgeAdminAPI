package org.carebridge.carebridgeadminapi.faq.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.carebridge.carebridgeadminapi.faq.dto.FAQEditDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;

import java.util.List;

public interface FAQMapper {

    // FAQ 조회
    List<FAQListDTO> getAllFAQs();

    // FAQ 추가
    void insertFAQ(FAQEditDTO faqEditDTO);

    // FAQ 수정
    void updateFAQ(FAQEditDTO faqEditDTO);

    // FAQ 삭제
    void softDeleteFAQ(long fno);

}
