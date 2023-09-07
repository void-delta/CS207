#include<iostream>
using namespace std;

class pig{
    private:
    static int count_pig;
    public:
    pig(){
        count_pig++;
    }
    friend void total_num();
};
int pig::count_pig = 0;

class dog{
    private:
    static int count_dog;
    public:
    dog(){
        count_dog++;
    }
    friend void total_num();
};
int dog::count_dog = 0;

class horse{
    private:
    static int count_horse;
    public:
    horse(){
        count_horse++;
    }
    friend void total_num();
};
int horse::count_horse = 0;

void total_num(){
    int total = horse::count_horse + pig::count_pig + dog::count_dog;
    cout << "\nDogs: " << dog::count_dog ;
    cout << "\nHorses: " << horse::count_horse;
    cout << "\nPigs: " << pig::count_pig;
    cout << "\nTotal: " << total << "\n";
    return;
}

int main(){
    cout << "Welcome to Dr. Able Smith' Veteranian Clinic\n";
    int n;
    do{
        cout << "1)Pig 2)Dog 3)Horse 9)End Program \t" ;
        cin >> n;
        if(n == 1){
            pig *p = new pig;
            cout << "Allocated\n" ;
            delete p;
        }
        else if (n == 2){
            dog *d = new dog;
            cout << "Allocated\n" ;
            delete d;
        }
        else if (n == 3){
            horse *h = new horse;
            cout << "Allocated\n" ;
            delete h;
        }
        else if (n == 9){
            break;
        }
    } while(n != 9);
    total_num();
}