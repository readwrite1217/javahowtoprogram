package Chapter5;

public class PythagoreanTriple {
    public static void main(String[] args) {
        for (int i = 1; i < 501; i++) {
            for (int j = 1; j < 501; j++) {
                for (int k = 1; k < 501; k++) {
                    int iSquared = i * i;
                    int jSquared = j * j;
                    int kSquared = k * k;
                    if ((iSquared == jSquared + kSquared) || (jSquared == iSquared + kSquared) || (kSquared == iSquared + jSquared)) {
                        System.out.printf("%4d%4d%4d\n", i, j, k);
                    }
                }
            }
        }
    }
}
