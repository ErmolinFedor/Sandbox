package task1;

public class IntParser {
    //приведение типов, попробуй реальзовать методы, тут нет подвоха, просто по анологии с первым методом

    public int parse(double num) {
        return (int) num;
    }

    public int parse(String line) {
        return Integer.parseInt(line);
    }

    public int parse(long num) {
        return (int) num;
    }

    public int parse(byte num) {
        int intNum = num;
        return intNum;
    }
}
