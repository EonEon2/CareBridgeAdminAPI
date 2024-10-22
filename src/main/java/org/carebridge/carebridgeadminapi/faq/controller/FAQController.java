package org.carebridge.carebridgeadminapi.faq.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.faq.dto.FAQEditDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;
import org.carebridge.carebridgeadminapi.faq.service.FAQService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faq")
@Log4j2
@RequiredArgsConstructor
public class FAQController {

    private final FAQService faqService;

    // FAQ 목록 조회
    @GetMapping("list")
    public ResponseEntity<List<FAQListDTO>> getFAQList(){

        log.info("getFAQList");

        return ResponseEntity.ok(faqService.getList());
    }

    // FAQ 등록
    @PostMapping("insert")
    public ResponseEntity<String> insertFAQ(@RequestBody FAQEditDTO faqEditDTO){
        log.info("insertFAQ");

        faqService.insertFAQ(faqEditDTO);

        return ResponseEntity.ok("Insert successful");
    }

}
