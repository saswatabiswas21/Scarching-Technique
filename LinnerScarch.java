import java.util.*;
class LinnerScarch{
	public static int scarch(int arr[],int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array:: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key:: ");
		int key=sc.nextInt();
		int r=scarch(arr,key);
		if(r==-1)
			System.out.println("The key "+key+" is not found");
		else
			System.out.println("The key "+key+" is at position no:: "+(r+1));
	}
}