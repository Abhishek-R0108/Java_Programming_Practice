package HackerRankProblemsSolved;

public class PlusMinus {
    public static void Ratio(int[] a){
        int n=a.length;
        double countofNegative=0;
        double countofPositive=0;
        double countofZeros=0;

        for(int i=0;i<a.length;i++){
            if(a[i]<0)
                countofNegative++;
            if(a[i]>0)
                countofPositive++;
            if(a[i]==0)
                countofZeros++;
        }
        System.out.format("%.6f \n", (countofNegative)/n);
        System.out.format("%.6f \n", (countofPositive)/n);
        System.out.format("%.6f \n", (countofZeros)/n);

    }
    public static void main(String[] args) {
        int[] a={1,1,0,-1,-1};
        Ratio(a);
    }
}
