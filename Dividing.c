#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int main()
{
    int aa[100][100],ba[100][100];
    int no,m;
    int i,j,k=0,l=0,x;
    scanf("%d",&no);
    for(i=0;i<n;i++)
    {
        for(j=0;j<no;j++)
        {
            scanf("%d",&aa[i][j]);
            ba[i][j]=1;
        }
    }
    for(i=0;i<no;i++)
    {
        for(j=0;j<no;j++)
        {
            if(aa[j]==0)
            {
                for(k=0;k<no;k++)
                {
                    bb[i][k]=0;
                }

                for(k=0;k<no;k++)
                {
                    bb[k][j]=0;
                }
            }
        }
    }
    for(i=0;i<no;i++)
    {
        for(j=0;j<no;j++)
        {
            printf("%d",bb[i][j]);
        }
        printf("\n");
    }
   return 0;
}
