package sample;

// 抽象方法
public interface Product1 {
    Integer getApple(Integer Apple);
    Integer getBanana(Integer Banana);
    Integer getOrange(Integer Orange);
    Integer getPeach(Integer Peach);
    Integer getSum1(Integer Apple, Integer Banana, Integer Orange, Integer Peach);
    Integer getSum2(Integer Sum1);
    Integer getSum3(Integer Sum2);
    Integer getSum4(Integer Sum3);
}

// 主要實現方法
class Product2 implements Product1 
{
    public Integer getApple(Integer Apple) { return Apple * 10; }
    public Integer getBanana(Integer Banana) { return Banana * 20; }
    public Integer getOrange(Integer Orange) { return Orange * 30; }
    public Integer getPeach(Integer Peach) { return Peach * 40; }

    // 原價
    public Integer getSum1(Integer Apple, Integer Banana, Integer Orange, Integer Peach) 
    {
        return getApple(Apple)+getBanana(Banana)+getOrange(Orange)+getPeach(Peach);
    }

    // 滿千95折
    public Integer getSum2(Integer Sum1) 
    {
       return (int)(Sum1*0.95);
    }

    // 會員95折
    public Integer getSum3(Integer Sum2) 
    {
    	return  (int)(Sum2);
    }
    
    // 會員再打95折
    public Integer getSum4(Integer Sum3)  
    {
    	return (int) (Sum3*0.95);
    }
}
