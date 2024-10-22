package org.carebridge.carebridgeadminapi.caretaker.dto;

import lombok.Data;

@Data
public class CareTakerDTO {

    private Long ctno;

    private String ctname;
    private int ctage;
    private String ctaddress;
    private String ctphone;

    private String ctemail;
    private String ctpw;

    private boolean ctdelete;

}

