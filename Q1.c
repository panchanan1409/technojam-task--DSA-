#include <stdio.h>

void generatePascalTriangle(int n) {
   //write your code here
   
    int i, j, k, no, value;
    printf("Enter the number of rows: ");
    scanf("%d", &no);
    
    for (i = 0; i < no; i++) {
        for (j = 0; j < (no - i - 1); j++) {
            printf(" ");
        }
        
        value = 1;
        
        for (k = 0; k <= i; k++) {
            printf("%d ", value);
            value = (value * (i - k)) / (k + 1);
        }
        
        printf("\n");
    }
}

int main() {
    int n = 5;
    generatePascalTriangle(n);
    return 0;
}
