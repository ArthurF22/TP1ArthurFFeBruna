#include <stdio.h>

int main(){
    int f, g;
    printf("Coloque o intervalo que deseja saber os números pares:\n");
    scanf("%d %d", &f, &g);
    while(f <= g){
       if(f%2==0){
          printf("%d par\n", f);
       }
       f++;
    }
}

