package sample;

// 抽象方法
public interface Member1 
{
    String getUserName(String name);
}




// 主要實現方法
class Member2 implements Member1 
{
   public String getUserName(String name) 
   {
	   return name;
   }
}

