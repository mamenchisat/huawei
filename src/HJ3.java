import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 * 项目名：    huawei
 * 文件名：    HJ3
 * 创建时间：   2022/9/7 15:12
 *
 * @author crazy Chen
 * 描述：  描述
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * <p>
 * 数据范围： 1≤n≤1000  ，输入的数字大小满足 1≤val≤500
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果    TODO
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < length; i++) {
            integers.add(scanner.nextInt());
        }
        int size = integers.size();
        int[] array = new int[size];
        Object[] objects = integers.toArray();
        Arrays.sort(objects);
        for (Object i :objects) {
            System.out.println(i);
        }


    }
}
