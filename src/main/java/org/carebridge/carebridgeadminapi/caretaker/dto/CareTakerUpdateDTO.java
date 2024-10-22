package org.carebridge.carebridgeadminapi.caretaker.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CareTakerUpdateDTO {

    private String ctname;
    private int ctage;
    private String ctaddress;
    private String ctphone;

}
