
  package com.dataStructure.array;
  
  import java.util.*;
  
  class Operation { 
	  private int size=50; 
	  private int[] arr=new int[size];
      private int num=5; 
      public void insertion() 
      { 
    	  Scanner sc=new Scanner(System.in);
			/*
			 * System.out.println("Enter number of elements you want to insert"); int
			 * num=sc.nextInt();
			 */
    	  System.out.println("Enter elements"); 
    	  for(int i=0;i<num;i++) 
    		  arr[i]=sc.nextInt(); 
    	  display(); 
    	  } 
      public void deletionAtPos()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter position which you want to delete");
    	  int pos=sc.nextInt()-1;
    	  if(pos<0 || pos>=num)
    	  {
    		  System.out.println("Invalid Position");
    	  }
    	  else
    	  {
    	  for(int i=pos;i<num;i++)
    	  {
    		arr[i]=arr[i+1];  
    	  }
    	  num--;
    	  display();
    	  }
      }
      
      public void display() 
      { 
    	  System.out.println("Elements:-"); 
    	  for(int i=0;i<num;i++) 
    		  System.out.print(arr[i]+"|"); 
    	  System.out.println("");
    }
                  } 
   public class Deletion {
   public static void main(String[] args)
       { // TODO Auto-generated method stub
          Operation op=new Operation(); 
          op.insertion();
          op.deletionAtPos();
          }
       }
 