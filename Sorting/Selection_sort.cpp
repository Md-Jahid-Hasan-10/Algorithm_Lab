#include <iostream>
using namespace std;

void selectionSort(int ar[], int n) {
  for (int step = 0; step < n - 1; step++) {
    int min_idx = step;
    for (int i = step + 1; i < n; i++) {
      if (ar[i] < ar[min_idx])
        min_idx = i;
    }
    swap(ar[min_idx],ar[step]);
  }
  for(int i = 0; i < n; i++){
    cout << ar[i] << " ";
  }
}

int main() {
  int data[] = {20, 12, 10, 15, 2};
  int n = sizeof(data) / sizeof(data[0]);
  selectionSort(data, n);
}
