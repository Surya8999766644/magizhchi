import java.util.*;

class Mainn
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
				{
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) 
		{

            for (int j = left; j <= right; j++)
                System.out.print(a[top][j] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(a[i][right] + " ");
            right--;

            for (int j = right; j >= left && top <= bottom; j--)
                System.out.print(a[bottom][j] + " ");
            bottom--;

            for (int i = bottom; i >= top && left <= right; i--)
                System.out.print(a[i][left] + " ");
            left++;
        }
    }
}