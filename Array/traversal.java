
  package com.dataStructure.array;
  
  import java.util.*;
  
  class Operation { private int size=50; private int[] arr=new int[size];
  private int num; public void insertion() { Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements you want to insert"); int
  num=sc.nextInt(); System.out.println("Enter elements"); for(int
  i=0;i<num;i++) arr[i]=sc.nextInt(); display(num); } public void display(int
  num) { System.out.println("Elements:-"); for(int i=0;i<num;i++)
  System.out.print(arr[i]+"|"); }
  
  } public class traversal {
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  Operation op=new Operation(); op.insertion(); }
  
  }
 
