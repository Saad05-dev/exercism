public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        int penalties = daysSkipped / 5;
       return penalties > 0 ? 1 - 1 * 0.15 * penalties : 1; 
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold >= 20 ? productsSold * 13 : productsSold * 10;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finalSalary < 2000 ? finalSalary  : 2000; 
    } 
}
