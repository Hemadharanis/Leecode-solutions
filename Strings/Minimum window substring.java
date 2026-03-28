class Solution {
    public String minWindow(String s, String t) {
        int n=t.length();
        int[] arr=new int[256];
        int l=0;
        int r=0;
        int min=Integer.MAX_VALUE;
        int ml=-1;
        int mr=-1;
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            arr[c-0]++;
        }
        while(r<s.length()){
            char c=s.charAt(r);
            arr[c-0]--;
            if(arr[c-0]>=0){
                n--;
            }
            while(n==0){
                if(n==0&&r-l+1<min){
                min=r-l+1;
                ml=l;
                mr=r;
            }
                char ch=s.charAt(l);
                arr[ch-0]++;
                l++;
                if(arr[ch-0]>0)
                n++;
           
            
            }
            r++;

        }
        return ml == -1 ? "" : s.substring(ml, mr + 1);
    }
}
