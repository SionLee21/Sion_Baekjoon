#include <stdio.h>

int main(void) {
  int n,k,p;
  int bread, total=0;
  scanf("%d %d %d", &n, &k, &p);
  for(int j=0; j<n; j++){ 
    int count=0;
    for(int i=0; i<k; i++){
      scanf("%d",&bread);
      if (bread==0){
        count++;
      }
    }
    if(count<p) total++;
  }
  printf("%d", total);
  return 0;
}