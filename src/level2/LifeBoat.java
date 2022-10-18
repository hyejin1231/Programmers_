package level2;

import java.util.Arrays;

/**
 * 프로그래머스 Lv2.
 * 구명보트
 */
public class LifeBoat {
    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();
        int[] people = {70, 50, 80, 50};
        int result = lifeBoat.solution(people, 100);
        System.out.println("result = " + result); // result 3

        int[] people2 = {70, 80, 50};
        int result2 = lifeBoat.solution(people2, 100);
        System.out.println("result2 = " + result2); // result 3

    }


    public int solution(int[] people, int limit) {
        Arrays.parallelSort(people);

        int index = 0;
        int count = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                count++;
                index++;
            }else {
                count++;
            }
        }

        return count;
    }

    public int otherSolution(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0; int j = people.length -1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit) {
                ++i;
            }
        }
        return people.length - i;
    }
}
