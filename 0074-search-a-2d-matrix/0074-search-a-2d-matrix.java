class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
//         int start[]=new int[matrix.length];
        
//         for(int i=0;i<matrix.length;i++)
//         {
//             start[i]=matrix[i][0];
//         }
        
//         int row=findrow(start,target);
        
//         //since sorted so will do binary Search
//         System.out.print(row);
//         return bsearch(matrix,row,target);
//     }
    
//     private int findrow(int []arr,int val)
//     {
//         int index=0;
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i]>val)
//                 return i-1;
//         }
//         return arr.length-1;
//     }
    
//     private boolean bsearch(int[][] matrix,int row,int target)
//     {
//         int lo=0;
//         int hi=matrix[0].length-1;
        
//         while(lo<=hi)
//         {
//             int mid=lo+(hi-lo)/2;
//             if(matrix[row][mid]==target)
//                 return true;
//             else if(matrix[row][mid]>target)
//                 hi=mid-1;
//             else
//                 lo=mid+1;
//         }
//         return false;
//     }
        
     //2nd Approach
        
        int n=matrix[0].length;
        for(int i=matrix.length-1;i>=0;i--)
        {
            if(matrix[i][0]>target)
                continue;
            
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;
    }
}

//Another Approach Discussed

// brute force - O(mn) time, O(1) space

// public boolean searchMatrix1(int[][] matrix, int target) {
// 	for (int row = 0; row < matrix.length; row++) {
// 		for (int col = 0; col < matrix[row].length; col++) {
// 			if (matrix[row][col] == target) return true;
// 		}
// 	}
// 	return false;
// }
// 2nd approach

// public boolean searchMatrix(int[][] matrix, int target) {

// 	int row = matrix.length - 1, col = 0;

// 	while (row >= 0 && col < matrix[0].length) {

// 		int curr = matrix[row][col];

// 		if (curr == target) {
// 			return true;
// 		} else if (target > curr) {
// 			col++; // search in that row
// 		} else {
// 			row--;
// 		}
// 	}

// 	return false;
// }