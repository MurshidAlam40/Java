
class printSubArray{

	public static void main(String[] args)
	{
	    int arr[] = {5, 7, -8, -9, 0, 5};
	    int n=arr.length;
        for (int i=0; i <n; i++){
            for (int j=i; j<n; j++){
                for (int k=i; k<=j; k++){
                    System.out.print( arr[k]+" ");
                }
                System.out.println();
            }
        }
	}
}
