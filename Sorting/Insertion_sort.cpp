#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
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
}
