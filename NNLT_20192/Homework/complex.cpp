//Cau2: viet chuong trinh xay dung class so phuc.
//- du lieu gom real, image
//- nap chong cac toan tu sau:
//	- ham tao su dung tham so mac dinh
//	- toan tu nhap so phuc >>
//	- toan tu hien thi so phuc <<
//	- toan tu +, -, *, / 2 so phuc
//	- toan tu so sanh 2 so phuc
//	Viet chuong trinh chinh nhap vao hai so phuc bat ky de kiem tra 
//	cac ham vua tao, va nhap vao mot day gom n so phuc va hien thi ra 
//	man hinh day so do.
#include <iostream>
#include <math.h>
using namespace std;
class SoPhuc {
	public:
		float real, image;
		
		SoPhuc(float r= 1, float i= 1) {
			real = r; image = i;
		};
		friend ostream & operator << (ostream &out,  SoPhuc &c); 
    	friend istream & operator >> (istream &in,  SoPhuc &c); 
    	SoPhuc operator+ (SoPhuc x) {
			SoPhuc y;
			y.real = this->real + x.real;
			y.image = this->image + x.image;
			return y;
		}
		SoPhuc operator- (SoPhuc x) {
			SoPhuc y;
			y.real = this->real - x.real;
			y.image = this->image - x.image;
			return y;
		}
		SoPhuc operator* (SoPhuc x) {
			SoPhuc y;
			y.real = this->real * x.real - this->image * x.image;
			y.image = this->real * x.image + this->image * x.real;
			return y;
		}
		SoPhuc operator/ (SoPhuc x) { 
			SoPhuc y;
			y.real = (this->real * x.real + this->image * x.image) / (pow(x.real, 2) + pow(x.image, 2));
			y.image = (this->image * x.real - this->real * x.image) / (pow(x.real, 2) + pow(x.image, 2));
			return y;
		}
		void SoSanh (SoPhuc x) {
			if (this->real == x.real && this->image == x.image) cout<< "Hai so phuc bang nhau." <<endl;
			else cout<< "Hai so phuc khong bang nhau."<< endl;
		}
};
ostream & operator << (ostream &out,  SoPhuc &c) { 
    out <<"( " << c.real << " + i" << c.image << " )"; 
    return out; 
} 
  
istream & operator >> (istream &in,  SoPhuc &c) { 
    cout << "Nhap so phuc: \nNhap phan thuc: "; 
    in >> c.real; 
    cout << "Nhap phan ao: "; 
    in >> c.image;
    return in; 
} 
int main() {
	int n, i;
	SoPhuc a;
	cin >> a;
	cout << a << endl;
	SoPhuc b;
	cin >> b;
	cout << b << endl;
	SoPhuc c;
	c = a + b;
	cout << "Tong hai so phuc: " << c<< endl;
	c = a - b;
	cout << "Hieu hai so phuc: " << c<< endl;
	c = a * b;
	cout << "Tich hai so phuc: " << c<< endl;
	c = a / b;
	cout << "Chia hai so phuc: " << c<< endl;
	a.SoSanh(b);
	do{
		cout<< "Nhap so n: "; cin>> n;
	}
	while(n<=0);
	SoPhuc *d;
	d = new SoPhuc[n];
	for( i=0; i<n; i++) {
		cin>> d[i];
	}
	cout<< "Day so phuc: ";
	for(i=0; i<n; i++) cout<< d[i]<< "\t ";
	return 0;
}
