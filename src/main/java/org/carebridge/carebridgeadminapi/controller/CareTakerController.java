package org.carebridge.carebridgeadminapi.controller;


import com.sun.net.httpserver.Authenticator;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerDetailDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerUpdateDTO;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.carebridge.carebridgeadminapi.service.CareTakerService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/api/v1/careTaker")
public class CareTakerController {

    private final CareTakerService careTakerService;

    @GetMapping("list")
    public ResponseEntity<PageResponse<CareTakerDTO>> list(PageRequest pageRequest) {

        log.info("get careTaker list----------------------");

        return ResponseEntity.ok(careTakerService.getCareTakerList(pageRequest));
    }

    @PostMapping(value = "delete/{ctno}")
    public ResponseEntity<String> delete(@PathVariable Long ctno) {

        careTakerService.delete(ctno);

        return ResponseEntity.ok("success");

    }

    @PostMapping(value = "update/{ctno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> update(@PathVariable Long ctno, @RequestBody CareTakerUpdateDTO dto) {
        careTakerService.update(ctno ,dto);

        return ResponseEntity.ok("success");
    }

    @GetMapping(value = "read/{ctno}")
    public ResponseEntity<CareTakerDetailDTO> detail(@PathVariable Long ctno) {

        return ResponseEntity.ok(careTakerService.getOne(ctno));
    }

}
