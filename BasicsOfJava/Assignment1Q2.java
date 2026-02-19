public class Assignment1Q2 {
    public static void main(String[] args) {
        Employee emp =new Employee(111, "Jethalal", 25000);
        Manager mgr = new Manager(197, "Ashish", 60000, 15000, 10000);
        Programmer prog = new Programmer(202, "Yash", 45000, 12000);
        emp.displayDetails(); 
        mgr.displayDetails();
        prog.displayDetails();
    }
}


class Employee {
    int id;
    String name;
    double BasicSalary;
    public Employee(int id, String name, double BasicSalary) {
        this.id = id;
        this.name = name;
        this.BasicSalary = BasicSalary;
    }
    public double calculateSalary() {
        return BasicSalary;
    }
    public void displayDetails() {
        System.out.println("---------------------------Employee Details----------------------------------");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + BasicSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}



class Manager extends Employee {
    double house_rent;
    double bonus;
    public Manager(int id, String name, double BasicSalary, double house_rent, double bonus) {
        super(id, name, BasicSalary);
        this.house_rent = house_rent;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return BasicSalary + house_rent + bonus;
    }
    @Override
    public void displayDetails() {
        System.out.println("---------------------------Manager Details----------------------------------");
        System.out.println("Manager ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + BasicSalary);
        System.out.println("House Rent: " + house_rent);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}


class Programmer extends Employee {
    double extra_bonus;
    public Programmer(int id, String name, double BasicSalary, double extra_bonus) {
        super(id, name, BasicSalary);
        this.extra_bonus = extra_bonus;
    }

    @Override
    public double calculateSalary() {
        return BasicSalary + extra_bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("---------------------------Programmer Details---------------------------------");
        System.out.println("Programmer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + BasicSalary);
        System.out.println("Extra Bonus: " + extra_bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}