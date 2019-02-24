package com.company;

public interface IBaseInterestRate {
    default double getBaseInterestRate(){
        return 2.5;
    }
}
