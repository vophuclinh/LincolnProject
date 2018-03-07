import java.util.*;
public class Translate1 {
    public static HashMap<String,String> newmap= new HashMap<String,String>();
	

	public static String Translate (String numGe) {
		//String[] numEn= {"one","two","three","four","five","six","seven","eight","nine","ten"};
		String result="Errors!!";
		//String[] numDe= {"eins","zwei","drei","vier","funf","sechs","sieben","achts","neun","zehn"};
		//System.out.println(numGe);
	    //for(int i=0; i<10;i++)
	   // {	//System.out.println(numEn[i]);
	   // System.out.println(numEn[i].equals(numGe));
	    //	if (numEn[i].equals(numGe)) {return numDe[i];}}
	    //return result;
		newmap.put("one","eins");
		newmap.put("two","zwei");
		newmap.put("three","drei");
		newmap.put("four","vier");
		newmap.put("five","funf");
		newmap.put("six","sechs");
		newmap.put("seven","sieben");
		newmap.put("eight","achts");
		newmap.put("nine","neun");
		newmap.put("ten","zehn");
		result=(String)newmap.get(numGe);
		if(result==null) {result="Error!";}
		return result;
		
		}

}
