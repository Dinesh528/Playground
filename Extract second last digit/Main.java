#include<stdio.h>
int main()
{
  //Type your code here
  int n,secondDig,temp;
  scanf("%d",&n);
  temp=n/10;
  secondDig=temp%10;
  printf("%d",secondDig);
  return 0;
}