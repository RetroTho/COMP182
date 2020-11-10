import java.util.*;
import java.io.*;
public class WordLadder {
    private static LinkedList<String> dict;
    private static LinkedList<String> visited;
    private static String start, end;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File dictfile = new File("dictionary.txt");
		File infile = new File("infile.txt");
		dict = new LinkedList<>();
		// load the dictionary
		try(
			Scanner in = new Scanner(dictfile);){
			while(in.hasNext()) {
				
				 dict.add(in.next());
			}
		}
		try(Scanner in = new Scanner(infile);) 
		{
			while(in.hasNext()) {
			
				
				start = in.next();
				
				end = in.next();
				
				if(start.length()!=end.length() || !dict.contains(start) || !dict.contains(end) ){
					System.out.println("There is no word ladder between "+start+ " and "+end);
					continue;
				}
		
				findLadder(start,end);
			
			}
		}
		
	
	
	}
	
	public static void findLadder(String start,String end) {
		
		Queue<Stack<String>> queue = new LinkedList<>();
		visited = new LinkedList<>();
		Stack<String> copiedStack = new Stack<>();
		// Left as exercise  
		copiedStack.add(start);
		visited.add(start);  
		queue.add(copiedStack);

		//I think this is a better condition due to possiblity check being inside
		while(start != null){
			//Print finished word ladder
			for (Stack<String> strs : queue) {
		    	if(strs.peek().equals(end)){
		        	System.out.println(strs);
		         	return;
		     	}
		 	}

		 	//Check if word ladder is not possible
			if(queue.isEmpty()){
			    System.out.println("There is no word ladder between " + start + " and " + end);
			    return;
			}

			copiedStack = queue.remove();
			String wrd = copiedStack.peek();

			for(String str : dict){
			    if(!(visited.contains(str)) && isAnEdge(str, wrd)){
			        Stack<String> strStack = new Stack<>();

			        strStack.addAll(copiedStack);
			        strStack.push(str);

			        visited.add(str);
			        queue.add(strStack);
			    }
			}
		}
	}	
   
   public static boolean isAnEdge(String w1, String w2) {
        // Left as exercise
   		int count = 0;
		if(w1.length() != w2.length()){
		    return false;
		}

		for(int i = 0; i < w1.length(); i++){
		    if(w1.charAt(i) == w2.charAt(i)){
		        count++;
		    }
		}

		if(count == w2.length() - 1){
			return true;
		}

		return false;
    }
		
	
}



