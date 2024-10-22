package org.carebridge.carebridgeadminapi.faq.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.faq.dto.FAQUpdateDTO;
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

    // FAQ 조회
    @GetMapping("list")
    public ResponseEntity<List<FAQListDTO>> getFAQList(){

        log.info("getFAQList");

        return ResponseEntity.ok(faqService.getList());
    }

    // FAQ 등록
    @PostMapping("insert")
    public ResponseEntity<String> insertFAQ(@RequestBody FAQUpdateDTO faqUpdateDTO){
        log.info("insertFAQ");

        faqService.insertFAQ(faqUpdateDTO);

        return ResponseEntity.ok("Insert successful");
    }

    // FAQ 수정
    @PostMapping("update")
    public ResponseEntity<String> updateFAQ(@RequestBody FAQUpdateDTO faqUpdateDTO){
        log.info("updateFAQ");

        faqService.updateFAQ(faqUpdateDTO);

        return ResponseEntity.ok("Update successful");
    }

    // FAQ 소프트 삭제
    @PostMapping("delete/{fno}")
    public ResponseEntity<String> softDeleteFAQ(@PathVariable long fno) {
        log.info("softDeleteFAQ: {}", fno);

        faqService.softDeleteFAQ(fno);

        return ResponseEntity.ok("Logical delete successful");
    }

}
