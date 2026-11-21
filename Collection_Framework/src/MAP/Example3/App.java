package MAP.Example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.model.Student;
import com.model.StudentByCityASC;

public class App {

    public static void main(String[] args) {
        Map<Student, Map<String, Collection<String>>> Students =
                new TreeMap<>(new StudentByCityASC());
        Student s1 = new Student(17, "Umang", "Jaipur", 95.44);
        Map<String, Collection<String>> detailsOfS1 = new LinkedHashMap<>();
        Set<String> imagesOfS1 = new LinkedHashSet<>();
        imagesOfS1.add("img001.jpg");
        imagesOfS1.add("img002.jpg");
        imagesOfS1.add("img003.jpg");
        imagesOfS1.add("img004.jpg");
        detailsOfS1.put("images", imagesOfS1);
        Set<String> CertificationsOfS1 = new LinkedHashSet<>();
        CertificationsOfS1.add("Certified Professional Photographer");
        CertificationsOfS1.add("BIPP Qualification");
        CertificationsOfS1.add("Accredited Professional Photographer");
        detailsOfS1.put("Certification", CertificationsOfS1);
        Set<String> achievementOfS1 = new LinkedHashSet<>();
        achievementOfS1.add("Sony World Photography Award");
        achievementOfS1.add("MOMA Solo Colour Exhibition (1996)");
        achievementOfS1.add("Captured view from the window of Le Gras");
        detailsOfS1.put("achievements", achievementOfS1);
        List<String> reviewOfS1 = new ArrayList<>();
        reviewOfS1.add("Sony World Photography Award");
        reviewOfS1.add("MOMA Solo Colour Exhibition (1996)");
        reviewOfS1.add("Captured view from the window of Le Gras");
        detailsOfS1.put("review", reviewOfS1);
        Students.put(s1, detailsOfS1);
        
        Student s2 = new Student(4, "Dharmesh", "Pune", 78.44);
        Map<String, Collection<String>> detailsOfS2 = new LinkedHashMap<>();
        Set<String> imagesOfS2 = new LinkedHashSet<>();
        imagesOfS2.add("img005.jpg");
        imagesOfS2.add("img006.jpg");
        detailsOfS2.put("images", imagesOfS2);
        Set<String> CertificationsOfS2 = new LinkedHashSet<>();
        CertificationsOfS2.add("Oracle Certified Professional");
        CertificationsOfS2.add("Certified Information Systems Security Professional");
        CertificationsOfS2.add("Databricks Certified");
        detailsOfS2.put("Certification", CertificationsOfS2);
        Set<String> achievementOfS2 = new LinkedHashSet<>();
        achievementOfS2.add("Developed the first compiler (A-0) and contributed to COBOL");
        detailsOfS2.put("achievements", achievementOfS2);
        List<String> reviewOfS2 = new ArrayList<>();
        reviewOfS2.add("Nice programmer");
        reviewOfS2.add("Best Programmer");
        reviewOfS2.add("Fake Programmer");
        detailsOfS2.put("review", reviewOfS2);
        Students.put(s2, detailsOfS2);

        Set<Student> setOfStudents = Students.keySet();
        int Count = 0;
        for (Student s : setOfStudents) {
            System.out.println("Student No: " + (++Count));
            System.out.println(s);
            Map<String, Collection<String>> details = Students.get(s);
            System.out.println("Images");
            for (String obj : details.get("images")) {
                System.out.println(obj);
            }
            System.out.println("Certification");
            for (String obj : details.get("Certification")) {
                System.out.println(obj);
            }
            System.out.println("Achievements");
            for (String obj : details.get("achievements")) {
                System.out.println(obj);
            }
            System.out.println("Reviews");
            for (String obj : details.get("review")) {
                System.out.println(obj);
            }
            System.out.println("_____________________________________________________");
        }

    }
}