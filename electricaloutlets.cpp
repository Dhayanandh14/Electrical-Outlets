#include<iostream>
using namespace std;
int main() {
    int sum,tot=0,o,n,k;
    cin>>n;
    for(int i=0;i<n;i++){
      cin>>k;
      sum=0;
      for(int j=0;j<k;j++){
        cin>>o;
        sum= sum +o;
      }
      tot = (sum-k)+1;
      cout<<tot<<endl;      
    }   
}
//