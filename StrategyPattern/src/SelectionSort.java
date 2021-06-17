public class SelectionSort implements Sort {
    public int[] sort(int arr[]){
        int len = arr.length;
        for (int i= 0;i<len;i++){
            int index = i;
            for(int j=i+1;j<len;j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        System.out.println("选择排序");
        return arr;
    }
}
