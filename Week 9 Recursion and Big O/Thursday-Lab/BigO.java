public class BigO {
    public void printOnce(int n) {
        System.out.println(n);
    }
    public void printNTimes(int n) {
        String Phrase = "N times";
        for (int i = 1; i <= n; i++){
            System.out.println(Phrase);
    }
    }
    public void printNSquaredTimes(int n){
        String Phrase = "N^2 times";
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                System.out.println(Phrase);
            }
        }
    }
}