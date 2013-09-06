package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrlParser implements FileParser {
	
	File filein;
	Pattern defPattern;
	
	
	
	public WrlParser(String fileName) {
		filein = new File(fileName);
		defPattern = Pattern.compile("DEF\\s(.+)\\sTransform.*");
	}

	@Override
	public void parse() throws FileNotFoundException {
		Scanner input = new Scanner(filein);
		ArrayList<ThreeDObject> objects = new ArrayList<ThreeDObject>();
		ThreeDObject cObject = null;
		boolean first = true;
		boolean point = false;
		boolean face = false;
		
		while(input.hasNext()){
			if(point){
				if(input.findInLine("]") == null){
					if(input.hasNextDouble())
					cObject.addVertex(input.nextDouble(), input.nextDouble(), input.nextDouble());
					cObject.lastVert();
				}
				else
					point = false;
			}
			else if(face){
				if(input.findInLine("]")== null){
					if(input.hasNextInt())
					cObject.addFace(input.nextInt(), input.nextInt(), input.nextInt());
					cObject.lastFace();
				}
				else 
					face =false;
			}
				
			else{	
				String line = input.nextLine();
				System.out.println(line);
				Matcher m;
				if((m = defPattern.matcher(line)).matches()){
					
					if(!first){
					
						if (cObject != null)
							objects.add(cObject);
						cObject = new ThreeDObject(m.group(1));
					}
					else 
						first = false;
				}
					
				
				else if(line.matches("\\s*point.*")){
					point = true;
				}
				else if(line.matches("\\s*coordIndex.*")){
					face = true;
				}
			}
			
		}
		

	}

}
