package com.calculator.addservice.model.response;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class OperationResultResponse {
    private Double result;
    private Double cost;

    public OperationResultResponse() {
    }

    public OperationResultResponse(Double result, Double cost) {
        this.result = result;
        this.cost = cost;
    }

    public OperationResultResponse(Double result) {
        this.result = result;
    }

    public Double getResult() {
        return result;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "OperationResultResponse{" +
                "result=" + result +
                ", cost=" + cost +
                '}';
    }
}
