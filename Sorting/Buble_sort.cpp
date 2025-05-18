#include<bits/stdc++.h>

using namespace std;

int main()
{
    int ar[5] = {30,22,25,11,6};
    int n = 5;
    for(int j = 0; j < n; j++){
            cout << ar[j] << " ";
    }
    cout << endl;
    for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - i - 1; j++){
            cout << "compare "<< ar[j] <<" "<<ar[j+1] << endl;
            if(ar[j] > ar[j+1]){
                int tmp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = tmp;
            }
        }
        for(int j = 0; j < n; j++){
            cout << ar[j] << " ";
        }
        cout << endl;
    }
}
