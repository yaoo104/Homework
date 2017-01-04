package Module4;

import java.util.*;
import java.util.Currency;

/**
 * Created by aleks_000 on 24.11.2016.
 */
public class ChinaBank extends Bank{


    public ChinaBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    public int getLimitOfWithdrawal() {
        return this.getCurrency() == Currency.USD ? 100 : 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 5000;
        else return 10000;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR)
            return 1;
        else return 0;
    }

    @Override  public int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return 3;
            else return 5;
        } else {
            if (amount < 1000) return 1;
            else return 11;
    }
    }
    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
