package ArrayPW;

import java.util.Scanner;
class Arr{
    void demoArrays(){
        int[] age=new int[5];

        //assigning values
        age[0]=11;
        age[1]=33;
        age[2]=22;
        age[3]=72;
        age[4]=99;
        int sum1=0;
        int max=age[0];


        //maximum value of the array
        for (int i=0; i< age.length; i++){
            if (max<age[i]){
                max=age[i];
            }
        }
        System.out.println("*********");
        System.out.println(max);
        System.out.println("*********");


        //Search the given element x in the array. If present then return the index else return -1.
        int x=70;
        int index=-1;
        for (int i=0; i<age.length; i++){
            if(x==age[i]){
                index =i;
                break; //break is used because if there is any double value of x in array we do not want again that value
                       //when we get answer just break the loop
            }
        }

        if (index!=-1)  //if element is found the value of indexed is  changed
            System.out.println("Element "+x+" found at position " +index);
        else
            System.out.println("Element "+x+" not found");




        //addition of the array
        for (int i=0; i<age.length;i++){ //you can use i<=2 or i<3 etc...
            System.out.println(age[i]);
            sum1+=age[i];
        }
        System.out.println(sum1);

        //for-each loop
        for(int ages : age){   //this means we are printing all the elements of age in ages (ages is just a variable)
            System.out.println(ages);
        }

        int [][] age2=new int[3][2];
        //assigning values
        age2[0][0]=11;
        age2[0][1]=22;
        age2[1][1]=33;
        age2[1][0]=44;
        age2[2][1]=66;
        age2[2][0]=55;
        int sum=0;

        for (int i=0; i<age2.length; i++){
            for (int j=0; j<age2[i].length; j++){
                sum+=age2[i][j];

            }
        }
        System.out.println(sum);

        System.out.println("-----------------------");

        int[][]  age3={{1,2,6},{3,4,5,6},{7,8}};

        for (int i=0; i<age3.length;i++){
            for (int j=0;j<age3[i].length;j++){
                System.out.println(age3[i][j]);
            }
        }
        System.out.println(age3[1][1]);
        System.out.println(age3[2][1]);
        System.out.println("*****************");

        System.out.println(age2.length);
        System.out.println(age2[1][1]);
    }
}
public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Arr obj=new Arr();
        obj.demoArrays();

    }
}
