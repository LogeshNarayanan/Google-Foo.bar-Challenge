/* Re-ID
=====

There's some unrest in the minion ranks: minions with ID numbers like "1", "42", and other "good" numbers have been lording 
it over the poor minions who are stuck with more boring IDs. To quell the unrest, Commander Lambda has tasked you with 
reassigning everyone new, random IDs based on her Completely Foolproof Scheme. 

She's concatenated the prime numbers in a single long string: "2357111317192329...".
Now every minion must draw a number from a hat. That number is the starting index in that 
string of primes, and the minion's new ID number will be the next five digits in the string. 
So if a minion draws "3", their ID number will be "71113". 

Help the Commander assign these IDs by writing a function answer(n) 
which takes in the starting index n of Lambda's string of all primes, and
returns the next five digits in the string. Commander Lambda has a lot of minions,
so the value of n will always be between 0 and 10000.

Test cases
==========

Inputs:
    (int) n = 0
Output:
    (string) "23571"

Inputs:
    (int) n = 3
Output:
    (string) "71113" */
    
public class Answer(){

public static String answer(int index) {
		StringBuilder sb = new StringBuilder("2357");
		int n=11;		
		while(sb.length() < index+5){
			boolean is_prime =true;
			for(int i=3;i<=n/2;i+=2){
			  if (n % i == 0){
			    is_prime = false;
			    break;
			  }
			}
			if(is_prime){
				sb.append(n);
			}
			n+=2;
		}	
		return sb.substring(n, n+5);		
	}
 }
  
  
