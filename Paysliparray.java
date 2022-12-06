import java.util.Scanner;
import java.text.DecimalFormat;

public class Paysliparray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        String info[][] = {
                { "0121", "Joane May Delima" },
                { "0122", "Juan Dela Cruz" },
                { "0123", "Vincent Rivera" },
                { "0124", "Ryan Depalubos" }
        };
        System.out.println("*".repeat(63));
        System.out.print("\n Employee ID:\t ");
        String id = scan.nextLine();

        String employeeName = "";
        for (int i = 0; i < info.length; i++) {
            if (id.equals(info[i][0])) {
                employeeName = info[i][1];
                break;
            }
        }
        System.out.printf(" Name: %26s \n", employeeName);

        System.out.println();

        System.out.print(" Rate per day:\t\t  PHP ");
        double rpd = scan.nextDouble();

        System.out.print(" SSS Contribution:\t  PHP ");
        double sss = scan.nextDouble();

        System.out.print(" PAGIBIG Contribution:\t  PHP ");
        double ibig = scan.nextDouble();

        System.out.print(" PhilHealth Contribution: PHP ");
        double phealth = scan.nextDouble();

        System.out.println();

        System.out.print(" No. of days Worked:\t     ");
        double w = scan.nextDouble();

        System.out.print(" No. of hours Late:\t     ");
        double l = scan.nextDouble();

        System.out.print(" No. of hours Undertime:     ");
        double u = scan.nextDouble();

        System.out.print(" No. of days Absent:\t     ");
        double a = scan.nextDouble();

        System.out.println();

        ///////////////////////////////////////////////////////////////////////////////
        double rflu = rpd / 8;
        double rfa = rpd;
        String sign = "|";
        System.out.println(" " + "=".repeat(58));
        System.out.printf(" %s %56s \n", sign, sign);
        System.out.printf(" %s %-35s %20s \n", sign, "Rules for late and undertime", sign);
        System.out.printf(" %s   %-50s %3s \n", sign, "Every one hour late and undertime is equivalent to", sign);
        System.out.printf(" %s   %s %-48.2f %s \n", sign, "PHP", rflu, sign);
        System.out.printf(" %s %56s \n", sign, sign);
        System.out.printf(" %s %-35s %20s \n", sign, "Rule for absent", sign);
        System.out.printf(" %s   %-50s %3s \n", sign, "Every one day absent is equivalent to", sign);
        System.out.printf(" %s   %s %-48.2f %s \n", sign, "PHP", rfa, sign);
        
        System.out.printf(" %s %56s \n", sign, sign);
        System.out.println(" " + "=".repeat(58));
        ///////////////////////////////////////////////////////////////////////////////

        System.out.println();

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("\t================INCOME===============\n");
        double bp = rpd * w;
        System.out.println("\t   Basic Pay\t\tPHP " + df.format(bp));
        System.out.println("\t\t\t       ____________");
        double tl = bp;
        System.out.println("\t   TOTAL INCOME\t\tPHP " + df.format(tl));

        System.out.println();

        System.out.println("\t===============DEDUCTION=============\n");

        System.out.println("\t   SSS Cont.\t\t PHP " + df.format(sss));
        System.out.println("\t   PAGIBIG Cont.\t PHP " + df.format(ibig));
        System.out.println("\t   PhilHealth Cont.\t PHP " + df.format(phealth));
        System.out.println("\t   Late \t         PHP " + df.format(rfa));
        double undertime = u * rflu;
        System.out.println("\t   Undertime \t\t PHP " + df.format(undertime));
        double absent = a * rfa;
        System.out.println("\t   Absent \t\t PHP " + df.format(absent));
        System.out.println("\t\t\t       ____________");
        double td = sss + ibig + phealth + rfa + undertime + absent;
        System.out.println("\t   TOTAL DEDUCTION \t PHP " + df.format(td));

        System.out.println();

        System.out.println("\t   TAKE HOME PAY:  \t PHP " + df.format(tl-td));
        System.out.println();
        System.out.println("\t"+"=".repeat(37));
        System.out.println();
        ///////////////////////////////////////////////////////////////////////////////
    }
}