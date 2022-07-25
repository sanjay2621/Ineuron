package com.test;

import java.util.Scanner;

//author : Sanjay Patel


public class Assignment {
	
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = myScan.nextInt();

		printInueron(number);
		System.out.println("+++++++++++++++++");
		printQuestion2(number);
		System.out.println("+++++++++++++++++");
		printQuestion3(number);
		System.out.println("+++++++++++++++++");
		printQuestion4(number);	
		System.out.println("+++++++++++++++++");
		printQuestion5(number);
	}
	
	public static void printInueron(int n)
	{
		for(int i=0;i<n;i++)
        {
        
            for(int j=0;j<n;j++)
            {
            	
            		if(i==0 || i==n-1 || i<n && j==(n-1)/2)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            
            for(int j=0;j<n;j++)
            {
            	
            		if(i<n && j==0 || i == j || i<n-1 && j==n-1)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
                       
            for(int j=0;j<n;j++)
            {
            	
            		if(i<n && j==0 || i==0 && j<n || i==(n-1)/2 && j<n || i==n-1 && j<=n-1)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            
            for(int j=0;j<n;j++)
            {
            	
            		if(i<n && j==1 || i==n-1 && j!=0 || i<n-1 && j==n-1)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            
            for(int j=0;j<n;j++)
            {
            	
            		if(i<n && j==0 || 
            				i==0 && j<=n/2 || 
            				j==n/2 && i<=n/2 || 
            				i==n/2 && j<=n/2 || 
            				i>(n-1)/2 && i-j==n/2 )
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            
            for(int j=0;j<n;j++)
            {
            	
            		if(i<n && j==0 || i==0 && j<n || i==n-1 && j<=n/1 || i<=n-1 && j==n-1)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            for(int j=0;j<n;j++)
            {
            	
            		if(i<n && j==0 || i == j || i<n-1 && j==n-1)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            System.out.println();
        }
		
	}
	
	public static void printQuestion2(int n)
		{
		
		for(int i=1;i<=n;i++)
        {
        
            for(int j=1;j<n;j++)
            {
            	
            		if(i<=n && j<=n)
                  {
                  System.out.print(i);
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            System.out.println();
        }
	}
	
	public static void printQuestion3(int n)
	{
		for(int i=0;i<n;i++)
        {
        
            for(int j=0;j<n;j++)
            {
            	
            	if(i==0 || j==0 || i<n && j==n-1 || i==n-1 && j<n || i+j<n/2 || j-i>=(n-1)/2)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            System.out.println();
        }
	}
	
	public static void printQuestion4(int n)
	{
		for(int i=0;i<n;i++)
        {
        
            for(int j=0;j<n;j++)
            {
            	
            	if(i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            System.out.println();
        }
	}
	
	public static void printQuestion5(int n)
	{
		for(int i=0;i<n;i++)
        {
        
            for(int j=0;j<n;j++)
            {
            	
            	if(i-j>(n-1)/2 || i+j<=n/2 || i==0 || i==n-1)
                  {
                  System.out.print(" *");
                  }
                  else
                  { 
                  System.out.print("  ");
                  }
			
            }
            System.out.println();
        }
	}

}
