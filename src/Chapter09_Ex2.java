
public class Chapter09_Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int A = 976;
int B = 427;
 System.out.println(A + " と " + B + " の最大公約数は、" + C(A, B) + "です。") ; }

static int C(int A, int B) {
	if (B == 0) {
		return A;
	}
	return C(B, A % B);


	}

}
