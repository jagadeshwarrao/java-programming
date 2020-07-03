#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;
main()
{
int a,n,i,j,t,z,m;
cout<<"\n                    GUESS THE NUMBER            ";
cout<<"\n if you select easy level you will get double the amount";
cout<<"\n if you select medium level you will get 3times of amount";
cout<<"\n if you select difficult level you will get 4 times of amount";
cout<<"\n enter your amount";
cin>>m;
cout<<"\n enter your level";
cout<<"\n 1:easy    2:medium    3:difficult";
cin>>n;
cout<<"\n you will be given 5 chances";
cout<<"\n guess the number";
switch(n)
{
    case 1: cout<<"\n the number lies between 0 to 500";
    cout<<"\n if you win you will get rupees "<<(2*m);
    cout<<"\n guess the number";
    a=rand()%500;
    srand(time(0));
    a=rand()%500;
    for(i=0;i<5;i++)
    {
        cin>>t;
        z=a-t;
    if(t==a){
        cout<<"\n you are write";
    exit(0);
}
else
    cout<<"\n you are wrong";
    if(z>20)
        cout<<"\n "<<t<<" is too small";
    else if(z>=0&&z<=20)
        cout<<"\n"<<t<<" is little bit small";
    else if(z<0&&z>-20)
        cout<<"\n"<<t<<"is little large";
    else
        cout<<"\n "<<t<<" is too large";
}
cout<<"\n 5 chances completed";
break;
case 2:cout<<"\n the number lies between 0 to 1000";
       cout<<"\n if you win you will get rupees "<<(3*m);
    cout<<"\n guess the number";
    a=rand()%1000;
    srand(time(0));
    a=rand()%1000;
    for(i=0;i<5;i++)
    {
        cin>>t;
        z=a-t;
    if(t==a){
        cout<<"\n you are write";
    exit(0);}
    else
        cout<<"\n you are wrong";
        if(z>20)
        cout<<"\n "<<t<<" is too small";
    else if(z>=0&&z<=20)
        cout<<"\n"<<t<<" is little bit small";
    else if(z<0&&z>-20)
        cout<<"\n"<<t<<"is little large";
    else
        cout<<"\n "<<t<<" is too large";
    }
    cout<<"\n 5 chances completed";
    break;
case 3:cout<<"\n the number lies between 0 to 1500";
cout<<"\n if you win you will get rupees "<<(4*m);
    cout<<"\n guess the number";
    a=rand()%1500;
    srand(time(0));
    a=rand()%1500;
    for(i=0;i<5;i++)
    {
        cin>>t;
        z=a-t;
    if(t==a){
        cout<<"\n you are write";
    exit(0);}
    else
        cout<<"\n you are wrong";
        if(z>20)
        cout<<"\n "<<t<<" is too small";
    else if(z>=0&&z<=20)
        cout<<"\n"<<t<<" is little bit small";
    else if(z<0&&z>-20)
        cout<<"\n"<<t<<"is little large";
    else
        cout<<"\n "<<t<<" is too large";
    }
    cout<<"\n 5 chances completed";
    break;
}
cout<<"\n the answer is "<<a;
}
