package com.solidPrinciples.replaceSwitch;

//https://howtodoinjava.com/java/enum/java-enum-string-example/

//https://www.developer.com/design/seven-ways-to-refactor-java-switch-statements/

import java.util.Arrays;
import java.util.Optional;

public enum MetricTypes {

    KB("kilobytes") {
        @Override
        public double normalizeValue(double value) {
            return value * 1024;
        }
    },
    MB("megabytes") {
        @Override
        public double normalizeValue(double value) {
            return value * 1048576;
        }
    },
    BYTES("bytes") {
        @Override
        public double normalizeValue(double value) {
            return value;
        }
    },
    GB("gigabytes") {
        @Override
        public double normalizeValue(double value) {
            return value * 1073741824;
        }
    };

    private final String label;

    MetricTypes(String kk) {
        this.label = kk;
    }

    public String getLabel(){
        return label;
    }

    public abstract double normalizeValue(double value);

    //****** Reverse Lookup ************//
    public static Optional<MetricTypes> getEnum(String textName) {
        return Arrays.stream(MetricTypes.values())
                .filter(metric -> textName.contains(metric.getLabel().toLowerCase()))
                .findFirst();
    }
}

