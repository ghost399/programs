package str;
public class strprb {
    public static int cnt(int n) 
    { 
        int[] arr=new int[n + 1]; 
        arr[0]=1; 
        arr[1]=1; 
        arr[2]=2; 
        for (int i = 3; i <= n; i++) { 
        	arr[i]=arr[i - 1]+arr[i - 2]+ arr[i - 3];
        }
        return arr[n]; 
    } 
	public static void main(String[] args) {
		int n = 4;
		System.out.println(cnt(n));
	}
}
