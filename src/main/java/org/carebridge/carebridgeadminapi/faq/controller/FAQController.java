package org.carebridge.carebridgeadminapi.faq.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;
import org.carebridge.carebridgeadminapi.faq.service.FAQService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faq")
@Log4j2
@RequiredArgsConstructor
public class FAQController {

    private final FAQService faqService;

    @GetMapping("list")
    public ResponseEntity<List<FAQListDTO>> getFAQList(){

        log.info("getFAQList");

        return ResponseEntity.ok(faqService.getList());
    }

}
