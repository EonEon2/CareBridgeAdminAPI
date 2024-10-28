package org.carebridge.carebridgeadminapi.caretaker.dto;

import lombok.Data;

@Data
public class CareTakerDetailDTO {

    private Long ctno;
    private String ctname;
    private int ctage;
    private String ctaddress;
    private String ctphone;

    private String ctemail;

}
