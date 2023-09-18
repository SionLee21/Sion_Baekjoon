#include <stdio.h>

int main(void) {
  int n, m;
  scanf("%d %d", &n, &m);
  int c[n];
  int sum, max = 0;
  for (int i = 0; i < n; i++)
    scanf("%d", &c[i]);
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      for (int k = j + 1; k < n; k++) {
        sum = c[i] + c[j] + c[k];
        if (sum > max && sum <= m)
          max = sum;
      }
    }
  }
  printf("%d\n", max);
  return 0;
}
