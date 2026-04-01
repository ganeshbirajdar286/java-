public class make_zero_at_end {
    public static void main(String[] args){
        int  arr[]={1,0,-2,4,5,0,6};
        print(arr);
    }

    public static void print(int arr[]){
        int  n=arr.length;
        for(int i=0;i<n-1;i++){
            int swap=0;
            for (int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }

        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}