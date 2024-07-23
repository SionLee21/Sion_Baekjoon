import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 산술평균
        double mean = Arrays.stream(numbers).average().orElse(0.0);
        System.out.println(Math.round(mean));

        // 중앙값
        Arrays.sort(numbers);
        int median = numbers[N / 2];
        System.out.println(median);

        // 최빈값
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = Collections.max(frequencyMap.values());
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);
        int mode = (modes.size() > 1) ? modes.get(1) : modes.get(0);
        System.out.println(mode);

        // 범위
        int range = numbers[N - 1] - numbers[0];
        System.out.println(range);
    }
}
