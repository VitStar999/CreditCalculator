package org.example;

public class Calculator36Months {

    private double sum;
    private double months;
    private double costAuto;
    private double percentage1 = 8.99/100;
    private double percentage2 =  8.49/100;
    private double percentage3 = 7.49/100;
    private double percentage4= 5.49/100;
    private double percentage5= 4.99/100;
    private double onetimefee = 2.99/100;
    private double committee;


    public Calculator36Months(double costAuto, double sum, double months) {
        this.sum = sum;
        this.months = months;
        this.costAuto = costAuto;

    }


    public  void creditMonths36() {
        double calculation;

        if ((sum / costAuto) * 100 == 30 && months == 36 ) {
            calculation = ((costAuto - sum) * percentage1) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else if ((sum / costAuto) * 100 == 40 && months == 36) {
            calculation = ((costAuto - sum) * percentage2) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else if ((sum / costAuto) * 100 == 50 && months == 36) {
            calculation = ((costAuto - sum) * percentage3) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else if ((sum / costAuto) * 100 == 60 && months == 36) {
            calculation = ((costAuto - sum) * percentage4) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else if ((sum / costAuto) * 100 == 70 && months == 36) {
            calculation = ((costAuto - sum) * percentage5) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else
            System.out.println("Введіть правильне значення");

    }
}
