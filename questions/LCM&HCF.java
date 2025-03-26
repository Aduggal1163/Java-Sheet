 public static int[] lcmAndGcd(int a, int b) {
        // code here
        int ans[]=new int[2];
        int x=a;
        int y=b;
         while(true)
        {
            if(x>y)x=x-y;
            else y=y-x;
            if(x==0 || y==0) break;
        }
        ans[1]=x-y;
        //  if(a<b && a%b==a) ans[1]= b;
        // else if(a>=b && b%a==b) ans[1]= a;
        // else ans[1]= a*b;
        ans[0]=(a*b)/ans[1];
        return ans;
    }