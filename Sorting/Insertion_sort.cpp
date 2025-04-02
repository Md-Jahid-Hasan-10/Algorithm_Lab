#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cout << "Enter value of n \n";
    cin >> n;
    int ar[n];
    cout << "Enter n element \n";
    for(int i = 0; i < n; i++){
        cin >> ar[i];
    }
    for(int now = 1; now < n; now++){
        int key = ar[now];
        int prev = now - 1;
        while(prev >= 0 && key < ar[prev]){
            ar[prev + 1] = ar[prev];
            prev--;
        }
        ar[prev + 1] = key;
    }
    cout << "After sort array is = ";
    for(int i = 0; i < n; i++){
        cout << ar[i] << " ";
    }
    cout << endl;
}
