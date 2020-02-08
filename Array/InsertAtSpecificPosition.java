package com.dataStructure.array;

import java.util.Scanner;

class Operation
{
	private int size=50;
	private int[] arr=new int[size];
	private int num=5;
	private int pos;
	private int elem;
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
	public void display()
	{
		System.out.println("Elements:-");
		for(int i=0;i<num;i++)
		System.out.println(arr[i]+"at index "+i);
		
	}
	public void insertAtPos()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter position at which you want to insert elements");
	    int pos=sc.nextInt();
	    if(pos>0 && pos<=size)
	    {
	    System.out.println("Enter element you want to insert");
	    int elem=sc.nextInt();
	    for(int i=num;i>=pos;i--)
	    {
	    	arr[i+1]=arr[i];
	    }
	    arr[pos]=elem;
	    num=num+1;
	    display();
	    }
	    else
	    {
	    	System.out.println("Invalid Position");
	    }
	}
	public void insertAtbeg()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element you want to insert");
	    int elem=sc.nextInt();
		for(int i=num-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=elem;
		num=num+1;
	}
	public void insertAtEnd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element you want to insert");
	    int elem=sc.nextInt();
		arr[num]=elem;
		num=num+1;
	}
}
public class InsertAtSpecificPostion {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int o=0;
		Operation op=new Operation();
	       op.insertion();
	       while(o!=-1)
	       {
	       System.out.println("Select Operation or -1 to exit");
	       System.out.println("1 to insert at specific position");
	       System.out.println("2 to insert at begining");
	       System.out.println("3 to insert at end");
	       System.out.println("4 to display array");
	       o=sc.nextInt();
	       switch(o)
	       {
	       case 1:
	       op.insertAtPos();
	       break;
	       case 2:
	       op.insertAtbeg();
	       break;
	       case 3:
	       op.insertAtEnd();
	       break;
	       case 4:
	       op.display();
	       break;
	       }
	       
	       }
	}
}
