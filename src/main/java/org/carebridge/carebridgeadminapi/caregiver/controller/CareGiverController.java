package org.carebridge.carebridgeadminapi.caregiver.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.caregiver.dto.*;
import org.carebridge.carebridgeadminapi.caregiver.service.CareGiverService;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/caregiver")
@Log4j2
@RequiredArgsConstructor
public class CareGiverController {

    private final CareGiverService careGiverService;

    @GetMapping("list")
    public ResponseEntity<PageResponse<CareGiverListDTO>> getList(PageRequest pageRequest) {

        return ResponseEntity.ok(careGiverService.getList(pageRequest));
    }

    @PostMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
    public String register(@RequestBody CareGiverRegisterDTO careGiverRegisterDTO) {

        careGiverService.register(careGiverRegisterDTO);

        return "Success";
    }

    @PostMapping(value = "delete/{cpno}")
    public String delete(@PathVariable Long cpno) {

        careGiverService.delete(cpno);

        return "Success";
    }

    @PostMapping(value = "update/{cgno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@PathVariable Long cgno, @RequestBody CareGiverUpdateDTO dto) {

        careGiverService.update(cgno, dto);

        return "Success";
    }

    @GetMapping("read/approved/{cpno}")
    public ResponseEntity<CareGiverReadDTO> getApprovedOne(@PathVariable Long cpno) {

        return ResponseEntity.ok(careGiverService.getApprovedOne(cpno));
    }

    @GetMapping("read/notapproved/{cpno}")
    public ResponseEntity<CareGiverReadDTO> getNotApprovedOne(@PathVariable Long cpno) {

        return ResponseEntity.ok(careGiverService.getNotApprovedOne(cpno));
    }

    @GetMapping("notapprovedgivers")
    public ResponseEntity<PageResponse<CareGiverListDTO>> getNotApprovedGivers(PageRequest pageRequest) {

        return ResponseEntity.ok(careGiverService.getNotApprovedGiverList(pageRequest));
    }

    @PutMapping(value = "approve/{cgno}")
    public String approve(@PathVariable Long cgno) {

        careGiverService.approve(cgno);

        return "Success";
    }

    @GetMapping("matchedgiver/{cgno}")
    public ResponseEntity<PageResponse<CareGiverMatchedListDTO>>
        getMatchedGiverList(@PathVariable Long cgno,  PageRequest pageRequest) {

        return ResponseEntity.ok(careGiverService.getMatchedGiverList(cgno, pageRequest));
    }
}
