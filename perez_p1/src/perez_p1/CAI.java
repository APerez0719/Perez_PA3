package perez_p1;

import java.util.*;
import java.text.DecimalFormat;
import java.util.Random;

public class CAI {
	public static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String arg[])
	{
		while(true)
		{
			Startup();
		}
	}


static void Startup()
{
	Scanner scnr = new Scanner(System.in);
	int level, typeop;
	
	System.out.println("Choose your difficulty!");
	System.out.println("Level-1");
	System.out.println("Level-2");
	System.out.println("Level-3");
	System.out.println("Level-4");
	
	level = scnr.nextInt();
	
	System.out.println("Choose operation:");
	System.out.println("Addition - 1");
	System.out.println("Multiplication - 2");
	System.out.println("Subtraction - 3");
	System.out.println("Division - 4");
	System.out.println("Mixed Operations - 5");
	
	typeop = scnr.nextInt();
	
	problem_solver(level, typeop);
	
	scnr.close();
}

static void problem_solver(int level, int typeop)
{
	int rand, i, counter = 0;
	Random ran = new Random();
	
	switch(typeop) {
	case 1:
		for(i = 1;i <= 10; i++)
		{
            counter+=addition(level);
        }
		break;
		
	case 2:
		for(i=1;i<=10;i++)
        {
            counter+=multiplication(level);
        }
		break;
		
	case 3:
		for(i=1;i<=10;i++)
        {
            counter+=subtraction(level);
        }
		break;
		
	case 4:
		for(i=1;i<=10;i++)
        {
            counter+=division(level);
        }
		break;
	
	case 5:
		for(i = 1; i <= 10; i++)
		{
			rand = ran.nextInt(4) + 1;
			if(rand==1)
            {
                counter+=addition(level);
            }
			
            if(rand==2)
            {
                counter+=multiplication(level);
            }
            
            if(rand==3)
            {
                counter+=subtraction(level);
            }
            
            if(rand==4)
            {
                counter+=division(level);
            }
		}
		break;
	
		default:
			System.out.println("Invalid Number");
			
		return;
	}
	
	if((double)((double)counter/10)*100 >= 75)
	{
		System.out.println("Congratulations, you are ready to go to the next level!");
	}
	else
	{
		System.out.println("Please ask your teacher for extra help");
	}
}

static int addition(int level)
{
	int a = 0, b = 0, answer, wrong, temp;
	Random ran = new Random();
	Scanner scnr = new Scanner(System.in);
	
	if(level == 1)
	{
		a = ran.nextInt(10);
		b = ran.nextInt(10);
	}
	
	if(level == 2)
	{
		a = ran.nextInt(90) + 10;
		b = ran.nextInt(90) + 10;
	}
	
	if(level == 3)
	{
		a = ran.nextInt(900) + 100;
		b = ran.nextInt(900) + 100; 
	}
	
	if(level == 4)
	{
		a = ran.nextInt(9000) + 1000;
		b = ran.nextInt(9000) + 1000; 
	}
	
	System.out.println("How much is " + a + " plus " + b);
	
	answer = scnr.nextInt();
	
	if(answer == a + b)
	{
		temp = ran.nextInt(4) + 1;
		if(temp == 1)
        {
            System.out.println("Very good!");
        }
		
        if(temp == 2)
        {
            System.out.println("Excellent!");
        }
          
        if(temp == 3)
        {
            System.out.println("Nice work!");
        }
          
        if(temp == 4)
        { 
        System.out.println("Keep up the good work!");
        }
          
        return 1;
	}
	else
	{
		wrong = ran.nextInt(4) + 1;
		if(wrong == 1)
        {
			System.out.println("No. Please try again.");
        }
		
        if(wrong == 2)
        {
            System.out.println("Wrong. Try once more.");
        }
        
        if(wrong == 3)
        {
        	System.out.println("Don't give up!");
        }
        
        if(wrong == 4)
        {
        	System.out.println("No. Keep trying");
        }
        
        while(true)
        {
            answer = scnr.nextInt();
           
            if(answer == a + b)
            {
            	temp = ran.nextInt(4) + 1;
        		if(temp == 1)
                {
                    System.out.println("Very good!");
                }
        		
                if(temp == 2)
                {
                    System.out.println("Excellent!");
                }
                  
                if(temp == 3)
                {
                    System.out.println("Nice work!");
                }
                  
                if(temp == 4)
                { 
                System.out.println("Keep up the good work!");
                }
                  
                return 1;
            }
            else
            {
            	wrong = ran.nextInt(4) + 1;
        		if(wrong == 1)
                {
        			System.out.println("No. Please try again.");
                }
        		
                if(wrong == 2)
                {
                    System.out.println("Wrong. Try once more.");
                }
                
                if(wrong == 3)
                {
                	System.out.println("Don't give up!");
                }
                
                if(wrong == 4)
                {
                	System.out.println("No. Keep trying");
                }
            }
            }
        }
	}


