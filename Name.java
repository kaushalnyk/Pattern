public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int i=0;i<n;i++)
			{
		    for(int j=0; j<n ;j++)        //printing i
		    {
		    	if( j==(n-1)/2)
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		    
		    
		    for(int j=0; j<n ;j++)         //printing N
		    {
		    	if( j==0||j==n-1||i==j)
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		    
		    
		    for(int j=0; j<n ;j++)       //Printing E
		    {
		    	if(i==0&&j<(n-1)|| i==(n-1)/2&&j<(n-1)|| i==(n-1)&&j<(n-1) ||j==0)
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		   
		    
		    for(int j=0; j<n ;j++)       //Printing U
		    {
		    	if((j==0&& i!=(n-1))||(i==(n-1)&& j!=0&& j!=(n-1))||(j==(n-1)&& i!=(n-1)) )
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		    
		    
		    for(int j=0; j<n ;j++)       //Printing R
		    {
		    	if(j==0||(i==0&& j<(n-1)/2)||(i-j==(n-1)/2)||
		    			(i==(n-1)/2 &&j<(n-1)/2)||
		    			(j==(n-1)/2)&&i!=0&&i<(n-1)/2)
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		    
		    
		    for(int j=0; j<n ;j++)        //printing O
		    {
		    	if( (i==0 && j!=0 &&j<n-1 )||
		    			(i==n-1 && j!=0 && j!=(n-1))||
		    			(j==0 && i!=0 && i!=(n-1))||
		    			(j==n-1 && i!=0 && i!=(n-1)))
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		    
		    
		    for(int j=0; j<n ;j++)         //printing N
		    {
		    	if( j==0||j==n-1||i==j)
		    	{
			 System.out.print("*");
		    	}
		    	else
		    	{
			 System.out.print(" ");
		    	}
		    }
		    
		    
		    
		    System.out.println();
		}	
		
		
		
	}

}