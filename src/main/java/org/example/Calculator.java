package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public Double multiplying(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }

    public Double divide(List<? extends Number> list) {
        double result = list.remove(0).doubleValue();
        for (Number number : list) {
            result /= number.doubleValue();
        }
        return result;
    }

    public String binary(List<?> list) {

        ArrayList<String> arrayList = new ArrayList<>();
        for (Object o : list) {
            String obj = o.toString().replace(",", ".");
            String[] d = obj.split("\\.");
            int integer1;
            Double aDouble;

            String result;
            if (d.length > 1) {
                if (d[1].equals("0")) {
                    integer1 = Integer.parseInt(d[0]);
                    result = binResultInt(integer1);
                } else {
                    integer1 = Integer.parseInt(d[0]);
                    aDouble = Double.parseDouble(obj) % (double) integer1;
                    result = binResultInt(integer1) + "." + binResultDouble2(aDouble);
                }
            } else {
                integer1 = Integer.parseInt(obj);
                result = binResultInt(integer1);
            }
            arrayList.add(result);
        }
        return arrayList.toString();
    }

    private String binResultDouble2(Double aDouble) {
        StringBuilder stringBuilder = new StringBuilder();
        while (aDouble > 0.0) {
            aDouble *= 2;
            if (aDouble >= 1.0) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }
            aDouble %= 1;
        }

        return stringBuilder.toString();
    }

    private String binResultInt(Integer integer) {
        if (integer <= 1) {
            return "1";
        }
        return binResultInt(integer / 2) + integer % 2;
    }
}