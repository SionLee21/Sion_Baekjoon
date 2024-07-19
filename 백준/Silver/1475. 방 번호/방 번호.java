import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int roomNumber = s.nextInt();
        s.close();

        int[] digitCounts = new int[10];

        // 각 자리 숫자의 빈도를 세기
        while (roomNumber > 0) {
            int digit = roomNumber % 10;
            digitCounts[digit]++;
            roomNumber /= 10;
        }

        // 6과 9의 합으로 하나의 숫자 세트에 할당할 수 있음
        int sixAndNineCount = digitCounts[6] + digitCounts[9];
        digitCounts[6] = digitCounts[9] = (sixAndNineCount + 1) / 2;

        // 가장 많이 필요한 숫자의 세트 수 찾기
        int maxSets = 0;
        for (int count : digitCounts) {
            if (count > maxSets) {
                maxSets = count;
            }
        }

        System.out.println(maxSets);
    }
}
