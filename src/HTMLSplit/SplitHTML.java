package HTMLSplit;

import java.util.Arrays;

public class SplitHTML {
	public static void main(String args[]) {
		String html = "<html><head><<title>My Page</title></head><body>Hello</body></html>";
		String[] result = splitHTMLTags(html);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static String[] splitHTMLTags(String html) {
		String[] a = html.split("<");
		
		String temp = "";
		
		String[] array = Arrays.copyOfRange(a, 1, a.length);
		
		for (int i = 0; i < array.length; i++) {
		    array[i] = "<" + array[i];
		    temp = (String) array[i];
		    
		    array[i] = temp.split(">")[0] + ">";
		    
		    if (array[i] == "<>") {
		    	array[i] = "";
		    }
		}
		
		return(array);
	}
}
