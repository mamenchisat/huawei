import java.util.Scanner;

/**
 * 项目名：    huawei
 * 文件名：    HJ5
 * 创建时间：   2022/9/7 17:25
 *
 * @author crazy Chen
 * 描述：
 * 描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 *
 * 数据范围：保证结果在 1 \le n \le 2^{31}-1 \1≤n≤2
 * 31
 *  −1
 * 输入描述：
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。TODO
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String n = scanner.nextLine();
            System.out.println(Integer.parseInt(n.substring(2),16));
        }
    }
}
