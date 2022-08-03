package main;

public enum Days {
    SUNDAY(1, "Sunday"),
    MONDAY(2, "Monday"),
    TUESDAY(3, "Tuesday");

    private final Integer dayOfTheWeek;
    private final String dayName;

    Days(Integer dayOfTheWeek, String dayName){
        this.dayOfTheWeek = dayOfTheWeek;
        this.dayName = dayName;
    }
    public Integer getDayOfTheWeek(){
       // modifydayMame("1");
        return dayOfTheWeek;
    }
    public String getDayName(){
        return dayName;
    }
    private String modifydayMame(String dayName){
        return "modified";
    }

}
