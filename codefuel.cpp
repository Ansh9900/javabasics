//111111111111111111111
// #include <iostream>
// using namespace std;
// int main(){
// int n,s;    
// cin>>n;
// s=n-1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=s;j++)
//     cout<<" ";
//     for(int j =1 ;j<=i;j++)
//     cout<<"*";
//     s--;
//     cout<<endl;}
// return 0;
// }
////////////////////////////////////////////////////////////////////////
//2222222222222222222222222222222222222
// #include <iostream>
// using namespace std;
// int main(){
// int n,s;
// cin>>n;
// s=n-1;
// int k=1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=s;j++)
//     cout<<" ";
//     for(int j =1 ;j<=k;j++)
//     cout<<"*";
//     s--;
//     k=k+2;
//     cout<<endl;}
// return 0;
// }
////////////////////////////////////////////////////
//33333333333333333333333333333333
// #include <iostream>
// using namespace std;
// int main(){
// int n,s;
// cin>>n;
// s=n-1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=s;j++)
//     cout<<" ";
//     for(int j =1 ;j<i*2;j++)
//     cout<<"*";
//     s--;
//     cout<<endl;}
// return 0;
// }
/////////////////////////////////////////////////////////////////////////
//44444444444444444444444444444444444444444444444444444
// #include <iostream>
// using namespace std;
// int main(){
// int n,s;
// cin>>n;
// s=0;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=s;j++)
//     cout<<" ";
//     for(int j =i ;j<n;j++)
//     cout<<"*";
//     s++;
//     cout<<endl;}
// return 0;
// }
///////////////////////////////////////////////////////////////
//555555555555555555555555555555555     
// #include <iostream>
// using namespace std;
// int main(){
// int n,s;
// cin>>n;
// s=n-1;
// for(int i=n;i>=1;i--){

//     for(int j=1;j<=s;j++)
//     cout<<" ";
//     for(int j =1 ;j<=i*2;j++)
//     cout<<"*";
//     s++;
//     cout<<endl;}
// return 0;
// }
//////////////////////////////////////////////////////////////////////
//666666666666666666666666666666666666666666
#include <iostream>
using namespace std;
int main(){
int n,s;
cin>>n;
s=2*(n-1)-1;
for(int i=1;i<=n;i++){

    for(int j=1;j<=i;j++)
    cout<<"*";
    for(int j =1 ;j<=s;j++)
    cout<<" ";
for(int j=1;j<=i;j++)
if(j!=n)cout<<"*";
    s=s-2;
    cout<<endl;}
return 0;
}
//////////////////////////////////////////////////////////////////////////////////////
// 777777777777777777777777777777777777777
// #include <iostream>
// using namespace std;
// int main(){
// int n,s;
// cin>>n;
// s=n-1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=s;j++)
//     cout<<" ";
//     for(int j =1 ;j<i*2;j++)
//     cout<<j;
//     s--;
//     cout<<endl;}
// return 0;
// }