package com.Sena2.Santiago.service.Service;
import java.util.List;

import com.Sena2.Santiago.dto.LifeCycleDto;
import com.Sena2.Santiago.dto.response.LifeCycleResponseDto;

public interface LiceCycleService {
   List<LifeCycleResponseDto> findAll(); 

   LifeCycleResponseDto  findById (int id); 

   List<LifeCycleResponseDto> filterByStage (String stage);

   List<LifeCycleResponseDto> filterByDuratin (String duration); 

  LifeCycleResponseDto save(LifeCycleDto L);

   LifeCycleResponseDto update (int id , LifeCycleDto L); 

    void delete (int id); 



}


