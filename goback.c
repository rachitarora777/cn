#include<stdio.h>

int main()
{

int windowsize,sent=0,ack,i; printf("Enter the window size below:-\n"); scanf("%d",&windowsize); while(1)

{
for( i = 0; i < windowsize; i++)
{
printf("Frame %d has transmitted successfully.\n",sent); 
sent++;
if(sent == windowsize)
break;
}
printf("\nPlease enter the last Acknowledgement received below:- \n");
scanf("%d",&ack);

if(ack == windowsize)

{
printf("All Done\n");
break;
}
else
sent = ack;
}
return 0;

}
