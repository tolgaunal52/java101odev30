public class odev30 {
    public static void main(String[] args) {

        int a=0,b=0,c=0;
        String d="";
        for (a=1;a<=100;a++){
            c=0;

            for(b=a;b>=1;b--){

                if(a%b==0){
                    c+=1;
                }

            }

            if(c==2){
                d=d+a+" ";
            }

        }
        System.out.println(d);
    }
}