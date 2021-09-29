import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����{
   public static boolean[] isOpen;
   public static int N;
   
   public static void main(String[] args) throws IOException{
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      N = Integer.parseInt(br.readLine());
      isOpen = new boolean[N+1];
      
      for(int i=1; i<=N; i++) {
         if(i == 1) {
            for(int j=1; j<=N; j++) {
               isOpen[j] = true;
            }
         }else {
            for(int j=i; j<=N; j = j+i) {
               if(isOpen[j] == true)
                  isOpen[j] = false;
               else
                  isOpen[j] = true;
            }
         }
      }
      
      int count=0;
      
      for(int i=1; i<=N; i++) {
         if(isOpen[i] == true   ) {
            System.out.println("���� ���� ��ȣ : " + i);
            count++;
         }
      }
      
      System.out.println("���� ���� �� : " + count);
   }

}