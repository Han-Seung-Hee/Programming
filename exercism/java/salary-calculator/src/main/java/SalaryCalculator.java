import java.math.BigDecimal;

public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
       return  daysSkipped >= 5 ? 0.85 : 1 ;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double base = 1000;
        double multifiler_Days = multiplierPerDaysSkipped(daysSkipped);
        double bonusAmt = bonusForProductSold(productsSold);
        
        if(multifiler_Days * base + bonusAmt >= 2000){
            return 2000;
        }else{
            return multifiler_Days * base + bonusAmt;
        }

    } 
}
