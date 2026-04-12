class Angles_of_a_Triangle {
    public double[] internalAngles(int[] sides) {
        int n=sides.length;
        double ans[];
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];

        if(a+b>c && a+c>b && b+c>a){
            ans=new double[3];
            double A=Math.acos((b*b + c*c -a*a)/(2*b*c));
            double B=Math.acos((a*a + c*c - b*b)/(2*a*c));
            double C=Math.acos((a*a + b*b - c*c)/(2*a*b));

            ans[0]=Math.toDegrees(A);
            ans[1]=Math.toDegrees(B);
            ans[2]=Math.toDegrees(C);

            Arrays.sort(ans);
        }
        else{
            ans=new double[0];
            return ans;
        }
        return ans;
    }
}