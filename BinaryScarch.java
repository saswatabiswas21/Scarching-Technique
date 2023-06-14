import java.util.*;
class BinaryScarch{
	public static int scarch(int arr[],int key){
		Arrays.sort(arr);
		System.out.print("Shorted array is:: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==key)
				return mid;
			if(key>arr[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the array:: ");
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the key:: ");
		int k=sc.nextInt();
		int r=scarch(num,k);
		if(r==-1)
			System.out.println("The key "+k+" is not found");
		else
			System.out.println("The key "+k+" is found and position no is:: "+(r+1));
	}
}