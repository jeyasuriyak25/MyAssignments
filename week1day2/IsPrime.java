package week1day2;

public class IsPrime {
    public static void main(String[] args){
int n=7;
boolean flag=true;

for(int i=2;i<=n;i++){
    if(n%2==0){
        flag=false;
        break;
    }
}
   System.out.println(flag? "Prime number":"not prime");

    }
}
