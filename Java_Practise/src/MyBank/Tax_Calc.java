package MyBank;

public class Tax_Calc {

    public void t_calc(int Salary) {
        float tax = 0;

         if (Salary < 500000 && Salary > 250001) {
            tax = (float) (Salary*0.05);

        }

        else if (Salary < 750000 && Salary > 500001) {
            tax = (float) (Salary*0.1);
        }

        else if (Salary < 1000000 && Salary > 750001) {
            tax = (float) (Salary*0.15);
        }

        else if (Salary < 1250000 && Salary > 1000001) {
            tax = (float) (Salary*0.2);
        }

        else if (Salary < 1500000 && Salary > 1250001) {
            tax = (float) (Salary*0.25);
        }

        else if (Salary > 1500000) {
            tax = (float) (Salary*0.30);
        }
        System.out.println("Your total tax amount: " + tax);

    }

}
