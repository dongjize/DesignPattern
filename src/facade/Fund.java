package facade;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-14
 * @Time: 15:26
 */
public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt1 nationalDebt1;
    private Realty1 realty1;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nationalDebt1 = new NationalDebt1();
        realty1 = new Realty1();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt1.buy();
        realty1.buy();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt1.sell();
        realty1.sell();
    }

}
