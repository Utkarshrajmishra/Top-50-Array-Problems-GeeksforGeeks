class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        Pair <Long> p1=new Pair<Long>(a[0],a[n-1]);
        return p1;
    }
}
