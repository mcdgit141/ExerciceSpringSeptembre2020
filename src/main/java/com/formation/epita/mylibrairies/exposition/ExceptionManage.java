package com.formation.epita.mylibrairies.exposition;

import com.formation.epita.mylibrairies.domain.exception.LibrairieNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages = "com.formation.epita.mylibrairies")
public class ExceptionManage {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionManage.class);

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(LibrairieNotFoundException.class)
    public String librairieNotFound(LibrairieNotFoundException exception) {
        String codeErreur = exception.getErrorCode();
        LOGGER.info("Error {} : {}", codeErreur, exception.getMessage());
        return codeErreur;
    }


}
