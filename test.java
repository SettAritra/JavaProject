public class test{
//private variable
private int x;
//set method   
public void setVal(int m)
{
this.x = m;
}
//get method
public int getVal(){
    return this.x;
}
//main method
public static void main(String[] args){
        System.out.println("This is my main method");
        System.out.println("Accessing private variable 'x' using getter and setter .....");
        int val;
        test obj = new test();
        obj.setVal(100);
        val = obj.getVal();
        System.out.println("Value received: "+val);
}
}