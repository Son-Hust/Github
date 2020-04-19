#include <iostream>
#include <conio.h>
//#define Max 100
using namespace std;

class Matrix
{
public:
	int m, n;
	float A[50][50];
    void nhapMatrix()
    {
    	cout << "Nhap matrix: "<< endl;
        cout << "Nhap m:";
        cin >> m;
        cout << "Nhap n:";
        cin >> n;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cout << "Nhap phan tu: A"
                     << "[" << i << "][" << j << "]";
                cin >> A[i][j];
            }
        }
    }

    //Tong cac phan tu
    float tong()
    {
        float sum = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sum += A[i][j];
            }
        }
        return sum;
    }

    //Tong cac phan tu hang chan
    float tongChan()
    {
        float sum = 0;
        for (int i = 0; i < m; i + 2)
        {
            for (int j = 0; j < n; j++)
            {
                sum += A[i][j];
            }
        }
        return sum;
    }
    //Tong hang le
    float tongLe()
    {
        float sum = 0;
        for (int i = 1; i < m; i + 2)
        {
            for (int j = 0; j < n; j++)
            {
                sum += A[i][j];
            }
        }
        return sum;
    }
    //Tim min cua mang
    float min()
    {
        float min = A[0][0];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (A[i][j] < min)
                {
                    min = A[i][j];
                }
            }
        }
        return min;
    }

    //Tim max cua mang
    float max()
    {
        float max = A[0][0];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (A[i][j] > max)
                {
                    max = A[i][j];
                }
            }
        }
        return max;
    }

    //Tim max tren cot c
    float minC(int c)
    {
        float max = A[0][c];
        for (int i = 0; i < n; i++)
        {
            if (max < A[i][c])
            {
                max = A[i][c];
            }
        }
        return max;
    }
};

int main()
{
    Matrix matrix;
    matrix.nhapMatrix();
    matrix.tong();
    matrix.tongChan();
    matrix.tongLe();
    matrix.min();
    matrix.max();
    matrix.minC(5);
    return 0;
}
