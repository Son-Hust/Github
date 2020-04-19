#include <iostream>
using namespace std;

class Person
{
public:
    void setInfor(){
			cout<< "Nhap ten: ";
            cin >>name;
			cout<< "Nhap dia chi: ";
			cin>> address;		
			cout<< "Nhap ngay, thang, nam sinh: ";
			cin>>day;
            cin>>month;
            cin>>year;
    }
    void showInfor(){
        cout<<"Ho ten:"<<name;
        cout<<"Dia chi:"<<address;
        cout<<"Ngay sinh:"<<day<<"-"<<month<<"-"<<year;
    }

    char getName(){
        return name;
    }

    void setName(char name){
        name=name;
    }

    char getAddress(){
        return address;
    };

    void setName(char address){
        address=address;
    }

    int getDay(){
        return day;
    };

    void setDay(int day){
        day=day;
    }


private:
    int day, month, year;
    char name, address;      
};

int main()
{
    Person person;
    person.setInfor();
    person.showInfor();
    return 0;
}