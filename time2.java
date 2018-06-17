
public class time2 {
private int hour;
private int minute;
private int second;
//default constructor
public time2(){
	hour = 0;
	minute = 0;
	second = 0;
}
public time2(int h){
	hour = h;
	minute = 0;
	second = 0;
}
public time2(int h,int m){
	hour = h;
	minute = m;
	second = 0;
}
public time2(int h, int m, int s){
	hour = h;
	minute = m;
	second = s;
}
public int getHour()
{
	return hour;
}
public int getMinute(){
	return minute;
}

public int getSecond(){
	return second;
}
}