package org.carebridge.carebridgeadminapi.faq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.carebridge.carebridgeadminapi.vo.FAQVO;

import java.util.List;

@Mapper
public interface FAQMapper {

    // 전체 FAQ 목록 조회
    List<FAQVO> getAllFAQs();

}
