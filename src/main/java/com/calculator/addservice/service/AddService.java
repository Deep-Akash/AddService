package com.calculator.addservice.service;

import com.calculator.addservice.model.request.OperationRequest;
import com.calculator.addservice.model.response.OperationResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by akashdeepnew on 20/12/18.
 */
@Service
public class AddService {

    @Autowired
    private PropertyProviderService propertyProviderService;

    public OperationResultResponse add(OperationRequest request) {
        Double result = add(request.getFirstNumber(),request.getSecondNumber());
        return new OperationResultResponse(result,getCreditCost());
    }

    private Double add(Double first, Double second) {
        return first+second;
    }

    public Double getCreditCost() {
        return propertyProviderService.getCreditCost();
    }

}
