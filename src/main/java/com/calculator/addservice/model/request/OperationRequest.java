package com.calculator.addservice.model.request;

import java.math.BigDecimal;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class OperationRequest {
    private Double firstNumber;
    private Double secondNumber;

    public OperationRequest() {
    }

    public OperationRequest(Double firstNumber, Double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    @Override
    public String toString() {
        return "OperationRequest{" +
                "firstNumber=" + firstNumber +
                ", SecondNumber=" + secondNumber +
                '}';
    }
}
