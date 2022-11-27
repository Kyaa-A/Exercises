import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class payslipown {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String employee[][] = {
            {"0121","Joane May Delima"},
            {"0122","Juan Dela Cruz"},
            {"0123","Koko"},
            {"0124","Jojo"}
        };

        System.out.println("\tPAYSLIP\n");

        System.out.print("Employee ID:\t");
        String id = scan.nextLine();

        if(id.equals("0121")){
            System.out.println("Name:\t\t" + employee[0][1]);
            System.out.println("Payroll for:\tMar-18");
        }else if(id.equals("0122")){
            System.out.println("Name:\t\t" + employee[1][1]);
            System.out.println("Payroll for:\tMar-18");
        }else if(id.equals("0123")){
            System.out.println("Name:\t\t" + employee[2][1]);
            System.out.println("Payroll for:\tMar-18");
        }else if(id.equals("0124")){
            System.out.println("Name:\t\t" + employee[3][1]);
            System.out.println("Payroll for:\tMar-18");
        }else{
            System.out.println("Invalid");
        }

        System.out.println();

        System.out.print("Rate per day:\t\t PHP ");
        double rpd = scan.nextDouble();

        System.out.print("SSS Contribution:\t PHP ");
        double sss = scan.nextDouble();

        System.out.print("PAGIBIG Contribution:\t PHP ");
        double ibig = scan.nextDouble();

        System.out.print("PhilHealth Contribution: PHP ");
        double phealth = scan.nextDouble();

        System.out.println();

        System.out.print("No. of days Worked:\t    ");
        double w = scan.nextDouble();

        System.out.print("No. of hours Late:\t    ");
        double l = scan.nextDouble();

        System.out.print("No. of hours Undertime:\t    ");
        double u = scan.nextDouble();

        System.out.print("No. of days Absent:\t    ");
        double a = scan.nextDouble();

        System.out.println("\nRules for late and undertime");
        double rflu = rpd / 8;
        System.out.println("  Every one hour late and undertime is equivalent to");
        System.out.println("  PHP\t" + df.format(rflu));

        System.out.println("\nRule for absent");
        double rfa = rpd;
        System.out.println("  Every one day absent is equivalent to");
        System.out.println("  PHP\t" + df.format(rfa));

        System.out.println();
        
        System.out.println("================INCOME=================\n");
        double bp = rpd*w;
        System.out.println("Basic Pay\t\tPHP " + df.format(bp));
        System.out.println("\t\t       ______________");
        double tl = bp;
        System.out.println("TOTAL INCOME\t\tPHP " + df.format(tl));

        System.out.println();

        System.out.println("===============DEDUCTION===============\n");

        System.out.println("SSS Cont.\t\t PHP " + df.format(sss));
        System.out.println("PAGIBIG Cont.\t\t PHP " + df.format(ibig));
        System.out.println("PhilHealth Cont.\t PHP " + df.format(phealth));
        System.out.println("Late \t\t         PHP " + df.format(rfa));
        double undertime = u*rflu;
        System.out.println("Undertime \t\t PHP " + df.format(undertime));
        double absent = a*rfa;
        System.out.println("Absent \t\t\t PHP " + df.format(absent));
        System.out.println("\t\t       ______________");
        double td = sss+ibig+phealth+rfa+undertime+absent;
        System.out.println("TOTAL DEDUCTION \t PHP " + df.format(td));

        System.out.println();

        System.out.println("TAKE HOME PAY:  \t PHP " + df.format(tl - td));
    }
}
