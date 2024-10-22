package org.carebridge.carebridgeadminapi.faq.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.carebridge.carebridgeadminapi.faq.dto.FAQEditDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;

import java.util.List;

public interface FAQMapper {

    // 전체 FAQ 목록 조회
    List<FAQListDTO> getAllFAQs();

    // FAQ 추가
    void insertFAQ(FAQEditDTO faqEditDTO);



}
