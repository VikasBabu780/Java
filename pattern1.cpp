#include<iostream>
using namespace std;

int main(){
    int row;
    cout<<"enter the row number:";
    cin>>row;
    int col;
    cout<<"enter the col number:";
    cin>>col;
    int i =1;
    while(i<=row){
        int j =1;
        while(j<=col){
            cout<<i  ;
            j++;
        }
        cout<<endl;
        i++;


    }

}