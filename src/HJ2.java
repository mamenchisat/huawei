import java.util.Scanner;

/**
 * 项目名：    huawei
 * 文件名：    HJ2
 * 创建时间：   2022/9/7 14:53
 *
 * @author crazy Chen
 * 描述：
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 *
 * 数据范围： 1≤n≤1000
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。（不区分大小写字母）   TODO
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toUpperCase();
        String s2 = scanner.nextLine().toUpperCase();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
