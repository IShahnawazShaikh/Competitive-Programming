
public class MatrixSearch {
	public static int searchMatrix(int[][] A, int B) {
		int r = A.length, c = A[0].length;
		int low = 0, high = r * c - 1;
		int mid = 0;
		while (low <= high) {

			mid = (high - low) / 2 + low;
			// if(mid>=r*c) break;
			if (A[mid / c][mid % c] == B)   //to convert index into 2D matrix  divide by n0. of column
				return 1;
			else if (A[mid / c][mid % c] < B)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return 0;
	}

	public static void main(String[] args) {
	  int ar[][]={ {1,3,5,7},
	               {10, 11, 16, 20},
	               {23, 30, 34, 50}  
	              };
	  searchMatrix(ar,3);
	}

}
