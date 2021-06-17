public class Client {
    public static void main(String arg[]){
        int arr[]={1,4,5,2,9,7,3,1,0,6};
        int result[];
        ArrayHandler ah=new ArrayHandler();

        Sort sort;
        sort=(Sort)XMLUtil.getBean();

        ah.setSortObj(sort);
        result=ah.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
