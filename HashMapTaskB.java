//package hashmap.task;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.Map.*;
import java.util.InputMismatchException;


public class HashMapTaskB{
	    static Scanner input=new Scanner(System.in);
		
/*public static String stringInput(){
		
		return input.nextLine();
	}	*/	
//Question1		
	public static HashMap<String,String> map(){
   	  HashMap<String,String> hashMap=new HashMap<String,String>(); 
	  return hashMap;	  
    }
		
//Questionn2	
    public  HashMap<String,String> addString(){
   	  HashMap<String,String> hashMap=new HashMap<String,String>();  
	 
	    System.out.println("enter the number of pairs");
			int count =input.nextInt();
			
				for(int run =0;run<count; run++){
					System.out.println("enter the key");
					String keys =input.next();
					System.out.println("enter the values");
					String values =input.next();
					hashMap.put(keys,values);
	
		 return hashMap;	 
	}	 
		
//Questionn3	
    public  HashMap<Integer,Integer> addInteger(){
   	  HashMap<Integer,Integer> hashMap=new HashMap<>();  	
	    System.out.println("enter the number of pairs");
			int count =input.nextInt();
			
				for(int run =0;run<count; run++){
					System.out.println("enter the key");
					int key =input.nextInt();
					System.out.println("enter the value");
					int value=input.nextInt();
					hashMap.put(key,value);
				}	
		 return hashMap;
	}	 		
		
//Questionn4	
    public  HashMap<String,Integer> addMulti(){
   	  HashMap<String,Integer> hashMap=new HashMap<>();  	
	    System.out.println("enter the number of pairs");
			int count =input.nextInt();
			
				for(int run =0;run<count; run++){
					System.out.println("enter the employeeName");
					String employeeName =input.next();
					System.out.println("enter the employeeId");
					int  employeeId=input.nextInt();
					hashMap.put( employeeName, employeeId);
				}	
		 return hashMap;
	}	
//Questionn5
    public static HashMap< String,HashMapTaskB> addcustom(){
        HashMapTaskB custom=new HashMapTaskB();
   	  HashMap<String, HashMapTaskB> hashMapFour=new HashMap<>();  	
	    System.out.println("enter the number of pairs");
			int count =input.nextInt();
			
				for(int run =0;run<count; run++){
					System.out.println("enter the employeeName");
					String employeeName =input.next();
					System.out.println("enter the employeeId");
					int  employeeId=input.nextInt();
					hashMapFour.put( employeeName, custom);
				}	
		 return hashMapFour;
	
	}
//Questionn6
    public  HashMap<String,String> addOneNull( HashMap<String,String> hashMap){
   	   hashMap.put("john",null);
		 return hashMap;
	}	

//Questionn7
    public  HashMap<String,String> addNullKey( HashMap<String,String> hashMap){
   	   hashMap.put(null, "355");
		 return hashMap;
	}	

//Questionn8
    public  HashMap<String,String> keyExists( HashMap<String,String> hashMap,String key){
   	  System.out.println( hashMap.containsKey(key));
		 return hashMap;
	}	

//Questionn9
    public  HashMap<String,String> valueExists( HashMap<String,String> hashMap,String value){
   	  System.out.println( hashMap.containsValue(value));
		 return hashMap;
	}	
//question10
   public  Map<String,String> replaceAllValues(Map<String,String>hashMap,String newValue){
			hashMap.replaceAll((key, values)-> newValue);
			return hashMap;
			}
//Questionn11
    public  HashMap<String,String> valueOfExistingKey( HashMap<String,String> hashMap,String key){
   	   System.out.println(hashMap.get(key));
		 return hashMap;
	}		
	
//Questionn12
    public  HashMap<String,String> valueOfNonExistingKey( HashMap<String,String> hashMap,String key){
   	   System.out.println(hashMap.get(key));
		 return hashMap;
	}			
	
//Questionn13
    public  HashMap<String,String> returnZoho( HashMap<String,String> hashMap,String key){
   	   System.out.println(hashMap.getOrDefault(key,"zoho"));
		 return hashMap;
	}			
			
//Questionn13
    public  HashMap<String,String> removeExistingKey (HashMap<String,String> hashMap,String key){
   	    hashMap.remove(key);		
		 return hashMap;
		
	}		
//Question 14
public  Map<String,String> removeExistingKey(Map <String,String>hashMap,String key){		
			hashMap.remove(key);		
			return hashMap;
}		
//Question15
public  Map<String,String> removeExistingKeyIfValueMatch(Map <String,String>hashMap,String key,String value){	
			hashMap.remove(key,value);	
			return hashMap;
	}
//question16
	public  Map<String,String> replaceExistingKey(Map <String,String>hashMap,String key,String value){	
		hashMap.replace(key,value);
		return hashMap;
	}
//qus 17
public Map<String,String> replaceExistingKeyIfValueMatch(Map <String,String>hashMap,String key,String oldValue,String newValue){			
			hashMap.replace(key,oldValue,newValue);		
			return hashMap;
	}	
//qus18
public   Map<String,String> transferOneToAnother(Map <String,String>hashMapFirst,Map <String,String>hashMapSecond){
			hashMapSecond.putAll(hashMapFirst);
			return hashMapSecond;
	}	
//question19
public  Map<String,String> iterateHashMap(Map <String,String>hashMap){	
		Iterator<HashMap.Entry<String, String>> itr = hashMap.entrySet().iterator();  
			while(itr.hasNext())
			{
             HashMap.Entry<String, String> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		return hashMap;
	}	
	
//question20	
	public  Map<String,String> removeAllEntries(Map <String,String>hashMap){
	
		hashMap.clear();	
		return hashMap;
	}	
	public static void main(String[] args){
	     HashMapTaskB obj =new HashMapTaskB();
	     System.out.println("enter your choice");
	     int choice=input.nextInt();
	     
	switch(choice){
		case 1:
		        Map<String,String> hashMap=obj.map();
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());
		break;
		
		case 2:
		        
   		        HashMap<String,String>hashMapTwo =obj.addString();
				System.out.println("HashMap="+hashMapTwo);
				System.out.println("HashMap size="+hashMapTwo.size());   
		break;
		
		case 3:
   		        HashMap<Integer,Integer>hashMapThree =obj.addInteger();
				System.out.println("HashMap="+hashMapThree);
				System.out.println("HashMap size="+hashMapThree.size());		   
		break;
		
		case 4:
   		        HashMap<String,Integer>hashMapFour =obj.addMulti();
				System.out.println("HashMap="+hashMapFour);
				System.out.println("HashMap size="+hashMapFour.size());   
		break;
		
		case 5: HashMap<String,String> hashMapFive=obj.addString();
		       
				System.out.println("HashMap="+hashMapFive);
				System.out.println("HashMap size="+hashMapFive.size());   
		
		     
		       break;
		
		case 6:
		        HashMap<String,String> hashMapSix=obj.addString();
   		        hashMap=obj.addOneNull(hashMapSix);
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());   
		break;
		
		case 7:
		        HashMap<String,String> hashMapSeven=obj.addString();
   		        hashMap=obj.addNullKey(hashMapSeven);
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());   
		break;
		
		case 8:
		        String key=null; 
		      try{
		        HashMap<String,String> hashMapEight=obj.addString();
				System.out.println("Enter the key :");
				 key=input.next();
				hashMap= obj.keyExists(hashMapEight,key);
   		      //  hashMap=obj.addNullKey(hashMapEight);
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());   
			  }	 
			 catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

                 } 	
				
		break;
		
		case 9:
		        String value=null;
		
		       try{
		
		        HashMap<String,String> hashMapNine=obj.addString();
				System.out.println("Enter the value");
			    value=input.next();
				hashMap= obj.valueExists(hashMapNine,value);
   		       // hashMap=obj.addNullKey(hashMapNine);
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());  
			 }
			 catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 		 
		break;
		
		case 10:
		
		       try{
			 	Map<String,String>hashMapTen= obj.addString();
				System.out.println("Enter the value");
				 value=input.next();
				
				hashMap=obj.replaceAllValues(hashMapTen,value);
				System.out.println("Size of HashMap :"+hashMapTen.size());
				System.out.println("Hash Map is :"+hashMapTen);
				}
				catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
			
				break;
		case 11:
		
		      try{
		      
		        HashMap<String,String> hashMapEleven=obj.addString();
				System.out.println("Enter the key");
	            key=input.next();
				hashMap= obj.valueOfExistingKey(hashMapEleven,key);
 
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());  
				}
			catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
				
				  
		break;
		
					
		case 12:
		    try{
		        HashMap<String,String> hashMapTwelve=obj.addString();
				System.out.println("Enter the NonExistingKey ");
	            key=input.next();
				hashMap= obj.valueOfNonExistingKey(hashMapTwelve,key);
 
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());   
				}
				catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
			
				
		      break;
					
		case 13:
		     try{
		        HashMap<String,String> hashMapThirteen=obj.addString();
				System.out.println("Enter the NonExistingKey ");
	            key=input.next();
				hashMap= obj.returnZoho(hashMapThirteen,key);
 
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());  
				}
				catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
			 
		break;
		
		case 14:
		       try{
		        HashMap<String,String> hashMapFourteen=obj.addString();
				System.out.println("HashMap before remove :"+hashMapFourteen);
				System.out.println("Size of the hashMap Before Remove :"+hashMapFourteen.size());
				System.out.println("Enter the Key");
				key=input.next();
				hashMapFourteen=obj.removeExistingKey(hashMapFourteen,key);
				System.out.println("Size of the HashMap After Remove :"+hashMapFourteen.size());
				System.out.println("Hash Map After Remove :"+hashMapFourteen);
				}
			catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
			  
		        break;
			
	   case 15:
	           try{
	         
				Map<String,String>hashMapFifteen=obj.addString();
				System.out.println("Enter the key");
				 key=input.next();
				System.out.println("Enter the old value");
				String oldValue=input.next();
			
				hashMapFifteen=obj.removeExistingKeyIfValueMatch(hashMapFifteen,key,oldValue);
				System.out.println("Size of thee HashMap is :"+hashMapFifteen.size());
				System.out.println("Hash Map is :"+hashMapFifteen);
				}
              catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 

				break;	
       case 16:
               try{
               
				Map<String,String>hashMapSixteen=obj.addString();
				System.out.println("Enter the key");
				key=input.next();
				System.out.println("Enter the new value");
				value=input.next();
		
				hashMapSixteen=obj.replaceExistingKey(hashMapSixteen,key,value);
				System.out.println("Size of thee HashMap is :"+hashMapSixteen.size());
				System.out.println("Hash Map is :"+hashMapSixteen);
				}
				
				catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
				break;	
       	case 17:
       	     try{
       	     
				Map<String,String>hashMapSeventeen=obj.addString();
				System.out.println("Enter the key");
			     key=input.next();
				System.out.println("Enter the old value");
				  value=input.next();
				System.out.println("Enter the new value");
				String newValueSeventeen =input.next();
				hashMapSeventeen=obj.replaceExistingKeyIfValueMatch(hashMapSeventeen,key,value,newValueSeventeen);
				System.out.println("Size of thee HashMap is :"+hashMapSeventeen.size());
				System.out.println("Hash Map is :"+hashMapSeventeen);
				}
				catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

              } 
				break;	
       
        case 18:
				Map<String,String>firstHashMap=obj.addString();
				Map<String,String>secondHashMap=obj.addString();
				Map<String,String>hashMapEighteen=obj.transferOneToAnother(firstHashMap,secondHashMap);
				System.out.println("Size of thee HashMap is :"+hashMapEighteen.size());
				System.out.println("Hash Map is :"+hashMapEighteen);
				
				break;	  
    
	   case 19:
				Map<String,String>hashMapNineteen=obj.addString();
				hashMap=obj.iterateHashMap(hashMapNineteen);
				System.out.println("Size of thee HashMap is :"+hashMap.size());
				System.out.println("Hash Map is :"+hashMap);
				break;	
     
    	
	     case 20:
				
				Map<String,String>hashMapTwenty=obj.addString();
				hashMapTwenty=obj.removeAllEntries(hashMapTwenty);
				System.out.println("After remove all entries Size of the HashMap is :"+hashMapTwenty.size());
				System.out.println("After Remove all entries in a Hash Map is :"+hashMapTwenty);
				break;
				
				default:
					System.out.println("No program for your choice");
		}
	input.close();	 				
     }	
   }	
