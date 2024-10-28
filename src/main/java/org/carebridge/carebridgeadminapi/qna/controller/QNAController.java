package org.carebridge.carebridgeadminapi.qna.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.carebridge.carebridgeadminapi.qna.dto.QNADetailDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNAListDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNARegisterDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNAUpdateDTO;
import org.carebridge.carebridgeadminapi.qna.service.QNAService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/qna")
@Log4j2
@RequiredArgsConstructor
public class QNAController {

    private final QNAService qnaService;

    @GetMapping("list")
    public ResponseEntity<PageResponse<QNAListDTO>> getQNAList(PageRequest pageRequest) {
        log.info("Get Controller");

        return ResponseEntity.ok(qnaService.getQNAList(pageRequest));
    }

    @PostMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    public String register(@RequestBody QNARegisterDTO qnaRegisterDTO) {

        qnaService.register(qnaRegisterDTO);

        return "Success register";

    }

    @PostMapping("delete/{qno}")
    public String delete(@PathVariable("qno") Long qno) {

        qnaService.delete(qno);

        return "Success delete";
    }

    @PostMapping(value="update/{qno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@PathVariable("qno") Long qno, @RequestBody QNAUpdateDTO qnaUpdateDTO) {

        qnaService.update(qno, qnaUpdateDTO);

        return "Success update";
    }

    @GetMapping("read/{qno}")
    public ResponseEntity<QNADetailDTO> getRead(@PathVariable Long qno){

        log.info("Get Controller");

        return ResponseEntity.ok(qnaService.getOne(qno));

    }



}
