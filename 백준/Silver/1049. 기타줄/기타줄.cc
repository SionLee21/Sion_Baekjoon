#include <stdio.h>
#include <limits.h>

int main() {
    int n, m, minCost = INT_MAX, minOne = INT_MAX, minSix = INT_MAX, cost = INT_MAX;
    scanf("%d %d", &n, &m);
    for (int i = 0; i < m; i++) {
        int six, one;
        scanf("%d %d", &six, &one);
        minOne = (one < minOne) ? one : minOne;
        minSix = (six < minSix) ? six : minSix;
        cost = ((n + 5) / 6) * six < n * one ? ((n + 5) / 6) * six : n * one;
        minCost = (cost < minCost) ? cost : minCost;
    }
    cost = n / 6 * minSix;
    cost += n % 6 * minOne;
    minCost = (cost < minCost) ? cost : minCost;
    printf("%d\n", minCost);
    return 0;
}
