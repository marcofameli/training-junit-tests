package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {
    @Test
    public void constructorShouldCreateObjectWithCorrectData() {
        Financing f1 = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, f1.getTotalAmount());
        Assertions.assertEquals(2000.0, f1.getIncome());
        Assertions.assertEquals(80, f1.getMonths());
    }

    @Test
    public void constructorShouldThrowExceptionWhenDataIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void ShouldUpdateTheTotalAmountWhenTheDataIsValid() {
        //aaa =  arrange action assert

        //arrange
        Financing f1 = new Financing(100000.0, 2000.0, 80);
        //action
        f1.setTotalAmount(90000.0);
        //assertion
        Assertions.assertEquals(f1.getTotalAmount(), 90000.0);

    }

    @Test
    public void shouldThrowExceptionWhenSetTotalAmountIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Financing f = new Financing(100000.0,2000.0, 80);
           f.setTotalAmount(110000.0);
        });
    }

    @Test
    public void shouldUpdateTheIncomeWhenTheDataIsValid (){
        Financing f1 = new Financing(100000.0, 2000.0, 80);

        f1.setIncome(2000.0);

        Assertions.assertEquals(2000.0,f1.getIncome());


    }

    @Test
    public void shouldThrowExceptionWhenTheDataOfIncomeIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
        {
            Financing f1 = new Financing(100000.0, 2000.0, 80);

            f1.setIncome(1000.0);

            Assertions.assertEquals(1000.0,f1.getIncome());
        });
    }

    @Test
    public void shouldUpdateTheMonthsWhenDataIsValid(){
        Financing f1 = new Financing(100000.0, 2000.0, 80);

        f1.setMonths(80);

        Assertions.assertEquals(80,f1.getMonths());
    }

    @Test
    public void shouldThrowExceptionWhenTheMonthIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
        {
            Financing f1 = new Financing(100000.0, 2000.0, 80);

            f1.setMonths(79);

            Assertions.assertEquals(79,f1.getMonths());
        });
    }

    @Test
    public void shouldCalculateCorrectlyTheValueOfEntry(){
        Financing f = new Financing(100000.0,2000.0,80);
        Assertions.assertEquals(20000.0,f.entry());
    }

    @Test
    public void shouldCalculateCorrectlyTheValueOfQuota(){
        Financing f = new Financing(100000.0,2000.0,80);

        Assertions.assertEquals(1000.0,f.quota());
    }



}
