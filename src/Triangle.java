public class Triangle {
    public static String classifyTriangle(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideA == sideC && sideB == sideC) {
            return "tam giác đều";
        } else if (sideA==sideB||sideA==sideC||sideB==sideC) {
            return "tam giác cân";
        } else if (sideA+sideB>sideC&&sideA+sideC>sideB&&sideB+sideC>sideA) {
            return "tam giác thường";
        }else {
            return "không phải tam giác";
        }
    }
}