static int subtraction(int level)
{
	int a = 0, b = 0, answer, wrong, temp;
	Random ran = new Random();
	Scanner scnr = new Scanner(System.in);
	
	if(level == 1)
	{
		a = ran.nextInt(10);
		b = ran.nextInt(10);
	}
	
	if(level == 2)
	{
		a = ran.nextInt(90) + 10;
		b = ran.nextInt(90) + 10;
	}
	
	if(level == 3)
	{
		a = ran.nextInt(900) + 100;
		b = ran.nextInt(900) + 100; 
	}
	
	if(level == 4)
	{
		a = ran.nextInt(9000) + 1000;
		b = ran.nextInt(9000) + 1000; 
	}
	
	System.out.println("How much is " + a + " subtracted from " + b);
	
	answer = scnr.nextInt();
	
	if(answer == b - a)
	{
		temp = ran.nextInt(4) + 1;
		if(temp == 1)
        {
            System.out.println("Very good!");
        }
		
        if(temp == 2)
        {
            System.out.println("Excellent!");
        }
          
        if(temp == 3)
        {
            System.out.println("Nice work!");
        }
          
        if(temp == 4)
        { 
        System.out.println("Keep up the good work!");
        }
          
        return 1;
	}
	else
	{
		wrong = ran.nextInt(4) + 1;
		if(wrong == 1)
        {
			System.out.println("No. Please try again.");
        }
		
        if(wrong == 2)
        {
            System.out.println("Wrong. Try once more.");
        }
        
        if(wrong == 3)
        {
        	System.out.println("Don't give up!");
        }
        
        if(wrong == 4)
        {
        	System.out.println("No. Keep trying");
        }
        
        while(true)
        {
            answer = scnr.nextInt();
           
            if(answer == b - a)
            {
            	temp = ran.nextInt(4) + 1;
        		if(temp == 1)
                {
                    System.out.println("Very good!");
                }
        		
                if(temp == 2)
                {
                    System.out.println("Excellent!");
                }
                  
                if(temp == 3)
                {
                    System.out.println("Nice work!");
                }
                  
                if(temp == 4)
                { 
                System.out.println("Keep up the good work!");
                }
                  
                return 1;
            }
            else
            {
            	wrong = ran.nextInt(4) + 1;
        		if(wrong == 1)
                {
        			System.out.println("No. Please try again.");
                }
        		
                if(wrong == 2)
                {
                    System.out.println("Wrong. Try once more.");
                }
                
                if(wrong == 3)
                {
                	System.out.println("Don't give up!");
                }
                
                if(wrong == 4)
                {
                	System.out.println("No. Keep trying");
                }
            }
            }
        }
	}

