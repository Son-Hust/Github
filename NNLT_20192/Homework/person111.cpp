
#include <iostream>
#include <string>
using namespace std;
class Person {
	public:
		char * ten = new char [50];
		char *queQuan = new char [100];
		int d, m, y;
	void nhap() {
            cout << "Nhap thong tin: \n";
			cout << "\nNhap ten: ";
            cin >> ten;
            cout << "\nNhap que quan: ";
            cin >> queQuan;
			cout << "\nNhap ngay thang nam sinh: ";
			cin >> d;
			cin >> m;
			cin >> y;		
	}
	void xuat() {
		cout << "Thong tin Person: "<< endl;
		cout << "\n" << ten << ", sinh ngay " << d << " - " << m << " - " << y << endl;
		cout << "\nQue quan " << queQuan << endl;
	}
	char * getTen () {
		return this->ten;
	}
	void setTen (char *Ten) {
		this->ten = Ten;
	}
	char * getQue () {
		return this->queQuan;
	}
	void setQue (char *QueQuan) {
		this->queQuan = QueQuan;
	}
	void getBirthday() {
		cout << "\n" << this->d << " - " << this->m << " - " << this->y;
	}
	void setBirthday(int D, int M, int Y) {
		this->d = D;
		this->m = M;
		this->y = Y;
	}
};

int main() {
	Person A;
	A.nhap();
	A.xuat();
	A.getTen();
	A.getQue();
	A.getBirthday();
	return 0;
}
