public class Main {

    public static void main(String[] args) {
        int[] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;

        for (int s : report) {
            sum += s;
        }
        System.out.println(sum / report.length);
    }
}