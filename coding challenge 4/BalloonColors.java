import java.util.HashMap;
import java.util.Scanner;

public class BalloonColors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 

        String[] balloons = new String[N];
        for (int i = 0; i < N; i++) {
            balloons[i] = sc.nextLine();
        }


        String result = findOddBalloon(balloons);
        System.out.println(result);

        sc.close();
    }

    public static String findOddBalloon(String[] balloons) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String balloon : balloons) {
            frequencyMap.put(balloon, frequencyMap.getOrDefault(balloon, 0) + 1);
        }
        for (String balloon : balloons) {
            if (frequencyMap.get(balloon) % 2 != 0) {
                return balloon;
            }
        }
        return "All are even";
    }
}
