package com.f0cus;

import com.f0cus.interfaces.Contract;

import java.time.LocalDate;

public class NotSoSimpleClass implements Contract {
    @Override
    public String showCompleteContract() {
        return "Terms and Conditions Apply!";
    }

    @Override
    public LocalDate showContractExpiry() {
        return null;
    }
}
