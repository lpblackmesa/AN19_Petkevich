package lesson7.l1;


public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public static void show() {
        Days[] day = Days.values();
        for (Days s : day) {
            System.out.print(s);
            if (s == Days.SATURDAY | s == Days.SUNDAY) {
                System.out.println(" - WEEKEND");
            } else {
                System.out.println(" - WORK DAY");
            }
        }
    }
}