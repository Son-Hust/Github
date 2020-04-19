//Bai 2: xay dung lop Nguoi gom 2 thuoc tinh: ten, nam sinh va cac phuong thuc
//nhap/xuat cho cac thuoc tinh do
//Xay dung lop Sing Vien ke thua lop Nguoi.  lop SV co them thuoc tinh la 
//diem trung binh va cac phuong thuc nhap/xuat cho diem trung binh
//Xay dung lop Giang vien ke thua lop nguoi. co them cac thuoc tinh
//so gio day va cac phuong thuc nhap/xuat cho so gio day
//a. nhap 1 so nguyen duong n, khoi tao mot mang n phan tu gom ca GV va SV
//b. in ra sanh sach nhung GV va SV duoc thuong, biet GV duoc thuong neu so gio day lon hon 300
//SV duoc thuong neu diem trung binh lon hon 7.5
//# can XD them phuong thuc ao trong lop nguoi

#include <iostream>
using namespace std;
class Nguoi {
	public:
		string ten;
		int namsinh;
		virtual void nhap() = 0;
		virtual void xuat() = 0;
		virtual bool thuong() = 0;
};
class SinhVien : public Nguoi {
	float diemTB;
	void nhap() {
            cin.ignore();
			cout<< "Nhap ten SV: ";
            getline(cin, ten);
			cout<< "Nhap nam sinh: ";
			cin>> namsinh;		
			cout<< "Nhap diem trung binh: ";
			cin>> diemTB;
	}
	void xuat() {
		cout<< "Sinh vien "<< ten <<" sinh nam "<< namsinh << ". Diem trung binh la: "<< diemTB<< endl;
	}
	bool thuong() {
		if (diemTB > 7.5) return true;
		return false;
	}
};

class GiangVien : public Nguoi {
	int h;
	void nhap() {
		    cin.ignore();
			cout<< "Nhap ten GV: "; 
            getline(cin, ten);
			cout<< "Nhap nam sinh: ";
			cin>> namsinh;
			cout<< "Nhap so gio day: ";
			cin>> h;
	}
	void xuat() {
		cout<< "Giang vien "<< ten << " sinh nam "<< namsinh << ". So gio giang day la: "<< h <<endl;
	}
	bool thuong() {
		if (h > 300) return true;
		return false;
	}

};
int main() {
	int n, c;
	do {
		cout<< "Nhap so nguyen duong n: ";
		cin>> n;
	} while (n<=0);
	Nguoi *ds[n];
	int i=0;
			while (i<n) {
				cout<< "\nChon 1 de nhap thong tin Sinh Vien\n     2 de nhap thong tin Giang Vien.";
				cin>> c;
				cout<< endl;
					if (c==1) {
						ds[i] = new SinhVien;
					}
					else if (c==2) {
						ds[i] = new GiangVien;
					}
					else continue;
					ds[i]->nhap();
					i++;
					continue;
			}
	cout<< "\nDanh sach Giang Vien va Sinh Vien duoc thuong:" << endl;
	for (int j = 0; j<n; j++) {
		if (ds[j]->thuong() == true) ds[j]->xuat();
	}
	delete [] ds;
	return 0;
}
