#include<bits/stdc++.h>
using namespace std;

void max_Heapify(int ar[],int node,int n)
{
    int largest = node;
    int left = 2 * node + 1;
    int right = 2 * node + 2;
    //cout << node <<" <- node " ;
    if(left < n && ar[left] > ar[largest]){
        //cout << left <<" left " ;
        largest = left;
    }
    if(right < n && ar[right] > ar[largest]){
        largest = right;
        //cout << right <<" right " ;
    }
    //cout << largest <<" <- largest "<< endl;
    if(largest != node){
        swap(ar[largest],ar[node]);
        max_Heapify(ar,largest,n);
    }
}
void heap_sort(int ar[],int n){
    for(int i = n - 1; i > 0; i--){
        swap(ar[0],ar[i]);
        max_Heapify(ar,0,i);
    }
}
void build_max_heap(int ar[],int n)
{
    for(int i = n/2 - 1; i >= 0; i--){
        max_Heapify(ar,i,n);
    }
    heap_sort(ar,n);
}
int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++){
        cin >> ar[i];
    }
    build_max_heap(ar,n);
    for(int i = 0; i < n; i++){
        cout << ar[i] << " ";
    }
}
