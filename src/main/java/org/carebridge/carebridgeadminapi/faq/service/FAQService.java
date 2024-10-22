package org.carebridge.carebridgeadminapi.faq.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;
import org.carebridge.carebridgeadminapi.faq.mapper.FAQMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Log4j2
@Service
@RequiredArgsConstructor
public class FAQService {

    private final FAQMapper faqMapper;

    public List<FAQListDTO> getList() {

        return faqMapper.getAllFAQs();
    }
}
