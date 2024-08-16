#include<iostream>
using namespace std;

int main(){
   int n ;
   cout<<"enter the value of n:";
   cin>>n;
   
   int sum =0;
   int pro =1;
   while(n!=0){
    int i = (n%10);
    sum += i;
    pro *= i;
    n = n/10;
    }

   int result = pro - sum;
   cout<<result;
   
    
}
    