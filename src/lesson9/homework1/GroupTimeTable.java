package lesson9.homework1;

import java.util.ArrayList;
import java.util.List;

public class GroupTimeTable {
    private List<Teacher> studyDay = new ArrayList<>();
    private int group;

    public GroupTimeTable(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void addCouple(Teacher couple) {
        studyDay.add(couple);
    }

    public void getStudyGroupDay() {
        System.out.println("group " + group);
        System.out.println(studyDay);
    }

}
