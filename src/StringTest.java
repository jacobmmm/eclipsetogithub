import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String st="JACOB MAMMEN";
     System.out.println(st.substring(0,7));
     System.out.println(st.substring(0,7).equals("JACOB M"));
     String n="abc";
     String message="";
     StringBuilder sb = new StringBuilder(st);
     sb=sb.deleteCharAt(0);
     int k;
     try{
    	 k=Integer.parseInt(n);
    	 System.out.println(k);
     }catch(NumberFormatException e){
     System.out.println(e.getMessage());
	message=e.getMessage();
     }
     System.out.println(message);
     System.out.println(!n.isEmpty());
     System.out.println(sb);
     System.out.println(st.contains("MAMMEN"));
     List<String> myTodo = new ArrayList<String>();
 	 myTodo.add("hitler me");
 	 myTodo.add("djfdj");
 	 myTodo.add("jhkhkjh");
 	 
 	 for(String s:myTodo)
 	 {
 		 System.out.println(s);
 	 }
	
	}
	
}
