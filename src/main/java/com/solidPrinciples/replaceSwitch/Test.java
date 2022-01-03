package com.solidPrinciples.replaceSwitch;

public class Test {
    public static void main(String[] args) {
        String testStr = "kilobytes";
        System.out.println(
                MetricTypes
                .getEnum(testStr)
                .orElseThrow(IllegalArgumentException::new)
                .normalizeValue(200)
        );
    }
}
