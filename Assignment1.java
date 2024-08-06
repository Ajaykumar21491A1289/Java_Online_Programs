package online;

public class Assignment1 {

    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 7, 9, 11, 13, 15, 17, 19};
        String[] n1 = {"aa", "bbb", "cccc", "ddddd", "ee", "fffff"};
       int count= countString(n, n1);
       System.out.println(count);
    }

    public static int countString(int[] n, String[] n1) {
    	int sum=0,digsum=0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(n[i]); j++) {
                if (n[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum=sum+n[i];
            }
        }
        while(sum!=0) {
        	digsum+=sum%10;
        	sum/=10;
        }
        while(digsum!=0) {
        	sum+=digsum%10;
        	digsum/=10;
        }
        for(String str : n1) {
        	if(str.length()==sum) {
        		digsum+=1;
        	}
        }
        return digsum;
    }
}
