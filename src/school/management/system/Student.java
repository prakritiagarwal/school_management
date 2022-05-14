package school.management.system;

/*
This class is to keep track of students
*/
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
 /**
 * Fees for every student will be $30,000
 * Fees paid initially is $0
 * @param id Student ID to initialize
 * @param name Student Name
 * @param grade Student Grade
 */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * 
     * @param grade
     */
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    /**
     * Keep adding the fee paid to feepaid
     * Add the fees to the fees paid
     * The school is going to receive the funds
     * @param fees The fee student pays
     */
    public void payFees(int fees)
    {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student [feesPaid=" + feesPaid + ", feesTotal=" + feesTotal + ", grade=" + grade + ", id=" + id
                + ", name=" + name + "]";
    }

    
    
}
