#include<bits/stdc++.h>

using namespace std;

int ar[30],n;

int Partition(int l,int r)
{
    int x = l;
    for(int i = l; i < r; i++){
        if(ar[i] <= ar[r]){
            swap(ar[x],ar[i]);
            x++;
        }
    }
    swap(ar[x],ar[r]);
    return x;
}
void quick(int l,int r)
{
    if(l < r){
        int mid = Partition(l,r);
        quick(l,mid-1);
        quick(mid+1,r);
    }
}
int main()
{
    cin >> n;
    for(int i = 0; i < n; i++){
        cin >> ar[i];
    }
    quick(0,n-1);
    for(int i = 0; i < n; i++){
        cout << ar[i] <<" ";
    }
}
