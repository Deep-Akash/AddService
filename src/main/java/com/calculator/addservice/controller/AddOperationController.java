package com.calculator.addservice.controller;

import com.calculator.addservice.enums.APIResponseCodeENUM;
import com.calculator.addservice.exceptions.APIBaseException;
import com.calculator.addservice.model.request.OperationRequest;
import com.calculator.addservice.model.response.APIResponse;
import com.calculator.addservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * Created by akashdeepnew on 20/12/18.
 */
@RestController
@RequestMapping(value = "/add")
public class AddOperationController {

    @Autowired
    private AddService addService;

    @Autowired
    private ValidationService validateService;


    @PostMapping("/calculate")
    @ResponseBody
    public APIResponse calculate(@RequestBody OperationRequest operationRequest) throws Exception {
        validateService.validateServiceRequest(operationRequest);
        return APIResponse.buildSuccess(addService.add(operationRequest));
    }

    @GetMapping("/cost")
    @ResponseBody
    public APIResponse creditCost() throws Exception {
        return APIResponse.buildSuccess(addService.getCreditCost());
    }


    @ExceptionHandler
    @ResponseBody
    public APIResponse handleException(Exception ex) {
        if (ex instanceof APIBaseException){
            return APIResponse.buildFailure(((APIBaseException) ex).getApiResponseCodeENUM());
        }
        return APIResponse.buildFailure(APIResponseCodeENUM.GENERAL_FAILURE);
    }
}
