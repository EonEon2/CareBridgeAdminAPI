package org.carebridge.carebridgeadminapi.graph.mapper;

import org.carebridge.carebridgeadminapi.graph.dto.GraphDTO;



public interface GraphMapper {

    int GiverCount(); // match

    int TakerCount(); // match

    int MatchGiverCount();

    int MatchTakerCount();

}
