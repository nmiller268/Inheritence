import java.util.ArrayList;
public class InheritenceDemo {
    public static void main(String[] args) {
        //Create Workers
        Worker worker1 = new Worker( "Julie Hart",  10.00);
        Worker worker2 = new Worker("Jane Lupo",  12.00);
        Worker worker3 = new Worker("Jack Azala", 14.00);

        //Create SalaryWorkers
        SalaryWorker salaryWorker1 = new SalaryWorker("Tim Henry",   20000.00);
        SalaryWorker salaryWorker2 = new SalaryWorker("Tom Stroke",  25000.00);
        SalaryWorker salaryWorker3 = new SalaryWorker("Tina Turner",  30000.00);

        //Add Workers and SalaryWorkers to ArrayList
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        System.out.println("Weekly Pay Per Worker");
        System.out.println("------------------------------------");
        System.out.println("Name\tWeek 1\tWeek 2\tWeek 3");
        System.out.println("------------------------------------");

        //Loop through ArrayList and print out each worker's weekly pay
        for (Worker w : workers) {
            System.out.println(w.getFullName() + "\t" + w.calculateWeeklyPay(40) + "\t" + w.calculateWeeklyPay(50) + "\t" + w.calculateWeeklyPay(40));
        }
    }
}

