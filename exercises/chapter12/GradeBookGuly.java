package exercises.chapter12;

import java.util.Map;

public class GradeBookGuly extends TestResults {

    public static void main(String[] args) {

        Map<String, Integer> gradeBook=TestResults.getOriginalGrades();
        Map<String, Integer> makeUpTest=TestResults.getMakeUpGrades();

        for(var student : makeUpTest.entrySet()){
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = makeUpTest.get(student.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(student.getKey(), secondGrade);
            }

        }
        System.out.println("Final Grades:");
        gradeBook.forEach(
                (k,v)->System.out.println("Student: " + k + ", Final Grade: " + v));
    }
}
