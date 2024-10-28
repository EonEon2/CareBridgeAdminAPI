package org.carebridge.carebridgeadminapi.graph.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.graph.mapper.GraphMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class GraphService {

    private final GraphMapper graphMapper;

    public int GiverCount(){
        return graphMapper.GiverCount();
    }

    public int TakerCount(){
        return graphMapper.TakerCount();

    }

    public int NotMatchGiverCount(){
        return graphMapper.NotMatchGiverCount();

    }

    public int NotMatchTakerCount(){
        return graphMapper.NotMatchTakerCount();
    }

}
