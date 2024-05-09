package oop.labor09.feladat3;

import oop.labor09.feladat2.MyDate;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Ceg_temp");


        company.hire(new Manager("Jozsi", "Gergely", 200, new MyDate(2000, 11, 22), "IT"));
        company.hire(new Employee("Papp", "Benjamin", 100, new MyDate(2004, 10, 27)));
        company.hire(new Employee("Kiss", "Lajos", 100, new MyDate(2004, 2, 21)));

        System.out.println("Eredeti: ");
        company.printAll(System.out);
        System.out.println();

        System.out.println("Eredeti rendezve nevek szerint: ");
        company.sortByCompareator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getLName().equals(o2.getLName())) {
                    return o1.getFName().compareTo(o2.getFName());
                }

                return o1.getLName().compareTo(o2.getLName());
            }
        });
        company.printAll(System.out);
        System.out.println();

        System.out.println("Eredeti rendezve fizetes szerint: ");
        company.sortByCompareator((Employee o1, Employee o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        company.printAll(System.out);
    }
}