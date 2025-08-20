public class TrianglePrint {
    static void trianglePrint(int n){
        if (n < 0)
            return;
        else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        trianglePrint(n-1);
    }

    public static void main(String[] args) {
        trianglePrint(6);
    }
}
