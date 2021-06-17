public class BubbleSort implements Sort {
    public int[] sort(int arr[]){
        int len = arr.length;
        for (int i= 0;i<len-1;i++){
            for(int j=0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
