#include<stdio.h>
int main()
{
  //Type your code here
  int n,firstDig,thirdDig,sum=0;
  scanf("%d",&n);
  thirdDig=n%10;
  n=n/100;
  firstDig=n;
  sum=thirdDig+firstDig;
  printf("%d",sum);
  return 0;
}