package Module4;

import java.util.*;
import java.util.Currency;

/**
 * Created by aleks_000 on 24.11.2016.
 */
public class USBank extends Bank {


    public USBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return 1000;
        else return 1200;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 10000;
        else return 0;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR)
            return 2;
        else return 1;
    }

    @Override
    public int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD) {
            if (summ < 1000) return 5;
            else return 7;
        } else {
            if (summ < 1000) return 6;
            else return 8;
        }
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
