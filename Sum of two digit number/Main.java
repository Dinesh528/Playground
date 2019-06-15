#include<stdio.h>
int main()
{
  //Type your code here
  int n,sum,last,first;
  scanf("%d",&n);
  last=n%10;
  first=n/10;
  sum=first + last;
  printf("%d",sum);
  return 0;
}