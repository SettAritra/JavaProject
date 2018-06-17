//simple program to get familiar with getter and setter methods of Java.
class CalculateTime{
    private int hour,minute,second;
    public void setHour(int h){
        hour = h;
    }
    public void setMinute(int m){
        minute = m;
    }
    public void setSecond(int s){
        second = s;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
}
class MainClass{
    public static void main(String[] args){
        CalculateTime cal = new CalculateTime();
        cal.setHour(12);
        cal.setMinute(24);
        cal.setSecond(36);
        System.out.println("Time is - "+ cal.getHour()+":"+cal.getMinute()+":"+cal.getSecond());
}
}