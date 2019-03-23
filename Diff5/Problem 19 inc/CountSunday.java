public class CountSunday {
    public static void main(String[] commandLine) {
        int[][][] century = new int[100][12][];
        for(int year = 0; year < century.length; year++) {
            for(int month = 0; month < century[year].length; month++){
                century[year][month] = new int[createDays(month, year)];
                for(int day = 0; day < century[year][month].length; day++){
                    System.out.println(century[year][month][day]);
                }
            }
        }
    }
    public static boolean isLeap(int year) {
        if(year % 4 == 0) {
            if (year % 100 == 0)
                return year % 400 == 0;
            return true;
        }
        return false;
    }
    public static int createDays(int month, int year) {
        return 30;
    }
    /* 30 days
    April
    June 
    September 
    November 
    */
    /* 31 days
    January
    March
    May
    July
    August 
    October 
    December 
    */
    /*29/28 days 
    February 
    */
}