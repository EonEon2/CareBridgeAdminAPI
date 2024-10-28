package org.carebridge.carebridgeadminapi.faq.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.carebridge.carebridgeadminapi.faq.dto.FAQUpdateDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;
import org.carebridge.carebridgeadminapi.faq.mapper.FAQMapper;
import org.carebridge.carebridgeadminapi.qna.dto.QNAListDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Log4j2
@Service
@RequiredArgsConstructor
public class FAQService {

    private final FAQMapper faqMapper;

    // FAQ 전체 목록 조회
    public PageResponse<FAQListDTO> getFAQListAll(PageRequest pageRequest) {
        log.info("getFAQListAll");

        PageResponse<FAQListDTO> pageResponse =
                PageResponse.<FAQListDTO>with()
                        .list(faqMapper.getAllFAQs(pageRequest))
                        .total(faqMapper.count(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }

    // FAQ 간병인 목록 조회
    public PageResponse<FAQListDTO> getGiverFAQList(PageRequest pageRequest) {
        log.info("getGiverFAQList");

        PageResponse<FAQListDTO> pageResponse =
                PageResponse.<FAQListDTO>with()
                        .list(faqMapper.getGiverFAQs(pageRequest))
                        .total(faqMapper.count(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }

    // FAQ 보호자 목록 조회
    public PageResponse<FAQListDTO> getTakerFAQList(PageRequest pageRequest) {
        log.info("getTakerFAQList");

        PageResponse<FAQListDTO> pageResponse =
                PageResponse.<FAQListDTO>with()
                        .list(faqMapper.getTakerFAQs(pageRequest))
                        .total(faqMapper.count(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }



    // FAQ 등록
    public void insertFAQ(FAQUpdateDTO faqUpdateDTO) {

        faqMapper.insertFAQ(faqUpdateDTO);
    }

    // FAQ 수정
    public void updateFAQ(Long fno, FAQUpdateDTO faqUpdateDTO) {

        faqMapper.updateFAQ(fno, faqUpdateDTO);
    }

    // FAQ 소프트 삭제
    public void softDeleteFAQ(long fno) {

        faqMapper.softDeleteFAQ(fno);
    }

    // FAQ 상세
    public FAQUpdateDTO getOne(long fno) {
        return faqMapper.getOne(fno);
    }
}