package com.smarttoolfactory.tutorial2_1mockito.model_math_application;

import androidx.annotation.Nullable;

public class MathApplication {

    private CalculatorService calcService;

    public void setCalculatorService(CalculatorService calcService){
        this.calcService = calcService;
    }

    public double add(double input1, double input2){
        return calcService.add(input1, input2);
    }

    public double subtract(double input1, double input2){
        return calcService.subtract(input1, input2);
    }

    public double multiply(double input1, double input2){
        return calcService.multiply(input1, input2);
    }

    public double divide(double input1, double input2){
        return calcService.divide(input1, input2);
    }

    @Override
    public boolean equals(@Nullable Object obj) {

        if (obj.getClass() == MathApplication.class) {
            MathApplication mathApplication = (MathApplication) obj;
            return (this.calcService == mathApplication.calcService) || this.calcService == null;
        }

        return super.equals(obj);
    }
}