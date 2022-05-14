package school.management.system;

/**
 * Thi class is responsible for keeping track of teachers in the school
 */
public class Teacher {
    public int id;
    public String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return id;
    }

    public int getSalaray()
    {
        return salary;
    }   
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + "]";
    }    
}
