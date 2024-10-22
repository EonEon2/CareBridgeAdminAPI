package org.carebridge.carebridgeadminapi.faq.mapper;
import org.carebridge.carebridgeadminapi.vo.FAQVO;

import java.util.List;

public interface FAQMapper {

    // 전체 FAQ 목록 조회
    List<FAQVO> getAllFAQs();

}
