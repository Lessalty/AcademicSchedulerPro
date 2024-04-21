package match;

import department.Department;
import department.Professor;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProfProcessor {
    public static void loadProfessors(String filePath, Department department, Matcher matcher) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double seniority = Double.parseDouble(parts[2]);
                Date hiringDate = new SimpleDateFormat("dd/MM/yyyy").parse(parts[3]);

                Professor professor = new Professor(id, name, seniority, hiringDate);
                matcher.addProfessorToQueue(professor);
            }
        } catch (FileNotFoundException | ParseException e) {
            System.err.println("Error reading professor file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Department department = new Department();
        Matcher matcher = new Matcher(department);
        loadProfessors("path/to/profs.txt", department, matcher);
        matcher.processAssignments();
    }
}

