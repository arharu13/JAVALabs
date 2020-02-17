package ua.firstlab.java.lesson;

public class TouristPermit {
    private static int Time_Trevel = 10;
    public double duration_in_day;
    public double cost_in_euro;
    private int star_number;
    private String name_hotel;
    public String country;
    protected int average_temp;
    protected String food;

    public int getAverage_temp() {
        return average_temp;
    }

    public void setAverage_temp(int average_temp) {
        this.average_temp = average_temp;
    }

    public static int getTime_trevel() {
        return Time_Trevel;
    }

    public static void setTime_trevel(int time_trevel) {
        TouristPermit.Time_Trevel = time_trevel;
    }

    public double getDuration_in_day() {
        return duration_in_day;
    }

    public void setDuration_in_day(double duration_in_day) {
        this.duration_in_day = duration_in_day;
    }

    public double getCost_in_euro() {
        return cost_in_euro;
    }

    public void setCost_in_euro(double cost_in_euro) {
        this.cost_in_euro = cost_in_euro;
    }

    public int getStar_number() {
        return star_number;
    }

    public void setStar_number(int star_number) {
        this.star_number = star_number;
    }

    public String getName_hotel() {
        return name_hotel;
    }

    public void setName_hotel(String name_hotel) {
        this.name_hotel = name_hotel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TouristPermit( double duration_in_day, double cost_in_euro, int star_number, String name_hotel, String country, String food) {
        this.duration_in_day = duration_in_day;
        this.cost_in_euro = cost_in_euro;
        this.star_number = star_number;
        this.name_hotel = name_hotel;
        this.country = country;
        this.food = food;
    }

    public TouristPermit(double duration_in_day, double cost_in_euro, int star_number, String name_hotel) {
        this(duration_in_day, cost_in_euro, star_number, name_hotel, null, null);

    }

    public TouristPermit() {
        this(0, 0, 0, null, null, null);
    }

    @Override
    public String toString() {
        return "TouristPermit{" +
                "duration_in_day=" + duration_in_day +
                ", cost_in_euro=" + cost_in_euro +
                ", star_number=" + star_number +
                ", name_hotel='" + name_hotel + '\'' +
                ", country='" + country + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    public static void   printStaticTime_Trevel() {
        System.out.println("Time_in_hour = " + Time_Trevel);
    }
    public static  void  printTime_Trevel() {
        System.out.println("Time_in_hour = " + Time_Trevel);
    }

    public TouristPermit(double duration_in_day, double cost_in_euro, int star_number, String name_hotel, String country, int average_temp, String food) {
        this.duration_in_day = duration_in_day;
        this.cost_in_euro = cost_in_euro;
        this.star_number = star_number;
        this.name_hotel = name_hotel;
        this.country = country;
        this.average_temp = average_temp;
        this.food = food;
    }
}



