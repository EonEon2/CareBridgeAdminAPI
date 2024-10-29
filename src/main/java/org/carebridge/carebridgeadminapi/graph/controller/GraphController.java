package org.carebridge.carebridgeadminapi.graph.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.graph.service.GraphService;
import org.carebridge.carebridgeadminapi.qna.dto.QNADetailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/graph")
@Log4j2
@RequiredArgsConstructor
public class GraphController {

    private final GraphService graphService;

    @GetMapping("count/taker") // match
    public ResponseEntity<Integer> getTakerCount() {

        log.info("getTakerCount");

        int takerCount = graphService.TakerCount();

        return ResponseEntity.ok(takerCount);
    }

    @GetMapping("count/giver")  // match
    public ResponseEntity<Integer> getGiverCount() {

        log.info("getGiverCount");

        int giverCount = graphService.GiverCount();

        return ResponseEntity.ok(giverCount);
    }

    @GetMapping("count/mgiver")  // not match
    public ResponseEntity<Integer> MatchGiverCount() {

        log.info("get MatchGiverCount");

        int MatchGivercount = graphService.MatchGiverCount();

        return ResponseEntity.ok(MatchGivercount);
    }

    @GetMapping("count/mtaker")  // not match
    public ResponseEntity<Integer> MatchTakerCount() {

        log.info("get MatchTakerCount");

        int MatchTakercount = graphService.MatchTakerCount();

        return ResponseEntity.ok(MatchTakercount);
    }

}
