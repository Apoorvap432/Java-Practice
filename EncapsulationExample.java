class EmployeeCount{
    //isko private bnaege taaki bhr se access na ho ske 
    private int numOfEmployees = 0;

    //setter method 
    public void SetEmployee(int count) {
        if(numOfEmployees<0){
            throw new IllegalArgumentException("No. of Employees can't be a negative value");
        }

        //agr value negative ni hai to fir vo return kr dega no. of employees
        numOfEmployees = count;
    }

    //getter method - to read values
    public int getEmployee(){
        return numOfEmployees;
    }

    public int getPayroll(int averageSalary){
        int total = numOfEmployees*averageSalary;
        return total;
    }

}

public class EncapsulationExample {
    public static void main(String[] args) {
        EmployeeCount e = new EmployeeCount();

        e.SetEmployee(54);
        System.out.println("Total no. of employees are: " + e.getEmployee());

        int total = e.getPayroll(20000);
        System.out.println("The total payroll for " + e.getEmployee() + " employees are: " + total);
    }
}
