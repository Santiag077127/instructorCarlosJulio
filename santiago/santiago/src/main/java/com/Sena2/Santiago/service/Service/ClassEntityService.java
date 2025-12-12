package com.Sena2.Santiago.service.Service;
import java.util.List;

import com.Sena2.Santiago.dto.ClassEntityDto;
import com.Sena2.Santiago.dto.response.ClassEntityResponseDto;

public interface ClassEntityService {
        List<ClassEntityResponseDto>findAll();
         ClassEntityResponseDto findByid(int id ); 
        List<ClassEntityResponseDto>findByName(String name); 
        ClassEntityResponseDto  save (ClassEntityDto C ); 
        ClassEntityResponseDto update (int id, ClassEntityDto C); 
           void  delete (int id); 


}
