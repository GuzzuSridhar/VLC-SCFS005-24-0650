package com.ntuc.funcprog;

// the annotation helps the check for SAM
// annotation is optional
@FunctionalInterface
public interface SimpleFi {
    void print(String s);
    // void prints(String s);
}
