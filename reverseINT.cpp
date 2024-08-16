# include <iostream>
# include <math.h>
using namespace std;

int main(){
    int n;
    cout<<"enter the value of number:";
    cin>>n;

    int digit;
    int ans =0;
    
    
    while(n != 0){
        int digit  = n%10;
        ans = (ans* 10 + digit);
        
        n = n/10;
    }
    cout<<"Reversed numbers is :"<<ans;
}