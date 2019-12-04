package strng;


public class strngper2mat {

public static void modifyMatrix(int mat[ ][ ], int R, int C) 
    { 
        int row[ ]= new int [R]; 
        int col[ ]= new int [C]; 
        int i, j; 
      
        /* Initialize all values of row[] as 0 */
        for (i = 0; i < R; i++) 
        { 
        row[i] = 1; 
        } 
      
      
        /* Initialize all values of col[] as 0 */
        for (i = 0; i < C; i++) 
        { 
        col[i] = 1; 
        } 
    
for (i = 0; i < R; i++) 
    { 
        for (j = 0; j < C; j++) 
        { 
            if (mat[i][j] == 0) 
            { 
                row[i] = 0; 
                col[j] = 0; 
            } 
        } 
    } for (i = 0; i < R; i++) 
    { 
        for (j = 0; j < C; j++) 
        { 
            if ( row[i] == 0 || col[j] == 0 ) 
            { 
                mat[i][j] = 0; 
            } 
        } 
    } 
    }
    public static void printMatrix(int mat1[ ][ ], int F, int G) 
    { 
        int a, b; 
        for (a = 0; a< F; a++) 
        { 
            for (b= 0; b< G; b++) 
            { 
                System.out.print(mat1[a][b]+ " "); 
            } 
           System.out.println(); 
        } 
    } 
      

public static void main(String[] args)
{
//isPalindromePermutation("nayuan");
int mat[ ][ ] = { {1, 1, 1, 1}, 
                {1, 1, 1, 1}, 
                {0, 1, 1, 1},}; 
            
      System.out.println("Matrix Intially"); 
      printMatrix(mat, 3, 4); 
      modifyMatrix(mat, 3, 4); 
      System.out.println("Matrix after modification n"); 
      printMatrix(mat, 3, 4);

}
}




