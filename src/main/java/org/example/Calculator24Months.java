package org.example;

public   class Calculator24Months {
    private double sum;
    private double months;
    private double costAuto;
    private double percentage1 = 6.99/100;//0.069
    private double percentage2 =  5.99/100;
    private double percentage3 = 4.99/100;
    private double percentage4= 3.99/100;
    private double percentage5= 0.01/100;
    private double onetimefee = 2.99/100;
    private double committee;


    public Calculator24Months(double costAuto, double sum, double months) {
        this.sum = sum;
        this.months = months;
        this.costAuto = costAuto;

    }


    public  void creditMonths24() {
        double calculation;

        if ((sum / costAuto) * 100 == 30 && months == 24 ) {
            calculation = ((costAuto - sum) * percentage1) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        } else if ((sum / costAuto) * 100 == 40 && months == 24) {
            calculation = ((costAuto - sum) * percentage2) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else if ((sum / costAuto) * 100 == 50 && months == 24) {
            calculation = ((costAuto - sum) * percentage3) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на мысяць становить " +calculation);
        }else if ((sum / costAuto) * 100 == 60 && months == 24) {
            calculation = ((costAuto - sum) * percentage4) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else if ((sum / costAuto) * 100 == 70 && months == 24) {
            calculation = ((costAuto - sum) * percentage5) / months + ((costAuto - sum) / months);
            committee = (costAuto - sum) * onetimefee;
            System.out.println(" Разова комісія становить " + committee + ". Виплата по кредиту на місяць становить " +calculation);
        }else
            System.out.println("Введіть правильне значення");

    }


}


