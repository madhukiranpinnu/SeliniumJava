package JavaProgramsTest;

import java.util.Arrays;

public class T11FirstSmallAndLargeinArrar {
    public static void main(String[] args) {
        int[] ik={1,2,3,78,89,45,56};
        int size=ik.length;
        Arrays.sort(ik);
        System.out.println(ik[0]);
        System.out.println(ik[size-1]);
    }
}
