import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        WriteAndWriteFile writeAndWriteFile = new WriteAndWriteFile();
        List<Integer> num = writeAndWriteFile.readFile("number.txt");
        int maxValue = findMax(num);
        writeAndWriteFile.writeFile("result.txt", maxValue);
    }
}
