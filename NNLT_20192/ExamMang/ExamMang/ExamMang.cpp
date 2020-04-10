#include<iostream>
#include<math.h>
using namespace std;

struct DIEM
{
	float td;
	float hd;
};


void NhapToaDo(DIEM& d)
{
	cout << "Nhap Hoanh Do: "; cin >> d.hd;
	cout << "Nhap Tung Do: "; cin >> d.td;
}

void XuatToaDo(DIEM d)
{
	cout << "(" << d.hd << "," << d.td << ")";
}

float KhoangCach(DIEM d1, DIEM d2)
{
	float kc;
	kc = sqrt(double(d1.hd - d2.hd) * (d1.hd - d2.hd) + (d1.td - d2.td) * (d1.td - d2.td));
	return kc;
}

void main()
{
	DIEM Diem1, Diem2;
    float Khoang;
	cout << "Diem A:\n";
	NhapToaDo(Diem1);

	cout << "\nDiem B: \n";
	NhapToaDo(Diem2);

	cout << "\nToa do A la: ";
	XuatToaDo(Diem1);

	cout << "\nToa do  B la: ";
	XuatToaDo(Diem2);

	Khoang = KhoangCach(Diem1, Diem2);
	cout << "\nKhoang cach giua diem A va diem B la: " << Khoang;

	cout << endl;
}

