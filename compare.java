package homework;


import java.util.*;

public class compare {
	
    public static int getCard(List<String> list1){

        int temp1=1;
        int size = list1.size();
    	List<String> numList1   = new ArrayList<String>();
    	Set<String> numSet1 =new TreeSet<String>();
    	List<String> colorList1   = new ArrayList<String>();
    	Set<String> colorSet1 =new TreeSet<String>();
    	
    	for(int i = 0; i<list1.size();i++){
    		String num = list1.get(i).split(" ")[0];
    		String color = list1.get(i).split(" ")[1];
    		if(num.equals("T")){
    			numList1.add("10");
    			numSet1.add("10");
    		} else if (num.equals("J")){
    			numList1.add("11");
    			numSet1.add("11");
    		} else if(num.equals("Q")){
    			numList1.add("12");
    			numSet1.add("12");
    		} else if(num.equals("K")){
    			numList1.add("13");
    			numSet1.add("13");
    		} else if(num.equals("A")){
    			numList1.add("14");
    			numSet1.add("14");
    		} else{
    			numList1.add(num);
    			numSet1.add(num);
    		}
    		colorList1.add(color);
    		colorSet1.add(color);
    	}
    	
    	
    	if(colorSet1.size() == 1){
    		int flag1=0;
    		Collections.sort(numList1);
    		for(int i=0;i<numList1.size()-1;i++){
    			if(Integer.parseInt(numList1.get(i+1))-Integer.parseInt(numList1.get(i))==1){
    		       flag1++;
    			}
    		}
    		if(flag1==4){
    			temp1=9;
    		}else{
    			temp1=6;
    		}
    	}
    	
    	if(numSet1.size()==2){
    		Collections.sort(numList1);
    		if(!numList1.get(0).equals(numList1.get(1))||!numList1.get(size-1).equals(numList1.get(size-2))){
    			 temp1=8;
    		} else{
    			 temp1=7;
    		}
    		
    	}
    	
    	if(colorSet1.size()>1){
    		int flag2=0;
    		Collections.sort(numList1);
    		for(int i=0 ;i<numList1.size()-1;i++){
    			if(Integer.parseInt(numList1.get(i+1))-Integer.parseInt(numList1.get(i))==1){
                     flag2++;
    			}	
    		}
    		if(flag2==4){
    			temp1=5;
    		}else{
    			if(temp1<5)
    			temp1=1;
    		}
    		
    		if(numSet1.size()==3){
    			if(!numList1.get(0).equals(numList1.get(1))||!numList1.get(size-1).equals(numList1.get(size-2))){
    				temp1=4;
    			}
    			else{
    				temp1=3;
    			}
    		}
    		
    		if(numSet1.size()==4){
    			temp1=2;
    		}
    			
    	}	
    		
    	return temp1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Black:");
         Scanner sc = new Scanner(System.in);
    	 List<String> list = new ArrayList<String>();
//         while(sc.hasNextLine()){
//        	 String string = sc.nextLine();
//        	 list.add(string);
//         }
         for(int i=0;i<5;i++){
        	 String string = sc.nextLine();
        	 list.add(string);
        	 }
    	 
         int  temp1 = getCard(list);

         
         System.out.println("White:");
         Scanner sc2 = new Scanner(System.in);
    	 List<String> list2 = new ArrayList<String>();
//         while(sc.hasNextLine()){
//        	 String string = sc.nextLine();
//        	 list.add(string);
//         }
         for(int i=0;i<5;i++){
        	 String string2 = sc.nextLine();
        	 list.add(string2);
        	 }
         int  temp2 = getCard(list2);
         
         if(temp1==temp2){
        	 System.out.println("Æ½¾Ö");
         }else if(temp1<temp2){
        	 System.out.println("White Win");
         }else {
        	 System.out.println("Black Win");
         }
         
         
	}

}
