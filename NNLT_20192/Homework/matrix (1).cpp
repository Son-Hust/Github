#include <iostream>
#include <conio.h>
#define limit 100
using namespace std;

class Matrix
{

public:
    void nhapMatrix(float A[limit][limit], int m, int n)

    {

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
    float tong(float A[limit][limit], int m, int n)
    {
        float sum = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sum = sum + A[i][j];
            }
        }
        return sum;
    }

    //Tong cac phan tu hang chan
    float tongChan(float A[limit][limit], int m, int n)
    {
        float sum = 0;
        for (int i = 0; i < m; i + 2)
        {
            for (int j = 0; j < n; j++)
            {
                sum = sum + A[i][j];
            }
        }
        return sum;
    }
    //Tong hang le
    float tongLe(float A[limit][limit], int m, int n)
    {
        float sum = 0;
        for (int i = 1; i < m; i + 2)
        {
            for (int j = 0; j < n; j++)
            {
                sum = sum + A[i][j];
            }
        }
        return sum;
    }
    //Tim min cua mang
    float min(float A[limit][limit], int m, int n)
    {
        float min = 0;
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
    float max(float A[limit][limit], int m, int n)
    {
        float max = 0;
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
    float minC(float A[][limit], int m, int n, int c)
    {
        float max = 0;
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
    float A[limit][limit], m, n, c;
    matrix.nhapMatrix(A, m, n);
    matrix.tong(A, m, n);
    matrix.tongChan(A, m, n);
    matrix.tongLe(A, m, n);
    matrix.min(A, m, n);
    matrix.max(A, m, n);
    matrix.minC(A, m, n, c);
}
