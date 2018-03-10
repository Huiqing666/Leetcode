class Solution {
    public int climbStairs(int n) {
        int before=0,behind=0;
        int result=0;
        for(int i=1;i<=n;i++){
            if(i==1){
                result=1;
                before=0;
                behind=0;
            }
            else if(i==2){
                result=2;
                before=1;
                behind=result;
            }else{
                result=before+behind;
                before=behind;
                behind=result;
                
            }
        }
        return result;
        }
    /*
    private int getFibo(int i) {  
        if (i == 1 )  
            return 1;  
        else if (i == 2)return 2;
        else  
            return getFibo(i - 1) + getFibo(i - 2);  
    }
    */
    }
