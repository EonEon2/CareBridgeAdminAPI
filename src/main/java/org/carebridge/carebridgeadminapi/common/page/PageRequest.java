package org.carebridge.carebridgeadminapi.common.page;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageRequest {

    private int page = 1;
    private int size = 10;

    public void setPage(int page) {
        this.page = page <= 0 ? 1 : page;
    }

    public void setSize(int size) {
        this.size = size <= 10 ? 10 : size >= 100 ? 100 : 10;
    }

    public int getSkip(){
        return (page - 1) * size;
    }
}
