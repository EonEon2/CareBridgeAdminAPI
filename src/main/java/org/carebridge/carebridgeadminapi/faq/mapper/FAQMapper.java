package org.carebridge.carebridgeadminapi.faq.mapper;

import org.carebridge.carebridgeadminapi.faq.dto.FAQDTO;
import java.util.List;

public interface FAQMapper {

    // 전체 FAQ 목록 조회
    List<FAQDTO> getAllFAQs();

    // FAQ 목록 페이징 조회
    List<FAQDTO> getFAQsPaged(int offset, int limit);

    // 새로운 FAQ 추가
    int insertFAQ(FAQDTO faq);

    // 기존 FAQ 수정
    int updateFAQ(FAQDTO faq);

    // 특정 FAQ 삭제
    int deleteFAQ(int id);
}
