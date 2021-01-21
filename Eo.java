import java.util.*;
class Eo {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int sum,tot=0,o;
    int n=kbd.nextInt();
    for(int i=0;i<n;i++){
      int k= kbd.nextInt();
      sum=0;
      for(int j=0;j<k;j++){
        o=kbd.nextInt();
        sum= sum +o;
      }
       tot = (sum-k)+1;
       System.out.println(tot);
    } 
   
    
    
    kbd.close();
  }
}