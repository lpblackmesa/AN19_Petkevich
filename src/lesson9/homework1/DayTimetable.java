package lesson9.homework1;

import java.util.ArrayList;
import java.util.List;

public class DayTimetable {
    List<GroupTimeTable> uniStudyDay = new ArrayList<>();

    public void addTimetable4group(GroupTimeTable groupTimeTable) {
        uniStudyDay.add(groupTimeTable);
    }

    public void getTimetable4group(int group) {
        for (int i = 0; i < uniStudyDay.size(); i++)
            if (uniStudyDay.get(i).getGroup() == group) {
                uniStudyDay.get(i).getStudyGroupDay();
            }
    }
}
