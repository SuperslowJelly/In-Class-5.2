package io.github.superslowjelly.inclass52;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Company complexFTB = new Company("Complex FTB",
            new Employee[]{
                    new Employee("Frank", JobTitles.OWNER),
                    new Employee("Jelly", JobTitles.MANGER),
                    new Employee("Kookie", JobTitles.ADMIN),
                    new Employee("Wxirdd", JobTitles.MODERATOR),
                    new Employee("Juan_Pablo", JobTitles.HELPER)
            }
        );

        StringBuilder output = new StringBuilder("Company Name: ").append(complexFTB.getName()).append('\n')
                .append("Number of Employees: ").append(complexFTB.getNumberOfEmployees());

        DecimalFormat format = new DecimalFormat("#,###");

        for (Employee employee : complexFTB.getEmployees())
            output.append("\n").append(employee.getName()).append(", ").append(employee.getJob().toString().toLowerCase()).append(" - £").append(format.format(employee.getJob().getSalary()));

        System.out.print(output);

    }

}
