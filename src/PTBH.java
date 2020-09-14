import java.util.Scanner;

public class PTBH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        double a = scanner.nextDouble();
        System.out.println("enter b:");
        double b= scanner.nextDouble();
        System.out.println("enter c:");
        double c = scanner.nextDouble();
        Phuongtrinhbachai ptbh = new Phuongtrinhbachai(a,b,c);
        if( ptbh.getDelta()>0){
            System.out.println("phuong trinh co hai nghiem la: "+ ptbh.getRoot1() +", "+ ptbh.getRoot2());
        }else
            if(ptbh.getDelta()==0){
                System.out.println("phuong trinh co nghiem kep la: "+ ptbh.getRoot1());
            }else
            {
                System.out.println("phuong trinh vo nghiem");
            }
    }
}
