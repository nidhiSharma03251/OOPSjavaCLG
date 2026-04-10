public class prime {
    public static void seiveOfErastosthenes(int n){
        Boolean prime[] = new Boolean[n+1];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i<=n; i++){
            prime[i]=true;
        }

        for(int p=2; p*p<=n; p++){
            if(prime[p]){
                for(int multiple=p*p; multiple<=n; multiple+=p){
                    prime[multiple]=false;
                }
            }
        }

        for(int i=1; i<=n; i++){
            if(prime[i]){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String args[]){
        seiveOfErastosthenes(1000);
    }
}
