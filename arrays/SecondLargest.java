class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int firstmax=0;
        int secondmax=-1;
        int thirdmax=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>firstmax)
            {
                firstmax=arr[i];
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secondmax&&arr[i]<firstmax)
            {
                secondmax=arr[i];
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>thirdmax && arr[i]<secondmax && arr[i]<firstmax)
            {
                thirdmax=arr[i];
            }
        }
        
        return secondmax;
    }
}
