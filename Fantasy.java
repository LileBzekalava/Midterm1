package midterm.lile_bzekalava_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends midterm.lile_bzekalava_1.task1.AbstractFantasy implements midterm.lile_bzekalava_1.task1.Dream {
    // Change studentName to your name
    private String studentName;

    public Fantasy(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String getOrthodox1() {
        return "Fantasy by " + studentName + " is imaginative and creative.";
    }

    @Override
    public String getField2() {
        return "Fantasy by " + studentName + " explores fantastical realms.";
    }

    @Override
    public String methodHospitality3(String argScissors5) {
        return "Fantasy by " + studentName + " promotes hospitality with " + argScissors5 + ".";
    }

    @Override
    public List<String> methodFolk4(String argDesigner6) {
        List<String> folkList = new ArrayList<>();
        folkList.add("Fantasy by " + studentName + " portrays diverse folk cultures.");
        folkList.add("Fantasy by " + studentName + " celebrates " + argDesigner6 + ".");
        return folkList;
    }

    public static void main(String[] args) {
        Fantasy fantasy = new Fantasy("Your Name");
        System.out.println(fantasy.getOrthodox1());
        System.out.println(fantasy.getField2());
        System.out.println(fantasy.methodHospitality3("magic"));
        System.out.println(fantasy.methodFolk4("mythical creatures"));
    }
}
