class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap <Integer, Integer> map=new HashMap <Integer,Integer>();
          
       
      for(int i=0;i<n;i++)
      {
          if(map.containsKey(arr[i]))
          map.put(arr[i],map.get(arr[i])+1);
          else
          map.put(arr[i],1);
          
      }
      int ans=-1;
      for(int i=0;i<n;i++)
      {
          if(map.get(arr[i])==1)
          {
          ans=arr[i];
          break;
          }
     }
     return ans;
    }  
    
}
