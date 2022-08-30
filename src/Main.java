public class Main {

    public static void printSeparator() {
        System.out.println("++++++++++++++++++");
        System.out.println("------------------");
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }

    public static int sum(int [] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] issuesByMonths = {12, 23, 45, 77, 31, 45};
            printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 2 == 0) {
            printSeparator();

            }
        }
        int total = sum(issuesByMonths);
        printIssues(total);



    }
}