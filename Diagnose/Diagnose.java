import java.io.*;
import java.util.Scanner;
public class Diagnose {

    public static void main(String[] args)
    {
            boolean cough;
            boolean fever;
            boolean tiredness;
            boolean tasteSmell;
            boolean soreThroat;
        System.out.println("Please enter the symptoms you are experiencing");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Are you experiencing cough? Please enter Y or N");
        char coughChk = sc.next().charAt(0);
        if(coughChk=='Y'){
            cough = true;
        }
        else {
            cough = false;
        }
        
        System.out.println("Are you experiencing fever? Please enter Y or N");
        char feverChk = sc.next().charAt(0);
        if(feverChk=='Y'){
            fever = true;
        }
        else {
            fever = false;
        }

        System.out.println("Are you experiencing tiredness? Please enter Y or N");
        char tirednessChk = sc.next().charAt(0);
        if(tirednessChk=='Y'){
            tiredness = true;
        }
        else {
            tiredness = false;
        }

        System.out.println("Are you able to smell or taste? Please enter Y or N");
        char tasteSmellChk = sc.next().charAt(0);
        if(tasteSmellChk=='Y'){
            tasteSmell = false;
        }
        else {
            tasteSmell = true;
        }

        System.out.println("Are you experiencing a sore throat? Please enter Y or N");
        char soreThroatChk = sc.next().charAt(0);
        if(soreThroatChk=='Y'){
            soreThroat = true;
        }
        else {
            soreThroat = false;
        }
        //combinations
        
        if(cough == true && fever == false && tiredness == false && tasteSmell == false && soreThroat == false){//only cough
        System.out.println("Please take Anti-coff cough syrup, cofsils");
        }
        else if(cough == false && fever == true && tiredness == false && tasteSmell == false && soreThroat == false){//only fever
        System.out.println(" A simple cold could be just a flu\n "+"Fever: Crocin, Paracetamol\n" );
        }
        else if(cough == false && fever == false && tiredness == false && tasteSmell == true && soreThroat == false){//only smellTaste
        System.out.println(" A complete loss of the sense of taste is called ageusia, which can make a person unable to detect any tastes.\n "+
        "Visit a doctor if the problem prevails." );
        }
        else if(cough == false && fever == false && tiredness == true && tasteSmell == false && soreThroat == false){//only tiredness
        System.out.println("This can be caused by dehydration so kindly drink lots of water. Having some nuts also help." );
        }
    
        else if(cough == false && fever == false && tiredness == false && tasteSmell == false && soreThroat == true){//sore
        System.out.println("Please take some Aspirin for a sore throat" );
        }
        
        else if((cough == true && fever == true && tiredness == false && tasteSmell == false && soreThroat == true) || (cough == true && fever == true && tiredness == true && tasteSmell == false && soreThroat == true)
        || (cough == true && fever == true && tiredness == false && tasteSmell == false && soreThroat == false)||(cough == true && fever == true && tiredness == true && tasteSmell == false && soreThroat == false)){//cold
            System.out.println("Cough, fever and sore throat are the basic symptoms of a common cold which could also be a viral infection.\n");
            System.out.println("Cough: Anti-coff cough syrup, cofsils.\n" +
                    "Fever: Crocin, Paracetamol\n" +
                    "Sore throat: Aspirin\n" +
                    "Tiredness: This can be caused by dehydration so kindly drink lots of water.");
        }
        else if(cough == true && fever == true && tiredness == true && tasteSmell == true && soreThroat == true){//coivd
            System.out.println("Continuous cough, high fever, sore throat, tiredness, loss of taste and respiratory problems are the most common symptoms of the COVID-19 virus. Please visit a Doctor as soon as possible\n");
            System.out.println("Cough: Anti-coff cough syrup, cofsils.\n" +
                    "Fever: Crocin, Paracetamol\n" +
                    "Sore throat: Aspirin\n");
        }
         else
        {
            System.out.println("You are just feeling uneasy just take some rest and if you feel any other symptoms please contact the nearest doctor thank you :)");               
        }
    }
}