static int multiplication(int level)
{
	int a = 0, b = 0, answer, wrong, temp;
	Random ran = new Random();
	Scanner scnr = new Scanner(System.in);
	
	if(level == 1)
	{
		a = ran.nextInt(10);
		b = ran.nextInt(10);
	}
	
	if(level == 2)
	{
		a = ran.nextInt(90) + 10;
		b = ran.nextInt(90) + 10;
	}
	
	if(level == 3)
	{
		a = ran.nextInt(900) + 100;
		b = ran.nextInt(900) + 100; 
	}
	
	if(level == 4)
	{
		a = ran.nextInt(9000) + 1000;
		b = ran.nextInt(9000) + 1000; 
	}
	
	System.out.println("How much is " + a + " times " + b);
	
	answer = scnr.nextInt();

	if(answer == a * b)
	{
		temp = ran.nextInt(4) + 1;
		if(temp == 1)
        {
            System.out.println("Very good!");
        }
		
        if(temp == 2)
        {
            System.out.println("Excellent!");
        }
          
        if(temp == 3)
        {
            System.out.println("Nice work!");
        }
          
        if(temp == 4)
        { 
        System.out.println("Keep up the good work!");
        }
          
        return 1;
	}
	else
	{
		wrong = ran.nextInt(4) + 1;
		if(wrong == 1)
        {
			System.out.println("No. Please try again.");
        }
		
        if(wrong == 2)
        {
            System.out.println("Wrong. Try once more.");
        }
        
        if(wrong == 3)
        {
        	System.out.println("Don't give up!");
        }
        
        if(wrong == 4)
        {
        	System.out.println("No. Keep trying");
        }
        
        while(true)
        {
            answer = scnr.nextInt();
           
            if(answer == a * b)
            {
            	temp = ran.nextInt(4) + 1;
        		if(temp == 1)
                {
                    System.out.println("Very good!");
                }
        		
                if(temp == 2)
                {
                    System.out.println("Excellent!");
                }
                  
                if(temp == 3)
                {
                    System.out.println("Nice work!");
                }
                  
                if(temp == 4)
                { 
                System.out.println("Keep up the good work!");
                }
                  
                return 1;
            }
            else
            {
            	wrong = ran.nextInt(4) + 1;
        		if(wrong == 1)
                {
        			System.out.println("No. Please try again.");
                }
        		
                if(wrong == 2)
                {
                    System.out.println("Wrong. Try once more.");
                }
                
                if(wrong == 3)
                {
                	System.out.println("Don't give up!");
                }
                
                if(wrong == 4)
                {
                	System.out.println("No. Keep trying");
                }
            }
            }
        
        }
	
	}

static int division(int level)
{
	int wrong, temp;
	float a = 0, b = 0, answer;
	double round_ans, c;
	Random ran = new Random();
	Scanner scnr = new Scanner(System.in);
	
	if(level == 1)
	{
		a = ran.nextInt(10);
		b = ran.nextInt(10);
	}
	
	if(level == 2)
	{
		a = ran.nextInt(90) + 10;
		b = ran.nextInt(90) + 10;
	}
	
	if(level == 3)
	{
		a = ran.nextInt(900) + 100;
		b = ran.nextInt(900) + 100; 
	}
	
	if(level == 4)
	{
		a = ran.nextInt(9000) + 1000;
		b = ran.nextInt(9000) + 1000; 
	}
	
	System.out.println("How much is " + b + " divided by " + a + ", round to the nearest hundredth");
	
	answer = scnr.nextInt();
	
	c = b/a;
		
	round_ans = Math.round(c * 100.0) / 100.0;
	
	if(answer == c)
	{
		temp = ran.nextInt(4) + 1;
		if(temp == 1)
        {
            System.out.println("Very good!");
        }
		
        if(temp == 2)
        {
            System.out.println("Excellent!");
        }
          
        if(temp == 3)
        {
            System.out.println("Nice work!");
        }
          
        if(temp == 4)
        { 
        System.out.println("Keep up the good work!");
        }
          
        return 1;
	}
	else
	{
		wrong = ran.nextInt(4) + 1;
		if(wrong == 1)
        {
			System.out.println("No. Please try again.");
        }
		
        if(wrong == 2)
        {
            System.out.println("Wrong. Try once more.");
        }
        
        if(wrong == 3)
        {
        	System.out.println("Don't give up!");
        }
        
        if(wrong == 4)
        {
        	System.out.println("No. Keep trying");
        }
        
        while(true)
        {
            answer = scnr.nextInt();
           
            if(answer == c)
            {
            	temp = ran.nextInt(4) + 1;
        		if(temp == 1)
                {
                    System.out.println("Very good!");
                }
        		
                if(temp == 2)
                {
                    System.out.println("Excellent!");
                }
                  
                if(temp == 3)
                {
                    System.out.println("Nice work!");
                }
                  
                if(temp == 4)
                { 
                System.out.println("Keep up the good work!");
                }
                  
                return 1;
            }
            else
            {
            	wrong = ran.nextInt(4) + 1;
        		if(wrong == 1)
                {
        			System.out.println("No. Please try again.");
                }
        		
                if(wrong == 2)
                {
                    System.out.println("Wrong. Try once more.");
                }
                
                if(wrong == 3)
                {
                	System.out.println("Don't give up!");
                }
                
                if(wrong == 4)
                {
                	System.out.println("No. Keep trying");
                }
            }
            }
        }
	}

}


