class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
         String stu="No";
        int counter=0;
    HashMap <Long,Integer> map= new HashMap <Long,Integer>();
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(a1[i])==false)
        {
            map.put(a1[i],1);
        }
    }
     for(int i=0;i<m;i++)
    {
        if(map.containsKey(a2[i]))
        {
           counter++;
        }
    }
    if(counter==m)
    {
        stu="Yes";
    }
    
       return stu; 
    }
}
