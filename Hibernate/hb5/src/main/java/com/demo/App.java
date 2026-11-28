package com.demo;

import java.util.Random;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HBUtils;

public class App {
    public static void main(String[] args) {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();

        String[] designations = {
            "Java Developer",
            "Software Developer",
            "Software Engineer",
            "Backend Developer",
            "Frontend Developer",
            "Full Stack Developer",
            "Web Developer",
            "Android Developer",
            "Python Developer",
            "PHP Developer",
            "Dot Net Developer",
            "Data Analyst",
            "Data Scientist",
            "Data Engineer",
            "SQL Developer",
            "Database Administrator",
            "System Administrator",
            "Network Engineer",
            "DevOps Engineer",
            "Cloud Engineer",
            "Cybersecurity Analyst",
            "Security Engineer",
            "QA Engineer",
            "Software Tester",
            "Automation Tester",
            "Technical Support Engineer",
            "IT Support Specialist",
            "Business Analyst",
            "UI/UX Designer",
            "Machine Learning Engineer"
        };

        String[] companies = {
            "TCS",
            "Infosys",
            "Wipro",
            "HCL Technologies",
            "Tech Mahindra",
            "Accenture",
            "Cognizant",
            "Capgemini",
            "IBM",
            "Microsoft",
            "Google",
            "Amazon",
            "Oracle",
            "LTIMindtree",
            "Persistent Systems",
            "Zensar Technologies",
            "Hexaware",
            "Mphasis",
            "KPIT Technologies",
            "Deloitte",
            "EY",
            "KPMG",
            "PwC",
            "Cisco",
            "SAP",
            "Zoho",
            "Freshworks",
            "NVIDIA",
            "Qualcomm",
            "Atlassian"
        };

        Random r = new Random();
        for (int i = 1; i <= 5000; i++) {
            Employee e = new Employee();
            StringBuilder name = new StringBuilder();
            for (int j = 1; j <= 10; j++) {
                name.append((char) (r.nextInt(26) + 65));
            }
            e.setName(name.toString());
            e.setCompany(companies[r.nextInt(companies.length)]);
            e.setDesignation(designations[r.nextInt(designations.length)]);

            int value = r.nextInt(1000);
            if (value == 0) {
                value++;
            }
            e.setSalary(value * 1000.0);

            session.save(e);
        }

        tx.commit();
        session.close();
    }
}