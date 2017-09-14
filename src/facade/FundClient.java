package facade;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-14
 * @Time: 15:30
 */
public class FundClient {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
