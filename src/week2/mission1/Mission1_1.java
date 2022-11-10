package week2.mission1;

public class Mission1_1 {
    public static void main(String[] args) {
        char[] alpabet = new char[26];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<alpabet.length; i++) {

            alpabet[i] = (char) ('A' + i);

            sb.append(alpabet[i] + " ");
        }
        System.out.println(sb);
    }
}