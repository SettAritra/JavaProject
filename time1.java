
public class time1 {
public static void main(String[] args){
	time2 obj = new time2();
	time2 obj1 = new time2(12);
	time2 obj2 = new time2(12,24);
	time2 obj3 = new time2(12,24,36);
	System.out.println(obj.getHour()+":"+obj.getMinute()+":"+obj.getSecond());
	System.out.println(obj1.getHour()+":"+obj1.getMinute()+":"+obj1.getSecond());
	System.out.println(obj2.getHour()+":"+obj2.getMinute()+":"+obj2.getSecond());
	System.out.println(obj3.getHour()+":"+obj3.getMinute()+":"+obj3.getSecond());	
}
}
