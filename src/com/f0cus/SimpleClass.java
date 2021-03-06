package com.f0cus;

import com.f0cus.interfaces.Contract;

import java.time.LocalDate;

public class SimpleClass implements Contract {

    private String result;

    public SimpleClass() {
    }

    public SimpleClass(String result) {
        this.result = result;
    }

    /**
     * Returns result of some calculations
     *
     *
     */
    public String getResult() {
        return "xyz";
    }

    @Override
    public String showCompleteContract() {
        return "Contract should be obeyed at all times, @Copyright 2022";
    }

    @Override
    public LocalDate showContractExpiry() {
        return LocalDate.of(2030, 12, 31);
    }

    private static class SimpleInnerClass {

    }


}
