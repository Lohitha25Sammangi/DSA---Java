package strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <=30; i++) {
            char ch = (char)('a' + i);
            series = series + " "+ch; // series += ch
        }

        System.out.println(series);
    }
}
