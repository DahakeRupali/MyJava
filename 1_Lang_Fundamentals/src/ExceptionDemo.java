/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trnguser1
 */
public class ExceptionDemo {
    public static void division() throws Exception
    {
    int no1 =23;
    int no2 =-3;
        if(no2<0)
        throw(new Exception("Can not divide by -ve"));
    System.out.println("Division is : " + no1/no2);
    }
public static void main(String args[])
{    
try{
division();
}catch(Exception ex)
{
System.out.println(ex);
}finally{
System.out.println("****Thanks You********");
}
}
}
