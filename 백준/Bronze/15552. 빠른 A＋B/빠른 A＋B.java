
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; //예외처리
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 리더 선언4
		 // reader에서 입력은 readLine -> 이때 readLine의 리턴값은 스트링 고정
		// -> 다른 형태 받으려면 형변환이 필수.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int depth = Integer.parseInt(bf.readLine());
		int result = 0;
		for(int i = 0; i<depth; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bw.write((x+y)+"\n");
		}
			bf.close();
			bw.flush();
			bw.close();
	}

}
