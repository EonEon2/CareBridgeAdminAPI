package org.carebridge.carebridgeadminapi.faq.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.carebridge.carebridgeadminapi.faq.dto.FAQUpdateDTO;
import org.carebridge.carebridgeadminapi.faq.dto.FAQListDTO;
import org.carebridge.carebridgeadminapi.faq.service.FAQService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faq")
@Log4j2
@RequiredArgsConstructor
public class FAQController {

    private final FAQService faqService;

    // FAQ 전체 조회
    @GetMapping("list")
    public ResponseEntity<PageResponse<FAQListDTO>> getFAQList(PageRequest pageRequest){
        log.info("getFAQList");

        return ResponseEntity.ok(faqService.getFAQListAll(pageRequest));
    }

    // FAQ 간병인 조회
    @GetMapping("giverlist")
    public ResponseEntity<PageResponse<FAQListDTO>> getFAQListGiver(PageRequest pageRequest){
        log.info("getFAQListGiver");

        return ResponseEntity.ok(faqService.getGiverFAQList(pageRequest));
    }

    // FAQ 보호자 조회
    @GetMapping("takerlist")
    public ResponseEntity<PageResponse<FAQListDTO>> getFAQListTaker(PageRequest pageRequest){
        log.info("getFAQListTaker");

        return ResponseEntity.ok(faqService.getTakerFAQList(pageRequest));
    }

    // FAQ 등록
    @PostMapping("insert")
    public ResponseEntity<String> insertFAQ(@RequestBody FAQUpdateDTO faqUpdateDTO){
        log.info("insertFAQ");

        faqService.insertFAQ(faqUpdateDTO);

        return ResponseEntity.ok("Insert successful");
    }

    // FAQ 수정
    @PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
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

    // FAQ 상세 조회
    @GetMapping("read/{fno}")
    public ResponseEntity<FAQUpdateDTO> getOne(@PathVariable long fno) {
        log.info("getFAQDetail: {}", fno);

        FAQUpdateDTO faqDetail = faqService.getOne(fno);
        return ResponseEntity.ok(faqDetail);
    }
}