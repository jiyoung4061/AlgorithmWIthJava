package algorithmWithJava;

public class Caesar_cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "z";
			int n = 1;
			
			char[] arr = s.toCharArray();
			
			for(int i = 0 ; i < arr.length ; i++) {
				if( arr[i] != ' ' && arr[i] != 'z') {					
					arr[i] += n;
				} else if(arr[i] == 'z') {
					arr[i] = (char) ('a'+(n-1));
				}
			}
			System.out.println(arr);
	}
}
