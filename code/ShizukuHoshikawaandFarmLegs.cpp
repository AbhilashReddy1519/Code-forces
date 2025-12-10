#include <bits/stdc++.h>
using namespace std;


int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  // Solution code here
  int t;
  cin >> t;
  while(t--) {
    int n;
    cin >> n;
    if(n % 2 != 0)  {
      cout << 0 <<'\n';
      continue;
    }
    int cows = 0;
    int chickens = n/2;
    int ways = 1;
    while(cows < n/4) {
      chickens -= 2;
      cows++;
      int total = chickens*2 + cows*4;
      if(total == n) ways++;
    }

    cout << ways << '\n';
  }
  return 0;
}