package io.homec.ppmtool.services;

import io.homec.ppmtool.domain.Project;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service
public class MapValidationErrorService {

    public ResponseEntity<?> MapValidationService(BindingResult result) {
        if (result.hasErrors()) {
            Map<String,String> errorMap = new HashMap<>();
            String errorMessage = "";
            //List<FieldError> listErrors = result.getFieldErrors();
            for( FieldError fieldError : result.getFieldErrors()) {
                errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());

            }
            return new ResponseEntity<Map<String,String>>(errorMap, HttpStatus.BAD_REQUEST);
        } else
            return null;
    }
}
