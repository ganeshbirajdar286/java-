class solution{
    public static int largestvalue(int[] arr){
        
         int n = arr.length;
         int min=Integer.MIN_VALUE;
        
         for(int i=0;i<n;i++){
             if(min<arr[i]){
                  min= arr[i];
             }
         }
         return min;
    }
}


class largest {
    public static void main(String[] args) {
        int[] arr = {2,3,10,4,5};
        int n=solution.largestvalue(arr);
        System.out.println("largest value : "+n);
    }
}