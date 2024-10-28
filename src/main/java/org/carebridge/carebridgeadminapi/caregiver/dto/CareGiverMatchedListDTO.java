package org.carebridge.carebridgeadminapi.caregiver.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;


@Data
@Builder
public class CareGiverMatchedListDTO {

    private Long cmno;

    private String cgname;

    private String ctname;

    private Timestamp start;

    private Timestamp end;
}
