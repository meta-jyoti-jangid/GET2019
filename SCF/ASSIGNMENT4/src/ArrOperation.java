
/*
 * Design a class arrOperation which should support following methods.
 *  assume each method will receive an array of positive integers.
 *  
 *  
 *  1.   Return the size of the largest mirror section found in the input array.
Mirror section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example
maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([7, 1, 4, 9, 7, 4, 1]) → 2
maxMirror([1, 2, 1, 4]) → 3
maxMirror*([1, 4, 5, 3, 5, 4, 1]) → 7
Throw assertion error in case array is empty*/

public class ArrOperation {
	
	  int maxMirror(int[] arr) throws Exception  //@param arr is array of elements
	{
		 if (arr.length == 0) {
				throw(new Exception("Empty Array"));
				}
		  int len = arr.length;//len is the length of array
		  int count= 0;    //count keeps the count of elements
		  int max = 0;    //max gives maximum count
		  for (int i = 0; i < len; i++){
		    count=0;
		    for (int j = len-1; i + count < len && j > -1; j--){
		      if(arr[i+count] == arr[j]){
		        count++;
		      }
		      else{
		        if (count > 0){
		          max = Math.max(count,max);
		          count = 0;
		        }
		      }
		    }
		    max = Math.max(count,max);
		  }
		  return max;     //@returns maximum count of elements
		}
	
	 /*Return the number of clumps in the input array.
		Clump in an array is a series of 2 or more adjacent elements of the same value. For example
		
		countClumps([1, 2, 2, 3, 4, 4]) → 2
	countClumps([1, 1, 2, 1, 1]) → 2
	countClumps([1, 1, 1, 1, 1]) → 1
	Throw assertion error in case array is empty.*/
	
	int countClumps(int[] arr) throws Exception    //@param arr is array of elements
	{
		if (arr.length == 0) {
			throw(new Exception("Empty Array"));
			}
		  boolean match = false;
		  int count = 0;
		  for (int i = 0; i < arr.length-1; i++)
           {
		    if (arr[i] == arr[i+1] && !match) 
		    {
		      match = true;
		      count++;
		    } 
		    else if (arr[i] != arr[i+1]) {
		      match = false;
		    }
		  }
		  return count;     //@return number of clumps
		}
	
	/*splitarray
	Return the index if there is a place to split the input array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side else return -1. For ex
	splitarray([1, 1, 1, 2, 1]) → 3
	splitarray([2, 1, 1, 2, 1]) → -1
	splitarray([10, 10]) → 1
	Throw assertion error in case array is empty.
	*/

	int splitarray(int arr[]) throws Exception   //@param arr is array of elements
	{
		int splitIndex=0;
		if (arr.length == 0) {
			throw (new Exception("Empty Array"));
			}
		int totalSum=0,sum=0;  //totalSum gives the total sum of array elements and sum gives the split sum
		for(int i=0;i<arr.length;i++)
		  totalSum+=arr[i];
		if(totalSum%2==0)
		{
		for(int j=0;j<arr.length;j++)
		{
			if(sum==totalSum/2)
			{
				splitIndex=j;
				break;
				//j gives the split index
				
			}
			else if(sum<totalSum)
			{
				sum+=arr[j];
			}
		}
		return splitIndex;
		}
		else
			return -1;
		
		
	}

	/*Solve fixXY problem
	Return an array that contains exactly the same numbers as the input array, but rearranged so that every X is immediately followed by a Y. Do not move X within array, but every other number may move. For ex: 
	Let’s say value of X is 4 and Y is 5. Then 
		
		fixXY([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
	fixXY([1, 4, 1, 5]) → [1, 4, 5, 1]
	fixXY([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
	assume we are receiving an array of integers along with value of X and Y as a method parameter.
	Throw assertion in following cases : 
	If array is empty
	If there are unequal numbers of X and Y in input array.
	If two adjacents X values are there.
	If X occurs at the last index of array.*/
	
	int[] fixXY(int arr[],int x,int y) throws Exception 
	{
		if (arr.length == 0) 
		{
			throw(new Exception("Empty Array"));
		}
		int t=0,i=0,j=0,count_x=0,count_y=0,adjacent_x=0;
		for(i=0;i<arr.length;i++)
		{
			if(x==arr[i])
				count_x++;
			else if(y==arr[i])
				count_y++;
			if((i<arr.length-1)&&(x==arr[i]&&x==arr[i+1]))
				adjacent_x++;
		}
		if(count_x!=count_y)
		{
			throw(new Exception("unequal numbers of X and Y in input array"));
		}
		if(0<adjacent_x)
		{
			throw(new Exception("two adjacents X values are there"));
		}
		if(x==arr[arr.length-1])
		{
			throw(new Exception("X occurs at the last index of array"));
		}
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==x && arr[i+1]!=y)
				for(j=0;j<arr.length;j++)
					if(arr[j]==y&&( j==0||arr[j-1]!=x ))
					{
						t=arr[j];
						arr[j]=arr[i+1];
						arr[i+1]=t;
					}
		}
		return arr;
	}

}

