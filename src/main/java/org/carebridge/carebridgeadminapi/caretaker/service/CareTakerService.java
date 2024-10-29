package org.carebridge.carebridgeadminapi.caretaker.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Param;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerDetailDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerMatchDTO;
import org.carebridge.carebridgeadminapi.caretaker.dto.CareTakerUpdateDTO;
import org.carebridge.carebridgeadminapi.caretaker.mapper.CareTakerMapper;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class CareTakerService {

    private final CareTakerMapper careTakerMapper;

    public void delete(Long ctno){
        careTakerMapper.delete(ctno);
    }

    public void update(Long ctno, CareTakerUpdateDTO dto){
        careTakerMapper.update(ctno, dto);
    }

    public CareTakerDetailDTO getOne(Long ctno){

        return careTakerMapper.getOne(ctno);
    }

    public PageResponse<CareTakerMatchDTO> getCareTakerMatchList(@Param("ctno")Long ctno,@Param("pageRequest") PageRequest pageRequest){

        PageResponse<CareTakerMatchDTO> pageResponse = PageResponse.<CareTakerMatchDTO>with()
                .list(careTakerMapper.careTakerMatchList(ctno, pageRequest))
                .total(careTakerMapper.countMatchedList(ctno, pageRequest))
                .pageRequest(pageRequest)
                .build();
        return pageResponse;
    }

    public PageResponse<CareTakerDTO> getCareTakerList(PageRequest pageRequest) {

        PageResponse<CareTakerDTO> pageResponse = PageResponse.<CareTakerDTO>with()
                .list(careTakerMapper.careTakerList(pageRequest))
                .total(careTakerMapper.count(pageRequest))
                .pageRequest(pageRequest)
                .build();

     return pageResponse;

    }

}
