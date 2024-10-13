package Day1;

public class java2_greaterNo2 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'B';
		char c3 = 'C';
		
		char res = (c1<c2) ? (c1<c3 ? c1 : c3) : (c2<c3 ? c2 : 3);
		System.out.println(res);

	}

}
