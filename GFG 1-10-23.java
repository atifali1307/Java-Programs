class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(n==1) // row ek hi ho to
        {
            for(int col=0;col<m;col++)
            {
                 list.add(matrix[0][col]);
            }
        }
        else if(m==1) // col ek hi ho to
        {
            for(int row=0;row<n;row++)
            {
                 list.add(matrix[row][0]);
            }
        }
        
        // row or col ek s jada ho to
        else
        {
            // 1st row ko print kr do
            for(int col=0;col<m;col++)
            {
                list.add(matrix[0][col]);
            }
            
            //last col ko print kr do --> 0th row ko chodkar 1st row s
            for(int row=1;row<n;row++)
            {
                list.add(matrix[row][m-1]);
            }
            
            // Ab ek colko  kam kr do last se Ex.  m=4
            m--; // ab m=3 hp gya
            
            //last row print kr do m=3 ==> last col ko chodkar m-1 => m=2 ----- 0 1 2  
            for(int col=m-1;col>=0;col--)
            {
                list.add(matrix[n-1][col]);
            }
            
            // ab last ki row kam kr do  Ex. n=4 h to n=3 kr do
            n--; // to ab n=3
            
            // 1st col print kr do n=3  then n-1 ==> n=2 --- 
            //row 2 1 hi kr krna hai ab
            //0th element to phle print ho gya tha oth row k sath
            for(int row=n-1;row>0;row--)
            {
                list.add(matrix[row][0]);
            }
        }
        
        return list;
    }
}
