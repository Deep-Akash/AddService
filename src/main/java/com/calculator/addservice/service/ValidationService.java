package com.calculator.addservice.service;

import com.calculator.addservice.exceptions.FaultyRequestException;
import com.calculator.addservice.exceptions.NumberMissingException;
import com.calculator.addservice.model.request.OperationRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.springframework.stereotype.Service;

/**
 * Created by akashdeepnew on 21/12/18.
 */
@Service
public class ValidationService {
    private static final Logger logger = LogManager.getLogger(ValidationService.class);

    public void validateServiceRequest(OperationRequest request) throws Exception {
        if (null == request) {
            throw new FaultyRequestException();
        }
        if (null == request.getFirstNumber()) {
            throw new NumberMissingException();
        }
        if (null == request.getSecondNumber()) {
            throw new NumberMissingException();
        }
    }
}
