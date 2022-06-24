import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi 1: ");
        String[] list1 = sc.nextLine().split(" ");

        System.out.println("Nhap chuoi 2: ");
        String[] list2 = sc.nextLine().split(" ");

        List<Integer> listInt1= Stream.of(list1).map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> listInt2=Stream.of(list2).map(Integer::valueOf).collect(Collectors.toList());

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(listInt1);
        treeSet.addAll(listInt2);

        System.out.println(treeSet);
    }
}
