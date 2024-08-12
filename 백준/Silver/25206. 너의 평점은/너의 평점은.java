import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String cName= "";
		double schoolGrade;
		String grade="";
		double res1 = 0; // 학점*과목 평점
		double res2 = 0; // 
		for(int i = 0; i<20; i++) {
			cName = sc.next();
			schoolGrade=sc.nextDouble();
			grade= sc.next();
			if(grade.equals("A+")) {
				res1 = res1+(schoolGrade*4.5);
				res2 += schoolGrade;
			}else if(grade.equals("A0")) {
				res1 = res1+(schoolGrade*4.0);
				res2 += schoolGrade;
			}else if(grade.equals("B+")) {
				res1 = res1+(schoolGrade*3.5);
				res2 += schoolGrade;
			}else if(grade.equals("B0")) {
				res1 = res1+(schoolGrade*3.0);
				res2 += schoolGrade;
			}else if(grade.equals("C+")) {
				res1 = res1+(schoolGrade*2.5);
				res2 += schoolGrade;
			}else if(grade.equals("C0")) {
				res1 = res1+(schoolGrade*2.0);
				res2 += schoolGrade;
			}else if(grade.equals("D+")) {
				res1 = res1+(schoolGrade*1.5);
				res2 += schoolGrade;
			}else if(grade.equals("D0")) {
				res1 = res1+(schoolGrade*1.0);
				res2 += schoolGrade;
			}else if(grade.equals("F")) {
				res1 = res1+(schoolGrade*0.0);
				res2 += schoolGrade;
			}
		}
		System.out.printf("%.6f",res1/res2);
	}
}