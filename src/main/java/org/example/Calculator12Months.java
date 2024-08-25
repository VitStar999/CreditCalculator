package org.example;

public class Calculator12Months {
    private double sum;
    private double months;
    private double costAuto;
    private double percentage1 = 3.75 / 100;
    private double percentage2 = 2.75 / 100;
    private double percentage3 = 1.49 / 100;
    private double percentage4 = 0.01 / 100;
    private double percentage5 = 0.01 / 100;
    public double onetimefee = 2.99/100;
    private double committee;

    public Calculator12Months(double costAuto, double sum, double months) {
        this.sum = sum;
        this.months = months;
        this.costAuto = costAuto;

    }


    public void creditMonths12() {
        double calculation;


        if ((sum / costAuto) * 100 == 30 && months == 12) {
            calculation = ((costAuto - sum) * percentage1) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else if ((sum / costAuto) * 100 == 40 && months == 12) {
            calculation = ((costAuto - sum) * percentage2) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else if ((sum / costAuto) * 100 == 50 && months == 12) {
            calculation = ((costAuto - sum) * percentage3) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else if ((sum / costAuto) * 100 == 60 && months == 12) {
            calculation = ((costAuto - sum) * percentage4) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else if ((sum / costAuto) * 100 == 70 && months == 12) {
            calculation = ((costAuto - sum) * percentage5) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else
            System.out.println("Введіть правильне значення");

    }


}


