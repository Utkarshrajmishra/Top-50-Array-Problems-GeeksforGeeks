class Solution{
    int findFrequency(int A[], int x){
        int num=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==x)
            {
                num++;
            }
        }
        return num;
    }
}
