package org.carebridge.carebridgeadminapi.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CareTakerVO {

    private Long ctno;

    private String ctname;
    private int ctage;
    private String ctaddress;
    private String ctphone;

    private String ctemail;
    private String ctpw;

}
